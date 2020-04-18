package DAO;

import ent.*;
import org.hibernate.Session;
import Factory.creatorSession;
import org.hibernate.query.Query;
import pageEntity.servicePage;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class generatorServicePage {

    private String ServiceName = "";

    public void setServiceName(String serviceName) {
        ServiceName = serviceName;
    }

    public String getServiceName() {
        return ServiceName;
    }

    private boolean ServiceActualFilter = false;

    public void setServiceActualFilter(boolean serviceActualFilter) {
        ServiceActualFilter = serviceActualFilter;
    }

    public boolean isServiceActualFilter() {
        return ServiceActualFilter;
    }

    private String ServiceType = "";

    public void setServiceType(String serviceType) {
        ServiceType = serviceType;
    }

    public String getServiceType() {
        return ServiceType;
    }

    private int ServiceTariffId = 0;
    private boolean ServiceTariffIdFilter = false;

    public void setServiceTariffIdFilter(boolean serviceTariffIdFilter) {
        ServiceTariffIdFilter = serviceTariffIdFilter;
    }

    public boolean isServiceTariffIdFilter() {
        return ServiceTariffIdFilter;
    }

    public void setServiceTariffId(int serviceTariffId) {
        ServiceTariffId = serviceTariffId;
    }

    public int getServiceTariffId() {
        return ServiceTariffId;
    }

    public List<servicePage> getPageService(){
        List<servicePage> result = new ArrayList<servicePage>();
        List<serviceEntity> tmpList = new ArrayList<serviceEntity>();
        Session session = creatorSession.getSessionFactory().openSession();
        session.beginTransaction();
        Query query = session.createQuery("from serviceEntity see where " +
                " ((see.name=:name_pr) or (:name_pr=''))");
        query.setParameter("name_pr", ServiceName);
        tmpList = query.list();
        for ( serviceEntity see : tmpList){
            servicePage sep = new servicePage();
            sep.setServiceSecretKey(see.getId());
            sep.setServiceActual(see.getState());
            sep.setServiceName(see.getName());
            sep.setServiceType(see.getType());
            if (see.getTariff() == null){
                setServiceTariffIdFilter(false);
            }
            Date tmpD = null;
            for ( tariffEntity tmpT : see.getTariff()){
                if (tmpD == null){
                    tmpD=tmpT.getCreate_time();
                    sep.setServiceTariff(tmpT);
                }
                else {
                    if (tmpT.getCreate_time().after(tmpD)){
                        tmpD=tmpT.getCreate_time();
                        sep.setServiceTariff(tmpT);
                    }
                }
            }

            if (sep.getServiceTariff() != null){
                if (
                        ( (see.getState()==true) || (ServiceActualFilter==false)) &
                                ( (ServiceType.equals("")) || ServiceType.equals(see.getType())) &
                                ( (ServiceTariffIdFilter==false) || (sep.getServiceTariff().getId() == ServiceTariffId))
                ){
                    result.add(sep);
                }
            }
            else{
                if (
                        ( (see.getState()==true) || (ServiceActualFilter==false)) &
                                ( (ServiceType.equals("")) || ServiceType.equals(see.getType())) &
                                ( (ServiceTariffIdFilter==false))
                ){
                    result.add(sep);
                }
            }
        }
        session.getTransaction().commit();
        return result;
    }

}

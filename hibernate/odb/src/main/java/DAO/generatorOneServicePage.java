package DAO;

import ent.*;
import org.hibernate.Session;
import Factory.creatorSession;
import org.hibernate.query.Query;
import pageEntity.oneServicePage;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class generatorOneServicePage {

    private String ServiceName = "";

    public String getServiceName() {
        return ServiceName;
    }

    public void setServiceName(String serviceName) {
        ServiceName = serviceName;
    }

    private boolean ServiceTariffActualFilter = false;
    private boolean ServiceTariffActual = false;

    public void setServiceTariffActual(boolean serviceTariffActual) {
        ServiceTariffActual = serviceTariffActual;
    }

    public void setServiceTariffActualFilter(boolean serviceTariffActualFilter) {
        ServiceTariffActualFilter = serviceTariffActualFilter;
    }

    public boolean isServiceTariffActual() {
        return ServiceTariffActual;
    }

    public boolean isServiceTariffActualFilter() {
        return ServiceTariffActualFilter;
    }

    private int ServiceTariffId = 0;
    private boolean ServiceTariffIdFilter = false;

    public boolean isServiceTariffIdFilter() {
        return ServiceTariffIdFilter;
    }

    public void setServiceTariffIdFilter(boolean serviceTariffIdFilter) {
        ServiceTariffIdFilter = serviceTariffIdFilter;
    }

    public void setServiceTariffId(int serviceTariffId) {
        ServiceTariffId = serviceTariffId;
    }

    public int getServiceTariffId() {
        return ServiceTariffId;
    }

    private float ServiceTariffCost;
    private boolean ServiceTariffCostFilter;

    public float getServiceTariffCost() {
        return ServiceTariffCost;
    }

    public void setServiceTariffCost(float serviceTariffCost) {
        ServiceTariffCost = serviceTariffCost;
    }

    public void setServiceTariffCostFilter(boolean serviceTariffCostFilter) {
        ServiceTariffCostFilter = serviceTariffCostFilter;
    }

    public boolean isServiceTariffCostFilter() {
        return ServiceTariffCostFilter;
    }

    private boolean ServiceTariffDaypaymode;
    private boolean ServiceTariffDaypaymodeFilter;

    public void setServiceTariffDaypaymode(boolean serviceTariffDaypaymode) {
        ServiceTariffDaypaymode = serviceTariffDaypaymode;
    }

    public void setServiceTariffDaypaymodeFilter(boolean serviceTariffDaypaymodeFilter) {
        ServiceTariffDaypaymodeFilter = serviceTariffDaypaymodeFilter;
    }

    public boolean isServiceTariffDaypaymode() {
        return ServiceTariffDaypaymode;
    }

    public boolean isServiceTariffDaypaymodeFilter() {
        return ServiceTariffDaypaymodeFilter;
    }

    private Date ServiceTariffDate ;
    private boolean ServiceTariffDateFilter = false;

    public void setServiceTariffDate(Date serviceTariffDate) {
        ServiceTariffDate = serviceTariffDate;
    }

    public void setServiceTariffDateFilter(boolean serviceTariffDateFilter) {
        ServiceTariffDateFilter = serviceTariffDateFilter;
    }

    public boolean isServiceTariffDateFilter() {
        return ServiceTariffDateFilter;
    }

    public Date getServiceTariffDate() {
        return ServiceTariffDate;
    }

    private float ServiceTariffValue;
    private boolean ServiceTariffValueFilter;

    public float getServiceTariffValue() {
        return ServiceTariffValue;
    }

    public void setServiceTariffValue(float serviceTariffValue) {
        ServiceTariffValue = serviceTariffValue;
    }

    public void setServiceTariffValueFilter(boolean serviceTariffValueFilter) {
        ServiceTariffValueFilter = serviceTariffValueFilter;
    }

    public boolean isServiceTariffValueFilter() {
        return ServiceTariffValueFilter;
    }

    public List<oneServicePage> getPageOneService(){
        List<oneServicePage> result = new ArrayList<oneServicePage>();
        List<serviceEntity> tmpList = new ArrayList<serviceEntity>();
        Session session = creatorSession.getSessionFactory().openSession();
        session.beginTransaction();
        Query query = session.createQuery("from serviceEntity see where " +
                " ((see.name=:name_pr) or (:name_pr=''))");
        query.setParameter("name_pr", ServiceName);
        tmpList = query.list();
        for ( serviceEntity see : tmpList){
            oneServicePage osp = new oneServicePage();
            osp.setName(see.getName());
            osp.setDescribe(see.getDescribe());
            osp.setSecretKey(see.getId());
            osp.setType(see.getType());
            osp.setActual(see.getState());
            List<tariffEntity> tmpT = new ArrayList<tariffEntity>();
            for ( tariffEntity tae : see.getTariff() ){
                if (
                        ( (ServiceTariffIdFilter==false) || (ServiceTariffId == tae.getId())) &
                                ((ServiceTariffActualFilter == false) || (ServiceTariffActual == tae.getState())) &
                                ((ServiceTariffCostFilter == false) || (ServiceTariffCost == tae.getCost())) &
                                ((ServiceTariffDaypaymodeFilter==false)||(ServiceTariffDaypaymode == tae.getDaypaymode())) &
                                ((ServiceTariffDateFilter==false)||(((ServiceTariffDate.getTime()-tae.getCreate_time().getTime())/(24*60*60*1000)<=0))) &
                                ((ServiceTariffValueFilter==false)||(ServiceTariffValue==tae.getValue()))

                ){
                    tmpT.add(tae);
                }
            }
            osp.setTariff(tmpT);
            result.add(osp);
        }
        session.getTransaction().commit();
        session.close();
        return result;
    };
}

package DAO;

import ent.*;
import org.hibernate.Session;
import Factory.creatorSession;
import org.hibernate.query.Query;

import pageEntity.oneClientPage;

import java.util.*;

public class generatorOneClientPage {

    private String ClientName = "";

    public String getClientName() {
        return ClientName;
    }

    public void setClientName(String clientName) {
        ClientName = clientName;
    }

    private String BalanceNameService = "";

    public String getBalanceNameService() {
        return BalanceNameService;
    }

    public void setBalanceNameService(String balanceNameService) {
        BalanceNameService = balanceNameService;
    }

    private float BalanceCount = 0;
    private boolean BalanceCountFilter = false;

    public float getBalanceCount() {
        return BalanceCount;
    }

    public void setBalanceCount(float balanceCount) {
        BalanceCount = balanceCount;
    }

    public void setBalanceCountFilter(boolean balanceCountFilter) {
        BalanceCountFilter = balanceCountFilter;
    }

    private Date BalanceDate = new Date();
    private boolean BalanceDateFilter = false;

    public Date getBalanceDate() {
        return BalanceDate;
    }

    public void setBalanceDate(Date balanceDate) {
        BalanceDate = balanceDate;
    }

    public void setBalanceDateFilter(boolean balanceDateFilter) {
        BalanceDateFilter = balanceDateFilter;
    }

    private String ServiceServiceName = "";

    public void setServiceServiceName(String serviceServiceName) {
        ServiceServiceName = serviceServiceName;
    }

    public String getServiceServiceName() {
        return ServiceServiceName;
    }

    private float ServiceState = 0;
    private boolean ServiceStateFilter = false;

    public void setServiceState(float serviceState) {
        ServiceState = serviceState;
    }

    public void setServiceStateFilter(boolean serviceStateFilter) {
        ServiceStateFilter = serviceStateFilter;
    }

    public float getServiceState() {
        return ServiceState;
    }

    private Date ServiceTopDate = new Date();
    private boolean ServiceTopDateFilter = false;

    public void setServiceTopDate(Date serviceTopDate) {
        ServiceTopDate = serviceTopDate;
    }

    public void setServiceTopDateFilter(boolean serviceTopDateFilter) {
        ServiceTopDateFilter = serviceTopDateFilter;
    }

    public Date getServiceTopDate() {
        return ServiceTopDate;
    }

    private Date ServiceBottomDate = new Date();
    private boolean ServiceBottomDateFilter = false;

    public void setServiceBottomDate(Date serviceBottomDate) {
        ServiceBottomDate = serviceBottomDate;
    }

    public Date getServiceBottomDate() {
        return ServiceBottomDate;
    }

    public void setServiceBottomDateFilter(boolean serviceBottomDateFilter) {
        ServiceBottomDateFilter = serviceBottomDateFilter;
    }

    public List<oneClientPage> getPageOneClient () {

        List<oneClientPage> result = new ArrayList<oneClientPage>();
        List<clientEntity> tmpList = null;

        Session session = creatorSession.getSessionFactory().openSession();
        session.beginTransaction();
        Query query = session.createQuery("from clientEntity cle where " +
                " ((cle.name=:name_pr) or (:name_pr=''))");
        query.setParameter("name_pr", ClientName);
        tmpList = query.list();

        for (clientEntity cle : tmpList) {
            oneClientPage ocp = new oneClientPage();
            ocp.setSecretClientId(cle.getId());
            ocp.setName(cle.getName());
            ocp.setMax_credit(cle.getMax_credit());
            ocp.setMax_credit_day(cle.getMax_credit_day());
            List<contactEntity> tmp_conE= new ArrayList<contactEntity>();
            tmp_conE.addAll(cle.getContact());
            ocp.setContact(tmp_conE);
            List<historyServiceEntity> tmp_hisS = new ArrayList<historyServiceEntity>();
            for ( historyServiceEntity hisS : cle.getHistory_service()){
                if ( hisS.getEnd_time() == null){ ServiceTopDateFilter=false;}
                if (
                        (hisS.getService().getName().equals(ServiceServiceName) || (ServiceServiceName=="")) &
                                ( (hisS.getState()==ServiceState) | (ServiceStateFilter == false)) &
                                ((ServiceTopDateFilter==false) || hisS.getEnd_time().before(ServiceTopDate)) &
                                ((ServiceBottomDateFilter==false) || hisS.getBegin_time().after(ServiceBottomDate))
                ){
                    tmp_hisS.add(hisS);
                }
            }
            ocp.setServiceHistory(tmp_hisS);

            List<historyBalanceEntity> tmp_hisB = new ArrayList<historyBalanceEntity>();
            for ( historyBalanceEntity hisB : cle.getHistory_balance()){
                if( ((hisB.getService().getName().equals(BalanceNameService)) || (BalanceNameService.equals("")))
                        & ( (BalanceCountFilter == false) || (hisB.getSumm()==BalanceCount)) &
                        ( (BalanceDateFilter == false) || ( (((hisB.getOp_time().getTime() - BalanceDate.getTime())
                                / (24 * 60 * 60 * 1000) ) == 0) & (BalanceDate.before(hisB.getOp_time())) )  )
                ){
                    tmp_hisB.add(hisB);
                }
            }
            ocp.setBalanceHistory(tmp_hisB);
            for ( contactEntity coe : cle.getContact()){
                List<addresEntity> tmp_addE = ocp.getAddress();
                if( coe.getAddres() != null){
                    tmp_addE.addAll(coe.getAddres());
                    ocp.setAddress(tmp_addE);
                }
                List<emailEntity> tmp_emmE = ocp.getEmail();
                if ( coe.getEmail() != null){
                    tmp_emmE.addAll(coe.getEmail());
                    ocp.setEmail(tmp_emmE);
                }
                List<phoneEntity> tmp_phhE = ocp.getPhone();
                if( coe.getPhone() != null){
                    tmp_phhE.addAll(coe.getPhone());
                    ocp.setPhone(tmp_phhE);
                }

            }
            result.add(ocp);
        }
            session.getTransaction().commit();
            return result;
        };
}


package pageEntity;

import Factory.creatorSession;
import ent.*;
import DAO.findById;
import org.hibernate.Session;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class connectPage {

    private List<serviceEntity> AddServiceList;
    private List<serviceEntity> AvaibleServiceList;

    public connectPage RemoteService( int EndId){
        Session session = creatorSession.getSessionFactory().openSession();
        session.beginTransaction();
        findById dao = new findById();
        historyServiceEntity hse = dao.findHistoryServiceById(EndId);
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        hse.setEnd_time(timestamp);
        session.update(hse);
        session.getTransaction().commit();
        session.close();
        return this;
    }


    public connectPage  AddNewService(){
        Session session = creatorSession.getSessionFactory().openSession();
        findById dao = new findById();
        serviceEntity see = dao.findServiceById(AddServiceId);
        clientEntity  cle = dao.findClientById(AddClientId);
        if ( see.getType().equals("BALANCE") ){
            historyBalanceEntity hbe = new historyBalanceEntity();
            session.beginTransaction();
            hbe.setService(see);
            hbe.setClient(cle);
            if ( NewValueSet ){
                hbe.setSumm(NewValue);
                float count = 0;
                if(hbe.getService().getName().equals("BalanceUP")){
                    count = cle.getAccount().getBalance() + NewValue;
                }
                else {
                    count = cle.getAccount().getBalance() - NewValue;
                }
                accountEntity ace = cle.getAccount();
                ace.setBalance(count);
                session.merge(ace);
            }
            else {
                for ( tariffEntity taf : see.getTariff()){
                    if ( taf.getState()){
                        hbe.setSumm(taf.getValue());
                        float count = 0;
                        if(hbe.getService().getName().equals("BalanceUP")){
                            count = cle.getAccount().getBalance() + taf.getValue();
                        }
                        else {
                            count = cle.getAccount().getBalance() - taf.getValue();
                        }
                        accountEntity ace = cle.getAccount();
                        ace.setBalance(count);
                        session.merge(ace);
                    }
                }
            }
            Timestamp timestamp = new Timestamp(System.currentTimeMillis());
            hbe.setOp_time(timestamp);
            session.save(hbe);
            session.getTransaction().commit();
            session.close();
        }
        else {
            historyServiceEntity hse = new historyServiceEntity();
            session.beginTransaction();
            hse.setService(see);
            hse.setClient(cle);
            Timestamp timestamp = new Timestamp(System.currentTimeMillis());
            hse.setBegin_time(timestamp);
            if ( NewValueSet ){
                hse.setState(NewValue);
            }
            else {
                for ( tariffEntity taf : see.getTariff()){
                    if ( taf.getState()){
                        hse.setState(taf.getValue());
                    }
                }
            }
            session.save(hse);
            session.getTransaction().commit();
            session.close();
        }
        return this;
    }

    private int AddServiceId = 1;
    private int AddClientId  = 1;
    private float NewValue;
    private boolean NewValueSet = false;

    public float getNewValue() {
        return NewValue;
    }

    public int getAddClientId() {
        return AddClientId;
    }

    public int getAddServiceId() {
        return AddServiceId;
    }

    public void setAddClientId(int addClientId) {
        AddClientId = addClientId;
    }

    public void setAddServiceId(int addServiceId) {
        AddServiceId = addServiceId;
    }

    public void setNewValue(float newValue) {
        NewValue = newValue;
    }

    public void setNewValueSet(boolean newValueSet) {
        NewValueSet = newValueSet;
    }

    public boolean isNewValueSet() {
        return NewValueSet;
    }

    public List<serviceEntity> getAddServiceList() {
        return AddServiceList;
    }

    public void setAddServiceList(List<serviceEntity> addServiceList) {
        AddServiceList = addServiceList;
    }

    public List<serviceEntity> getAvaibleServiceList() {
        return AvaibleServiceList;
    }

    public void setAvaibleServiceList(List<serviceEntity> avaibleServiceList) {
        AvaibleServiceList = avaibleServiceList;
    }

    @Override
    public String toString() {
        String result = "";
        result= result+ "ConnectPage:: " + '\n' ;
        result=result+ "  " + "Current::" + '\n' ;
        for ( serviceEntity add : AddServiceList){
            result=result + "    "  + add.toString() + '\n';
        }
        result=result+ "  " + "Available::" + '\n';
        for ( serviceEntity all : AvaibleServiceList){
            result=result + "    " + all.toString() + '\n';
        }
        return result;
    }

}

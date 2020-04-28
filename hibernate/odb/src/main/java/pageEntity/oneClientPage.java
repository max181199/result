package pageEntity;

import Factory.creatorSession;
import ent.*;
import org.hibernate.Session;
import org.hibernate.query.Query;

import javax.naming.Name;
import java.util.ArrayList;
import java.util.List;

public class oneClientPage {

    private String name;
    private float max_credit;
    private float max_credit_day;

    private List<contactEntity> contact = new ArrayList<contactEntity>();
    private List<historyServiceEntity> ServiceHistory = new ArrayList<historyServiceEntity>();
    private List<historyBalanceEntity> BalanceHistory = new ArrayList<historyBalanceEntity>();
    private List<emailEntity> email = new ArrayList<emailEntity>();
    private List<addresEntity> address = new ArrayList<addresEntity>();
    private List<phoneEntity>  phone = new ArrayList<phoneEntity>();
    private int SecretClientId;

    public oneClientPage UPDATE(){
        List<clientEntity> tmpList = new ArrayList<clientEntity>();
        Session session = creatorSession.getSessionFactory().openSession();
        session.beginTransaction();
        Query query = session.createQuery("from clientEntity cle where " +
                " cle.id=:id_pr");
        query.setParameter("id_pr", SecretClientId);
        tmpList = query.list();
        for (clientEntity ent : tmpList) {
            ent.setMax_credit(max_credit);
            ent.setMax_credit_day(max_credit_day);
            ent.setName(name);
            session.update(ent);
        }
        session.getTransaction().commit();
        session.close();
        return this;
    }

    public oneClientPage INSERT(){
        clientEntity createClient = new clientEntity();
        accountEntity createAccount = new accountEntity();
        Session session = creatorSession.getSessionFactory().openSession();
        session.beginTransaction();
        createClient.setName(name);
        createClient.setMax_credit_day(max_credit_day);
        createClient.setMax_credit(max_credit);
        session.save(createClient);
        session.getTransaction().commit();
        session.beginTransaction();
        createAccount.setId(createClient.getId());
        createAccount.setBalance(0);
        createAccount.setCredit_day(0);
        session.save(createAccount);
        session.getTransaction().commit();
        SecretClientId = createClient.getId();
        return this;
    }

    public void DELETE(){
        List<clientEntity> tmpList = new ArrayList<clientEntity>();
        Session session = creatorSession.getSessionFactory().openSession();
        session.beginTransaction();
        Query query = session.createQuery("from clientEntity cle where " +
                " cle.id=:id_pr");
        query.setParameter("id_pr", SecretClientId);
        tmpList = query.list();
        for (clientEntity ent : tmpList) {
            accountEntity dropAccount = ent.getAccount();
            ent.setAccount(null);
            dropAccount.setCle(null);
            session.delete(dropAccount);
            for ( historyServiceEntity hse : ent.getHistory_service()){
                ent.setHistory_service(null);
                hse.setClient(null);
                session.delete(hse);
            }
            for (historyBalanceEntity hbe : ent.getHistory_balance()){
                ent.setHistory_balance(null);
                hbe.setClient(null);
                session.delete(hbe);
            }
            for (contactEntity cte : ent.getContact()){
                for (addresEntity ade : cte.getAddres()){
                    cte.setAddres(null);
                    ade.setContact(null);
                    session.delete(ade);
                }
                for ( emailEntity eme : cte.getEmail()){
                    cte.setEmail(null);
                    eme.setContact(null);
                    session.delete(eme);
                }
                for ( phoneEntity phe : cte.getPhone()){
                    phe.setContact(null);
                    cte.setPhone(null);
                    session.delete(phe);
                }
                cte.setClient(null);
                session.delete(cte);
            }
            ent.setContact(null);
            session.delete(ent);
        }
        session.getTransaction().commit();
        session.close();
        return;
    }


    public void setSecretClientId(int secretClientId) {
        SecretClientId = secretClientId;
    }

    public int getSecretClientId() {
        return SecretClientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getMax_credit() {
        return max_credit;
    }

    public void setMax_credit(float max_credit) {
        this.max_credit = max_credit;
    }

    public float getMax_credit_day() {
        return max_credit_day;
    }

    public void setMax_credit_day(float max_credit_day) {
        this.max_credit_day = max_credit_day;
    }

    public List<addresEntity> getAddress() {
        return address;
    }

    public void setAddress(List<addresEntity> address) {
        this.address = address;
    }

    public List<contactEntity> getContact() {
        return contact;
    }

    public void setContact(List<contactEntity> contact) {
        this.contact = contact;
    }

    public List<emailEntity> getEmail() {
        return email;
    }

    public void setEmail(List<emailEntity> email) {
        this.email = email;
    }

    public List<historyBalanceEntity> getBalanceHistory() {
        return BalanceHistory;
    }

    public void setBalanceHistory(List<historyBalanceEntity> balanceHistory) {
        BalanceHistory = balanceHistory;
    }

    public List<historyServiceEntity> getServiceHistory() {
        return ServiceHistory;
    }

    public void setServiceHistory(List<historyServiceEntity> serviceHistory) {
        ServiceHistory = serviceHistory;
    }

    public List<phoneEntity> getPhone() {
        return phone;
    }

    public void setPhone(List<phoneEntity> phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {

        String resultStr = "";
        resultStr = resultStr + "OneClientPage::" + '\n' + "  Name= " + name + ",  max_credit=" + max_credit +
                ",  max_credit_day=" + max_credit_day + "  :: SECRET_KEY  ::   "+ SecretClientId +'\n';

        for ( contactEntity conc : contact){
            resultStr=resultStr + "  " + conc.toString() + '\n' ;
            for ( phoneEntity ph : phone){
                if( ph.getContact().getId() == conc.getId()){
                    resultStr=resultStr+ "    " + ph.toString() + '\n';
                }
            }
            for ( addresEntity ad : address){
                if( ad.getContact().getId() == conc.getId()){
                    resultStr=resultStr+ "    " + ad.toString() + '\n';
                }
            }
            for ( emailEntity em : email){
                if( em.getContact().getId() == conc.getId()){
                    resultStr=resultStr+ "    " + em.toString() + '\n';
                }
            }
        }

        for ( historyServiceEntity hse : ServiceHistory){
            resultStr=resultStr + "  " + hse.toString() + '\n';
        }

        for ( historyBalanceEntity hbe : BalanceHistory){
            resultStr=resultStr + "  " + hbe.toString() + '\n';
        }

        resultStr=resultStr + '\n';
        return resultStr;
    }
}

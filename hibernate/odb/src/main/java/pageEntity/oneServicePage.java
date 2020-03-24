package pageEntity;

import Factory.creatorSession;
import ent.*;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.ArrayList;
import java.util.List;

public class oneServicePage {

    private String Describe;
    private  String Name;
    private String Type;
    private int SecretKey;
    private List<tariffEntity> Tariff ;
    private boolean Actual;

    public oneServicePage INSERT(){
        serviceEntity createService = new serviceEntity();
        Session session = creatorSession.getSessionFactory().openSession();
        session.beginTransaction();
        createService.setName(Name);
        createService.setDescribe(Describe);
        createService.setState(Actual);
        createService.setType(Type);
        session.save(createService);
        session.getTransaction().commit();
        SecretKey = createService.getId();
        return this;
    }

    public oneServicePage UPDATE(){
        List<serviceEntity> tmpList = new ArrayList<serviceEntity>();
        Session session = creatorSession.getSessionFactory().openSession();
        session.beginTransaction();
        Query query = session.createQuery("from serviceEntity see where " +
                " see.id=:id_pr");
        query.setParameter("id_pr", SecretKey);
        tmpList = query.list();
        for (serviceEntity ent : tmpList) {
            ent.setType(Type);
            ent.setState(Actual);
            ent.setName(Name);
            ent.setDescribe(Describe);
            session.update(ent);
        }
        session.getTransaction().commit();
        return this;
    }

    public void DELETE(){
        List<serviceEntity> tmpList = new ArrayList<serviceEntity>();
        Session session = creatorSession.getSessionFactory().openSession();
        session.beginTransaction();
        Query query = session.createQuery("from serviceEntity see where " +
                " see.id=:id_pr");
        query.setParameter("id_pr", SecretKey);
        tmpList = query.list();
        for (serviceEntity see : tmpList) {
            //System.out.println(see);
            for (tariffEntity taf : see.getTariff()){
                see.setTariff(null);
                taf.setService(null);
                session.delete(taf);
            }
            for ( historyServiceEntity hse : see.getHistoryService()){
                hse.setService(null);
                see.setHistoryService(null);
                session.delete(hse);
            }
            for ( historyBalanceEntity hbe : see.getBalanceService()){
                hbe.setService(null);
                see.setBalanceService(null);
                session.delete(hbe);
            }
            session.delete(see);
        }
        session.getTransaction().commit();
        return;
    }

    public oneServicePage DeleteTariff( int TariId) {
        Session session = creatorSession.getSessionFactory().openSession();
        List<tariffEntity> tmp = new ArrayList<tariffEntity>();
        for ( tariffEntity tae : Tariff){
            tmp.add(tae);
        }
        for ( tariffEntity phe : tmp){
            if( phe.getId() == TariId){
                session.beginTransaction();
                Tariff.remove(phe);
                session.delete(phe);
                session.getTransaction().commit();
            }
        }
        return this;
    }


    public boolean isActual() {
        return Actual;
    }

    public void setActual(boolean actual) {
        Actual = actual;
    }

    public void setSecretKey(int secretKey) {
        SecretKey = secretKey;
    }

    public int getSecretKey() {
        return SecretKey;
    }

    public List<tariffEntity> getTariff() {
        return Tariff;
    }

    public void setTariff(List<tariffEntity> tariff) {
        Tariff = tariff;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getDescribe() {
        return Describe;
    }

    public void setDescribe(String describe) {
        Describe = describe;
    }


    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    @Override
    public String toString() {
        String result = "";
        result= result+ "OneServicePage:: " + '\n' + "  " + "ServiceName= " + Name + "  Type= " + Type + "  Actual=" + Actual
                +  "  :: SECRET ::  " +   SecretKey + '\n' + "  " + "Describe::" + '\n' + "    " + Describe +
                   '\n' ;
        for ( tariffEntity taf : Tariff){
            result=result + "  " + taf.toString() + '\n';
        }
        return result;
    }
}

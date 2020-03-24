package DAO;

import ent.*;
import org.hibernate.Session;
import Factory.creatorSession;
import org.hibernate.query.Query;
import pageEntity.connectPage;

import java.util.ArrayList;
import java.util.List;

public class generatorConnectPage {

    private int ClinetBacklID = -1;

    public int getClinetBacklID() {
        return ClinetBacklID;
    }

    public void setClinetBacklID(int clinetBacklID) {
        ClinetBacklID = clinetBacklID;
    }

    public List<connectPage> getPageConnect(){
        List<connectPage> result = new ArrayList<connectPage>();
        List<clientEntity> tmpList = new ArrayList<clientEntity>();
        List<serviceEntity> tmpList2 = new ArrayList<serviceEntity>();
        Session session = creatorSession.getSessionFactory().openSession();
        session.beginTransaction();
        Query query = session.createQuery("from clientEntity cle where " +
                " ((cle.id=:name_pr) or (:name_pr=-1))");
        query.setParameter("name_pr", ClinetBacklID);
        tmpList = query.list();
        Query query2 = session.createQuery("from serviceEntity see");
        tmpList2 = query2.list();
        for ( clientEntity cle : tmpList){
            connectPage cop = new connectPage();
            List<serviceEntity> tmpSE1 = new ArrayList<serviceEntity>();
            for ( serviceEntity see : tmpList2){
                if (see.getState() == true){
                    tmpSE1.add(see);
                }
            }
            cop.setAvaibleServiceList(tmpSE1);
            List<serviceEntity> tmpSE2 = new ArrayList<serviceEntity>();
            for ( historyServiceEntity hse : cle.getHistory_service()){
                if( hse.getEnd_time() == null) {
                    tmpSE2.add(hse.getService());
                }
            }
            cop.setAddServiceList(tmpSE2);
            result.add(cop);
        }
        return result;
    }


}

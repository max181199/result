package DAO;


import ent.*;
import org.hibernate.Session;
import Factory.creatorSession;
import org.hibernate.query.Query;
import pageEntity.tariffPage;

import java.util.ArrayList;
import java.util.List;

public class generatorTariffPage {

    private int TariffId = -1;

    public int getTariffId() {
        return TariffId;
    }

    public void setTariffId(int tariffId) {
        TariffId = tariffId;
    }

    public List<tariffPage> getPageTariff(){
        List<tariffPage> result = new ArrayList<tariffPage>();
        List<tariffEntity> tmpList = new ArrayList<tariffEntity>();
        Session session = creatorSession.getSessionFactory().openSession();
        session.beginTransaction();
        Query query = session.createQuery("from tariffEntity tae where " +
                " ((tae.id=:name_pr) or (:name_pr=-1))");
        query.setParameter("name_pr", TariffId);
        tmpList = query.list();
        for ( tariffEntity tae : tmpList){
            tariffPage tap = new tariffPage();
            tap.setTariffCost(tae.getCost());
            tap.setTariffDaypaymode(tae.getDaypaymode());
            tap.setTariffId(tae.getId());
            tap.setTariffValue(tae.getValue());
            tap.setServiceKeyId(tae.getService().getId());
            result.add(tap);
        }
        session.getTransaction().commit();
        session.close();
        return result;
    }
}

package pageEntity;

import DAO.findById;
import Factory.creatorSession;
import ent.*;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.omg.CORBA.DATA_CONVERSION;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class tariffPage {

    private int TariffId;
    private float TariffCost;
    private float TariffValue;
    private boolean TariffDaypaymode;


    public tariffPage INSERT(){
        tariffEntity taf = new tariffEntity();
        findById dao = new findById();
        Session session = creatorSession.getSessionFactory().openSession();
        session.beginTransaction();
        taf.setCost(TariffCost);
        taf.setDaypaymode(TariffDaypaymode);
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        taf.setCreate_time(timestamp);
        taf.setValue(TariffValue);
        for ( tariffEntity tae : dao.findServiceById(ServiceKeyId).getTariff()){
            tae.setState(false);
            session.update(tae);
        }
        taf.setState(true);
        taf.setService(dao.findServiceById(ServiceKeyId));
        //System.out.println(taf);
        session.save(taf);
        session.getTransaction().commit();
        TariffId = taf.getId();
        return this;
    }


    private int ServiceKeyId;

    public void setServiceKeyId(int serviceKeyId) {
        ServiceKeyId = serviceKeyId;
    }

    public int getServiceKeyId() {
        return ServiceKeyId;
    }

    public void setTariffId(int tariffId) {
        TariffId = tariffId;
    }

    public int getTariffId() {
        return TariffId;
    }

    public void setTariffCost(float tariffCost) {
        TariffCost = tariffCost;
    }

    public void setTariffDaypaymode(boolean tariffDaypaymode) {
        TariffDaypaymode = tariffDaypaymode;
    }

    public void setTariffValue(float tariffValue) {
        TariffValue = tariffValue;
    }

    public boolean isTariffDaypaymode() {
        return TariffDaypaymode;
    }

    public float getTariffCost() {
        return TariffCost;
    }

    public float getTariffValue() {
        return TariffValue;
    }


    @Override
    public String toString() {
        return "tariffPage::" + '\n' + "  " +
                "TariffId=" + TariffId +
                ", TariffCost=" + TariffCost +
                ", TariffValue=" + TariffValue +
                ", TariffDaypaymode=" + TariffDaypaymode +
                '\n';
    }
}

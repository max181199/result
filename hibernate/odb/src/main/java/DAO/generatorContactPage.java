package DAO;

import ent.*;
import org.hibernate.Session;
import Factory.creatorSession;
import org.hibernate.query.Query;
import pageEntity.contactPage;

import java.util.ArrayList;
import java.util.List;

public class generatorContactPage {

    private String ContactName = "";

    public String getContactName() {
        return ContactName;
    }

    public void setContactName(String contactName) {
        ContactName = contactName;
    }

    public List<contactPage> getPageContact(){
        List<contactPage> result = new ArrayList<contactPage>();
        List<contactEntity> tmpContact = new ArrayList<contactEntity>();
        Session session = creatorSession.getSessionFactory().openSession();
        session.beginTransaction();
        Query query = session.createQuery("from contactEntity coe where " +
                " ((coe.name=:name_pr) or (:name_pr=''))");
        query.setParameter("name_pr", ContactName);
        tmpContact = query.list();
        for ( contactEntity coe : tmpContact){
            contactPage cop = new contactPage();
            cop.setContactName(coe.getName());
            clientEntity ce = coe.getClient();
            cop.setClientKeyID(ce.getId());
            cop.setSecretContactKey(coe.getId());
            List<addresEntity> tmp_adr = new ArrayList<addresEntity>();
            tmp_adr.addAll(coe.getAddres());
            cop.setContactAddress(tmp_adr);
            List<phoneEntity> tmp_ph = new ArrayList<phoneEntity>();
            tmp_ph.addAll(coe.getPhone());
            cop.setContactPhone(tmp_ph);
            List<emailEntity> tmp_em = new ArrayList<emailEntity>();
            tmp_em.addAll(coe.getEmail());
            cop.setContactEmail(tmp_em);
            result.add(cop);
        }
        session.getTransaction().commit();
        return result;
    };
}

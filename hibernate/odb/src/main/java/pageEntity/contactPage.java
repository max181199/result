package pageEntity;

import Factory.creatorSession;
import ent.*;
import org.hibernate.Session;
import org.hibernate.query.Query;
import DAO.findById;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class contactPage {

    private int SecretContactKey;
    private String ContactName;
    private List<addresEntity> ContactAddress = new ArrayList<addresEntity>();
    private List<phoneEntity>  ContactPhone   = new ArrayList<phoneEntity>();
    private List<emailEntity>  ContactEmail   = new ArrayList<emailEntity>();

    private int ClientKeyID = 1;

    public void setClientKeyID(int clientKeyID) {
        ClientKeyID = clientKeyID;
    }

    public int getClientKeyID() {
        return ClientKeyID;
    }

    public contactPage UPDATE(){
        List<contactEntity> tmpList = new ArrayList<contactEntity>();
        Session session = creatorSession.getSessionFactory().openSession();
        session.beginTransaction();
        Query query = session.createQuery("from contactEntity coe where " +
                " coe.id=:id_pr");
        query.setParameter("id_pr", SecretContactKey);
        tmpList = query.list();
        for (contactEntity coe : tmpList) {
            coe.setName(ContactName);
            session.update(coe);
        }
        session.getTransaction().commit();
        return this;
    }

    public contactPage INSERT(){
        contactEntity coe = new contactEntity();
        findById dao = new findById();
        Session session = creatorSession.getSessionFactory().openSession();
        session.beginTransaction();
        coe.setName(ContactName);
        coe.setClient(dao.findClientById(ClientKeyID));
        session.save(coe);
        session.getTransaction().commit();
        SecretContactKey = coe.getId();
        return this;
    }

    public void DELETE(){
        List<contactEntity> tmpList = new ArrayList<contactEntity>();
        Session session = creatorSession.getSessionFactory().openSession();
        session.beginTransaction();
        Query query = session.createQuery("from contactEntity coe where " +
                " coe.id=:id_pr");
        query.setParameter("id_pr", SecretContactKey);
        tmpList = query.list();
        for (contactEntity coe : tmpList) {
                for (addresEntity ade : coe.getAddres()){
                    coe.setAddres(null);
                    ade.setContact(null);
                    session.delete(ade);
                }
                for ( emailEntity eme : coe.getEmail()){
                    coe.setEmail(null);
                    eme.setContact(null);
                    session.delete(eme);
                }
                for ( phoneEntity phe : coe.getPhone()){
                    phe.setContact(null);
                    coe.setPhone(null);
                    session.delete(phe);
                }
                coe.setClient(null);
                session.delete(coe);
        }
        session.getTransaction().commit();
        return;
    }

    public contactPage AddPhone( String AddPhonePr){
        phoneEntity phe = new phoneEntity();
        findById dao = new findById();
        Session session = creatorSession.getSessionFactory().openSession();
        session.beginTransaction();
        phe.setPhone(AddPhonePr);
        phe.setContact(dao.findContactById(SecretContactKey));
        session.save(phe);
        session.getTransaction().commit();
        ContactPhone.add(phe);
        return this;
    }

    public contactPage AddEmail( String AddEmailPr){
        emailEntity phe = new emailEntity();
        findById dao = new findById();
        Session session = creatorSession.getSessionFactory().openSession();
        session.beginTransaction();
        phe.setEmail(AddEmailPr);
        phe.setContact(dao.findContactById(SecretContactKey));
        session.save(phe);
        session.getTransaction().commit();
        ContactEmail.add(phe);
        return this;
    }

    public contactPage AddAddress( String AddAddressPr){
        addresEntity phe = new addresEntity();
        findById dao = new findById();
        Session session = creatorSession.getSessionFactory().openSession();
        session.beginTransaction();
        phe.setAddres(AddAddressPr);
        phe.setContact(dao.findContactById(SecretContactKey));
        session.save(phe);
        session.getTransaction().commit();
        ContactAddress.add(phe);
        return this;
    }

    public contactPage DeletePhone( String DeletePhonePr){
        Session session = creatorSession.getSessionFactory().openSession();
        List<phoneEntity> tmp = new ArrayList<phoneEntity>();
        for ( phoneEntity phe : ContactPhone){
            tmp.add(phe);
        }
        for ( phoneEntity phe : tmp){
            if( phe.getPhone().equals(DeletePhonePr)){
                session.beginTransaction();
                ContactPhone.remove(phe);
                session.delete(phe);
                session.getTransaction().commit();
            }
        }
        return this;
    }

    public contactPage DeleteEmail( String DeleteEmailPr){
        Session session = creatorSession.getSessionFactory().openSession();
        List<emailEntity> tmp = new ArrayList<emailEntity>();
        for ( emailEntity phe : ContactEmail){
            tmp.add(phe);
        }
        for ( emailEntity phe : tmp){
            if( phe.getEmail().equals(DeleteEmailPr)){
                session.beginTransaction();
                ContactEmail.remove(phe);
                session.delete(phe);
                session.getTransaction().commit();
            }
        }
        return this;
    }

    public contactPage DeleteAddress( String DeleteAddressPr){
        Session session = creatorSession.getSessionFactory().openSession();
        List<addresEntity> tmp = new ArrayList<addresEntity>();
        for ( addresEntity phe : ContactAddress){
            tmp.add(phe);
        }
        for ( addresEntity phe : tmp){
            if( phe.getAddres().equals(DeleteAddressPr)){
                session.beginTransaction();
                ContactAddress.remove(phe);
                session.delete(phe);
                session.getTransaction().commit();
            }
        }
        return this;
    }


    public void setSecretContactKey(int secretContactKey) {
        SecretContactKey = secretContactKey;
    }

    public int getSecretContactKey() {
        return SecretContactKey;
    }

    public void setContactAddress(List<addresEntity> contactAddress) {
        ContactAddress = contactAddress;
    }

    public List<addresEntity> getContactAddress() {
        return ContactAddress;
    }

    public void setContactEmail(List<emailEntity> contactEmail) {
        ContactEmail = contactEmail;
    }

    public List<emailEntity> getContactEmail() {
        return ContactEmail;
    }

    public void setContactName(String contactName) {
        ContactName = contactName;
    }

    public String getContactName() {
        return ContactName;
    }

    public void setContactPhone(List<phoneEntity> contactPhone) {
        ContactPhone = contactPhone;
    }

    public List<phoneEntity> getContactPhone() {
        return ContactPhone;
    }

    @Override
    public String toString() {
        String result = "";
        result= result+ "ContactPage:: " + '\n' + "  " + "ContactName= " + ContactName + '\n';
        for ( addresEntity adr : ContactAddress){
            result=result + "    "  + adr.toString() + '\n';
        }
        for ( phoneEntity ph : ContactPhone){
            result=result + "    " + ph.toString() + '\n';
        }
        for ( emailEntity em : ContactEmail){
            result=result + "    " + em.toString() + '\n';
        }
        return result;
    }
}

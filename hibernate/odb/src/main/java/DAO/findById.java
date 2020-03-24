package DAO;

import ent.clientEntity;
import ent.accountEntity;
import ent.contactEntity;
import ent.phoneEntity;
import ent.addresEntity;
import ent.tariffEntity;
import ent.serviceEntity;
import ent.historyServiceEntity;
import ent.historyBalanceEntity;
import ent.emailEntity;

import org.hibernate.Session;
import Factory.creatorSession;

public class findById {

    public clientEntity findClientById(int id) {
        return creatorSession.getSessionFactory()
                .openSession().get( clientEntity.class, id);
    }

    public accountEntity findAccountById(int id) {
        return creatorSession.getSessionFactory()
                .openSession().get( accountEntity.class, id);
    }

    public contactEntity findContactById(int id) {
        return creatorSession.getSessionFactory()
                .openSession().get( contactEntity.class, id);
    }

    public phoneEntity findPhoneById(int id) {
        return creatorSession.getSessionFactory()
                .openSession().get( phoneEntity.class, id);
    }


    public addresEntity findAddressById(int id) {
        return creatorSession.getSessionFactory()
                .openSession().get( addresEntity.class, id);
    }

    public emailEntity findEmailById(int id) {
        return creatorSession.getSessionFactory()
                .openSession().get( emailEntity.class, id);
    }

    public tariffEntity findTariffById(int id) {
        return creatorSession.getSessionFactory()
                .openSession().get( tariffEntity.class, id);
    }

    public serviceEntity findServiceById(int id) {
        return creatorSession.getSessionFactory()
                .openSession().get( serviceEntity.class, id);
    }

    public historyBalanceEntity findHistoryBalanceById(int id) {
        return creatorSession.getSessionFactory()
                .openSession().get( historyBalanceEntity.class, id);
    }

    public historyServiceEntity findHistoryServiceById(int id) {
        return creatorSession.getSessionFactory()
                .openSession().get( historyServiceEntity.class, id);
    }

}

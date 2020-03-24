package Factory;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import ent.accountEntity;
import ent.clientEntity;
import ent.contactEntity;
import ent.phoneEntity;
import ent.addresEntity;
import ent.emailEntity;
import ent.tariffEntity;
import ent.serviceEntity;
import ent.historyServiceEntity;
import ent.historyBalanceEntity;

public class creatorSession {

    private static SessionFactory sessionFactory;

    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            try {
                Configuration configuration = new Configuration().configure();
                configuration.addAnnotatedClass(clientEntity.class);
                configuration.addAnnotatedClass(accountEntity.class);
                configuration.addAnnotatedClass(contactEntity.class);
                configuration.addAnnotatedClass(phoneEntity.class);
                configuration.addAnnotatedClass(addresEntity.class);
                configuration.addAnnotatedClass(emailEntity.class);
                configuration.addAnnotatedClass(tariffEntity.class);
                configuration.addAnnotatedClass(serviceEntity.class);
                configuration.addAnnotatedClass(historyServiceEntity.class);
                configuration.addAnnotatedClass(historyBalanceEntity.class);
                sessionFactory = configuration.buildSessionFactory();

            } catch (Exception e) {
                System.out.println("Client Исключение :: " + e);
            }
        }
        return sessionFactory;
    }
}

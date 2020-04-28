package DAO;

import ent.*;
import org.hibernate.Session;
import Factory.creatorSession;
import org.hibernate.query.Query;
import pageEntity.clientPage;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;


public class generatorClientPages {

    private String clientName = "";

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    private int balance = 0;

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    private  boolean debt = false;

    public void setDebt(boolean debt) {
        this.debt = debt;
    }

    public String serviceName = "";

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getServiceName() {
        return serviceName;
    }

    public Date serviceTopDate = null;

    public void setServiceTopDate(Date serviceTopDate) {
        this.serviceTopDate = serviceTopDate;
    }

    public Date getServiceTopDate() {
        return serviceTopDate;
    }

    public Date serviceDownDate = null;

    public Date getServiceDownDate() {
        return serviceDownDate;
    }

    public void setServiceDownDate(Date serviceDownDate) {
        this.serviceDownDate = serviceDownDate;
    }

    private boolean ServiceFilterOne(Set<historyServiceEntity> setService, String SN, Date TopDate, Date DownDate ){
      for ( historyServiceEntity entity : setService) {
          //System.out.println(entity.getService().getName().equals(SN)  );


          if ((TopDate == null) & (DownDate == null)) {
              if ((entity.getService().getName().equals(SN)) & ((entity.getEnd_time() == null))) {
                  return true;
              }
          }

          if ((TopDate == null) & (DownDate != null)) {
              //System.out.println(entity.getBegin_time().getTime()  + " :: "+ DownDate.getTime()  );
              if ((entity.getService().getName().equals(SN)) & ((entity.getEnd_time() == null))
                    & (entity.getBegin_time().getTime() > DownDate.getTime())
                 ) {
                  return true;
              }
          }

          if ((TopDate != null) & (DownDate == null)) {
              if ((entity.getEnd_time() != null)){
                  if ((entity.getService().getName().equals(SN))
                          & (entity.getEnd_time().getTime() < TopDate.getTime())
                  ) {
                     // System.out.println(entity.getEnd_time().getTime() + "  ::  " + TopDate.getTime() );
                      return true;
                  }
              }
          }

          if ((TopDate != null) & (DownDate != null)) {
              if ((entity.getEnd_time() != null)){
                 // System.out.println(entity.getBegin_time().getTime() + "  ::  " + TopDate.getTime() + " :: "+ DownDate.getTime()  );
                  if ((entity.getService().getName().equals(SN))
                          & (entity.getEnd_time().getTime() < TopDate.getTime()) & (entity.getBegin_time().getTime() > DownDate.getTime())
                  ) {
                      return true;
                  }
              }
          }

      }
      return false;
    };

    public List<clientPage> getPageClient() {
        List<clientPage> result= new ArrayList<clientPage>();
        List<clientEntity> tmpList = null;

        Session session = creatorSession.getSessionFactory().openSession();
        session.beginTransaction();
        Query query = session.createQuery("from clientEntity cle where " +
                " ((cle.name=:name_pr) or (:name_pr=''))");
        query.setParameter("name_pr",clientName);
        tmpList=query.list();
        for ( clientEntity ent : tmpList ){
           // System.out.println(serviceName);
            if ( (((balance == 2) & (ent.getAccount().getBalance() >= 0)) ||
                  ((balance == 1) & (ent.getAccount().getBalance() < 0))  || (balance==0)) &
                  ((debt) & (ent.getAccount().getCredit_day() > 0) || !(debt)) &
                    ((ServiceFilterOne(ent.getHistory_service(),serviceName,serviceTopDate,serviceDownDate)) || (serviceName.equals("")))
            ){
                clientPage page = new clientPage();
                page.setSecretKey(ent.getId());

                page.setClientName(ent.getName());
                page.setClientBalance(ent.getAccount().getBalance());
                page.setClientDebt(ent.getAccount().getCredit_day());
                result.add(page);
            }

        }
        session.getTransaction().commit();
        session.close();
        return result;
    }

}

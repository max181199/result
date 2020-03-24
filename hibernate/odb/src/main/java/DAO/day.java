package DAO;

import ent.*;
import Factory.*;
import org.hibernate.query.Query;
import pageEntity.*;
import org.hibernate.Session;

import java.sql.Timestamp;
import java.util.*;

public class day {

    private Calendar DataOfTheDay;

    public Calendar getDataOfTheDay() {
        return DataOfTheDay;
    }

    public void setDataOfTheDay(Calendar dataOfTheDay) {
        DataOfTheDay = dataOfTheDay;
    }

   public void DaysGone(){
       List<clientEntity> tmpList = null;
       Session session = creatorSession.getSessionFactory().openSession();
       session.beginTransaction();
       Query query = session.createQuery("from clientEntity cle");
       tmpList = query.list();
       for ( clientEntity cle : tmpList){
           List<historyServiceEntity> tmpl = new ArrayList<historyServiceEntity>();
           for (historyServiceEntity hse : cle.getHistory_service()){
               tmpl.add(hse);
           }
           for ( historyServiceEntity hes : tmpl){
               //System.out.println(hes);
               if ( hes.getEnd_time() == null ){
                    serviceEntity see = hes.getService();
                    accountEntity ace = cle.getAccount();
                    tariffEntity taf = new tariffEntity() ;
                    for( tariffEntity ta : see.getTariff() ){
                        if ( ta.getState()){
                            taf = ta;
                        }
                    }

                    if (taf.getId() == 0){continue;}

                   if ( ((taf.getDaypaymode()==false) && (DataOfTheDay.get(Calendar.DAY_OF_MONTH)== 27))
                            || (taf.getDaypaymode() == true) ){
                        float count = ace.getBalance() - taf.getCost();
                        ace.setBalance(count);
                        historyBalanceEntity hbe = new historyBalanceEntity();
                        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
                        hbe.setOp_time(timestamp);
                        hbe.setSumm(taf.getCost());
                        hbe.setClient(cle);
                        findById dao = new findById();
                       // System.out.println(taf);
                       //System.out.println(see.getTariff());
                        hbe.setService(dao.findServiceById((int)taf.getService().getId()));
                        session.merge(ace);
                        session.save(hbe);
                    }
                }
           }
       }

       Query query2 = session.createQuery("from accountEntity ace");
       List<accountEntity> tmpList2 = query2.list();
       for ( accountEntity ace : tmpList2){
           if (ace.getBalance() < 0){
               float cr =  ace.getCredit_day() + 1;
               ace.setCredit_day(cr);
           }
       }

       session.getTransaction().commit();
        return;
   }



}

package mx;

import org.junit.Test;
import org.testng.Assert;
import DAO.*;
import pageEntity.*;
import ent.*;

import org.hibernate.Session;
import Factory.*;
import org.hibernate.query.Query;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class test_day {

    @Test
    public void dao_day_test(){
        findById dao = new findById();
        day daygone = new day();
        accountEntity ace = new accountEntity();

        Assert.assertEquals((int)dao.findAccountById(1).getBalance(),0,"AS1");
        Assert.assertEquals((int)dao.findAccountById(2).getBalance(),400,"AS2");
        Assert.assertEquals((int)dao.findAccountById(3).getBalance(),-100,"AS3");
        Assert.assertEquals((int)dao.findAccountById(4).getBalance(),-200,"AS4");
        Assert.assertEquals((int)dao.findAccountById(5).getBalance(),10000,"AS5");

        Assert.assertEquals((int)dao.findAccountById(1).getCredit_day(),0,"AS6");
        Assert.assertEquals((int)dao.findAccountById(2).getCredit_day(),0,"AS7");
        Assert.assertEquals((int)dao.findAccountById(3).getCredit_day(),10,"AS8");
        Assert.assertEquals((int)dao.findAccountById(4).getCredit_day(),1,"AS9");
        Assert.assertEquals((int)dao.findAccountById(5).getCredit_day(),0,"AS10");

        Calendar calendar = new GregorianCalendar(2020 , 2 , 3);
        daygone.setDataOfTheDay(calendar);
        daygone.DaysGone();
//
      // System.out.println((int)dao.findAccountById(1).getBalance());
        Assert.assertEquals((int)dao.findAccountById(1).getBalance(),-400,"AS11");
        Assert.assertEquals((int)dao.findAccountById(2).getBalance(),0,"AS12");
        Assert.assertEquals((int)dao.findAccountById(3).getBalance(),-500,"AS13");
        Assert.assertEquals((int)dao.findAccountById(4).getBalance(),-200,"AS14");
        Assert.assertEquals((int)dao.findAccountById(5).getBalance(),9600,"AS15");

        Assert.assertEquals((int)dao.findAccountById(1).getCredit_day(),1,"AS16");
        Assert.assertEquals((int)dao.findAccountById(2).getCredit_day(),0,"AS17");
        Assert.assertEquals((int)dao.findAccountById(3).getCredit_day(),11,"AS18");
        Assert.assertEquals((int)dao.findAccountById(4).getCredit_day(),2,"AS19");
        Assert.assertEquals((int)dao.findAccountById(5).getCredit_day(),0,"AS20");

        List<historyBalanceEntity> tmpList = null;
        Session session = creatorSession.getSessionFactory().openSession();
        session.beginTransaction();
        Query query = session.createQuery("from historyBalanceEntity hes ");
        tmpList = query.list();
        for (historyBalanceEntity hes : tmpList){
            if ( hes.getOp_time().getYear() > (100) ){
                Assert.assertEquals((int)dao.findHistoryBalanceById(hes.getId()).getService().getId(),5);
                Assert.assertEquals((int)dao.findHistoryBalanceById(hes.getId()).getSumm(),400);
            }
        }
        session.getTransaction().commit();

        calendar = new GregorianCalendar(2020 , 2 , 27);
        daygone.setDataOfTheDay(calendar);
        daygone.DaysGone();

        Assert.assertEquals((int)dao.findAccountById(1).getBalance(),-1000,"AS21");
        Assert.assertEquals((int)dao.findAccountById(2).getBalance(),-400,"As22");
        Assert.assertEquals((int)dao.findAccountById(3).getBalance(),-1100,"AS23");
        Assert.assertEquals((int)dao.findAccountById(4).getBalance(),-400,"AS24");
        Assert.assertEquals((int)dao.findAccountById(5).getBalance(),9000,"AS25");

        Assert.assertEquals((int)dao.findAccountById(1).getCredit_day(),2,"AS26");
        Assert.assertEquals((int)dao.findAccountById(2).getCredit_day(),1,"AS27");
        Assert.assertEquals((int)dao.findAccountById(3).getCredit_day(),12,"AS28");
        Assert.assertEquals((int)dao.findAccountById(4).getCredit_day(),3,"AS29");
        Assert.assertEquals((int)dao.findAccountById(5).getCredit_day(),0,"AS30");
    }
}

package mx;

import org.junit.Test;
import org.junit.Assert;

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

        Assert.assertEquals("as1",0,(int)dao.findAccountById(1).getBalance());
        ///Assert.assertEquals((int)dao.findAccountById(1).getBalance(),0,"AS1");
        Assert.assertEquals("as2",400,(int)dao.findAccountById(2).getBalance());
        //Assert.assertEquals((int)dao.findAccountById(2).getBalance(),400,"AS2");
        Assert.assertEquals("as3",-100,(int)dao.findAccountById(3).getBalance());
        //Assert.assertEquals((int)dao.findAccountById(3).getBalance(),-100,"AS3");
        Assert.assertEquals("as4",-200,(int)dao.findAccountById(4).getBalance());
        //Assert.assertEquals((int)dao.findAccountById(4).getBalance(),-200,"AS4");
        Assert.assertEquals("as5",10000,(int)dao.findAccountById(5).getBalance());
       // Assert.assertEquals((int)dao.findAccountById(5).getBalance(),10000,"AS5");

        Assert.assertEquals("as6",0,(int)dao.findAccountById(1).getCredit_day());
        //Assert.assertEquals((int)dao.findAccountById(1).getCredit_day(),0,"AS6");
        Assert.assertEquals("as7",0,(int)dao.findAccountById(2).getCredit_day());
        //Assert.assertEquals((int)dao.findAccountById(2).getCredit_day(),0,"AS7");
        Assert.assertEquals("as8",10,(int)dao.findAccountById(3).getCredit_day());
        //Assert.assertEquals((int)dao.findAccountById(3).getCredit_day(),10,"AS8");
        Assert.assertEquals("as9",1,(int)dao.findAccountById(4).getCredit_day());
        //Assert.assertEquals((int)dao.findAccountById(4).getCredit_day(),1,"AS9");
        Assert.assertEquals("as10",0,(int)dao.findAccountById(5).getCredit_day());
        //Assert.assertEquals((int)dao.findAccountById(5).getCredit_day(),0,"AS10");

        Calendar calendar = new GregorianCalendar(2020 , 2 , 3);
        daygone.setDataOfTheDay(calendar);
        daygone.DaysGone();
//
      // System.out.println((int)dao.findAccountById(1).getBalance());
        Assert.assertEquals("as11",-400,(int)dao.findAccountById(1).getBalance());
        //Assert.assertEquals((int)dao.findAccountById(1).getBalance(),-400,"AS11");
        Assert.assertEquals("as12",0,(int)dao.findAccountById(2).getBalance());
        //Assert.assertEquals((int)dao.findAccountById(2).getBalance(),0,"AS12");
        Assert.assertEquals("as13",-500,(int)dao.findAccountById(3).getBalance());
        //Assert.assertEquals((int)dao.findAccountById(3).getBalance(),-500,"AS13");
        Assert.assertEquals("as14",-200,(int)dao.findAccountById(4).getBalance());
        //Assert.assertEquals((int)dao.findAccountById(4).getBalance(),-200,"AS14");
        Assert.assertEquals("as15",9600,(int)dao.findAccountById(5).getBalance());
        //Assert.assertEquals((int)dao.findAccountById(5).getBalance(),9600,"AS15");

        Assert.assertEquals("as16",1,(int)dao.findAccountById(1).getCredit_day());
        //Assert.assertEquals((int)dao.findAccountById(1).getCredit_day(),1,"AS16");
        Assert.assertEquals("as17",0,(int)dao.findAccountById(2).getCredit_day());
        //Assert.assertEquals((int)dao.findAccountById(2).getCredit_day(),0,"AS17");
        Assert.assertEquals("as18",11,(int)dao.findAccountById(3).getCredit_day());
        //Assert.assertEquals((int)dao.findAccountById(3).getCredit_day(),11,"AS18");
        Assert.assertEquals("as19",2,(int)dao.findAccountById(4).getCredit_day());
        //Assert.assertEquals((int)dao.findAccountById(4).getCredit_day(),2,"AS19");
        Assert.assertEquals("as20",0,(int)dao.findAccountById(5).getCredit_day());
        //Assert.assertEquals((int)dao.findAccountById(5).getCredit_day(),0,"AS20");

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

        Assert.assertEquals("as21",-1000,(int)dao.findAccountById(1).getBalance());
        //Assert.assertEquals((int)dao.findAccountById(1).getBalance(),-1000,"AS21");
        Assert.assertEquals("as22",-400,(int)dao.findAccountById(2).getBalance());
        //Assert.assertEquals((int)dao.findAccountById(2).getBalance(),-400,"As22");
        Assert.assertEquals("as23",-1100,(int)dao.findAccountById(3).getBalance());
        //Assert.assertEquals((int)dao.findAccountById(3).getBalance(),-1100,"AS23");
        Assert.assertEquals("as24",-400,(int)dao.findAccountById(4).getBalance());
        //Assert.assertEquals((int)dao.findAccountById(4).getBalance(),-400,"AS24");
        Assert.assertEquals("as25",9000,(int)dao.findAccountById(5).getBalance());
        //Assert.assertEquals((int)dao.findAccountById(5).getBalance(),9000,"AS25");

        Assert.assertEquals("as26",2,(int)dao.findAccountById(1).getCredit_day());
        //Assert.assertEquals((int)dao.findAccountById(1).getCredit_day(),2,"AS26");
        Assert.assertEquals("as27",1,(int)dao.findAccountById(2).getCredit_day());
        //Assert.assertEquals((int)dao.findAccountById(2).getCredit_day(),1,"AS27");
        Assert.assertEquals("as28",12,(int)dao.findAccountById(3).getCredit_day());
        //Assert.assertEquals((int)dao.findAccountById(3).getCredit_day(),12,"AS28");
        Assert.assertEquals("as29",3,(int)dao.findAccountById(4).getCredit_day());
        //Assert.assertEquals((int)dao.findAccountById(4).getCredit_day(),3,"AS29");
        Assert.assertEquals("as30",0,(int)dao.findAccountById(5).getCredit_day());
        //Assert.assertEquals((int)dao.findAccountById(5).getCredit_day(),0,"AS30");
    }
}

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

        Assert.assertEquals((int)dao.findAccountById(1).getBalance(),0);
        Assert.assertEquals((int)dao.findAccountById(2).getBalance(),400);
        Assert.assertEquals((int)dao.findAccountById(3).getBalance(),-100);
        Assert.assertEquals((int)dao.findAccountById(4).getBalance(),-200);
        Assert.assertEquals((int)dao.findAccountById(5).getBalance(),10000);

        Assert.assertEquals((int)dao.findAccountById(1).getCredit_day(),0);
        Assert.assertEquals((int)dao.findAccountById(2).getCredit_day(),0);
        Assert.assertEquals((int)dao.findAccountById(3).getCredit_day(),10);
        Assert.assertEquals((int)dao.findAccountById(4).getCredit_day(),1);
        Assert.assertEquals((int)dao.findAccountById(5).getCredit_day(),0);

        Calendar calendar = new GregorianCalendar(2020 , 2 , 3);
        daygone.setDataOfTheDay(calendar);
        daygone.DaysGone();

        Assert.assertEquals((int)dao.findAccountById(1).getBalance(),-400);
        Assert.assertEquals((int)dao.findAccountById(2).getBalance(),0);
        Assert.assertEquals((int)dao.findAccountById(3).getBalance(),-500);
        Assert.assertEquals((int)dao.findAccountById(4).getBalance(),-200);
        Assert.assertEquals((int)dao.findAccountById(5).getBalance(),9600);

        Assert.assertEquals((int)dao.findAccountById(1).getCredit_day(),1);
        Assert.assertEquals((int)dao.findAccountById(2).getCredit_day(),0);
        Assert.assertEquals((int)dao.findAccountById(3).getCredit_day(),11);
        Assert.assertEquals((int)dao.findAccountById(4).getCredit_day(),2);
        Assert.assertEquals((int)dao.findAccountById(5).getCredit_day(),0);

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

        Assert.assertEquals((int)dao.findAccountById(1).getBalance(),-1000);
        Assert.assertEquals((int)dao.findAccountById(2).getBalance(),-400);
        Assert.assertEquals((int)dao.findAccountById(3).getBalance(),-1100);
        Assert.assertEquals((int)dao.findAccountById(4).getBalance(),-400);
        Assert.assertEquals((int)dao.findAccountById(5).getBalance(),9000);

        Assert.assertEquals((int)dao.findAccountById(1).getCredit_day(),2);
        Assert.assertEquals((int)dao.findAccountById(2).getCredit_day(),1);
        Assert.assertEquals((int)dao.findAccountById(3).getCredit_day(),12);
        Assert.assertEquals((int)dao.findAccountById(4).getCredit_day(),3);
        Assert.assertEquals((int)dao.findAccountById(5).getCredit_day(),0);
    }
}

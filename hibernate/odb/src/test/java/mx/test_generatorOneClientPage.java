package mx;

import org.junit.Test;
import org.junit.Assert;
//import org.testng.Assert;
import DAO.*;
import pageEntity.*;
import ent.*;

import org.hibernate.Session;
import Factory.*;
import org.hibernate.query.Query;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

public class test_generatorOneClientPage {

    @Test
    public void genTestOCLP(){
        generatorOneClientPage genOneClientPage = new generatorOneClientPage();
        genOneClientPage.setClientName("Milton Bostock");
        List<oneClientPage> tmp2 = genOneClientPage.getPageOneClient();
        for ( oneClientPage ent : tmp2){
            if (!ent.getName().equals("Milton Bostock")){
                Assert.fail();
            }
            for (addresEntity ade : ent.getAddress()){
                if (!ade.getAddres().equals("75 Mill Pond Avenue North Bergen, NJ 07047")){
                    Assert.fail();
                }
            }
            for (phoneEntity phe : ent.getPhone()){
                if (!phe.getPhone().equals("8-800-555-3535")){
                    Assert.fail();
                }
            }
            for (emailEntity ema : ent.getEmail()){
                if (!ema.getEmail().equals("mil_bos@mail.ru")){
                    Assert.fail();
                }
            }
        }


        genOneClientPage.setBalanceNameService("BalanceUP");
        tmp2 = genOneClientPage.getPageOneClient();
        for ( oneClientPage ent : tmp2){
            for (historyBalanceEntity hes : ent.getBalanceHistory()){
                if (!hes.getService().getName().equals("BalanceUP") ){
                    Assert.fail();
                }
            }
        }
        genOneClientPage.setBalanceNameService("");


        genOneClientPage.setBalanceCountFilter(true);
        genOneClientPage.setBalanceCount(400);
        tmp2 = genOneClientPage.getPageOneClient();
        for ( oneClientPage ent : tmp2){
            for (historyBalanceEntity hes : ent.getBalanceHistory()){
                if (hes.getSumm() != 400 ){
                    Assert.fail();
                }
            }
        }
        genOneClientPage.setBalanceCountFilter(false);


        Calendar calendar = new GregorianCalendar(1997, 0 , 8);
        genOneClientPage.setBalanceDate(calendar.getTime());
        genOneClientPage.setBalanceDateFilter(true);
        tmp2 = genOneClientPage.getPageOneClient();
        for ( oneClientPage ent : tmp2){
            for (historyBalanceEntity hes : ent.getBalanceHistory()){
                if (hes.getId() != 1 ){
                    Assert.fail();
                }
            }
        }
        genOneClientPage.setBalanceDateFilter(false);

        genOneClientPage.setServiceServiceName("push_service");
        tmp2 = genOneClientPage.getPageOneClient();
        for ( oneClientPage ent : tmp2){
            for (historyServiceEntity hse : ent.getServiceHistory()){
                if ( !hse.getService().getName().equals("push_service")){
                    Assert.fail();
                }
            }
        }
        genOneClientPage.setServiceServiceName("");


        genOneClientPage.setServiceStateFilter(true);
        genOneClientPage.setServiceState(50);
        tmp2 = genOneClientPage.getPageOneClient();
        for ( oneClientPage ent : tmp2){
            for (historyServiceEntity hse : ent.getServiceHistory()){
                if ( (int)hse.getState() != 50){
                    Assert.fail();
                }
            }
        }
        genOneClientPage.setServiceStateFilter(false);

        calendar = new GregorianCalendar(1999 , 1 , 1);
        genOneClientPage.setServiceTopDateFilter(true);
        genOneClientPage.setServiceTopDate(calendar.getTime());
        calendar = new GregorianCalendar(1998 , 4 , 23);
        genOneClientPage.setServiceBottomDateFilter(true);
        genOneClientPage.setServiceBottomDate(calendar.getTime());
        tmp2 = genOneClientPage.getPageOneClient();
        for ( oneClientPage ent : tmp2){
            //System.out.println(tmp2);
            for (historyServiceEntity hse : ent.getServiceHistory()){
                if ( (int)hse.getId() != 1){
                    Assert.fail();
                }
            }
        }
        genOneClientPage.setServiceTopDateFilter(false);
        genOneClientPage.setServiceBottomDateFilter(false);

        calendar = new GregorianCalendar(1998 , 4 , 23);
        genOneClientPage.setServiceBottomDateFilter(true);
        genOneClientPage.setServiceBottomDate(calendar.getTime());
        tmp2 = genOneClientPage.getPageOneClient();
        for ( oneClientPage ent : tmp2){
            //System.out.println(tmp2);
            for (historyServiceEntity hse : ent.getServiceHistory()){
                if ( ((int)hse.getId() != 1) ){
                    Assert.fail();
                }
            }
        }
        genOneClientPage.setServiceBottomDateFilter(false);

        calendar = new GregorianCalendar(1998 , 1 , 1);
        genOneClientPage.setServiceTopDateFilter(true);
        genOneClientPage.setServiceTopDate(calendar.getTime());
        tmp2 = genOneClientPage.getPageOneClient();
        for ( oneClientPage ent : tmp2){
            //System.out.println(tmp2);
            for (historyServiceEntity hse : ent.getServiceHistory()){
                if ( ((int)hse.getId() != 17) ){
                    Assert.fail();
                }
            }
        }
        genOneClientPage.setServiceBottomDateFilter(false);

    }
}

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

public class test_generatorClientPages {

    @Test
    public void genTestCLP(){

        generatorClientPages genClientPage = new generatorClientPages();
        genClientPage.setClientName("Milton Bostock");
        List<clientPage>  tmp = genClientPage.getPageClient();
        for ( clientPage ent : tmp){
            Assert.assertEquals("Milton Bostock",ent.getClientName());
            //Assert.assertEquals(ent.getClientName(),"Milton Bostock");
        }
        genClientPage.setClientName("");

        genClientPage.setBalance(2);
        tmp = genClientPage.getPageClient();
        for ( clientPage ent : tmp){
            if (ent.getClientBalance() < 0 ){
                Assert.fail();
            }
        }
        genClientPage.setBalance(0);

        genClientPage.setDebt(true);
        tmp = genClientPage.getPageClient();
        for ( clientPage ent : tmp){
            if (ent.getClientDebt() <= 0 ){
                Assert.fail();
            }
        }
        genClientPage.setDebt(false);

        genClientPage.setServiceName("internet");
        tmp = genClientPage.getPageClient();
        for ( clientPage ent : tmp){
            if (ent.getClientName() == "Zayden Gould"){
                Assert.fail();
            }
        }
        genClientPage.setServiceName("");

        genClientPage.setServiceName("push_service");
        SimpleDateFormat ft = new SimpleDateFormat ("dd.MM.yyyy");
        Date parsingDate = new Date();
        try {
            parsingDate = ft.parse("28.2.2000");
            System.out.println(parsingDate);
        }catch (ParseException e) {
            System.out.println("Нераспаршена с помощью " + ft);
        }
        genClientPage.setServiceTopDate(parsingDate);
        tmp = genClientPage.getPageClient();
        for ( clientPage ent : tmp){
            Assert.fail();
        }
        genClientPage.setServiceTopDate(null);


        genClientPage.setServiceName("push_service");
        ft = new SimpleDateFormat ("dd.MM.yyyy");
        parsingDate = new Date();
        try {
            parsingDate = ft.parse("28.2.2000");
            System.out.println(parsingDate);
        }catch (ParseException e) {
            System.out.println("Нераспаршена с помощью " + ft);
        }
        genClientPage.setServiceDownDate(parsingDate);
        tmp = genClientPage.getPageClient();
        for ( clientPage ent : tmp){
            if (ent.getClientName() == "Milton Bostock"){
                Assert.fail();
            }
        }


    }

}

package mx;

import org.junit.Test;
import org.testng.Assert;
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

public class test_generatorServicePage {

    @Test
    public void genTestSP(){
        generatorServicePage genServicePage = new generatorServicePage();
        genServicePage.setServiceName("push_service");
        List<servicePage> tmp4 = genServicePage.getPageService();
        for( servicePage sep: tmp4){
            if (!sep.getServiceName().equals("push_service")){
                Assert.assertEquals(0,1);
            }
        }
        genServicePage.setServiceName("");

        genServicePage.setServiceActualFilter(true);
        tmp4 = genServicePage.getPageService();
        for( servicePage sep: tmp4){
           if ( !sep.ServiceActual){
               Assert.assertEquals(0,1);
           }
        }
        genServicePage.setServiceActualFilter(false);



        genServicePage.setServiceType("BALANCE");
        tmp4 = genServicePage.getPageService();
        for( servicePage sep: tmp4){
            if (!sep.getServiceType().equals("BALANCE")){
                Assert.assertEquals(0,1);
            }
        }
        genServicePage.setServiceType("");

        genServicePage.setServiceTariffId(7);
        genServicePage.setServiceTariffIdFilter(true);
        tmp4 = genServicePage.getPageService();
        for( servicePage sep: tmp4){
            if (sep.getServiceTariff().getId() != 7 ){
                Assert.assertEquals(0,1);
            }
        }
        genServicePage.setServiceTariffIdFilter(false);


    }

}

package mx;

import org.junit.Test;
//import org.testng.Assert;
import org.junit.Assert;
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

public class test_generatorOneServicePage {

    @Test
    public void genTestOSP(){
        generatorOneServicePage genOneServicePage = new generatorOneServicePage();
        List<oneServicePage> tmp5 = genOneServicePage.getPageOneService();

        genOneServicePage.setServiceName("BalanceDOWN");
        tmp5 = genOneServicePage.getPageOneService();
        for ( oneServicePage osp : tmp5){
            if (!osp.getName().equals("BalanceDOWN")){
                Assert.fail();
            }
        }
        genOneServicePage.setServiceName("");

        genOneServicePage.setServiceTariffId(7);
        genOneServicePage.setServiceTariffIdFilter(true);
        tmp5 = genOneServicePage.getPageOneService();
        for ( oneServicePage osp : tmp5){
            for (tariffEntity taf : osp.getTariff()){
                if(taf.getId() != 7){
                    Assert.fail();
                }
            }
        }
        genOneServicePage.setServiceTariffIdFilter(false);

        genOneServicePage.setServiceTariffActual(true);
        genOneServicePage.setServiceTariffActualFilter(true);
        tmp5 = genOneServicePage.getPageOneService();
        for ( oneServicePage osp : tmp5){
            for (tariffEntity taf : osp.getTariff()){
                if(taf.getState() == false){
                    Assert.fail();
                }
            }
        }
        genOneServicePage.setServiceTariffActualFilter(false);


        genOneServicePage.setServiceTariffCost(2);
        genOneServicePage.setServiceTariffCostFilter(true);
        tmp5 = genOneServicePage.getPageOneService();
        for ( oneServicePage osp : tmp5){
            for (tariffEntity taf : osp.getTariff()){
                if((int)taf.getCost() != 2){
                    Assert.fail();
                }
            }
        }
        genOneServicePage.setServiceTariffCostFilter(false);


        genOneServicePage.setServiceTariffDaypaymode(true);
        genOneServicePage.setServiceTariffDaypaymodeFilter(true);
        tmp5 = genOneServicePage.getPageOneService();
        for ( oneServicePage osp : tmp5){
            for (tariffEntity taf : osp.getTariff()){
                if( taf.getDaypaymode() == false){
                    Assert.fail();
                }
            }
        }
        genOneServicePage.setServiceTariffDaypaymodeFilter(false);


        genOneServicePage.setServiceTariffValue(777);
        genOneServicePage.setServiceTariffValueFilter(true);
        tmp5 = genOneServicePage.getPageOneService();
        for ( oneServicePage osp : tmp5){
            for (tariffEntity taf : osp.getTariff()){
                if( taf.getValue() != 777){
                    Assert.fail();
                }
            }
        }
        genOneServicePage.setServiceTariffValueFilter(false);

        Calendar calendar = new GregorianCalendar(1999 , 0 , 8);
        genOneServicePage.setServiceTariffDate(calendar.getTime());
        genOneServicePage.setServiceTariffDateFilter(true);
        tmp5 = genOneServicePage.getPageOneService();
        for ( oneServicePage osp : tmp5){
            for (tariffEntity taf : osp.getTariff()){
                if(taf.getId() != 3){
                    Assert.fail();
                }
            }
        }
        genOneServicePage.setServiceTariffDateFilter(false);

    }
}

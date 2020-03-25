package mx;

import org.junit.Test;
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


public class test_generatorTariffPage {

    @Test
    public void genTestTP(){
        generatorTariffPage getTariffPage = new generatorTariffPage();
        getTariffPage.setTariffId(7);
        List<tariffPage> tmp6 = getTariffPage.getPageTariff();
        for ( tariffPage tap : tmp6){
            if ( tap.getTariffId() != 7){
                Assert.fail();
            }
        }
    }
}

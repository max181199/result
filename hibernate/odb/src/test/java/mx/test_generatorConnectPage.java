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

import javax.swing.text.html.parser.Entity;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;


public class test_generatorConnectPage {

    @Test
    public void  genTestCOP(){
        generatorConnectPage getConnectPage = new generatorConnectPage();
        getConnectPage.setClinetBacklID(1);
        List<connectPage> trump7 = getConnectPage.getPageConnect();
        for ( connectPage cop : trump7){
            for (serviceEntity see : cop.getAddServiceList()){
                if ((see.getId() == 1) || (see.getId() == 2)){
                    Assert.fail();
                }
            }
        }
    }

}

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

public class test_generatorContactPage {
    @Test
    public void  genTestCP(){
        generatorContactPage genContactPage = new generatorContactPage();
        genContactPage.setContactName("Milton Bostock");
        List<contactPage> trump3 = genContactPage.getPageContact();
        for ( contactPage cnp : trump3){
            if (!cnp.getContactName().equals("Milton Bostock")){
                Assert.fail();
            }
        }
    }
}

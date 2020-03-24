package mx;

import org.junit.Test;
import org.testng.Assert;
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

public class test_IDU_ALL {

    @Test
    public void IDU_FOR_ALL(){

        findById dao = new findById();
        generatorClientPages genClientPage = new generatorClientPages();
        generatorOneClientPage genOneClientPage = new generatorOneClientPage();
        generatorContactPage genContactPage = new generatorContactPage();
        generatorServicePage genServicePage = new generatorServicePage();
        generatorOneServicePage genOneServicePage = new generatorOneServicePage();
        generatorTariffPage getTariffPage = new generatorTariffPage();
        generatorConnectPage getConnectPage = new generatorConnectPage();
        historyServiceEntity hse = new historyServiceEntity();
        historyBalanceEntity hbe = new historyBalanceEntity();

        oneClientPage tmponp = new oneClientPage();
        tmponp.setMax_credit(100);
        tmponp.setMax_credit_day(333);
        tmponp.setName("MAX181199");
        tmponp.INSERT();

        genOneClientPage.setClientName("MAX181199");
        List<oneClientPage> tmp = genOneClientPage.getPageOneClient();
        for ( oneClientPage ocp : tmp){
            if (!ocp.getName().equals("MAX181199")){
                Assert.assertEquals(0,1);
            }
            if (ocp.getMax_credit() !=100){
                Assert.assertEquals(0,1);
            }
            if (ocp.getMax_credit_day() != 333){
                Assert.assertEquals(0,1);
            }
        }

        tmponp.setName("NOMAX181199");
        tmponp.UPDATE();

        genOneClientPage.setClientName("NOMAX181199");
        tmp = genOneClientPage.getPageOneClient();
        for ( oneClientPage ocp : tmp){
            if (!ocp.getName().equals("NOMAX181199")){
                Assert.assertEquals(0,1);
            }
            if (ocp.getMax_credit() !=100){
                Assert.assertEquals(0,1);
            }
            if (ocp.getMax_credit_day() != 333){
                Assert.assertEquals(0,1);
            }
            if (dao.findAccountById(ocp.getSecretClientId()).getId() != ocp.getSecretClientId()){
                Assert.assertEquals(0,1);
            }
        }

        genOneClientPage.setClientName("NOMAX181199");
        tmp = genOneClientPage.getPageOneClient();
        for ( oneClientPage ocp : tmp){
            ocp.DELETE();
        }

        genOneClientPage.setClientName("NOMAX181199");
        tmp = genOneClientPage.getPageOneClient();
        for ( oneClientPage ocp : tmp){
            if (ocp.getName().equals("NOMAX181199")){
                Assert.assertEquals(0,1);
            }
        }

//        System.out.println("<--------------------------------------------->");
//        System.out.println("/////////     END CLIENT IDU TEST     /////////");
//        System.out.println("<--------------------------------------------->");


        boolean keyOne   = true;
        boolean keyTwo   = true;
        boolean keyThree = true;
        genContactPage.setContactName("Milton Bostock");
        List<contactPage> trump3 = genContactPage.getPageContact();
        for ( contactPage cnp : trump3){
              cnp = cnp.AddPhone("8-888-888-8888");
              cnp = cnp.AddEmail("Eight@mail.ru");
              cnp = cnp.AddAddress("Eight Sity");

              for (phoneEntity phe : cnp.getContactPhone()){
                  if ( phe.getPhone().equals("8-888-888-8888")){
                      keyOne = false;
                  }
              }
              for (addresEntity ade : cnp.getContactAddress()){
                  if ( ade.getAddres().equals("Eight Sity")){
                      keyTwo = false;
                  }
              }
              for (emailEntity eme : cnp.getContactEmail()){
                  if (eme.getEmail().equals("Eight@mail.ru")){
                      keyThree = false;
                  }
              }

              if (keyOne || keyTwo || keyThree){
                  Assert.assertEquals(0,1);
              }

              cnp = cnp.DeletePhone("8-888-888-8888");
              cnp = cnp.DeleteEmail("Eight@mail.ru");
              cnp = cnp.DeleteAddress("Eight Sity");

            for (phoneEntity phe : cnp.getContactPhone()){
                if ( phe.getPhone().equals("8-888-888-8888")){
                    keyOne = true;
                }
            }
            for (addresEntity ade : cnp.getContactAddress()){
                if ( ade.getAddres().equals("Eight Sity")){
                    keyTwo = true;
                }
            }
            for (emailEntity eme : cnp.getContactEmail()){
                if (eme.getEmail().equals("Eight@mail.ru")){
                    keyThree = true;
                }
            }

            if (keyOne || keyTwo || keyThree){
                Assert.assertEquals(0,1);
            }

        }


//        System.out.println("<--------------------------------------------->");
//        System.out.println("/////////    END CONTACT IDU  TEST    /////////");
//        System.out.println("<--------------------------------------------->");


        contactPage cop = new contactPage();
        cop.setClientKeyID(1);
        cop.setContactName("GOD");
        cop = cop.INSERT();
        cop = cop.AddPhone("8-888-888-8888");
        cop = cop.AddEmail("Eight@mail.ru");
        cop = cop.AddAddress("Eight Sity");

        keyOne = true;
        clientEntity cle = dao.findClientById(1);
        for (contactEntity coe : cle.getContact()){
            if( coe.getName().equals("GOD")){
                keyOne = false;
            }
        }

        if (keyOne) {
            Assert.assertEquals(0,1);
        }

        cop.setContactName("DEVIL");
        cop = cop.UPDATE();

        keyOne = true;
        keyTwo = false;
        cle = dao.findClientById(1);
        for (contactEntity coe : cle.getContact()){
            if( coe.getName().equals("DEVIL")){
                keyOne = false;
            }
            if (coe.getName().equals("GOD")){
                keyTwo = true;
            }
        }

        if (keyOne || keyTwo) {
            Assert.assertEquals(0,1);
        }


        genContactPage.setContactName("DEVIL");
        trump3 =  genContactPage.getPageContact();
        for ( contactPage cp : trump3){
            cp.DELETE();
        }

        keyOne = false;
        cle = dao.findClientById(1);
        for (contactEntity coe : cle.getContact()){
            if( coe.getName().equals("DEVIL")){
                keyOne = true;
            }
        }

        if (keyOne) {
            Assert.assertEquals(0,1);
        }


//        System.out.println("<--------------------------------------------->");
//        System.out.println("/////////    END CONTACT UDI TEST     /////////");
//        System.out.println("<--------------------------------------------->");




        tariffPage taf = new tariffPage();
        taf.setTariffValue(123);
        taf.setTariffDaypaymode(false);
        taf.setTariffCost(123);
        taf.setServiceKeyId(1);
        taf.INSERT();

        keyOne = true;
        serviceEntity see = dao.findServiceById(1);
        for ( tariffEntity tf :see.getTariff() ){
            if( tf.getValue() == 123){
                keyOne=false;
            }
        }

        if ( keyOne) {
            Assert.assertEquals(0,1);
        }

        keyOne = false;
        int tmpid = -1;
        genOneServicePage.setServiceName("BalanceUP");
        List<oneServicePage>trump5 = genOneServicePage.getPageOneService();
        for ( oneServicePage osp : trump5){
            for (tariffEntity tf : osp.getTariff()){
                if (tf.getValue() == 123){
                    tmpid = tf.getId();
                }
            }
            if (tmpid > 0){
                osp.DeleteTariff(tmpid);
            }
            for (tariffEntity tf : osp.getTariff()){
                if (tf.getValue() == 123){
                    keyOne=true;
                }
            }
        }

        if ( keyOne) {
            Assert.assertEquals(0,1);
        }


//        System.out.println("<--------------------------------------------->");
//        System.out.println("/////////    END TARIFF UDI TEST      /////////");
//        System.out.println("<--------------------------------------------->");


        oneServicePage osp = new oneServicePage();
        osp.setActual(true);
        osp.setType("internet");
        osp.setDescribe("Some");
        osp.setName("LORD");
        osp = osp.INSERT();

        keyOne = true;
        genServicePage.setServiceName("LORD");
        List<servicePage> tmp4 = genServicePage.getPageService();
        for( servicePage sep: tmp4){
            if (sep.getServiceName().equals("LORD")){
                keyOne = false;
            }
        }
        if (keyOne){
            Assert.assertEquals(0,1);
        }

        osp.setName("LIGHT_LORD");
        osp = osp.UPDATE();
        keyOne = true;
        keyTwo = false;
        genServicePage.setServiceName("LIGHT_LORD");
        tmp4 = genServicePage.getPageService();
        for( servicePage sep: tmp4){
            if (sep.getServiceName().equals("LIGHT_LORD")){
                keyOne = false;
            }
            if (sep.getServiceName().equals("LORD")){
                keyTwo = true;
            }
        }
        if (keyOne || keyTwo){
            Assert.assertEquals(0,1);
        }

        osp.DELETE();
        keyOne = false;

        genServicePage.setServiceName("LIGHT_LORD");
        tmp4 = genServicePage.getPageService();
        for( servicePage sep: tmp4){
            if (sep.getServiceName().equals("LIGHT_LORD")){
                keyOne = true;
            }

        }
        if (keyOne){
            Assert.assertEquals(0,1);
        }



//        System.out.println("<--------------------------------------------->");
//        System.out.println("/////////    END SERVICE UDC TEST     /////////");
//        System.out.println("<--------------------------------------------->");


        getConnectPage.setClinetBacklID(1);
        List<connectPage>trump7 = getConnectPage.getPageConnect();
        for ( connectPage cpp : trump7){
            cpp.setAddClientId(1);
            cpp.setAddServiceId(4);
            cpp.setNewValue(12345);
            cpp.setNewValueSet(true);
            cpp=cpp.AddNewService();

            keyOne = true;
            int tmpID = -1;
            clientEntity cl = dao.findClientById(1);
            for (historyServiceEntity hsee : cl.getHistory_service()){
                if ( (hsee.getEnd_time() == null) & (hsee.getState()==12345) ){
                    keyOne=false;
                    tmpID=hsee.getId();
                }
            }

            if (keyOne){
                Assert.assertEquals(0,1);
            }

            cpp=cpp.RemoteService(tmpID);
            keyOne = true;
            cl = dao.findClientById(1);
            for (historyServiceEntity hsee : cl.getHistory_service()){
                if ( (hsee.getEnd_time() != null) & (hsee.getState()==12345) ){
                    keyOne=false;
                    tmpID=hsee.getId();
                }
            }

            if (keyOne){
                Assert.assertEquals(0,1);
            }
        }

//        System.out.println("<--------------------------------------------->");
//        System.out.println("/////////     END CONNECT DC TEST     /////////");
//        System.out.println("<--------------------------------------------->");

    }
}

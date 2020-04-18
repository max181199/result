
import java.lang.String;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import com.sun.xml.bind.v2.TODO;
import ent.clientEntity;
import ent.accountEntity;
import ent.contactEntity;
import ent.phoneEntity;
import ent.addresEntity;
import ent.emailEntity;
import ent.tariffEntity;
import ent.serviceEntity;
import ent.historyServiceEntity;
import ent.historyBalanceEntity;

import DAO.*;
import pageEntity.*;

public class Main {

    public static void main(String[] args) {

        findById dao = new findById();
        generatorClientPages genClientPage = new generatorClientPages();
        generatorOneClientPage genOneClientPage = new generatorOneClientPage();
        generatorContactPage genContactPage = new generatorContactPage();
        generatorServicePage genServicePage = new generatorServicePage();
        generatorOneServicePage genOneServicePage = new generatorOneServicePage();
        generatorTariffPage getTariffPage = new generatorTariffPage();
        generatorConnectPage getConnectPage = new generatorConnectPage();
        clientEntity  cle = new clientEntity();
        accountEntity ace = new accountEntity();
        contactEntity coe = new contactEntity();
        phoneEntity   phe = new phoneEntity();
        addresEntity  ade = new addresEntity();
        emailEntity   eme = new emailEntity();
        tariffEntity  tae = new tariffEntity();
        serviceEntity see = new serviceEntity();
        historyServiceEntity hse = new historyServiceEntity();
        historyBalanceEntity hbe = new historyBalanceEntity();

        System.out.println("<--------------------------------------------->");
        System.out.println("/////////       END DATA DESCRIBE     /////////");
        System.out.println("<--------------------------------------------->");

        genClientPage.setServiceName("");
        List<clientPage>  trump = genClientPage.getPageClient();
        for ( clientPage ent : trump){
            System.out.println(ent);
        }
        System.out.println("<--------------------------------------------->");
        System.out.println("/////////          CLP TEST           /////////");
        System.out.println("<--------------------------------------------->");

        genOneClientPage.setClientName("");

        genOneClientPage.setBalanceNameService("");
        genOneClientPage.setBalanceCount(400);
        genOneClientPage.setBalanceCountFilter(false);
        Calendar calendar = new GregorianCalendar(1999, 0 , 8);
        genOneClientPage.setBalanceDate(calendar.getTime());
        genOneClientPage.setBalanceDateFilter(false);


        genOneClientPage.setServiceServiceName("");
        genOneClientPage.setServiceStateFilter(false);
        genOneClientPage.setServiceState(123);
        calendar = new GregorianCalendar(2020 , 4 , 23);
        genOneClientPage.setServiceTopDateFilter(false);
        genOneClientPage.setServiceTopDate(calendar.getTime());
        calendar = new GregorianCalendar(1997 , 4 , 23);
        genOneClientPage.setServiceBottomDateFilter(true);
        genOneClientPage.setServiceBottomDate(calendar.getTime());


        List<oneClientPage> trump2 = genOneClientPage.getPageOneClient();
        for ( oneClientPage ent : trump2){
            System.out.println(ent);
        }
        System.out.println("<--------------------------------------------->");
        System.out.println("/////////           OCLP TEST         /////////");
        System.out.println("<--------------------------------------------->");
        List<contactPage> trump3 = genContactPage.getPageContact();
        for ( contactPage cnp : trump3){
            System.out.println(cnp);
        }
        System.out.println("<--------------------------------------------->");
        System.out.println("/////////           CP TEST           /////////");
        System.out.println("<--------------------------------------------->");
        genServicePage.setServiceName("");
        genServicePage.setServiceActualFilter(false);
        genServicePage.setServiceType("");
        genServicePage.setServiceTariffId(7);
        genServicePage.setServiceTariffIdFilter(false);
        List<servicePage> trump4 = genServicePage.getPageService();
        for( servicePage sep: trump4){
            System.out.println(sep);
        }
        System.out.println("<--------------------------------------------->");
        System.out.println("/////////           SP TEST           /////////");
        System.out.println("<--------------------------------------------->");
        genOneServicePage.setServiceName("");
        genOneServicePage.setServiceTariffId(7);
        genOneServicePage.setServiceTariffIdFilter(false);
        genOneServicePage.setServiceTariffActual(false);
        genOneServicePage.setServiceTariffActualFilter(false);
        genOneServicePage.setServiceTariffCost(2);
        genOneServicePage.setServiceTariffCostFilter(false);
        genOneServicePage.setServiceTariffDaypaymode(false);
        genOneServicePage.setServiceTariffDaypaymodeFilter(false);
        calendar = new GregorianCalendar(2020 , 2 , 3);
        genOneServicePage.setServiceTariffDate(calendar.getTime());
        genOneServicePage.setServiceTariffDateFilter(false);
        genOneServicePage.setServiceTariffValue(200);
        genOneServicePage.setServiceTariffValueFilter(false);
        List<oneServicePage> trump5 = genOneServicePage.getPageOneService();
        for ( oneServicePage osp : trump5){
            System.out.println(osp);
        }
        System.out.println("<--------------------------------------------->");
        System.out.println("/////////           OSP TEST          /////////");
        System.out.println("<--------------------------------------------->");
        List<tariffPage> trump6 = getTariffPage.getPageTariff();
        for ( tariffPage tap : trump6){
            System.out.println(tap);
        }
        System.out.println("<--------------------------------------------->");
        System.out.println("/////////           TP TEST           /////////");
        System.out.println("<--------------------------------------------->");
        List<connectPage> trump7 = getConnectPage.getPageConnect();
        for ( connectPage cop : trump7){
            System.out.println(cop);
        }
        System.out.println("<--------------------------------------------->");
        System.out.println("/////////           CP TEST           /////////");
        System.out.println("<--------------------------------------------->");


        System.out.println("<--------------------------------------------->");
        System.out.println("/////////       END SELECT TEST       /////////");
        System.out.println("<--------------------------------------------->"); //TODO write filter test for clientPage

    /*

        genOneClientPage.setClientName("NOMAX181199");
        trump2 = genOneClientPage.getPageOneClient();
        for ( oneClientPage ocp : trump2){
            ocp.DELETE();
        }

        oneClientPage tmponp = new oneClientPage();
        tmponp.setMax_credit(100);
        tmponp.setMax_credit_day(333);
        tmponp.setName("MAX181199");
        tmponp.INSERT();

        System.out.println(tmponp);
        tmponp.setName("NOMAX181199");
        tmponp.UPDATE();
        System.out.println(tmponp);
        System.out.println("<--------------------------------------------->");
     */

        System.out.println("<--------------------------------------------->");
        System.out.println("/////////     END CLIENT UDC TEST     /////////");
        System.out.println("<--------------------------------------------->");

        genContactPage.setContactName("Milton Bostock");
        trump3 = genContactPage.getPageContact();
        for ( contactPage cnp : trump3){
//              cnp = cnp.AddPhone("8-800-555-3535");
//              cnp = cnp.AddEmail("fuck_you@mail.ru");
//              cnp = cnp.AddAddress("fuck_you_too Sity");
//              cnp = cnp.DeletePhone("8-800-555-3535");
//              cnp = cnp.DeleteEmail("fuck_you@mail.ru");
//              cnp = cnp.DeleteAddress("fuck_you_too Sity");
            System.out.println(cnp);
        }

        System.out.println("<--------------------------------------------->");
        System.out.println("/////////   END CONTACT EPA AD TEST   /////////");
        System.out.println("<--------------------------------------------->");


//        genContactPage.setContactName("DEVIL");
//        trump3 =  genContactPage.getPageContact();
//        for ( contactPage cp : trump3){
//            cp.DELETE();
//        }
//        contactPage cop = new contactPage();
//        cop.setClientKeyID(1);
//        cop.setContactName("GOD");
//        cop = cop.INSERT();
//        System.out.println(cop);
//
//        cop.setContactName("DEVIL");
//        cop = cop.UPDATE();
//        System.out.println(cop);

        System.out.println("<--------------------------------------------->");
        System.out.println("/////////    END CONTACT UDC TEST     /////////");
        System.out.println("<--------------------------------------------->");


    /*
        oneServicePage osp = new oneServicePage();
        osp.setActual(true);
        osp.setType("internet");
        osp.setDescribe("IN THE NAME OF GOD");
        osp.setName("PRAY TO LIGHT LORD");
        osp = osp.INSERT();

        osp.setName("LIGHT LORD");
        osp = osp.UPDATE();

        osp.DELETE();

     */

        System.out.println("<--------------------------------------------->");
        System.out.println("/////////    END SERVICE UDC TEST     /////////");
        System.out.println("<--------------------------------------------->");

     /*

        tariffPage taf = new tariffPage();
        taf.setTariffValue(0);
        taf.setTariffDaypaymode(false);
        taf.setTariffCost(0);
        taf.setServiceKeyId(1);
        taf.INSERT();



        genOneServicePage.setServiceName("BalanceUP");
        trump5 = genOneServicePage.getPageOneService();
        for ( oneServicePage osp : trump5){
            osp.DeleteTariff(69);
            System.out.println(osp);
        }

      */

        System.out.println("<--------------------------------------------->");
        System.out.println("/////////     END TARIFF DC TEST      /////////");
        System.out.println("<--------------------------------------------->");

//        getConnectPage.setClinetBacklID(1);
//        trump7 = getConnectPage.getPageConnect();
//        for ( connectPage cop : trump7){
//            cop.setAddClientId(1);
//            cop.setAddServiceId(1);
//            cop.setNewValue(123);
//            cop.setNewValueSet(true);
//            cop=cop.AddNewService();
//
//            System.out.println(cop);
//        }

        System.out.println("<--------------------------------------------->");
        System.out.println("/////////     END CONNECT DC TEST     /////////");
        System.out.println("<--------------------------------------------->");

//        day HelloWorld = new day();
//        calendar = new GregorianCalendar(2020 , 2 , 3);
//        HelloWorld.setDataOfTheDay(calendar);
//        HelloWorld.DaysGone();

        System.out.println("<--------------------------------------------->");
        System.out.println("/////////         END DAY TEST        /////////");
        System.out.println("<--------------------------------------------->");

        System.out.println("<--------------------------------------------->");
        System.out.println("/////////        END EVERYTHING       /////////");
        System.out.println("<--------------------------------------------->");

    }


}

package selenium;

import org.hibernate.integrator.spi.ServiceContributingIntegrator;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class oneClientTest extends base {
    @Test
    public void oneClient(){

        driver.get("http://localhost:8080/start");

        if(!driver.getTitle().equals("Client_EXT_")){
            Assert.fail();
        }

        List<WebElement> tmp = new ArrayList<WebElement>();
        tmp = driver.findElements(By.id("clientName"));

        for ( WebElement ent : tmp){
            //System.out.println(ent.getText());
            if (ent.getText().equals("Milton Bostock")){
                ent.click();
                break;
            }
        }

        if(!driver.getTitle().equals("oneClient_EXT_")){
            Assert.fail();
        }

        String name= "Milton Bostock";
        String count = "500.0";
        String day   = "60.0";

        if ( !driver.findElement(By.id("clientName")).getAttribute("Value").equals(name)){
            System.out.println(driver.findElement(By.id("clientName")).getAttribute("Value"));
            System.out.println(driver.getTitle());
            Assert.fail();
        }
        if ( !driver.findElement(By.id("mcCount")).getAttribute("Value").equals(count)){
            Assert.fail();
        }
        if ( !driver.findElement(By.id("mcDay")).getAttribute("Value").equals(day)){
            Assert.fail();
        }

        driver.findElement(By.id("clientName")).clear();
        driver.findElement(By.id("update")).click();
        if(!driver.getTitle().equals("ERROR")){
            System.out.println(driver.getTitle());
            Assert.fail();
        }
        driver.findElement(By.id("back")).click();

        tmp = driver.findElements(By.id("clientName"));
        for ( WebElement ent : tmp){
            //System.out.println(ent.getText());
            if (ent.getText().equals("Milton Bostock")){
                ent.click();
                break;
            }
        }
        driver.findElement(By.id("clientName")).clear();
        driver.findElement(By.id("clientName")).sendKeys("NewName");
        driver.findElement(By.id("update")).click();
        driver.findElement(By.id("back")).click();

        tmp = new ArrayList<WebElement>();
        List<String> clientName = new ArrayList<String>();
        // Setup name array
        // Setup element array
        tmp = driver.findElements(By.id("clientName"));
        clientName.add("NewName");
        clientName.add("Mazie Burn");
        clientName.add("Zayden Gould");
        clientName.add("Harriet Shaw");
        clientName.add("Armitage Company");
        // trick
        if ( tmp.size() != 0){
            tmp.remove(0); //First element everytime Empty
        }
        // run nad check every name
        tmp = driver.findElements(By.id("clientName"));
        for ( WebElement ent : tmp){
            int cout = clientName.indexOf(ent.getText());
            if( (cout == -1)){
                System.out.println("Error::_" + ent.getText());
                Assert.fail();
            }
            else {
                clientName.remove(cout);
            }
        }

        tmp = driver.findElements(By.id("clientName"));
        for ( WebElement ent : tmp){
            //System.out.println(ent.getText());
            if (ent.getText().equals("NewName")){
                ent.click();
                break;
            }
        }

        driver.findElement(By.id("clientName")).clear();
        driver.findElement(By.id("clientName")).sendKeys("Milton Bostock");
        driver.findElement(By.id("update")).click();


        driver.findElement(By.id("mcCount")).clear();
        driver.findElement(By.id("mcCount")).sendKeys("");
        driver.findElement(By.id("update")).click();
        if(!driver.getTitle().equals("ERROR")){
            System.out.println(driver.getTitle());
            Assert.fail();
        }
        driver.get("http://localhost:8080/start");

        tmp = driver.findElements(By.id("clientName"));
        for ( WebElement ent : tmp){
            //System.out.println(ent.getText());
            if (ent.getText().equals("Milton Bostock")){
                ent.click();
                break;
            }
        }

        driver.findElement(By.id("mcCount")).clear();
        driver.findElement(By.id("mcCount")).sendKeys("sfkksfvksf2e08---");
        driver.findElement(By.id("update")).click();
        if(!driver.getTitle().equals("ERROR")){
            System.out.println(driver.getTitle());
            Assert.fail();
        }
        driver.findElement(By.id("back")).click();

        tmp = driver.findElements(By.id("clientName"));
        for ( WebElement ent : tmp){
            //System.out.println(ent.getText());
            if (ent.getText().equals("Milton Bostock")){
                ent.click();
                break;
            }
        }

        driver.findElement(By.id("mcCount")).clear();
        driver.findElement(By.id("mcCount")).sendKeys("333");
        driver.findElement(By.id("update")).click();
        driver.get("http://localhost:8080/start");

        tmp = driver.findElements(By.id("clientName"));
        for ( WebElement ent : tmp){
            //System.out.println(ent.getText());
            if (ent.getText().equals("Milton Bostock")){
                ent.click();
                break;
            }
        }

        count = "333.0";

        if ( !driver.findElement(By.id("mcCount")).getAttribute("Value").equals(count)){
            Assert.fail();
        }

        driver.findElement(By.id("mcCount")).clear();
        driver.findElement(By.id("mcCount")).sendKeys("500");
        driver.findElement(By.id("update")).click();


        driver.findElement(By.id("mcDay")).clear();
        driver.findElement(By.id("mcDay")).sendKeys("");
        driver.findElement(By.id("update")).click();
        if(!driver.getTitle().equals("ERROR")){
            System.out.println(driver.getTitle());
            Assert.fail();
        }
        driver.get("http://localhost:8080/start");

        tmp = driver.findElements(By.id("clientName"));
        for ( WebElement ent : tmp){
            //System.out.println(ent.getText());
            if (ent.getText().equals("Milton Bostock")){
                ent.click();
                break;
            }
        }

        driver.findElement(By.id("mcDay")).clear();
        driver.findElement(By.id("mcDay")).sendKeys("sfkksfvksf2e08---");
        driver.findElement(By.id("update")).click();
        if(!driver.getTitle().equals("ERROR")){
            System.out.println(driver.getTitle());
            Assert.fail();
        }
        driver.findElement(By.id("back")).click();

        tmp = driver.findElements(By.id("clientName"));
        for ( WebElement ent : tmp){
            //System.out.println(ent.getText());
            if (ent.getText().equals("Milton Bostock")){
                ent.click();
                break;
            }
        }

        driver.findElement(By.id("mcDay")).clear();
        driver.findElement(By.id("mcDay")).sendKeys("333");
        driver.findElement(By.id("update")).click();
        driver.get("http://localhost:8080/start");

        tmp = driver.findElements(By.id("clientName"));
        for ( WebElement ent : tmp){
            //System.out.println(ent.getText());
            if (ent.getText().equals("Milton Bostock")){
                ent.click();
                break;
            }
        }

        count = "333.0";

        if ( !driver.findElement(By.id("mcDay")).getAttribute("Value").equals(count)){
            Assert.fail();
        }

        driver.findElement(By.id("mcDay")).clear();
        driver.findElement(By.id("mcDay")).sendKeys("60");
        driver.findElement(By.id("update")).click();

        tmp = new ArrayList<WebElement>();
        List<String>  contactName = new ArrayList<String>();

        // Setup name array
        contactName.add("Milton Bostock");
        // Setup element array
        tmp = driver.findElements(By.id("contactName"));
        // trick
        tmp.remove(0); //First element everytime Empty
        // run nad check every name
        for ( WebElement ent : tmp){
            int coun = clientName.indexOf(ent.getText());
            if( (coun == -1)){
                Assert.fail();
            }
            else {
                clientName.remove(coun);
            }
        }

                         tmp = new ArrayList<WebElement>();
        List<WebElement> tmp2 = new ArrayList<WebElement>();
        List<WebElement> tmp3 = new ArrayList<WebElement>();
        List<WebElement> tmp4 = new ArrayList<WebElement>();
        List<String>  serviceName = new ArrayList<String>();
        List<String>  serviceState = new ArrayList<String>();
        List<String>  serviceBegin = new ArrayList<String>();
        List<String>  serviceEnd = new ArrayList<String>();

        // Setup name array
        serviceName.add("ServiceName :: internet");
        serviceState.add("ServiceState :: 50.0");
        serviceBegin.add("ServiceBegin :: 1998-01-08 04:05:06.0");
        serviceEnd.add("ServiceEnd :: ---");

        serviceName.add("ServiceName :: test");
        serviceState.add("ServiceState :: 333.0");
        serviceBegin.add("ServiceBegin :: 1996-01-08 04:05:06.0");
        serviceEnd.add("ServiceEnd :: 1999-01-08 04:05:06.0");

        serviceName.add("ServiceName :: sms");
        serviceState.add("ServiceState :: 0.0");
        serviceBegin.add("ServiceBegin :: 1997-01-08 04:05:06.0");
        serviceEnd.add("ServiceEnd :: ---");

        serviceName.add("ServiceName :: test");
        serviceState.add("ServiceState :: 333.0");
        serviceBegin.add("ServiceBegin :: 1996-01-08 04:05:06.0");
        serviceEnd.add("ServiceEnd :: 1998-01-08 04:05:06.0");

        serviceName.add("ServiceName :: push_service");
        serviceState.add("ServiceState :: 100.0");
        serviceBegin.add("ServiceBegin :: 1999-01-08 04:05:06.0");
        serviceEnd.add("ServiceEnd :: ---");

        serviceName.add("ServiceName :: bell");
        serviceState.add("ServiceState :: 77.0");
        serviceBegin.add("ServiceBegin :: 1996-01-08 04:05:06.0");
        serviceEnd.add("ServiceEnd :: ---");

        // Setup element array
        tmp = driver.findElements(By.id("serviceName"));
        tmp2 = driver.findElements(By.id("serviceState"));
        tmp3 = driver.findElements(By.id("serviceBegin"));
        tmp4 = driver.findElements(By.id("serviceEnd"));
        //Check every string
       for(int i =0 ; i<tmp.size(); i++){
//           System.out.println(tmp.get(i).getText());
//           System.out.println(tmp2.get(i).getText());
//           System.out.println(tmp3.get(i).getText());
//           System.out.println(tmp4.get(i).getText());
           int num = serviceName.indexOf(tmp.get(i).getText());
           int num2 = serviceState.indexOf(tmp2.get(i).getText().toString());
           int num3 = serviceBegin.indexOf(tmp3.get(i).getText().toString());
           int num4 = serviceEnd.indexOf(tmp4.get(i).getText().toString());
           if( num==-1 || num2==-1 || num3==-1 || num4==-1){
               System.out.println("Error::_" + tmp.get(i).getText() + "_Stop");
               System.out.println("Error::_" + tmp2.get(i).getText() +  "_Stop");
               System.out.println("Error::_" + tmp3.get(i).getText() +  "_Stop");
               System.out.println("Error::_" + tmp4.get(i).getText() + "_Stop");
               System.out.println("NUM::" + num + " NUM2::" + num2 + " NUM3::" +num3 + " NUM4::" + num4);
               Assert.fail();
           }
           else {
               serviceName.remove(num);
               serviceState.remove(num2);
               serviceBegin.remove(num3);
               serviceEnd.remove(num4);
           }
       }

        driver.findElement(By.id("serviceNameField")).clear();
        driver.findElement(By.id("serviceNameField")).sendKeys("internet");
        driver.findElement(By.id("filter")).click();

        tmp = new ArrayList<WebElement>();
        tmp2 = new ArrayList<WebElement>();
        tmp3 = new ArrayList<WebElement>();
        tmp4 = new ArrayList<WebElement>();
        serviceName = new ArrayList<String>();
        serviceState = new ArrayList<String>();
        serviceBegin = new ArrayList<String>();
        serviceEnd = new ArrayList<String>();

        // Setup name array
        serviceName.add("ServiceName :: internet");
        serviceState.add("ServiceState :: 50.0");
        serviceBegin.add("ServiceBegin :: 1998-01-08 04:05:06.0");
        serviceEnd.add("ServiceEnd :: ---");

        // Setup element array
        tmp = driver.findElements(By.id("serviceName"));
        tmp2 = driver.findElements(By.id("serviceState"));
        tmp3 = driver.findElements(By.id("serviceBegin"));
        tmp4 = driver.findElements(By.id("serviceEnd"));
        //Check every string
        for(int i =0 ; i<tmp.size(); i++){
//           System.out.println(tmp.get(i).getText());
//           System.out.println(tmp2.get(i).getText());
//           System.out.println(tmp3.get(i).getText());
//           System.out.println(tmp4.get(i).getText());
            int num = serviceName.indexOf(tmp.get(i).getText());
            int num2 = serviceState.indexOf(tmp2.get(i).getText().toString());
            int num3 = serviceBegin.indexOf(tmp3.get(i).getText().toString());
            int num4 = serviceEnd.indexOf(tmp4.get(i).getText().toString());
            if( num==-1 || num2==-1 || num3==-1 || num4==-1){
                System.out.println("Error::_" + tmp.get(i).getText() + "_Stop");
                System.out.println("Error::_" + tmp2.get(i).getText() +  "_Stop");
                System.out.println("Error::_" + tmp3.get(i).getText() +  "_Stop");
                System.out.println("Error::_" + tmp4.get(i).getText() + "_Stop");
                System.out.println("NUM::" + num + " NUM2::" + num2 + " NUM3::" +num3 + " NUM4::" + num4);
                Assert.fail();
            }
            else {
                serviceName.remove(num);
                serviceState.remove(num2);
                serviceBegin.remove(num3);
                serviceEnd.remove(num4);
            }
        }

        driver.findElement(By.id("serviceNameField")).clear();
        driver.findElement(By.id("serviceNameField")).sendKeys("sfgsgere");
        driver.findElement(By.id("filter")).click();

        tmp = new ArrayList<WebElement>();
        tmp2 = new ArrayList<WebElement>();
        tmp3 = new ArrayList<WebElement>();
        tmp4 = new ArrayList<WebElement>();
        serviceName = new ArrayList<String>();
        serviceState = new ArrayList<String>();
        serviceBegin = new ArrayList<String>();
        serviceEnd = new ArrayList<String>();

        // Setup name array

        // Setup element array
        tmp = driver.findElements(By.id("serviceName"));
        tmp2 = driver.findElements(By.id("serviceState"));
        tmp3 = driver.findElements(By.id("serviceBegin"));
        tmp4 = driver.findElements(By.id("serviceEnd"));
        //Check every string
        for(int i =0 ; i<tmp.size(); i++){
//           System.out.println(tmp.get(i).getText());
//           System.out.println(tmp2.get(i).getText());
//           System.out.println(tmp3.get(i).getText());
//           System.out.println(tmp4.get(i).getText());
            int num = serviceName.indexOf(tmp.get(i).getText());
            int num2 = serviceState.indexOf(tmp2.get(i).getText().toString());
            int num3 = serviceBegin.indexOf(tmp3.get(i).getText().toString());
            int num4 = serviceEnd.indexOf(tmp4.get(i).getText().toString());
            if( num==-1 || num2==-1 || num3==-1 || num4==-1){
                System.out.println("Error::_" + tmp.get(i).getText() + "_Stop");
                System.out.println("Error::_" + tmp2.get(i).getText() +  "_Stop");
                System.out.println("Error::_" + tmp3.get(i).getText() +  "_Stop");
                System.out.println("Error::_" + tmp4.get(i).getText() + "_Stop");
                System.out.println("NUM::" + num + " NUM2::" + num2 + " NUM3::" +num3 + " NUM4::" + num4);
                Assert.fail();
            }
            else {
                serviceName.remove(num);
                serviceState.remove(num2);
                serviceBegin.remove(num3);
                serviceEnd.remove(num4);
            }
        }

        driver.findElement(By.id("serviceStateField")).clear();
        driver.findElement(By.id("filter")).click();

        if(!driver.getTitle().equals("ERROR")){
            System.out.println(driver.getTitle());
            Assert.fail();
        }
        driver.findElement(By.id("back")).click();

        tmp = driver.findElements(By.id("clientName"));
        for ( WebElement ent : tmp){
            //System.out.println(ent.getText());
            if (ent.getText().equals("Milton Bostock")){
                ent.click();
                break;
            }
        }


        if(!driver.getTitle().equals("oneClient_EXT_")){
            System.out.println(driver.getTitle());
            Assert.fail();
        }


        driver.findElement(By.id("serviceStateField")).sendKeys("fesfsfsrf");
        driver.findElement(By.id("filter")).click();

        if(!driver.getTitle().equals("ERROR")){
            System.out.println(driver.getTitle());
            Assert.fail();
        }
        driver.findElement(By.id("back")).click();

        tmp = driver.findElements(By.id("clientName"));
        for ( WebElement ent : tmp){
            //System.out.println(ent.getText());
            if (ent.getText().equals("Milton Bostock")){
                ent.click();
                break;
            }
        }

        driver.findElement(By.id("serviceStateField")).clear();
        driver.findElement(By.id("serviceStateField")).sendKeys("50.0");
        driver.findElement(By.id("filter")).click();

        tmp = new ArrayList<WebElement>();
        tmp2 = new ArrayList<WebElement>();
        tmp3 = new ArrayList<WebElement>();
        tmp4 = new ArrayList<WebElement>();
        serviceName = new ArrayList<String>();
        serviceState = new ArrayList<String>();
        serviceBegin = new ArrayList<String>();
        serviceEnd = new ArrayList<String>();

        // Setup name array
        serviceName.add("ServiceName :: internet");
        serviceState.add("ServiceState :: 50.0");
        serviceBegin.add("ServiceBegin :: 1998-01-08 04:05:06.0");
        serviceEnd.add("ServiceEnd :: ---");

        // Setup element array
        tmp = driver.findElements(By.id("serviceName"));
        tmp2 = driver.findElements(By.id("serviceState"));
        tmp3 = driver.findElements(By.id("serviceBegin"));
        tmp4 = driver.findElements(By.id("serviceEnd"));
        //Check every string
        for(int i =0 ; i<tmp.size(); i++){
//           System.out.println(tmp.get(i).getText());
//           System.out.println(tmp2.get(i).getText());
//           System.out.println(tmp3.get(i).getText());
//           System.out.println(tmp4.get(i).getText());
            int num = serviceName.indexOf(tmp.get(i).getText());
            int num2 = serviceState.indexOf(tmp2.get(i).getText().toString());
            int num3 = serviceBegin.indexOf(tmp3.get(i).getText().toString());
            int num4 = serviceEnd.indexOf(tmp4.get(i).getText().toString());
            if( num==-1 || num2==-1 || num3==-1 || num4==-1){
                System.out.println("Error::_" + tmp.get(i).getText() + "_Stop");
                System.out.println("Error::_" + tmp2.get(i).getText() +  "_Stop");
                System.out.println("Error::_" + tmp3.get(i).getText() +  "_Stop");
                System.out.println("Error::_" + tmp4.get(i).getText() + "_Stop");
                System.out.println("NUM::" + num + " NUM2::" + num2 + " NUM3::" +num3 + " NUM4::" + num4);
                Assert.fail();
            }
            else {
                serviceName.remove(num);
                serviceState.remove(num2);
                serviceBegin.remove(num3);
                serviceEnd.remove(num4);
            }
        }

        driver.findElement(By.id("serviceStateField")).clear();
        driver.findElement(By.id("serviceStateField")).sendKeys("55.0");
        driver.findElement(By.id("filter")).click();

        tmp = new ArrayList<WebElement>();
        tmp2 = new ArrayList<WebElement>();
        tmp3 = new ArrayList<WebElement>();
        tmp4 = new ArrayList<WebElement>();
        serviceName = new ArrayList<String>();
        serviceState = new ArrayList<String>();
        serviceBegin = new ArrayList<String>();
        serviceEnd = new ArrayList<String>();


        // Setup element array
        tmp = driver.findElements(By.id("serviceName"));
        tmp2 = driver.findElements(By.id("serviceState"));
        tmp3 = driver.findElements(By.id("serviceBegin"));
        tmp4 = driver.findElements(By.id("serviceEnd"));
        //Check every string
        for(int i =0 ; i<tmp.size(); i++){
//           System.out.println(tmp.get(i).getText());
//           System.out.println(tmp2.get(i).getText());
//           System.out.println(tmp3.get(i).getText());
//           System.out.println(tmp4.get(i).getText());
            int num = serviceName.indexOf(tmp.get(i).getText());
            int num2 = serviceState.indexOf(tmp2.get(i).getText().toString());
            int num3 = serviceBegin.indexOf(tmp3.get(i).getText().toString());
            int num4 = serviceEnd.indexOf(tmp4.get(i).getText().toString());
            if( num==-1 || num2==-1 || num3==-1 || num4==-1){
                System.out.println("Error::_" + tmp.get(i).getText() + "_Stop");
                System.out.println("Error::_" + tmp2.get(i).getText() +  "_Stop");
                System.out.println("Error::_" + tmp3.get(i).getText() +  "_Stop");
                System.out.println("Error::_" + tmp4.get(i).getText() + "_Stop");
                System.out.println("NUM::" + num + " NUM2::" + num2 + " NUM3::" +num3 + " NUM4::" + num4);
                Assert.fail();
            }
            else {
                serviceName.remove(num);
                serviceState.remove(num2);
                serviceBegin.remove(num3);
                serviceEnd.remove(num4);
            }
        }

        driver.findElement(By.id("serviceStateField")).clear();
        driver.findElement(By.id("serviceStateField")).sendKeys("0.0");
        driver.findElement(By.id("filter")).click();


        Select select = new Select(driver.findElement(By.id("downDateDay")));
        select.selectByVisibleText("31");
        select = new Select(driver.findElement(By.id("downDateMonth")));
        select.selectByVisibleText("2");
        select = new Select(driver.findElement(By.id("downDateYearFP")));
        select.selectByVisibleText("20");
        driver.findElement(By.id("downDateYearSP")).clear();
        driver.findElement(By.id("downDateYearSP")).sendKeys("81");
        driver.findElement(By.id("filter")).click();

        if(!driver.getTitle().equals("ERROR")){
            System.out.println(driver.getTitle());
            Assert.fail();
        }

        driver.findElement(By.id("back")).click();
        tmp = driver.findElements(By.id("clientName"));
        for ( WebElement ent : tmp){
            //System.out.println(ent.getText());
            if (ent.getText().equals("Milton Bostock")){
                ent.click();
                break;
            }
        }

        select = new Select(driver.findElement(By.id("downDateDay")));
        select.selectByVisibleText("31");
        select = new Select(driver.findElement(By.id("downDateMonth")));
        select.selectByVisibleText("2");
        select = new Select(driver.findElement(By.id("downDateYearFP")));
        select.selectByVisibleText("20");
        driver.findElement(By.id("downDateYearSP")).clear();
        driver.findElement(By.id("downDateYearSP")).sendKeys("101");
        driver.findElement(By.id("filter")).click();

        if(!driver.getTitle().equals("ERROR")){
            System.out.println(driver.getTitle());
            Assert.fail();
        }

        driver.findElement(By.id("back")).click();
        tmp = driver.findElements(By.id("clientName"));
        for ( WebElement ent : tmp){
            //System.out.println(ent.getText());
            if (ent.getText().equals("Milton Bostock")){
                ent.click();
                break;
            }
        }

        select = new Select(driver.findElement(By.id("downDateDay")));
        select.selectByVisibleText("31");
        select = new Select(driver.findElement(By.id("downDateMonth")));
        select.selectByVisibleText("2");
        select = new Select(driver.findElement(By.id("downDateYearFP")));
        select.selectByVisibleText("20");
        driver.findElement(By.id("downDateYearSP")).clear();
        driver.findElement(By.id("downDateYearSP")).sendKeys("afaef");
        driver.findElement(By.id("filter")).click();

        if(!driver.getTitle().equals("ERROR")){
            System.out.println(driver.getTitle());
            Assert.fail();
        }

        driver.findElement(By.id("back")).click();
        tmp = driver.findElements(By.id("clientName"));
        for ( WebElement ent : tmp){
            //System.out.println(ent.getText());
            if (ent.getText().equals("Milton Bostock")){
                ent.click();
                break;
            }
        }


        select = new Select(driver.findElement(By.id("downDateDay")));
        select.selectByVisibleText("23");
        select = new Select(driver.findElement(By.id("downDateMonth")));
        select.selectByVisibleText("6");
        select = new Select(driver.findElement(By.id("downDateYearFP")));
        select.selectByVisibleText("19");
        driver.findElement(By.id("downDateYearSP")).clear();
        driver.findElement(By.id("downDateYearSP")).sendKeys("98");
        driver.findElement(By.id("filter")).click();

        tmp = new ArrayList<WebElement>();
        tmp2 = new ArrayList<WebElement>();
        tmp3 = new ArrayList<WebElement>();
        tmp4 = new ArrayList<WebElement>();
        serviceName = new ArrayList<String>();
        serviceState = new ArrayList<String>();
        serviceBegin = new ArrayList<String>();
        serviceEnd = new ArrayList<String>();

        serviceName.add("ServiceName :: push_service");
        serviceState.add("ServiceState :: 100.0");
        serviceBegin.add("ServiceBegin :: 1999-01-08 04:05:06.0");
        serviceEnd.add("ServiceEnd :: ---");

        // Setup element array
        tmp = driver.findElements(By.id("serviceName"));
        tmp2 = driver.findElements(By.id("serviceState"));
        tmp3 = driver.findElements(By.id("serviceBegin"));
        tmp4 = driver.findElements(By.id("serviceEnd"));
        //Check every string
        for(int i =0 ; i<tmp.size(); i++){
//           System.out.println(tmp.get(i).getText());
//           System.out.println(tmp2.get(i).getText());
//           System.out.println(tmp3.get(i).getText());
//           System.out.println(tmp4.get(i).getText());
            int num = serviceName.indexOf(tmp.get(i).getText());
            int num2 = serviceState.indexOf(tmp2.get(i).getText().toString());
            int num3 = serviceBegin.indexOf(tmp3.get(i).getText().toString());
            int num4 = serviceEnd.indexOf(tmp4.get(i).getText().toString());
            if( num==-1 || num2==-1 || num3==-1 || num4==-1){
                System.out.println("Error::_" + tmp.get(i).getText() + "_Stop");
                System.out.println("Error::_" + tmp2.get(i).getText() +  "_Stop");
                System.out.println("Error::_" + tmp3.get(i).getText() +  "_Stop");
                System.out.println("Error::_" + tmp4.get(i).getText() + "_Stop");
                System.out.println("NUM::" + num + " NUM2::" + num2 + " NUM3::" +num3 + " NUM4::" + num4);
                Assert.fail();
            }
            else {
                serviceName.remove(num);
                serviceState.remove(num2);
                serviceBegin.remove(num3);
                serviceEnd.remove(num4);
            }
        }

        select = new Select(driver.findElement(By.id("downDateDay")));
        select.selectByVisibleText("--");
        select = new Select(driver.findElement(By.id("downDateMonth")));
        select.selectByVisibleText("--");
        select = new Select(driver.findElement(By.id("downDateYearFP")));
        select.selectByVisibleText("--");
        driver.findElement(By.id("downDateYearSP")).clear();
        driver.findElement(By.id("downDateYearSP")).sendKeys("--");
        driver.findElement(By.id("filter")).click();



        select = new Select(driver.findElement(By.id("upDateDay")));
        select.selectByVisibleText("31");
        select = new Select(driver.findElement(By.id("upDateMonth")));
        select.selectByVisibleText("2");
        select = new Select(driver.findElement(By.id("upDateYearFP")));
        select.selectByVisibleText("20");
        driver.findElement(By.id("upDateYearSP")).clear();
        driver.findElement(By.id("upDateYearSP")).sendKeys("81");
        driver.findElement(By.id("filter")).click();

        if(!driver.getTitle().equals("ERROR")){
            System.out.println(driver.getTitle());
            Assert.fail();
        }

        driver.findElement(By.id("back")).click();
        tmp = driver.findElements(By.id("clientName"));
        for ( WebElement ent : tmp){
            //System.out.println(ent.getText());
            if (ent.getText().equals("Milton Bostock")){
                ent.click();
                break;
            }
        }

        select = new Select(driver.findElement(By.id("upDateDay")));
        select.selectByVisibleText("31");
        select = new Select(driver.findElement(By.id("upDateMonth")));
        select.selectByVisibleText("2");
        select = new Select(driver.findElement(By.id("upDateYearFP")));
        select.selectByVisibleText("20");
        driver.findElement(By.id("upDateYearSP")).clear();
        driver.findElement(By.id("upDateYearSP")).sendKeys("101");
        driver.findElement(By.id("filter")).click();

        if(!driver.getTitle().equals("ERROR")){
            System.out.println(driver.getTitle());
            Assert.fail();
        }

        driver.findElement(By.id("back")).click();
        tmp = driver.findElements(By.id("clientName"));
        for ( WebElement ent : tmp){
            //System.out.println(ent.getText());
            if (ent.getText().equals("Milton Bostock")){
                ent.click();
                break;
            }
        }

        select = new Select(driver.findElement(By.id("upDateDay")));
        select.selectByVisibleText("31");
        select = new Select(driver.findElement(By.id("upDateMonth")));
        select.selectByVisibleText("2");
        select = new Select(driver.findElement(By.id("upDateYearFP")));
        select.selectByVisibleText("20");
        driver.findElement(By.id("upDateYearSP")).clear();
        driver.findElement(By.id("upDateYearSP")).sendKeys("afaef");
        driver.findElement(By.id("filter")).click();

        if(!driver.getTitle().equals("ERROR")){
            System.out.println(driver.getTitle());
            Assert.fail();
        }

        driver.findElement(By.id("back")).click();
        tmp = driver.findElements(By.id("clientName"));
        for ( WebElement ent : tmp){
            //System.out.println(ent.getText());
            if (ent.getText().equals("Milton Bostock")){
                ent.click();
                break;
            }
        }


        select = new Select(driver.findElement(By.id("upDateDay")));
        select.selectByVisibleText("23");
        select = new Select(driver.findElement(By.id("upDateMonth")));
        select.selectByVisibleText("2");
        select = new Select(driver.findElement(By.id("upDateYearFP")));
        select.selectByVisibleText("19");
        driver.findElement(By.id("upDateYearSP")).clear();
        driver.findElement(By.id("upDateYearSP")).sendKeys("98");
        driver.findElement(By.id("filter")).click();

//        System.out.println(driver.getTitle());
//        System.out.println(driver.findElement(By.id("text")).getText());


        tmp = new ArrayList<WebElement>();
        tmp2 = new ArrayList<WebElement>();
        tmp3 = new ArrayList<WebElement>();
        tmp4 = new ArrayList<WebElement>();
        serviceName = new ArrayList<String>();
        serviceState = new ArrayList<String>();
        serviceBegin = new ArrayList<String>();
        serviceEnd = new ArrayList<String>();

        serviceName.add("ServiceName :: test");
        serviceState.add("ServiceState :: 333.0");
        serviceBegin.add("ServiceBegin :: 1996-01-08 04:05:06.0");
        serviceEnd.add("ServiceEnd :: 1998-01-08 04:05:06.0");

        // Setup element array
        tmp = driver.findElements(By.id("serviceName"));
        tmp2 = driver.findElements(By.id("serviceState"));
        tmp3 = driver.findElements(By.id("serviceBegin"));
        tmp4 = driver.findElements(By.id("serviceEnd"));
        //Check every string
        for(int i =0 ; i<tmp.size(); i++){
//           System.out.println(tmp.get(i).getText());
//           System.out.println(tmp2.get(i).getText());
//           System.out.println(tmp3.get(i).getText());
//           System.out.println(tmp4.get(i).getText());
            int num = serviceName.indexOf(tmp.get(i).getText());
            int num2 = serviceState.indexOf(tmp2.get(i).getText().toString());
            int num3 = serviceBegin.indexOf(tmp3.get(i).getText().toString());
            int num4 = serviceEnd.indexOf(tmp4.get(i).getText().toString());
            if( num==-1 || num2==-1 || num3==-1 || num4==-1){
                System.out.println("Error::_" + tmp.get(i).getText() + "_Stop");
                System.out.println("Error::_" + tmp2.get(i).getText() +  "_Stop");
                System.out.println("Error::_" + tmp3.get(i).getText() +  "_Stop");
                System.out.println("Error::_" + tmp4.get(i).getText() + "_Stop");
                System.out.println("NUM::" + num + " NUM2::" + num2 + " NUM3::" +num3 + " NUM4::" + num4);
                Assert.fail();
            }
            else {
                serviceName.remove(num);
                serviceState.remove(num2);
                serviceBegin.remove(num3);
                serviceEnd.remove(num4);
            }
        }

       // System.out.println(driver.getTitle());

        select = new Select(driver.findElement(By.id("upDateDay")));
        select.selectByVisibleText("--");
        select = new Select(driver.findElement(By.id("upDateMonth")));
        select.selectByVisibleText("--");
        select = new Select(driver.findElement(By.id("upDateYearFP")));
        select.selectByVisibleText("--");
        driver.findElement(By.id("upDateYearSP")).clear();
        driver.findElement(By.id("upDateYearSP")).sendKeys("--");
        driver.findElement(By.id("filter")).click();

    }
}

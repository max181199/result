package selenium;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class connectTest extends base {

    @Test
    public void LastTest(){

        driver.get("http://localhost:8080/start");

        if(!driver.getTitle().equals("Client_EXT_")){
            Assert.fail();
        }


        driver.findElement(By.id("clientAdd")).click();
        String name= "TestUser";
        String count = "13";
        String day   = "13";
        driver.findElement(By.id("clientName")).clear();
        driver.findElement(By.id("clientName")).sendKeys(name);
        driver.findElement(By.id("mcCount")).clear();
        driver.findElement(By.id("mcCount")).sendKeys(count);
        driver.findElement(By.id("mcDay")).clear();
        driver.findElement(By.id("mcDay")).sendKeys(day);
        driver.findElement(By.id("addButton")).click();

        List<WebElement> tmp = driver.findElements(By.id("clientName"));
        for ( WebElement ent : tmp){
            if (ent.getText().equals("TestUser")){
                ent.click();
                break;
            }
        }

        driver.findElement(By.id("connect")).click();

        if(!driver.getTitle().equals("Connect_EXT_")){
            Assert.fail();
        }

        driver.findElement(By.id("back")).click();

        if(!driver.getTitle().equals("oneClient_EXT_")){
            Assert.fail();
        }

        driver.findElement(By.id("connect")).click();


        tmp = driver.findElements(By.id("balanceValue"));
        List<WebElement> tmp2 = driver.findElements(By.id("balanceAdd"));

        for ( int i =0;i<tmp.size();i++){
            tmp.get(i).clear();
            tmp2.get(i).click();
            break;
        }

        if(!driver.getTitle().equals("ERROR")){
            Assert.fail();
        }

        driver.findElement(By.id("back")).click();

        tmp = driver.findElements(By.id("clientName"));
        for ( WebElement ent : tmp){
            if (ent.getText().equals("TestUser")){
                ent.click();
                break;
            }
        }

        driver.findElement(By.id("connect")).click();





        tmp = driver.findElements(By.id("balanceValue"));
        tmp2 = driver.findElements(By.id("balanceAdd"));

        for ( int i =0;i<tmp.size();i++){
            tmp.get(i).clear();
            tmp.get(i).sendKeys("aenfkjsfjsjk");
            tmp2.get(i).click();
            break;
        }

        if(!driver.getTitle().equals("ERROR")){
            Assert.fail();
        }

        driver.findElement(By.id("back")).click();

        tmp = driver.findElements(By.id("clientName"));
        for ( WebElement ent : tmp){
            if (ent.getText().equals("TestUser")){
                ent.click();
                break;
            }
        }

        driver.findElement(By.id("connect")).click();






        tmp = new ArrayList<WebElement>();
        tmp2 = new ArrayList<WebElement>();
        List<String>  serviceName = new ArrayList<String>();
        List<String>  serviceType = new ArrayList<String>();
        // Setup name array
            serviceName.add("ServiceName :: BalanceUP");
            serviceType.add("ServiceType :: BALANCE");

            serviceName.add("ServiceName :: BalanceDOWN");
            serviceType.add("ServiceType :: BALANCE");

        // Setup element array
        tmp  = driver.findElements(By.id("balanceName"));
        tmp2 = driver.findElements(By.id("balanceType"));
        // trick
        // run nad check every name
        for ( int i =0; i<tmp.size(); i++){
//            System.out.println("++Error::_" + tmp.get(i).getText());
//            System.out.println("++Error::_" + tmp2.get(i).getText());
            int num = serviceName.indexOf(tmp.get(i).getText());
            int num2 = serviceType.indexOf(tmp2.get(i).getText());
            if( num==-1 || num2==-1){
                System.out.println("Error::_" + tmp.get(i).getText());
                System.out.println("Error::_" + tmp2.get(i).getText());
                System.out.println("NUM: " + num + "    NUM2: " + num2);
                Assert.fail();
            }
            else {
                serviceName.remove(num);
                serviceType.remove(num2);
            }
        }

        tmp = driver.findElements(By.id("balanceValue"));
        tmp2 = driver.findElements(By.id("balanceAdd"));

        for ( int i =0;i<tmp.size();i++){
            tmp.get(i).clear();
            tmp.get(i).sendKeys("100");
            tmp2.get(i).click();
            break;
        }

        tmp = driver.findElements(By.id("balanceValue"));
        tmp2 = driver.findElements(By.id("balanceAdd"));

        for ( int i =1;i<tmp.size();i++){
            tmp.get(i).clear();
            tmp.get(i).sendKeys("100");
            tmp2.get(i).click();
            break;
        }





        tmp = new ArrayList<WebElement>();
        tmp2 = new ArrayList<WebElement>();
        serviceName = new ArrayList<String>();
        serviceType = new ArrayList<String>();
        // Setup name array
        serviceName.add("ServiceName :: push_service");
        serviceType.add("ServiceType :: PUSH");

        serviceName.add("ServiceName :: internet");
        serviceType.add("ServiceType :: INTERNET");

        serviceName.add("ServiceName :: sms");
        serviceType.add("ServiceType :: SMS");

        serviceName.add("ServiceName :: bell");
        serviceType.add("ServiceType :: BELL");

        // Setup element array
        tmp  = driver.findElements(By.id("serviceName"));
        tmp2 = driver.findElements(By.id("serviceType"));
        // trick
        // run nad check every name
        for ( int i =0; i<tmp.size(); i++){
//            System.out.println("++Error::_" + tmp.get(i).getText());
//            System.out.println("++Error::_" + tmp2.get(i).getText());
            int num = serviceName.indexOf(tmp.get(i).getText());
            int num2 = serviceType.indexOf(tmp2.get(i).getText());
            if( num==-1 || num2==-1){
                System.out.println("Error::_" + tmp.get(i).getText());
                System.out.println("Error::_" + tmp2.get(i).getText());
                Assert.fail();
            }
            else {
                serviceName.remove(num);
                serviceType.remove(num2);
            }
        }


        tmp = driver.findElements(By.id("serviceValue"));
        tmp2 = driver.findElements(By.id("serviceAdd"));

        for ( int i =0;i<tmp.size();i++){
            tmp.get(i).clear();
            tmp.get(i).sendKeys("100");
            tmp2.get(i).click();
            break;
        }

        tmp = driver.findElements(By.id("serviceValue"));
        tmp2 = driver.findElements(By.id("serviceAdd"));

        for ( int i =1;i<tmp.size();i++){
            tmp.get(i).clear();
            tmp.get(i).sendKeys("200");
            tmp2.get(i).click();
            break;
        }

        tmp = driver.findElements(By.id("serviceValue"));
        tmp2 = driver.findElements(By.id("serviceAdd"));

        for ( int i =2;i<tmp.size();i++){
            tmp.get(i).clear();
            tmp.get(i).sendKeys("300");
            tmp2.get(i).click();
            break;
        }

        tmp = driver.findElements(By.id("serviceValue"));
        tmp2 = driver.findElements(By.id("serviceAdd"));

        for ( int i =3;i<tmp.size();i++){
            tmp2.get(i).click();
            break;
        }







        tmp = new ArrayList<WebElement>();
        tmp2 = new ArrayList<WebElement>();
        List<WebElement> tmp3 = new ArrayList<WebElement>();
        serviceName = new ArrayList<String>();
        serviceType = new ArrayList<String>();
        List<String> serviceValue = new ArrayList<String>();
        // Setup name array
        serviceName.add("ServiceName :: push_service");
        serviceType.add("ServiceType :: PUSH");
        serviceValue.add("ServiceValue :: 100.0");

        serviceName.add("ServiceName :: internet");
        serviceType.add("ServiceType :: INTERNET");
        serviceValue.add("ServiceValue :: 200.0");

        serviceName.add("ServiceName :: sms");
        serviceType.add("ServiceType :: SMS");
        serviceValue.add("ServiceValue :: 300.0");

        serviceName.add("ServiceName :: bell");
        serviceType.add("ServiceType :: BELL");
        serviceValue.add("ServiceValue :: 777.0");
        // Setup element array
        tmp  = driver.findElements(By.id("name"));
        tmp2 = driver.findElements(By.id("type"));
        tmp3 = driver.findElements(By.id("value"));
        // trick
        // run nad check every name
        for ( int i =0; i<tmp.size(); i++){
//            System.out.println("++Error::_" + tmp.get(i).getText());
//            System.out.println("++Error::_" + tmp2.get(i).getText());
            int num = serviceName.indexOf(tmp.get(i).getText());
            int num2 = serviceType.indexOf(tmp2.get(i).getText());
            int num3 = serviceValue.indexOf(tmp3.get(i).getText());
            if( num==-1 || num2==-1 || num3==-1){
                System.out.println("Error::_" + tmp.get(i).getText());
                System.out.println("Error::_" + tmp2.get(i).getText());
                System.out.println("Error::_" + tmp3.get(i).getText());
                Assert.fail();
            }
            else {
                serviceName.remove(num);
                serviceType.remove(num2);
                serviceValue.remove(num3);
            }
        }


        driver.findElement(By.id("back")).click();






        tmp = new ArrayList<WebElement>();
        tmp2 = new ArrayList<WebElement>();

        serviceName = new ArrayList<String>();
        List<String> serviceState = new ArrayList<String>();
        // Warvars

        serviceName.add("ServiceName :: internet");
        serviceState.add("ServiceState :: 200.0");

        serviceName.add("ServiceName :: sms");
        serviceState.add("ServiceState :: 300.0");

        serviceName.add("ServiceName :: push_service");
        serviceState.add("ServiceState :: 100.0");

        serviceName.add("ServiceName :: bell");
        serviceState.add("ServiceState :: 777.0");


        // Setup element array
        tmp = driver.findElements(By.id("serviceName"));
        tmp2 = driver.findElements(By.id("serviceState"));
        //Check every string
        for(int i =0 ; i<tmp.size(); i++){
//           System.out.println(tmp.get(i).getText());
//           System.out.println(tmp2.get(i).getText());
//           System.out.println(tmp3.get(i).getText());
//           System.out.println(tmp4.get(i).getText());
            int num = serviceName.indexOf(tmp.get(i).getText());
            int num2 = serviceState.indexOf(tmp2.get(i).getText().toString());
            if( num==-1 || num2==-1 ){
                System.out.println("Error::_" + tmp.get(i).getText() + "_Stop");
                System.out.println("Error::_" + tmp2.get(i).getText() +  "_Stop");
                System.out.println("NUM::" + num + " NUM2::" + num2 );
                Assert.fail();
            }
            else {
                serviceName.remove(num);
                serviceState.remove(num2);
            }
        }

        driver.findElement(By.id("connect")).click();

        tmp2 = driver.findElements(By.id("cancel"));

        for ( int i =0;i<tmp.size();i++){
            tmp2.get(i).click();
            break;
        }

        tmp2 = driver.findElements(By.id("cancel"));
        for ( int i =0;i<tmp.size();i++){
            tmp2.get(i).click();
            break;
        }

        tmp2 = driver.findElements(By.id("cancel"));
        for ( int i =0;i<tmp.size();i++){
            tmp2.get(i).click();
            break;
        }

        tmp2 = driver.findElements(By.id("cancel"));
        for ( int i =0;i<tmp.size();i++){
            tmp2.get(i).click();
            break;
        }





        tmp = new ArrayList<WebElement>();
        tmp2 = new ArrayList<WebElement>();
        serviceName = new ArrayList<String>();
        serviceType = new ArrayList<String>();
        // Setup name array

        // Setup element array
        tmp  = driver.findElements(By.id("name"));
        tmp2 = driver.findElements(By.id("type"));
        // trick
        // run nad check every name
        for ( int i =0; i<tmp.size(); i++){
//            System.out.println("++Error::_" + tmp.get(i).getText());
//            System.out.println("++Error::_" + tmp2.get(i).getText());
            int num = serviceName.indexOf(tmp.get(i).getText());
            int num2 = serviceType.indexOf(tmp2.get(i).getText());
            if( num==-1 || num2==-1){
                System.out.println("Error::_" + tmp.get(i).getText());
                System.out.println("Error::_" + tmp2.get(i).getText());
                Assert.fail();
            }
            else {
                serviceName.remove(num);
                serviceType.remove(num2);
            }
        }


        driver.findElement(By.id("back")).click();
        driver.findElement(By.id("back")).click();

        tmp = driver.findElements(By.id("clientName"));
        tmp2= driver.findElements(By.id("balance"));

        for ( int i =0 ; i< tmp.size() ; i++){
            //System.out.println(ent.getText());
            if (tmp.get(i).getText().equals("TestUser")){
                tmp2.get(i).click();
                break;
            }
        }



        tmp = new ArrayList<WebElement>();
        tmp2 = new ArrayList<WebElement>();
        tmp3 = new ArrayList<WebElement>();
        List<String> balanceName = new ArrayList<String>();
        List<String> balanceCount = new ArrayList<String>();

        balanceName.add("BalanceName :: BalanceUP");
        balanceName.add("BalanceCount :: 100.0");

        balanceName.add("BalanceName :: BalanceDOWN");
        balanceName.add("BalanceCount :: 100.0");



        tmp = driver.findElements(By.id("balanceName"));
        tmp2 = driver.findElements(By.id("balanceCount"));
        //Some info
//        if ( tmp.size() != 0){
//            tmp.remove(0); //First element everytime Empty
//        }
//        if ( tmp2.size() != 0){
//            tmp2.remove(0); //First element everytime Empty
//        }
        //Check every string
        for(int i =0 ; i<tmp3.size(); i++){
//           System.out.println(tmp.get(i).getText());
//           System.out.println(tmp2.get(i).getText());
//           System.out.println(tmp3.get(i).getText());
            int num = balanceName.indexOf(tmp.get(i).getText());
            int num2 = balanceCount.indexOf(tmp2.get(i).getText().toString());
            if( num==-1 || num2==-1 ){
                System.out.println("Error::_" + tmp.get(i).getText() + "_Stop");
                System.out.println("Error::_" + tmp2.get(i).getText() +  "_Stop");
                System.out.println("NUM::" + num + " NUM2::" + num2  );
                Assert.fail();
            }
            else {
                balanceName.remove(num);
                balanceCount.remove(num2);
            }
        }


        driver.findElement(By.id("back")).click();

        tmp = driver.findElements(By.id("clientName"));

        for ( int i =0 ; i< tmp.size() ; i++){
            //System.out.println(ent.getText());
            if (tmp.get(i).getText().equals("TestUser")){
                tmp.get(i).click();
                break;
            }
        }


        driver.findElement(By.id("delete")).click();

    }
}

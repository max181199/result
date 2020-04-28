package selenium;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class serviceTest extends base {

    @Test
    public void ServiceT(){

        driver.get("http://localhost:8080/service");

        if(!driver.getTitle().equals("Service_EXT_")){
            Assert.fail();
        }

        driver.findElement(By.id("serviceButton")).click();

        if(!driver.getTitle().equals("Service_EXT_")){
            Assert.fail();
        }

        driver.findElement(By.id("clientButton")).click();

        if(!driver.getTitle().equals("Client_EXT_")){
            Assert.fail();
        }

        driver.findElement(By.id("serviceButton")).click();



        List<WebElement> tmp = new ArrayList<WebElement>();
        List<String>  serviceName = new ArrayList<String>();
        // Setup name array
        serviceName.add("BalanceUP");
        serviceName.add("BalanceDOWN");
        serviceName.add("push_service");
        serviceName.add("internet");
        serviceName.add("sms");
        serviceName.add("bell");
        serviceName.add("test");
        // Setup element array
        tmp = driver.findElements(By.id("serviceName"));
        // run nad check every name
        for ( WebElement ent : tmp){
            int num = serviceName.indexOf(ent.getText());
            if( (num == -1)){
                Assert.fail();
            }
            else {
                serviceName.remove(num);
            }
        }

        driver.findElement(By.id("state")).click();
        driver.findElement(By.id("filter")).click();

        tmp = new ArrayList<WebElement>();
        serviceName = new ArrayList<String>();
        // Setup name array
        serviceName.add("BalanceUP");
        serviceName.add("BalanceDOWN");
        serviceName.add("push_service");
        serviceName.add("internet");
        serviceName.add("sms");
        serviceName.add("bell");
        // Setup element array
        tmp = driver.findElements(By.id("serviceName"));
        // run nad check every name
        for ( WebElement ent : tmp){
            int num = serviceName.indexOf(ent.getText());
            if( (num == -1)){
                Assert.fail();
            }
            else {
                serviceName.remove(num);
            }
        }

        driver.findElement(By.id("state")).click();
        driver.findElement(By.id("filter")).click();

        driver.findElement(By.id("name")).clear();
        driver.findElement(By.id("name")).sendKeys("BalanceUP");
        driver.findElement(By.id("filter")).click();

        tmp = new ArrayList<WebElement>();
        serviceName = new ArrayList<String>();
        // Setup name array
        serviceName.add("BalanceUP");
        // Setup element array
        tmp = driver.findElements(By.id("serviceName"));
        // run nad check every name
        for ( WebElement ent : tmp){
            int num = serviceName.indexOf(ent.getText());
            if( (num == -1)){
                Assert.fail();
            }
            else {
                serviceName.remove(num);
            }
        }

        driver.findElement(By.id("name")).clear();
        driver.findElement(By.id("filter")).click();

        tmp = new ArrayList<WebElement>();
        serviceName = new ArrayList<String>();
        // Setup name array
        serviceName.add("BalanceUP");
        serviceName.add("BalanceDOWN");
        serviceName.add("push_service");
        serviceName.add("internet");
        serviceName.add("sms");
        serviceName.add("bell");
        serviceName.add("test");
        // Setup element array
        tmp = driver.findElements(By.id("serviceName"));
        // run nad check every name
        for ( WebElement ent : tmp){
            int num = serviceName.indexOf(ent.getText());
            if( (num == -1)){
                Assert.fail();
            }
            else {
                serviceName.remove(num);
            }
        }




        driver.findElement(By.id("type")).clear();
        driver.findElement(By.id("type")).sendKeys("BALANCE");
        driver.findElement(By.id("filter")).click();

        tmp = new ArrayList<WebElement>();
        serviceName = new ArrayList<String>();
        // Setup name array
        serviceName.add("BalanceUP");
        serviceName.add("BalanceDOWN");
        // Setup element array
        tmp = driver.findElements(By.id("serviceName"));
        // run nad check every name
        for ( WebElement ent : tmp){
            int num = serviceName.indexOf(ent.getText());
            if( (num == -1)){
                Assert.fail();
            }
            else {
                serviceName.remove(num);
            }
        }

        driver.findElement(By.id("type")).clear();
        driver.findElement(By.id("filter")).click();

        tmp = new ArrayList<WebElement>();
        serviceName = new ArrayList<String>();
        // Setup name array
        serviceName.add("BalanceUP");
        serviceName.add("BalanceDOWN");
        serviceName.add("push_service");
        serviceName.add("internet");
        serviceName.add("sms");
        serviceName.add("bell");
        serviceName.add("test");
        // Setup element array
        tmp = driver.findElements(By.id("serviceName"));
        // run nad check every name
        for ( WebElement ent : tmp){
            int num = serviceName.indexOf(ent.getText());
            if( (num == -1)){
                Assert.fail();
            }
            else {
                serviceName.remove(num);
            }
        }

        driver.findElement(By.id("tariff")).clear();
        driver.findElement(By.id("filter")).click();

        if(!driver.getTitle().equals("ERROR")){
            System.out.println(driver.getTitle());
            Assert.fail();
        }

        driver.findElement(By.id("back")).click();
        driver.findElement(By.id("serviceButton")).click();

        driver.findElement(By.id("tariff")).clear();
        driver.findElement(By.id("tariff")).sendKeys("adacsrch");
        driver.findElement(By.id("filter")).click();

        if(!driver.getTitle().equals("ERROR")){
            System.out.println(driver.getTitle());
            Assert.fail();
        }

        driver.findElement(By.id("back")).click();
        driver.findElement(By.id("serviceButton")).click();


        driver.findElement(By.id("tariff")).clear();
        driver.findElement(By.id("tariff")).sendKeys("1");
        driver.findElement(By.id("filter")).click();

        tmp = new ArrayList<WebElement>();
        serviceName = new ArrayList<String>();
        // Setup name array
        serviceName.add("BalanceUP");
        // Setup element array
        tmp = driver.findElements(By.id("serviceName"));
        // run nad check every name
        for ( WebElement ent : tmp) {
            int num = serviceName.indexOf(ent.getText());
            if ((num == -1)) {
                Assert.fail();
            } else {
                serviceName.remove(num);
            }
        }

        driver.findElement(By.id("tariff")).clear();
        driver.findElement(By.id("tariff")).sendKeys("100");
        driver.findElement(By.id("filter")).click();

        tmp = new ArrayList<WebElement>();
        serviceName = new ArrayList<String>();
        // Setup name array
        // Setup element array
        tmp = driver.findElements(By.id("serviceName"));
        // run nad check every name
        for ( WebElement ent : tmp) {
            int num = serviceName.indexOf(ent.getText());
            if ((num == -1)) {
                Assert.fail();
            } else {
                serviceName.remove(num);
            }
        }

        driver.findElement(By.id("tariff")).clear();
        driver.findElement(By.id("tariff")).sendKeys("0");
        driver.findElement(By.id("filter")).click();

        tmp = new ArrayList<WebElement>();
        serviceName = new ArrayList<String>();
        // Setup name array
        serviceName.add("BalanceUP");
        serviceName.add("BalanceDOWN");
        serviceName.add("push_service");
        serviceName.add("internet");
        serviceName.add("sms");
        serviceName.add("bell");
        serviceName.add("test");
        // Setup element array
        tmp = driver.findElements(By.id("serviceName"));
        // run nad check every name
        for ( WebElement ent : tmp){
            int num = serviceName.indexOf(ent.getText());
            if( (num == -1)){
                Assert.fail();
            }
            else {
                serviceName.remove(num);
            }
        }





        // <-----ADD_SERVICE_TEST-----> \\


        driver.findElement(By.id("add")).click();
        driver.findElement(By.id("back")).click();

        if(!driver.getTitle().equals("Service_EXT_")){
            System.out.println(driver.getTitle());
            Assert.fail();
        }

        driver.findElement(By.id("add")).click();
        driver.findElement(By.id("add")).click();

        if(!driver.getTitle().equals("ERROR")){
            System.out.println(driver.getTitle());
            Assert.fail();
        }

        driver.findElement(By.id("back")).click();
        driver.findElement(By.id("serviceButton")).click();


        driver.findElement(By.id("add")).click();
        driver.findElement(By.id("name")).sendKeys("newService");
        driver.findElement(By.id("add")).click();

        if(!driver.getTitle().equals("ERROR")){
            System.out.println(driver.getTitle());
            Assert.fail();
        }

        driver.findElement(By.id("back")).click();
        driver.findElement(By.id("serviceButton")).click();

        driver.findElement(By.id("add")).click();
        driver.findElement(By.id("type")).sendKeys("newType");
        driver.findElement(By.id("add")).click();

        if(!driver.getTitle().equals("ERROR")){
            System.out.println(driver.getTitle());
            Assert.fail();
        }

        driver.findElement(By.id("back")).click();
        driver.findElement(By.id("serviceButton")).click();

        driver.findElement(By.id("add")).click();
        driver.findElement(By.id("name")).sendKeys("newService");
        driver.findElement(By.id("type")).sendKeys("newType");
        driver.findElement(By.id("add")).click();

        if(!driver.getTitle().equals("Service_EXT_")){
            System.out.println(driver.getTitle());
            Assert.fail();
        }

        tmp = new ArrayList<WebElement>();
        serviceName = new ArrayList<String>();
        // Setup name array
        serviceName.add("BalanceUP");
        serviceName.add("BalanceDOWN");
        serviceName.add("push_service");
        serviceName.add("internet");
        serviceName.add("sms");
        serviceName.add("bell");
        serviceName.add("test");
        serviceName.add("newService");
        // Setup element array
        tmp = driver.findElements(By.id("serviceName"));
        // run nad check every name
        for ( WebElement ent : tmp){
            int num = serviceName.indexOf(ent.getText());
            if( (num == -1)){
                Assert.fail();
            }
            else {
                serviceName.remove(num);
            }
        }


        tmp = driver.findElements(By.id("serviceName"));
        for ( WebElement ent : tmp){
            if( ent.getText().equals("newService")){
                ent.click();
            }
        }

        if( !driver.findElement(By.id("serviceName")).getAttribute("Value").equals("newService")){
            Assert.fail();
        }

        if( !driver.findElement(By.id("serviceType")).getAttribute("Value").equals("newType")){
            Assert.fail();
        }

        if( driver.findElement(By.id("serviceState")).isSelected()){
            Assert.fail();
        }

        driver.findElement(By.id("delete")).click();

        tmp = new ArrayList<WebElement>();
        serviceName = new ArrayList<String>();
        // Setup name array
        serviceName.add("BalanceUP");
        serviceName.add("BalanceDOWN");
        serviceName.add("push_service");
        serviceName.add("internet");
        serviceName.add("sms");
        serviceName.add("bell");
        serviceName.add("test");
        // Setup element array
        tmp = driver.findElements(By.id("serviceName"));
        // run nad check every name
        for ( WebElement ent : tmp){
            int num = serviceName.indexOf(ent.getText());
            if( (num == -1)){
                Assert.fail();
            }
            else {
                serviceName.remove(num);
            }
        }


        driver.findElement(By.id("add")).click();
        driver.findElement(By.id("name")).sendKeys("newService");
        driver.findElement(By.id("type")).sendKeys("newType");
        driver.findElement(By.id("describe")).sendKeys("newDescribe");
        driver.findElement(By.id("state")).click();
        driver.findElement(By.id("add")).click();

        if(!driver.getTitle().equals("Service_EXT_")){
            System.out.println(driver.getTitle());
            Assert.fail();
        }

        tmp = new ArrayList<WebElement>();
        serviceName = new ArrayList<String>();
        // Setup name array
        serviceName.add("BalanceUP");
        serviceName.add("BalanceDOWN");
        serviceName.add("push_service");
        serviceName.add("internet");
        serviceName.add("sms");
        serviceName.add("bell");
        serviceName.add("test");
        serviceName.add("newService");
        // Setup element array
        tmp = driver.findElements(By.id("serviceName"));
        // run nad check every name
        for ( WebElement ent : tmp){
            int num = serviceName.indexOf(ent.getText());
            if( (num == -1)){
                Assert.fail();
            }
            else {
                serviceName.remove(num);
            }
        }


        tmp = driver.findElements(By.id("serviceName"));
        for ( WebElement ent : tmp){
            if( ent.getText().equals("newService")){
                ent.click();
            }
        }

        if( !driver.findElement(By.id("serviceName")).getAttribute("Value").equals("newService")){
            Assert.fail();
        }

        if( !driver.findElement(By.id("serviceType")).getAttribute("Value").equals("newType")){
            Assert.fail();
        }

        if( !driver.findElement(By.id("serviceState")).isSelected()){
            Assert.fail();
        }

        if( !driver.findElement(By.id("serviceDescribe")).getAttribute("value").equals("newDescribe")){
            System.out.println("||" + driver.findElement(By.id("serviceDescribe")).getAttribute("value") + "||");
            Assert.fail();
        }

        driver.findElement(By.id("delete")).click();

        tmp = new ArrayList<WebElement>();
        serviceName = new ArrayList<String>();
        // Setup name array
        serviceName.add("BalanceUP");
        serviceName.add("BalanceDOWN");
        serviceName.add("push_service");
        serviceName.add("internet");
        serviceName.add("sms");
        serviceName.add("bell");
        serviceName.add("test");
        // Setup element array
        tmp = driver.findElements(By.id("serviceName"));
        // run nad check every name
        for ( WebElement ent : tmp){
            int num = serviceName.indexOf(ent.getText());
            if( (num == -1)){
                Assert.fail();
            }
            else {
                serviceName.remove(num);
            }
        }

        // <-----ADD_SERVICE_TEST-----> \\



    }
}

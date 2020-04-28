package selenium;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class oneServiceTest extends base {

    @Test
    public void SomeName() {

        driver.get("http://localhost:8080/service");

        if(!driver.getTitle().equals("Service_EXT_")){
            Assert.fail();
        }

        List<WebElement> tmp = new ArrayList<WebElement>();
        tmp = driver.findElements(By.id("serviceName"));
        for ( WebElement ent : tmp){
            if( ent.getText().equals("BalanceDOWN")){
                ent.click();
                break;
            }
        }

        if(!driver.getTitle().equals("oneService_EXT_")){
            Assert.fail();
        }

        driver.findElement(By.id("serviceName")).clear();
        driver.findElement(By.id("serviceType")).clear();
        driver.findElement(By.id("update")).click();

        if(!driver.getTitle().equals("ERROR")){
            System.out.println(driver.getTitle());
            Assert.fail();
        }

        driver.findElement(By.id("back")).click();
        driver.findElement(By.id("serviceButton")).click();

        tmp = new ArrayList<WebElement>();
        tmp = driver.findElements(By.id("serviceName"));
        for ( WebElement ent : tmp){
            if( ent.getText().equals("BalanceDOWN")){
                ent.click();
                break;
            }
        }


        //driver.findElement(By.id("serviceName")).clear();
        driver.findElement(By.id("serviceType")).clear();
        driver.findElement(By.id("update")).click();

        if(!driver.getTitle().equals("ERROR")){
            System.out.println(driver.getTitle());
            Assert.fail();
        }

        driver.findElement(By.id("back")).click();
        driver.findElement(By.id("serviceButton")).click();

        tmp = new ArrayList<WebElement>();
        tmp = driver.findElements(By.id("serviceName"));
        for ( WebElement ent : tmp){
            if( ent.getText().equals("BalanceDOWN")){
                ent.click();
                break;
            }
        }

        driver.findElement(By.id("serviceName")).clear();
        //driver.findElement(By.id("serviceType")).clear();
        driver.findElement(By.id("update")).click();

        if(!driver.getTitle().equals("ERROR")){
            System.out.println(driver.getTitle());
            Assert.fail();
        }

        driver.findElement(By.id("back")).click();
        driver.findElement(By.id("serviceButton")).click();

        tmp = new ArrayList<WebElement>();
        tmp = driver.findElements(By.id("serviceName"));
        for ( WebElement ent : tmp){
            if( ent.getText().equals("BalanceDOWN")){
                ent.click();
                break;
            }
        }

        driver.findElement(By.id("serviceName")).clear();
        driver.findElement(By.id("serviceName")).sendKeys("NewName");
        driver.findElement(By.id("update")).click();
        driver.findElement(By.id("back")).click();

        tmp = new ArrayList<WebElement>();
        List<String> serviceName = new ArrayList<String>();
        // Setup name array
        serviceName.add("BalanceUP");
        serviceName.add("NewName");
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

        tmp = new ArrayList<WebElement>();
        tmp = driver.findElements(By.id("serviceName"));
        for ( WebElement ent : tmp){
            if( ent.getText().equals("NewName")){
                ent.click();
                break;
            }
        }

        if( !driver.findElement(By.id("serviceDescribe")).getAttribute("value").equals("DECREASE BALANCE")){
            System.out.println("||" + driver.findElement(By.id("serviceDescribe")).getAttribute("value") + "||");
            Assert.fail();
        }

        driver.findElement(By.id("serviceName")).clear();
        driver.findElement(By.id("serviceName")).sendKeys("BalanceDOWN");
        driver.findElement(By.id("update")).click();






        driver.findElement(By.id("serviceType")).clear();
        driver.findElement(By.id("serviceType")).sendKeys("NewType");
        driver.findElement(By.id("update")).click();
        driver.findElement(By.id("back")).click();

        tmp = new ArrayList<WebElement>();
        List<String> serviceType = new ArrayList<String>();
        // Setup name array
        serviceType.add("BALANCE");
        serviceType.add("NewType");
        serviceType.add("PUSH");
        serviceType.add("SMS");
        serviceType.add("BELL");
        serviceType.add("TEST");
        serviceType.add("INTERNET");
        // Setup element array
        tmp = driver.findElements(By.id("serviceType"));
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

        tmp = new ArrayList<WebElement>();
        tmp = driver.findElements(By.id("serviceName"));
        for ( WebElement ent : tmp){
            if( ent.getText().equals("BalanceDOWN")){
                ent.click();
                break;
            }
        }

        if( !driver.findElement(By.id("serviceDescribe")).getAttribute("value").equals("DECREASE BALANCE")){
            System.out.println("||" + driver.findElement(By.id("serviceDescribe")).getAttribute("value") + "||");
            Assert.fail();
        }

        if( driver.findElement(By.id("serviceType")).getAttribute("Value").equals("NewType")){
            Assert.fail();
        }

        driver.findElement(By.id("serviceType")).clear();
        driver.findElement(By.id("serviceType")).sendKeys("BALANCE");
        driver.findElement(By.id("update")).click();







        driver.findElement(By.id("serviceState")).click();
        driver.findElement(By.id("update")).click();
        driver.findElement(By.id("back")).click();


        tmp = new ArrayList<WebElement>();
        tmp = driver.findElements(By.id("serviceName"));
        for ( WebElement ent : tmp){
            if( ent.getText().equals("BalanceDOWN")){
                ent.click();
                break;
            }
        }

        if( !driver.findElement(By.id("serviceDescribe")).getAttribute("value").equals("DECREASE BALANCE")){
            System.out.println("||" + driver.findElement(By.id("serviceDescribe")).getAttribute("value") + "||");
            Assert.fail();
        }

        if( !driver.findElement(By.id("serviceType")).getAttribute("Value").equals("BALANCE")){
            Assert.fail();
        }

        if( driver.findElement(By.id("serviceState")).isSelected()){
            Assert.fail();
        }

        driver.findElement(By.id("serviceState")).click();
        driver.findElement(By.id("update")).click();






        driver.findElement(By.id("serviceDescribe")).clear();
        driver.findElement(By.id("serviceDescribe")).sendKeys("NewDescribe");
        driver.findElement(By.id("update")).click();
        driver.findElement(By.id("back")).click();


        tmp = new ArrayList<WebElement>();
        tmp = driver.findElements(By.id("serviceName"));
        for ( WebElement ent : tmp){
            if( ent.getText().equals("BalanceDOWN")){
                ent.click();
                break;
            }
        }

        if( !driver.findElement(By.id("serviceDescribe")).getAttribute("value").equals("NewDescribe")){
            System.out.println("||" + driver.findElement(By.id("serviceDescribe")).getAttribute("value") + "||");
            Assert.fail();
        }

        if( !driver.findElement(By.id("serviceType")).getAttribute("Value").equals("BALANCE")){
            Assert.fail();
        }

        if( !driver.findElement(By.id("serviceState")).isSelected()){
            Assert.fail();
        }

        driver.findElement(By.id("serviceDescribe")).clear();
        driver.findElement(By.id("serviceDescribe")).sendKeys("DECREASE BALANCE");
        driver.findElement(By.id("update")).click();


    }
}

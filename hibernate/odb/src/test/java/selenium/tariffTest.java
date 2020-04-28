package selenium;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class tariffTest extends base {

    @Test
    public void name() {

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


        if(!driver.findElement(By.id("actualId")).getText().equals("ID :: 2")){
            Assert.fail();
        }
        if(!driver.findElement(By.id("actualValue")).getText().equals("VALUE :: 200.0")){
            Assert.fail();
        }
        if(!driver.findElement(By.id("actualDpmode")).getText().equals("DP Mode :: true")){
            Assert.fail();
        }
        if(!driver.findElement(By.id("actualActual")).getText().equals("Actual :: true")){
            Assert.fail();
        }
        if(!driver.findElement(By.id("actualCost")).getText().equals("Cost :: 200.0")){
            Assert.fail();
        }

            // Feature


        tmp = new ArrayList<WebElement>();
        List<WebElement> tmp2 = new ArrayList<WebElement>();
        List<WebElement> tmp3 = new ArrayList<WebElement>();
        List<WebElement> tmp4 = new ArrayList<WebElement>();
        List<WebElement> tmp5 = new ArrayList<WebElement>();
        List<WebElement> tmp6 = new ArrayList<WebElement>();
        List<String>  tariffId = new ArrayList<String>();
        List<String>  tariffValue = new ArrayList<String>();
        List<String>  tariffDpmode = new ArrayList<String>();
        List<String>  tariffActual = new ArrayList<String>();
        List<String>  tariffCost = new ArrayList<String>();
        List<String>  tariffCreate = new ArrayList<String>();
        // Setup name array

        tariffId.add("ID :: 3");
        tariffValue.add("VALUE :: 300.0");
        tariffDpmode.add("DP Mode :: true");
        tariffActual.add("Actual :: false");
        tariffCost.add("Cost :: 300.0");
        tariffCreate.add("Create :: 1999-01-08 04:05:06.0");

        tariffId.add("ID :: 8");
        tariffValue.add("VALUE :: 500.0");
        tariffDpmode.add("DP Mode :: false");
        tariffActual.add("Actual :: false");
        tariffCost.add("Cost :: 100.0");
        tariffCreate.add("Create :: 2000-01-08 04:05:06.0");

        tariffId.add("ID :: 9");
        tariffValue.add("VALUE :: 900.0");
        tariffDpmode.add("DP Mode :: false");
        tariffActual.add("Actual :: false");
        tariffCost.add("Cost :: 200.0");
        tariffCreate.add("Create :: 2001-01-08 04:05:06.0");

        // Setup element array
        tmp = driver.findElements(By.id("allId"));
        tmp2 = driver.findElements(By.id("allValue"));
        tmp3 = driver.findElements(By.id("allDpmode"));
        tmp4 = driver.findElements(By.id("allActual"));
        tmp5 = driver.findElements(By.id("allCost"));
        tmp6 = driver.findElements(By.id("allCreate"));
        //Check every string
        for(int i =0 ; i<tmp.size(); i++){
//           System.out.println(tmp.get(i).getText());
//           System.out.println(tmp2.get(i).getText());
//           System.out.println(tmp3.get(i).getText());
//           System.out.println(tmp4.get(i).getText());
//           System.out.println(tmp5.get(i).getText());
//           System.out.println(tmp6.get(i).getText());
            int num = tariffId.indexOf(tmp.get(i).getText());
            int num2 = tariffValue.indexOf(tmp2.get(i).getText().toString());
            int num3 = tariffDpmode.indexOf(tmp3.get(i).getText().toString());
            int num4 = tariffActual.indexOf(tmp4.get(i).getText().toString());
            int num5 = tariffCost.indexOf(tmp5.get(i).getText().toString());
            int num6 = tariffCreate.indexOf(tmp6.get(i).getText().toString());
            if( num==-1 || num2==-1 || num3==-1 || num4==-1 || num5==-1 || num6==-1){
                System.out.println("Error::_" + tmp.get(i).getText() + "_Stop");
                System.out.println("Error::_" + tmp2.get(i).getText() +  "_Stop");
                System.out.println("Error::_" + tmp3.get(i).getText() +  "_Stop");
                System.out.println("Error::_" + tmp4.get(i).getText() + "_Stop");
                System.out.println("Error::_" + tmp5.get(i).getText() +  "_Stop");
                System.out.println("Error::_" + tmp6.get(i).getText() + "_Stop");
                System.out.println("NUM::" + num + " NUM2::" + num2 + " NUM3::" +num3 + " NUM4::" + num4 + " NUM5::" + num5 + " NUM6::" + num6);
                Assert.fail();
            }
            else {
                tariffId.remove(num);
                tariffValue.remove(num2);
                tariffDpmode.remove(num3);
                tariffActual.remove(num4);
                tariffCost.remove(num5);
                tariffCreate.remove(num6);
            }
        }

        driver.findElement(By.id("tariffId")).clear();
        driver.findElement(By.id("filter")).click();

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

        driver.findElement(By.id("tariffId")).clear();
        driver.findElement(By.id("tariffId")).sendKeys("aedeadajk");
        driver.findElement(By.id("filter")).click();

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

        driver.findElement(By.id("tariffId")).clear();
        driver.findElement(By.id("tariffId")).sendKeys("8");
        driver.findElement(By.id("filter")).click();

        tmp = new ArrayList<WebElement>();
        tmp2 = new ArrayList<WebElement>();
        tmp3 = new ArrayList<WebElement>();
        tmp4 = new ArrayList<WebElement>();
        tmp5 = new ArrayList<WebElement>();
        tmp6 = new ArrayList<WebElement>();
        tariffId = new ArrayList<String>();
        tariffValue = new ArrayList<String>();
        tariffDpmode = new ArrayList<String>();
        tariffActual = new ArrayList<String>();
        tariffCost = new ArrayList<String>();
        tariffCreate = new ArrayList<String>();
        // Setup name array


        tariffId.add("ID :: 8");
        tariffValue.add("VALUE :: 500.0");
        tariffDpmode.add("DP Mode :: false");
        tariffActual.add("Actual :: false");
        tariffCost.add("Cost :: 100.0");
        tariffCreate.add("Create :: 2000-01-08 04:05:06.0");


        // Setup element array
        tmp = driver.findElements(By.id("allId"));
        tmp2 = driver.findElements(By.id("allValue"));
        tmp3 = driver.findElements(By.id("allDpmode"));
        tmp4 = driver.findElements(By.id("allActual"));
        tmp5 = driver.findElements(By.id("allCost"));
        tmp6 = driver.findElements(By.id("allCreate"));
        //Check every string
        for(int i =0 ; i<tmp.size(); i++){
//           System.out.println(tmp.get(i).getText());
//           System.out.println(tmp2.get(i).getText());
//           System.out.println(tmp3.get(i).getText());
//           System.out.println(tmp4.get(i).getText());
//           System.out.println(tmp5.get(i).getText());
//           System.out.println(tmp6.get(i).getText());
            int num = tariffId.indexOf(tmp.get(i).getText());
            int num2 = tariffValue.indexOf(tmp2.get(i).getText().toString());
            int num3 = tariffDpmode.indexOf(tmp3.get(i).getText().toString());
            int num4 = tariffActual.indexOf(tmp4.get(i).getText().toString());
            int num5 = tariffCost.indexOf(tmp5.get(i).getText().toString());
            int num6 = tariffCreate.indexOf(tmp6.get(i).getText().toString());
            if( num==-1 || num2==-1 || num3==-1 || num4==-1 || num5==-1 || num6==-1){
                System.out.println("Error::_" + tmp.get(i).getText() + "_Stop");
                System.out.println("Error::_" + tmp2.get(i).getText() +  "_Stop");
                System.out.println("Error::_" + tmp3.get(i).getText() +  "_Stop");
                System.out.println("Error::_" + tmp4.get(i).getText() + "_Stop");
                System.out.println("Error::_" + tmp5.get(i).getText() +  "_Stop");
                System.out.println("Error::_" + tmp6.get(i).getText() + "_Stop");
                System.out.println("NUM::" + num + " NUM2::" + num2 + " NUM3::" +num3 + " NUM4::" + num4 + " NUM5::" + num5 + " NUM6::" + num6);
                Assert.fail();
            }
            else {
                tariffId.remove(num);
                tariffValue.remove(num2);
                tariffDpmode.remove(num3);
                tariffActual.remove(num4);
                tariffCost.remove(num5);
                tariffCreate.remove(num6);
            }
        }

        driver.findElement(By.id("tariffId")).clear();
        driver.findElement(By.id("tariffId")).sendKeys("0");
        driver.findElement(By.id("filter")).click();








        driver.findElement(By.id("tariffCost")).clear();
        driver.findElement(By.id("filter")).click();

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

        driver.findElement(By.id("tariffCost")).clear();
        driver.findElement(By.id("tariffCost")).sendKeys("aedeadajk");
        driver.findElement(By.id("filter")).click();

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

        driver.findElement(By.id("tariffCost")).clear();
        driver.findElement(By.id("tariffCost")).sendKeys("100.0");
        driver.findElement(By.id("filter")).click();

        tmp = new ArrayList<WebElement>();
        tmp2 = new ArrayList<WebElement>();
        tmp3 = new ArrayList<WebElement>();
        tmp4 = new ArrayList<WebElement>();
        tmp5 = new ArrayList<WebElement>();
        tmp6 = new ArrayList<WebElement>();
        tariffId = new ArrayList<String>();
        tariffValue = new ArrayList<String>();
        tariffDpmode = new ArrayList<String>();
        tariffActual = new ArrayList<String>();
        tariffCost = new ArrayList<String>();
        tariffCreate = new ArrayList<String>();
        // Setup name array


        tariffId.add("ID :: 8");
        tariffValue.add("VALUE :: 500.0");
        tariffDpmode.add("DP Mode :: false");
        tariffActual.add("Actual :: false");
        tariffCost.add("Cost :: 100.0");
        tariffCreate.add("Create :: 2000-01-08 04:05:06.0");


        // Setup element array
        tmp = driver.findElements(By.id("allId"));
        tmp2 = driver.findElements(By.id("allValue"));
        tmp3 = driver.findElements(By.id("allDpmode"));
        tmp4 = driver.findElements(By.id("allActual"));
        tmp5 = driver.findElements(By.id("allCost"));
        tmp6 = driver.findElements(By.id("allCreate"));
        //Check every string
        for(int i =0 ; i<tmp.size(); i++){
//           System.out.println(tmp.get(i).getText());
//           System.out.println(tmp2.get(i).getText());
//           System.out.println(tmp3.get(i).getText());
//           System.out.println(tmp4.get(i).getText());
//           System.out.println(tmp5.get(i).getText());
//           System.out.println(tmp6.get(i).getText());
            int num = tariffId.indexOf(tmp.get(i).getText());
            int num2 = tariffValue.indexOf(tmp2.get(i).getText().toString());
            int num3 = tariffDpmode.indexOf(tmp3.get(i).getText().toString());
            int num4 = tariffActual.indexOf(tmp4.get(i).getText().toString());
            int num5 = tariffCost.indexOf(tmp5.get(i).getText().toString());
            int num6 = tariffCreate.indexOf(tmp6.get(i).getText().toString());
            if( num==-1 || num2==-1 || num3==-1 || num4==-1 || num5==-1 || num6==-1){
                System.out.println("Error::_" + tmp.get(i).getText() + "_Stop");
                System.out.println("Error::_" + tmp2.get(i).getText() +  "_Stop");
                System.out.println("Error::_" + tmp3.get(i).getText() +  "_Stop");
                System.out.println("Error::_" + tmp4.get(i).getText() + "_Stop");
                System.out.println("Error::_" + tmp5.get(i).getText() +  "_Stop");
                System.out.println("Error::_" + tmp6.get(i).getText() + "_Stop");
                System.out.println("NUM::" + num + " NUM2::" + num2 + " NUM3::" +num3 + " NUM4::" + num4 + " NUM5::" + num5 + " NUM6::" + num6);
                Assert.fail();
            }
            else {
                tariffId.remove(num);
                tariffValue.remove(num2);
                tariffDpmode.remove(num3);
                tariffActual.remove(num4);
                tariffCost.remove(num5);
                tariffCreate.remove(num6);
            }
        }

        driver.findElement(By.id("tariffCost")).clear();
        driver.findElement(By.id("tariffCost")).sendKeys("0.0");
        driver.findElement(By.id("filter")).click();








        driver.findElement(By.id("tariffValue")).clear();
        driver.findElement(By.id("filter")).click();

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

        driver.findElement(By.id("tariffValue")).clear();
        driver.findElement(By.id("tariffValue")).sendKeys("aedeadajk");
        driver.findElement(By.id("filter")).click();

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

        driver.findElement(By.id("tariffValue")).clear();
        driver.findElement(By.id("tariffValue")).sendKeys("500.0");
        driver.findElement(By.id("filter")).click();

        tmp = new ArrayList<WebElement>();
        tmp2 = new ArrayList<WebElement>();
        tmp3 = new ArrayList<WebElement>();
        tmp4 = new ArrayList<WebElement>();
        tmp5 = new ArrayList<WebElement>();
        tmp6 = new ArrayList<WebElement>();
        tariffId = new ArrayList<String>();
        tariffValue = new ArrayList<String>();
        tariffDpmode = new ArrayList<String>();
        tariffActual = new ArrayList<String>();
        tariffCost = new ArrayList<String>();
        tariffCreate = new ArrayList<String>();
        // Setup name array


        tariffId.add("ID :: 8");
        tariffValue.add("VALUE :: 500.0");
        tariffDpmode.add("DP Mode :: false");
        tariffActual.add("Actual :: false");
        tariffCost.add("Cost :: 100.0");
        tariffCreate.add("Create :: 2000-01-08 04:05:06.0");


        // Setup element array
        tmp = driver.findElements(By.id("allId"));
        tmp2 = driver.findElements(By.id("allValue"));
        tmp3 = driver.findElements(By.id("allDpmode"));
        tmp4 = driver.findElements(By.id("allActual"));
        tmp5 = driver.findElements(By.id("allCost"));
        tmp6 = driver.findElements(By.id("allCreate"));
        //Check every string
        for(int i =0 ; i<tmp.size(); i++){
//           System.out.println(tmp.get(i).getText());
//           System.out.println(tmp2.get(i).getText());
//           System.out.println(tmp3.get(i).getText());
//           System.out.println(tmp4.get(i).getText());
//           System.out.println(tmp5.get(i).getText());
//           System.out.println(tmp6.get(i).getText());
            int num = tariffId.indexOf(tmp.get(i).getText());
            int num2 = tariffValue.indexOf(tmp2.get(i).getText().toString());
            int num3 = tariffDpmode.indexOf(tmp3.get(i).getText().toString());
            int num4 = tariffActual.indexOf(tmp4.get(i).getText().toString());
            int num5 = tariffCost.indexOf(tmp5.get(i).getText().toString());
            int num6 = tariffCreate.indexOf(tmp6.get(i).getText().toString());
            if( num==-1 || num2==-1 || num3==-1 || num4==-1 || num5==-1 || num6==-1){
                System.out.println("Error::_" + tmp.get(i).getText() + "_Stop");
                System.out.println("Error::_" + tmp2.get(i).getText() +  "_Stop");
                System.out.println("Error::_" + tmp3.get(i).getText() +  "_Stop");
                System.out.println("Error::_" + tmp4.get(i).getText() + "_Stop");
                System.out.println("Error::_" + tmp5.get(i).getText() +  "_Stop");
                System.out.println("Error::_" + tmp6.get(i).getText() + "_Stop");
                System.out.println("NUM::" + num + " NUM2::" + num2 + " NUM3::" +num3 + " NUM4::" + num4 + " NUM5::" + num5 + " NUM6::" + num6);
                Assert.fail();
            }
            else {
                tariffId.remove(num);
                tariffValue.remove(num2);
                tariffDpmode.remove(num3);
                tariffActual.remove(num4);
                tariffCost.remove(num5);
                tariffCreate.remove(num6);
            }
        }

        driver.findElement(By.id("tariffValue")).clear();
        driver.findElement(By.id("tariffValue")).sendKeys("0.0");
        driver.findElement(By.id("filter")).click();


        driver.findElement(By.id("tariffDaypaymode")).click();
        driver.findElement(By.id("filter")).click();

        tmp = new ArrayList<WebElement>();
        tmp2 = new ArrayList<WebElement>();
        tmp3 = new ArrayList<WebElement>();
        tmp4 = new ArrayList<WebElement>();
        tmp5 = new ArrayList<WebElement>();
        tmp6 = new ArrayList<WebElement>();
        tariffId = new ArrayList<String>();
        tariffValue = new ArrayList<String>();
        tariffDpmode = new ArrayList<String>();
        tariffActual = new ArrayList<String>();
        tariffCost = new ArrayList<String>();
        tariffCreate = new ArrayList<String>();
        // Setup name array


        tariffId.add("ID :: 3");
        tariffValue.add("VALUE :: 300.0");
        tariffDpmode.add("DP Mode :: true");
        tariffActual.add("Actual :: false");
        tariffCost.add("Cost :: 300.0");
        tariffCreate.add("Create :: 1999-01-08 04:05:06.0");


        // Setup element array
        tmp = driver.findElements(By.id("allId"));
        tmp2 = driver.findElements(By.id("allValue"));
        tmp3 = driver.findElements(By.id("allDpmode"));
        tmp4 = driver.findElements(By.id("allActual"));
        tmp5 = driver.findElements(By.id("allCost"));
        tmp6 = driver.findElements(By.id("allCreate"));
        //Check every string
        for(int i =0 ; i<tmp.size(); i++){
//           System.out.println(tmp.get(i).getText());
//           System.out.println(tmp2.get(i).getText());
//           System.out.println(tmp3.get(i).getText());
//           System.out.println(tmp4.get(i).getText());
//           System.out.println(tmp5.get(i).getText());
//           System.out.println(tmp6.get(i).getText());
            int num = tariffId.indexOf(tmp.get(i).getText());
            int num2 = tariffValue.indexOf(tmp2.get(i).getText().toString());
            int num3 = tariffDpmode.indexOf(tmp3.get(i).getText().toString());
            int num4 = tariffActual.indexOf(tmp4.get(i).getText().toString());
            int num5 = tariffCost.indexOf(tmp5.get(i).getText().toString());
            int num6 = tariffCreate.indexOf(tmp6.get(i).getText().toString());
            if( num==-1 || num2==-1 || num3==-1 || num4==-1 || num5==-1 || num6==-1){
                System.out.println("Error::_" + tmp.get(i).getText() + "_Stop");
                System.out.println("Error::_" + tmp2.get(i).getText() +  "_Stop");
                System.out.println("Error::_" + tmp3.get(i).getText() +  "_Stop");
                System.out.println("Error::_" + tmp4.get(i).getText() + "_Stop");
                System.out.println("Error::_" + tmp5.get(i).getText() +  "_Stop");
                System.out.println("Error::_" + tmp6.get(i).getText() + "_Stop");
                System.out.println("NUM::" + num + " NUM2::" + num2 + " NUM3::" +num3 + " NUM4::" + num4 + " NUM5::" + num5 + " NUM6::" + num6);
                Assert.fail();
            }
            else {
                tariffId.remove(num);
                tariffValue.remove(num2);
                tariffDpmode.remove(num3);
                tariffActual.remove(num4);
                tariffCost.remove(num5);
                tariffCreate.remove(num6);
            }
        }

        driver.findElement(By.id("tariffDaypaymode")).click();
        driver.findElement(By.id("filter")).click();







        driver.findElement(By.id("tariffActual")).click();
        driver.findElement(By.id("filter")).click();

        tmp = new ArrayList<WebElement>();
        tmp2 = new ArrayList<WebElement>();
        tmp3 = new ArrayList<WebElement>();
        tmp4 = new ArrayList<WebElement>();
        tmp5 = new ArrayList<WebElement>();
        tmp6 = new ArrayList<WebElement>();
        tariffId = new ArrayList<String>();
        tariffValue = new ArrayList<String>();
        tariffDpmode = new ArrayList<String>();
        tariffActual = new ArrayList<String>();
        tariffCost = new ArrayList<String>();
        tariffCreate = new ArrayList<String>();
        // Setup name array

        // Setup element array
        tmp = driver.findElements(By.id("allId"));
        tmp2 = driver.findElements(By.id("allValue"));
        tmp3 = driver.findElements(By.id("allDpmode"));
        tmp4 = driver.findElements(By.id("allActual"));
        tmp5 = driver.findElements(By.id("allCost"));
        tmp6 = driver.findElements(By.id("allCreate"));
        //Check every string
        for(int i =0 ; i<tmp.size(); i++){
//           System.out.println(tmp.get(i).getText());
//           System.out.println(tmp2.get(i).getText());
//           System.out.println(tmp3.get(i).getText());
//           System.out.println(tmp4.get(i).getText());
//           System.out.println(tmp5.get(i).getText());
//           System.out.println(tmp6.get(i).getText());
            int num = tariffId.indexOf(tmp.get(i).getText());
            int num2 = tariffValue.indexOf(tmp2.get(i).getText().toString());
            int num3 = tariffDpmode.indexOf(tmp3.get(i).getText().toString());
            int num4 = tariffActual.indexOf(tmp4.get(i).getText().toString());
            int num5 = tariffCost.indexOf(tmp5.get(i).getText().toString());
            int num6 = tariffCreate.indexOf(tmp6.get(i).getText().toString());
            if( num==-1 || num2==-1 || num3==-1 || num4==-1 || num5==-1 || num6==-1){
                System.out.println("Error::_" + tmp.get(i).getText() + "_Stop");
                System.out.println("Error::_" + tmp2.get(i).getText() +  "_Stop");
                System.out.println("Error::_" + tmp3.get(i).getText() +  "_Stop");
                System.out.println("Error::_" + tmp4.get(i).getText() + "_Stop");
                System.out.println("Error::_" + tmp5.get(i).getText() +  "_Stop");
                System.out.println("Error::_" + tmp6.get(i).getText() + "_Stop");
                System.out.println("NUM::" + num + " NUM2::" + num2 + " NUM3::" +num3 + " NUM4::" + num4 + " NUM5::" + num5 + " NUM6::" + num6);
                Assert.fail();
            }
            else {
                tariffId.remove(num);
                tariffValue.remove(num2);
                tariffDpmode.remove(num3);
                tariffActual.remove(num4);
                tariffCost.remove(num5);
                tariffCreate.remove(num6);
            }
        }

        driver.findElement(By.id("tariffActual")).click();
        driver.findElement(By.id("filter")).click();







        Select select = new Select(driver.findElement(By.id("tariffDataDay")));
        select.selectByVisibleText("31");
        select = new Select(driver.findElement(By.id("tariffDataMonth")));
        select.selectByVisibleText("2");
        select = new Select(driver.findElement(By.id("tariffDataYearFP")));
        select.selectByVisibleText("20");
        driver.findElement(By.id("tariffDataYearSP")).clear();
        driver.findElement(By.id("tariffDataYearSP")).sendKeys("");
        driver.findElement(By.id("filter")).click();

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




        select = new Select(driver.findElement(By.id("tariffDataDay")));
        select.selectByVisibleText("31");
        select = new Select(driver.findElement(By.id("tariffDataMonth")));
        select.selectByVisibleText("2");
        select = new Select(driver.findElement(By.id("tariffDataYearFP")));
        select.selectByVisibleText("20");
        driver.findElement(By.id("tariffDataYearSP")).clear();
        driver.findElement(By.id("tariffDataYearSP")).sendKeys("302");
        driver.findElement(By.id("filter")).click();

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



        select = new Select(driver.findElement(By.id("tariffDataDay")));
        select.selectByVisibleText("31");
        select = new Select(driver.findElement(By.id("tariffDataMonth")));
        select.selectByVisibleText("2");
        select = new Select(driver.findElement(By.id("tariffDataYearFP")));
        select.selectByVisibleText("20");
        driver.findElement(By.id("tariffDataYearSP")).clear();
        driver.findElement(By.id("tariffDataYearSP")).sendKeys("desde");
        driver.findElement(By.id("filter")).click();

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



        select = new Select(driver.findElement(By.id("tariffDataDay")));
        select.selectByVisibleText("31");
        select = new Select(driver.findElement(By.id("tariffDataMonth")));
        select.selectByVisibleText("2");
        select = new Select(driver.findElement(By.id("tariffDataYearFP")));
        select.selectByVisibleText("20");
        driver.findElement(By.id("tariffDataYearSP")).clear();
        driver.findElement(By.id("tariffDataYearSP")).sendKeys("20");
        driver.findElement(By.id("filter")).click();

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


        select = new Select(driver.findElement(By.id("tariffDataDay")));
        select.selectByVisibleText("18");
        select = new Select(driver.findElement(By.id("tariffDataMonth")));
        select.selectByVisibleText("11");
        select = new Select(driver.findElement(By.id("tariffDataYearFP")));
        select.selectByVisibleText("20");
        driver.findElement(By.id("tariffDataYearSP")).clear();
        driver.findElement(By.id("tariffDataYearSP")).sendKeys("00");
        driver.findElement(By.id("filter")).click();

        tmp = new ArrayList<WebElement>();
        tmp2 = new ArrayList<WebElement>();
        tmp3 = new ArrayList<WebElement>();
        tmp4 = new ArrayList<WebElement>();
        tmp5 = new ArrayList<WebElement>();
        tmp6 = new ArrayList<WebElement>();
        tariffId = new ArrayList<String>();
        tariffValue = new ArrayList<String>();
        tariffDpmode = new ArrayList<String>();
        tariffActual = new ArrayList<String>();
        tariffCost = new ArrayList<String>();
        tariffCreate = new ArrayList<String>();
        // Setup name array

        tariffId.add("ID :: 9");
        tariffValue.add("VALUE :: 900.0");
        tariffDpmode.add("DP Mode :: false");
        tariffActual.add("Actual :: false");
        tariffCost.add("Cost :: 200.0");
        tariffCreate.add("Create :: 2001-01-08 04:05:06.0");

        // Setup element array
        tmp = driver.findElements(By.id("allId"));
        tmp2 = driver.findElements(By.id("allValue"));
        tmp3 = driver.findElements(By.id("allDpmode"));
        tmp4 = driver.findElements(By.id("allActual"));
        tmp5 = driver.findElements(By.id("allCost"));
        tmp6 = driver.findElements(By.id("allCreate"));
        //Check every string
        for(int i =0 ; i<tmp.size(); i++){
//           System.out.println(tmp.get(i).getText());
//           System.out.println(tmp2.get(i).getText());
//           System.out.println(tmp3.get(i).getText());
//           System.out.println(tmp4.get(i).getText());
//           System.out.println(tmp5.get(i).getText());
//           System.out.println(tmp6.get(i).getText());
            int num = tariffId.indexOf(tmp.get(i).getText());
            int num2 = tariffValue.indexOf(tmp2.get(i).getText().toString());
            int num3 = tariffDpmode.indexOf(tmp3.get(i).getText().toString());
            int num4 = tariffActual.indexOf(tmp4.get(i).getText().toString());
            int num5 = tariffCost.indexOf(tmp5.get(i).getText().toString());
            int num6 = tariffCreate.indexOf(tmp6.get(i).getText().toString());
            if( num==-1 || num2==-1 || num3==-1 || num4==-1 || num5==-1 || num6==-1){
                System.out.println("Error::_" + tmp.get(i).getText() + "_Stop");
                System.out.println("Error::_" + tmp2.get(i).getText() +  "_Stop");
                System.out.println("Error::_" + tmp3.get(i).getText() +  "_Stop");
                System.out.println("Error::_" + tmp4.get(i).getText() + "_Stop");
                System.out.println("Error::_" + tmp5.get(i).getText() +  "_Stop");
                System.out.println("Error::_" + tmp6.get(i).getText() + "_Stop");
                System.out.println("NUM::" + num + " NUM2::" + num2 + " NUM3::" +num3 + " NUM4::" + num4 + " NUM5::" + num5 + " NUM6::" + num6);
                Assert.fail();
            }
            else {
                tariffId.remove(num);
                tariffValue.remove(num2);
                tariffDpmode.remove(num3);
                tariffActual.remove(num4);
                tariffCost.remove(num5);
                tariffCreate.remove(num6);
            }
        }

        select = new Select(driver.findElement(By.id("tariffDataDay")));
        select.selectByVisibleText("--");
        select = new Select(driver.findElement(By.id("tariffDataMonth")));
        select.selectByVisibleText("--");
        select = new Select(driver.findElement(By.id("tariffDataYearFP")));
        select.selectByVisibleText("--");
        driver.findElement(By.id("tariffDataYearSP")).clear();
        driver.findElement(By.id("tariffDataYearSP")).sendKeys("--");
        driver.findElement(By.id("filter")).click();

        driver.findElement(By.id("back")).click();

        driver.findElement(By.id("add")).click();
        driver.findElement(By.id("name")).sendKeys("newService");
        driver.findElement(By.id("type")).sendKeys("newType");
        driver.findElement(By.id("describe")).sendKeys("newDescribe");
        driver.findElement(By.id("state")).click();
        driver.findElement(By.id("add")).click();

        tmp = new ArrayList<WebElement>();
        tmp = driver.findElements(By.id("serviceName"));
        for ( WebElement ent : tmp){
            if( ent.getText().equals("newService")){
                ent.click();
                break;
            }
        }

        driver.findElement(By.id("addTariff")).click();
        driver.findElement(By.id("cost")).clear();
        driver.findElement(By.id("value")).clear();
        driver.findElement(By.id("add")).click();

        if(!driver.getTitle().equals("ERROR")){
            System.out.println(driver.getTitle());
            Assert.fail();
        }

        driver.findElement(By.id("back")).click();
        driver.findElement(By.id("serviceButton")).click();

        tmp = new ArrayList<WebElement>();
        tmp = driver.findElements(By.id("serviceName"));
        for ( WebElement ent : tmp){
            if( ent.getText().equals("newService")){
                ent.click();
                break;
            }
        }


        driver.findElement(By.id("addTariff")).click();
        //driver.findElement(By.id("cost")).clear();
        driver.findElement(By.id("value")).clear();
        driver.findElement(By.id("add")).click();

        if(!driver.getTitle().equals("ERROR")){
            System.out.println(driver.getTitle());
            Assert.fail();
        }

        driver.findElement(By.id("back")).click();
        driver.findElement(By.id("serviceButton")).click();

        tmp = new ArrayList<WebElement>();
        tmp = driver.findElements(By.id("serviceName"));
        for ( WebElement ent : tmp){
            if( ent.getText().equals("newService")){
                ent.click();
                break;
            }
        }


        driver.findElement(By.id("addTariff")).click();
        driver.findElement(By.id("cost")).clear();
        //driver.findElement(By.id("value")).clear();
        driver.findElement(By.id("add")).click();

        if(!driver.getTitle().equals("ERROR")){
            System.out.println(driver.getTitle());
            Assert.fail();
        }

        driver.findElement(By.id("back")).click();
        driver.findElement(By.id("serviceButton")).click();

        tmp = new ArrayList<WebElement>();
        tmp = driver.findElements(By.id("serviceName"));
        for ( WebElement ent : tmp){
            if( ent.getText().equals("newService")){
                ent.click();
                break;
            }
        }


        driver.findElement(By.id("addTariff")).click();
        driver.findElement(By.id("cost")).clear();
        driver.findElement(By.id("cost")).sendKeys("dsdssfvsf");
        driver.findElement(By.id("add")).click();

        if(!driver.getTitle().equals("ERROR")){
            System.out.println(driver.getTitle());
            Assert.fail();
        }

        driver.findElement(By.id("back")).click();
        driver.findElement(By.id("serviceButton")).click();

        tmp = new ArrayList<WebElement>();
        tmp = driver.findElements(By.id("serviceName"));
        for ( WebElement ent : tmp){
            if( ent.getText().equals("newService")){
                ent.click();
                break;
            }
        }


        driver.findElement(By.id("addTariff")).click();
        driver.findElement(By.id("value")).clear();
        driver.findElement(By.id("value")).sendKeys("dsdssfvsf");
        driver.findElement(By.id("add")).click();

        if(!driver.getTitle().equals("ERROR")){
            System.out.println(driver.getTitle());
            Assert.fail();
        }

        driver.findElement(By.id("back")).click();
        driver.findElement(By.id("serviceButton")).click();

        tmp = new ArrayList<WebElement>();
        tmp = driver.findElements(By.id("serviceName"));
        for ( WebElement ent : tmp){
            if( ent.getText().equals("newService")){
                ent.click();
                break;
            }
        }




        driver.findElement(By.id("addTariff")).click();
        driver.findElement(By.id("value")).clear();
        driver.findElement(By.id("value")).sendKeys("13");
        driver.findElement(By.id("cost")).clear();
        driver.findElement(By.id("cost")).sendKeys("13");
        driver.findElement(By.id("add")).click();



        if(!driver.getTitle().equals("oneService_EXT_")){
            Assert.fail();
        }



        if(!driver.findElement(By.id("actualValue")).getText().equals("VALUE :: 13.0")){
            Assert.fail();
        }
        if(!driver.findElement(By.id("actualDpmode")).getText().equals("DP Mode :: false")){
            Assert.fail();
        }

        if(!driver.findElement(By.id("actualCost")).getText().equals("Cost :: 13.0")){
            Assert.fail();
        }



        driver.findElement(By.id("addTariff")).click();
        driver.findElement(By.id("value")).clear();
        driver.findElement(By.id("value")).sendKeys("15");
        driver.findElement(By.id("cost")).clear();
        driver.findElement(By.id("cost")).sendKeys("15");
        driver.findElement(By.id("dpmode")).click();
        driver.findElement(By.id("add")).click();



        if(!driver.getTitle().equals("oneService_EXT_")){
            Assert.fail();
        }



        if(!driver.findElement(By.id("actualValue")).getText().equals("VALUE :: 15.0")){
            System.out.println(driver.getTitle());
            System.out.println(driver.findElement(By.id("actualValue")).getText());
            Assert.fail();
        }
        if(!driver.findElement(By.id("actualDpmode")).getText().equals("DP Mode :: true")){
            Assert.fail();
        }

        if(!driver.findElement(By.id("actualCost")).getText().equals("Cost :: 15.0")){
            Assert.fail();
        }


        tmp = new ArrayList<WebElement>();
        tmp2 = new ArrayList<WebElement>();
        tmp3 = new ArrayList<WebElement>();
        tmp4 = new ArrayList<WebElement>();
        tmp5 = new ArrayList<WebElement>();
        tmp6 = new ArrayList<WebElement>();
        tariffId = new ArrayList<String>();
        tariffValue = new ArrayList<String>();
        tariffDpmode = new ArrayList<String>();
        tariffActual = new ArrayList<String>();
        tariffCost = new ArrayList<String>();
        tariffCreate = new ArrayList<String>();
        // Setup name array

        tariffValue.add("VALUE :: 13.0");
        tariffDpmode.add("DP Mode :: false");
        tariffActual.add("Actual :: false");
        tariffCost.add("Cost :: 13.0");

        tmp2 = driver.findElements(By.id("allValue"));
        tmp3 = driver.findElements(By.id("allDpmode"));
        tmp4 = driver.findElements(By.id("allActual"));
        tmp5 = driver.findElements(By.id("allCost"));
        //Check every string
        for(int i =0 ; i<tmp.size(); i++){
//           System.out.println(tmp.get(i).getText());
//           System.out.println(tmp2.get(i).getText());
//           System.out.println(tmp3.get(i).getText());
//           System.out.println(tmp4.get(i).getText());
//           System.out.println(tmp5.get(i).getText());
//           System.out.println(tmp6.get(i).getText());
            int num2 = tariffValue.indexOf(tmp2.get(i).getText().toString());
            int num3 = tariffDpmode.indexOf(tmp3.get(i).getText().toString());
            int num4 = tariffActual.indexOf(tmp4.get(i).getText().toString());
            int num5 = tariffCost.indexOf(tmp5.get(i).getText().toString());
            if(  num2==-1 || num3==-1 || num4==-1 || num5==-1 ){
                System.out.println("Error::_" + tmp.get(i).getText() + "_Stop");
                System.out.println("Error::_" + tmp2.get(i).getText() +  "_Stop");
                System.out.println("Error::_" + tmp3.get(i).getText() +  "_Stop");
                System.out.println("Error::_" + tmp4.get(i).getText() + "_Stop");
                System.out.println("Error::_" + tmp5.get(i).getText() +  "_Stop");
                System.out.println("Error::_" + tmp6.get(i).getText() + "_Stop");
                System.out.println(  " NUM2::" + num2 + " NUM3::" +num3 + " NUM4::" + num4 + " NUM5::" + num5 );
                Assert.fail();
            }
            else {
                tariffValue.remove(num2);
                tariffDpmode.remove(num3);
                tariffActual.remove(num4);
                tariffCost.remove(num5);
            }
        }








        driver.findElement(By.id("tariffUpdate")).click();
        driver.findElement(By.id("cost")).clear();
        driver.findElement(By.id("value")).clear();
        driver.findElement(By.id("add")).click();

        if(!driver.getTitle().equals("ERROR")){
            System.out.println(driver.getTitle());
            Assert.fail();
        }

        driver.findElement(By.id("back")).click();
        driver.findElement(By.id("serviceButton")).click();

        tmp = new ArrayList<WebElement>();
        tmp = driver.findElements(By.id("serviceName"));
        for ( WebElement ent : tmp){
            if( ent.getText().equals("newService")){
                ent.click();
                break;
            }
        }


        driver.findElement(By.id("tariffUpdate")).click();
        //driver.findElement(By.id("cost")).clear();
        driver.findElement(By.id("value")).clear();
        driver.findElement(By.id("add")).click();

        if(!driver.getTitle().equals("ERROR")){
            System.out.println(driver.getTitle());
            Assert.fail();
        }

        driver.findElement(By.id("back")).click();
        driver.findElement(By.id("serviceButton")).click();

        tmp = new ArrayList<WebElement>();
        tmp = driver.findElements(By.id("serviceName"));
        for ( WebElement ent : tmp){
            if( ent.getText().equals("newService")){
                ent.click();
                break;
            }
        }


        driver.findElement(By.id("tariffUpdate")).click();
        driver.findElement(By.id("cost")).clear();
        //driver.findElement(By.id("value")).clear();
        driver.findElement(By.id("add")).click();

        if(!driver.getTitle().equals("ERROR")){
            System.out.println(driver.getTitle());
            Assert.fail();
        }

        driver.findElement(By.id("back")).click();
        driver.findElement(By.id("serviceButton")).click();

        tmp = new ArrayList<WebElement>();
        tmp = driver.findElements(By.id("serviceName"));
        for ( WebElement ent : tmp){
            if( ent.getText().equals("newService")){
                ent.click();
                break;
            }
        }


        driver.findElement(By.id("tariffUpdate")).click();
        driver.findElement(By.id("cost")).clear();
        driver.findElement(By.id("cost")).sendKeys("dsdssfvsf");
        driver.findElement(By.id("add")).click();

        if(!driver.getTitle().equals("ERROR")){
            System.out.println(driver.getTitle());
            Assert.fail();
        }

        driver.findElement(By.id("back")).click();
        driver.findElement(By.id("serviceButton")).click();

        tmp = new ArrayList<WebElement>();
        tmp = driver.findElements(By.id("serviceName"));
        for ( WebElement ent : tmp){
            if( ent.getText().equals("newService")){
                ent.click();
                break;
            }
        }


        driver.findElement(By.id("tariffUpdate")).click();
        driver.findElement(By.id("value")).clear();
        driver.findElement(By.id("value")).sendKeys("dsdssfvsf");
        driver.findElement(By.id("add")).click();

        if(!driver.getTitle().equals("ERROR")){
            System.out.println(driver.getTitle());
            Assert.fail();
        }

        driver.findElement(By.id("back")).click();
        driver.findElement(By.id("serviceButton")).click();

        tmp = new ArrayList<WebElement>();
        tmp = driver.findElements(By.id("serviceName"));
        for ( WebElement ent : tmp){
            if( ent.getText().equals("newService")){
                ent.click();
                break;
            }
        }











        driver.findElement(By.id("tariffUpdate")).click();
        driver.findElement(By.id("value")).clear();
        driver.findElement(By.id("value")).sendKeys("18");
        driver.findElement(By.id("cost")).clear();
        driver.findElement(By.id("cost")).sendKeys("18");
        driver.findElement(By.id("dpmode")).click();
        driver.findElement(By.id("add")).click();



        if(!driver.getTitle().equals("oneService_EXT_")){
            Assert.fail();
        }



        if(!driver.findElement(By.id("actualValue")).getText().equals("VALUE :: 18.0")){
            Assert.fail();
        }
        if(!driver.findElement(By.id("actualDpmode")).getText().equals("DP Mode :: false")){
            Assert.fail();
        }

        if(!driver.findElement(By.id("actualCost")).getText().equals("Cost :: 18.0")){
            Assert.fail();
        }


        tmp = new ArrayList<WebElement>();
        tmp2 = new ArrayList<WebElement>();
        tmp3 = new ArrayList<WebElement>();
        tmp4 = new ArrayList<WebElement>();
        tmp5 = new ArrayList<WebElement>();
        tmp6 = new ArrayList<WebElement>();
        tariffId = new ArrayList<String>();
        tariffValue = new ArrayList<String>();
        tariffDpmode = new ArrayList<String>();
        tariffActual = new ArrayList<String>();
        tariffCost = new ArrayList<String>();
        tariffCreate = new ArrayList<String>();
        // Setup name array

        tariffValue.add("VALUE :: 15.0");
        tariffDpmode.add("DP Mode :: true");
        tariffActual.add("Actual :: false");
        tariffCost.add("Cost :: 15.0");

        tariffValue.add("VALUE :: 13.0");
        tariffDpmode.add("DP Mode :: false");
        tariffActual.add("Actual :: false");
        tariffCost.add("Cost :: 13.0");

        tmp2 = driver.findElements(By.id("allValue"));
        tmp3 = driver.findElements(By.id("allDpmode"));
        tmp4 = driver.findElements(By.id("allActual"));
        tmp5 = driver.findElements(By.id("allCost"));
        //Check every string
        for(int i =0 ; i<tmp.size(); i++){
//           System.out.println(tmp.get(i).getText());
//           System.out.println(tmp2.get(i).getText());
//           System.out.println(tmp3.get(i).getText());
//           System.out.println(tmp4.get(i).getText());
//           System.out.println(tmp5.get(i).getText());
//           System.out.println(tmp6.get(i).getText());
            int num2 = tariffValue.indexOf(tmp2.get(i).getText().toString());
            int num3 = tariffDpmode.indexOf(tmp3.get(i).getText().toString());
            int num4 = tariffActual.indexOf(tmp4.get(i).getText().toString());
            int num5 = tariffCost.indexOf(tmp5.get(i).getText().toString());
            if(  num2==-1 || num3==-1 || num4==-1 || num5==-1 ){
                System.out.println("Error::_" + tmp.get(i).getText() + "_Stop");
                System.out.println("Error::_" + tmp2.get(i).getText() +  "_Stop");
                System.out.println("Error::_" + tmp3.get(i).getText() +  "_Stop");
                System.out.println("Error::_" + tmp4.get(i).getText() + "_Stop");
                System.out.println("Error::_" + tmp5.get(i).getText() +  "_Stop");
                System.out.println("Error::_" + tmp6.get(i).getText() + "_Stop");
                System.out.println(  " NUM2::" + num2 + " NUM3::" +num3 + " NUM4::" + num4 + " NUM5::" + num5 );
                Assert.fail();
            }
            else {
                tariffValue.remove(num2);
                tariffDpmode.remove(num3);
                tariffActual.remove(num4);
                tariffCost.remove(num5);
            }
        }

        driver.findElement(By.id("delete")).click();

    }
}

package selenium;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class balanceTest extends base {

    @Test
    public void  balanceT(){

        driver.get("http://localhost:8080/start");

        if(!driver.getTitle().equals("Client_EXT_")){
            Assert.fail();
        }

        List<WebElement> tmp = new ArrayList<WebElement>();
        List<WebElement> tmp2 = new ArrayList<WebElement>();
        tmp = driver.findElements(By.id("clientName"));
        tmp2= driver.findElements(By.id("balance"));

        for ( int i =0 ; i< tmp.size() ; i++){
            //System.out.println(ent.getText());
            if (tmp.get(i).getText().equals("Milton Bostock")){
                tmp2.get(i).click();
                break;
            }
        }

        if(!driver.getTitle().equals("balance_EXT_")){
            Assert.fail();
        }

        driver.findElement(By.id("back")).click();

        if(!driver.getTitle().equals("Client_EXT_")){
            Assert.fail();
        }

        tmp = new ArrayList<WebElement>();
        tmp2 = new ArrayList<WebElement>();
        tmp = driver.findElements(By.id("clientName"));
        tmp2= driver.findElements(By.id("balance"));

        for ( int i =0 ; i< tmp.size() ; i++){
            //System.out.println(ent.getText());
            if (tmp.get(i).getText().equals("Milton Bostock")){
                tmp2.get(i).click();
                break;
            }
        }

        if(!driver.getTitle().equals("balance_EXT_")){
            Assert.fail();
        }


        tmp = new ArrayList<WebElement>();
        tmp2 = new ArrayList<WebElement>();
        List<WebElement> tmp3 = new ArrayList<WebElement>();
        List<String>  balanceName = new ArrayList<String>();
        List<String>  balanceCount = new ArrayList<String>();
        List<String>  balanceTime = new ArrayList<String>();

        // Setup name array
        balanceName.add("BalanceName :: BalanceDOWN");
        balanceCount.add("BalanceCount :: 400.0");
        balanceTime.add("BalanceTimeTransaction :: 1998-01-08 05:05:06.0");

        balanceName.add("BalanceName :: BalanceUP");
        balanceCount.add("BalanceCount :: 500.0");
        balanceTime.add("BalanceTimeTransaction :: 1999-01-08 06:05:06.0");

        balanceName.add("BalanceName :: BalanceDOWN");
        balanceCount.add("BalanceCount :: 200.0");
        balanceTime.add("BalanceTimeTransaction :: 1996-01-08 07:05:06.0");

        balanceName.add("BalanceName :: BalanceUP");
        balanceCount.add("BalanceCount :: 500.0");
        balanceTime.add("BalanceTimeTransaction :: 1997-01-08 04:05:06.0");

        // Setup element array
        tmp = driver.findElements(By.id("balanceName"));
        tmp2 = driver.findElements(By.id("balanceCount"));
        tmp3 = driver.findElements(By.id("balanceTime"));
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
            int num3 = balanceTime.indexOf(tmp3.get(i).getText().toString());
            if( num==-1 || num2==-1 || num3==-1){
                System.out.println("Error::_" + tmp.get(i).getText() + "_Stop");
                System.out.println("Error::_" + tmp2.get(i).getText() +  "_Stop");
                System.out.println("Error::_" + tmp3.get(i).getText() +  "_Stop");
                System.out.println("NUM::" + num + " NUM2::" + num2 + " NUM3::" +num3 );
                Assert.fail();
            }
            else {
                balanceName.remove(num);
                balanceCount.remove(num2);
                balanceTime.remove(num3);
            }
        }

        driver.findElement(By.id("name")).clear();
        driver.findElement(By.id("name")).sendKeys("BalanceUP");
        driver.findElement(By.id("filter")).click();

        tmp = new ArrayList<WebElement>();
        tmp2 = new ArrayList<WebElement>();
        tmp3 = new ArrayList<WebElement>();
        balanceName = new ArrayList<String>();
        balanceCount = new ArrayList<String>();
        balanceTime = new ArrayList<String>();

        // Setup name array

        balanceName.add("BalanceName :: BalanceUP");
        balanceCount.add("BalanceCount :: 500.0");
        balanceTime.add("BalanceTimeTransaction :: 1999-01-08 06:05:06.0");


        balanceName.add("BalanceName :: BalanceUP");
        balanceCount.add("BalanceCount :: 500.0");
        balanceTime.add("BalanceTimeTransaction :: 1997-01-08 04:05:06.0");

        // Setup element array
        tmp = driver.findElements(By.id("balanceName"));
        tmp2 = driver.findElements(By.id("balanceCount"));
        tmp3 = driver.findElements(By.id("balanceTime"));
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
            int num3 = balanceTime.indexOf(tmp3.get(i).getText().toString());
            if( num==-1 || num2==-1 || num3==-1){
                System.out.println("Error::_" + tmp.get(i).getText() + "_Stop");
                System.out.println("Error::_" + tmp2.get(i).getText() +  "_Stop");
                System.out.println("Error::_" + tmp3.get(i).getText() +  "_Stop");
                System.out.println("NUM::" + num + " NUM2::" + num2 + " NUM3::" +num3 );
                Assert.fail();
            }
            else {
                balanceName.remove(num);
                balanceCount.remove(num2);
                balanceTime.remove(num3);
            }
        }

        driver.findElement(By.id("name")).clear();
        driver.findElement(By.id("filter")).click();


        tmp = new ArrayList<WebElement>();
        tmp2 = new ArrayList<WebElement>();
        tmp3 = new ArrayList<WebElement>();
        balanceName = new ArrayList<String>();
        balanceCount = new ArrayList<String>();
        balanceTime = new ArrayList<String>();

        // Setup name array
        balanceName.add("BalanceName :: BalanceDOWN");
        balanceCount.add("BalanceCount :: 400.0");
        balanceTime.add("BalanceTimeTransaction :: 1998-01-08 05:05:06.0");

        balanceName.add("BalanceName :: BalanceUP");
        balanceCount.add("BalanceCount :: 500.0");
        balanceTime.add("BalanceTimeTransaction :: 1999-01-08 06:05:06.0");

        balanceName.add("BalanceName :: BalanceDOWN");
        balanceCount.add("BalanceCount :: 200.0");
        balanceTime.add("BalanceTimeTransaction :: 1996-01-08 07:05:06.0");

        balanceName.add("BalanceName :: BalanceUP");
        balanceCount.add("BalanceCount :: 500.0");
        balanceTime.add("BalanceTimeTransaction :: 1997-01-08 04:05:06.0");

        // Setup element array
        tmp = driver.findElements(By.id("balanceName"));
        tmp2 = driver.findElements(By.id("balanceCount"));
        tmp3 = driver.findElements(By.id("balanceTime"));
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
            int num3 = balanceTime.indexOf(tmp3.get(i).getText().toString());
            if( num==-1 || num2==-1 || num3==-1){
                System.out.println("Error::_" + tmp.get(i).getText() + "_Stop");
                System.out.println("Error::_" + tmp2.get(i).getText() +  "_Stop");
                System.out.println("Error::_" + tmp3.get(i).getText() +  "_Stop");
                System.out.println("NUM::" + num + " NUM2::" + num2 + " NUM3::" +num3 );
                Assert.fail();
            }
            else {
                balanceName.remove(num);
                balanceCount.remove(num2);
                balanceTime.remove(num3);
            }
        }


        driver.findElement(By.id("name")).clear();
        driver.findElement(By.id("name")).sendKeys("HEres");
        driver.findElement(By.id("filter")).click();

        tmp = new ArrayList<WebElement>();
        tmp2 = new ArrayList<WebElement>();
        tmp3 = new ArrayList<WebElement>();
        balanceName = new ArrayList<String>();
        balanceCount = new ArrayList<String>();
        balanceTime = new ArrayList<String>();


        // Setup element array
        tmp = driver.findElements(By.id("balanceName"));
        tmp2 = driver.findElements(By.id("balanceCount"));
        tmp3 = driver.findElements(By.id("balanceTime"));
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
            int num3 = balanceTime.indexOf(tmp3.get(i).getText().toString());
            if( num==-1 || num2==-1 || num3==-1){
                System.out.println("Error::_" + tmp.get(i).getText() + "_Stop");
                System.out.println("Error::_" + tmp2.get(i).getText() +  "_Stop");
                System.out.println("Error::_" + tmp3.get(i).getText() +  "_Stop");
                System.out.println("NUM::" + num + " NUM2::" + num2 + " NUM3::" +num3 );
                Assert.fail();
            }
            else {
                balanceName.remove(num);
                balanceCount.remove(num2);
                balanceTime.remove(num3);
            }
        }


        driver.findElement(By.id("name")).clear();
        driver.findElement(By.id("filter")).click();

        driver.findElement(By.id("count")).clear();
        driver.findElement(By.id("filter")).click();

        if(!driver.getTitle().equals("ERROR")){
            System.out.println(driver.getTitle());
            Assert.fail();
        }

        driver.findElement(By.id("back")).click();

        tmp = new ArrayList<WebElement>();
        tmp2 = new ArrayList<WebElement>();
        tmp = driver.findElements(By.id("clientName"));
        tmp2= driver.findElements(By.id("balance"));

        for ( int i =0 ; i< tmp.size() ; i++){
            //System.out.println(ent.getText());
            if (tmp.get(i).getText().equals("Milton Bostock")){
                tmp2.get(i).click();
                break;
            }
        }

        if(!driver.getTitle().equals("balance_EXT_")){
            Assert.fail();
        }


        driver.findElement(By.id("count")).clear();
        driver.findElement(By.id("count")).sendKeys("sdc2302904");
        driver.findElement(By.id("filter")).click();

        if(!driver.getTitle().equals("ERROR")){
            System.out.println(driver.getTitle());
            Assert.fail();
        }

        driver.findElement(By.id("back")).click();

        tmp = new ArrayList<WebElement>();
        tmp2 = new ArrayList<WebElement>();
        tmp = driver.findElements(By.id("clientName"));
        tmp2= driver.findElements(By.id("balance"));

        for ( int i =0 ; i< tmp.size() ; i++){
            //System.out.println(ent.getText());
            if (tmp.get(i).getText().equals("Milton Bostock")){
                tmp2.get(i).click();
                break;
            }
        }

        if(!driver.getTitle().equals("balance_EXT_")){
            Assert.fail();
        }


        driver.findElement(By.id("count")).clear();
        driver.findElement(By.id("count")).sendKeys("500.0");
        driver.findElement(By.id("filter")).click();

        tmp = new ArrayList<WebElement>();
        tmp2 = new ArrayList<WebElement>();
        tmp3 = new ArrayList<WebElement>();
        balanceName = new ArrayList<String>();
        balanceCount = new ArrayList<String>();
        balanceTime = new ArrayList<String>();

        // Setup name array

        balanceName.add("BalanceName :: BalanceUP");
        balanceCount.add("BalanceCount :: 500.0");
        balanceTime.add("BalanceTimeTransaction :: 1999-01-08 06:05:06.0");


        balanceName.add("BalanceName :: BalanceUP");
        balanceCount.add("BalanceCount :: 500.0");
        balanceTime.add("BalanceTimeTransaction :: 1997-01-08 04:05:06.0");

        // Setup element array
        tmp = driver.findElements(By.id("balanceName"));
        tmp2 = driver.findElements(By.id("balanceCount"));
        tmp3 = driver.findElements(By.id("balanceTime"));
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
            int num3 = balanceTime.indexOf(tmp3.get(i).getText().toString());
            if( num==-1 || num2==-1 || num3==-1){
                System.out.println("Error::_" + tmp.get(i).getText() + "_Stop");
                System.out.println("Error::_" + tmp2.get(i).getText() +  "_Stop");
                System.out.println("Error::_" + tmp3.get(i).getText() +  "_Stop");
                System.out.println("NUM::" + num + " NUM2::" + num2 + " NUM3::" +num3 );
                Assert.fail();
            }
            else {
                balanceName.remove(num);
                balanceCount.remove(num2);
                balanceTime.remove(num3);
            }
        }


        driver.findElement(By.id("count")).clear();
        driver.findElement(By.id("count")).sendKeys("777.0");
        driver.findElement(By.id("filter")).click();

        tmp = new ArrayList<WebElement>();
        tmp2 = new ArrayList<WebElement>();
        tmp3 = new ArrayList<WebElement>();
        balanceName = new ArrayList<String>();
        balanceCount = new ArrayList<String>();
        balanceTime = new ArrayList<String>();

        // Setup name array


        // Setup element array
        tmp = driver.findElements(By.id("balanceName"));
        tmp2 = driver.findElements(By.id("balanceCount"));
        tmp3 = driver.findElements(By.id("balanceTime"));
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
            int num3 = balanceTime.indexOf(tmp3.get(i).getText().toString());
            if( num==-1 || num2==-1 || num3==-1){
                System.out.println("Error::_" + tmp.get(i).getText() + "_Stop");
                System.out.println("Error::_" + tmp2.get(i).getText() +  "_Stop");
                System.out.println("Error::_" + tmp3.get(i).getText() +  "_Stop");
                System.out.println("NUM::" + num + " NUM2::" + num2 + " NUM3::" +num3 );
                Assert.fail();
            }
            else {
                balanceName.remove(num);
                balanceCount.remove(num2);
                balanceTime.remove(num3);
            }
        }

        driver.findElement(By.id("count")).clear();
        driver.findElement(By.id("count")).sendKeys("0.0");
        driver.findElement(By.id("filter")).click();


        //<---TIME_TEST_TIME--->\\

        Select select = new Select(driver.findElement(By.id("balanceDay")));
        select.selectByVisibleText("18");
        select = new Select(driver.findElement(By.id("balanceMonth")));
        select.selectByVisibleText("11");
        select = new Select(driver.findElement(By.id("balanceYearFP")));
        select.selectByVisibleText("20");
        driver.findElement(By.id("balanceYearSP")).clear();
        driver.findElement(By.id("filter")).click();

        if(!driver.getTitle().equals("ERROR")){
            System.out.println(driver.getTitle());
            Assert.fail();
        }

        driver.findElement(By.id("back")).click();

        tmp = new ArrayList<WebElement>();
        tmp2 = new ArrayList<WebElement>();
        tmp = driver.findElements(By.id("clientName"));
        tmp2= driver.findElements(By.id("balance"));

        for ( int i =0 ; i< tmp.size() ; i++){
            //System.out.println(ent.getText());
            if (tmp.get(i).getText().equals("Milton Bostock")){
                tmp2.get(i).click();
                break;
            }
        }

        if(!driver.getTitle().equals("balance_EXT_")){
            Assert.fail();
        }


        select = new Select(driver.findElement(By.id("balanceDay")));
        select.selectByVisibleText("18");
        select = new Select(driver.findElement(By.id("balanceMonth")));
        select.selectByVisibleText("11");
        select = new Select(driver.findElement(By.id("balanceYearFP")));
        select.selectByVisibleText("20");
        driver.findElement(By.id("balanceYearSP")).clear();
        driver.findElement(By.id("balanceYearSP")).sendKeys("abra-codabra");
        driver.findElement(By.id("filter")).click();

        if(!driver.getTitle().equals("ERROR")){
            System.out.println(driver.getTitle());
            Assert.fail();
        }

        driver.findElement(By.id("back")).click();

        tmp = new ArrayList<WebElement>();
        tmp2 = new ArrayList<WebElement>();
        tmp = driver.findElements(By.id("clientName"));
        tmp2= driver.findElements(By.id("balance"));

        for ( int i =0 ; i< tmp.size() ; i++){
            //System.out.println(ent.getText());
            if (tmp.get(i).getText().equals("Milton Bostock")){
                tmp2.get(i).click();
                break;
            }
        }

        if(!driver.getTitle().equals("balance_EXT_")){
            Assert.fail();
        }


        select = new Select(driver.findElement(By.id("balanceDay")));
        select.selectByVisibleText("18");
        select = new Select(driver.findElement(By.id("balanceMonth")));
        select.selectByVisibleText("11");
        select = new Select(driver.findElement(By.id("balanceYearFP")));
        select.selectByVisibleText("20");
        driver.findElement(By.id("balanceYearSP")).clear();
        driver.findElement(By.id("balanceYearSP")).sendKeys("123");
        driver.findElement(By.id("filter")).click();

        if(!driver.getTitle().equals("ERROR")){
            System.out.println(driver.getTitle());
            Assert.fail();
        }

        driver.findElement(By.id("back")).click();

        tmp = new ArrayList<WebElement>();
        tmp2 = new ArrayList<WebElement>();
        tmp = driver.findElements(By.id("clientName"));
        tmp2= driver.findElements(By.id("balance"));

        for ( int i =0 ; i< tmp.size() ; i++){
            //System.out.println(ent.getText());
            if (tmp.get(i).getText().equals("Milton Bostock")){
                tmp2.get(i).click();
                break;
            }
        }

        if(!driver.getTitle().equals("balance_EXT_")){
            Assert.fail();
        }


        select = new Select(driver.findElement(By.id("balanceDay")));
        select.selectByVisibleText("31");
        select = new Select(driver.findElement(By.id("balanceMonth")));
        select.selectByVisibleText("2");
        select = new Select(driver.findElement(By.id("balanceYearFP")));
        select.selectByVisibleText("20");
        driver.findElement(By.id("balanceYearSP")).clear();
        driver.findElement(By.id("balanceYearSP")).sendKeys("20");
        driver.findElement(By.id("filter")).click();

        if(!driver.getTitle().equals("ERROR")){
            System.out.println(driver.getTitle());
            Assert.fail();
        }

        driver.findElement(By.id("back")).click();

        tmp = new ArrayList<WebElement>();
        tmp2 = new ArrayList<WebElement>();
        tmp = driver.findElements(By.id("clientName"));
        tmp2= driver.findElements(By.id("balance"));

        for ( int i =0 ; i< tmp.size() ; i++){
            //System.out.println(ent.getText());
            if (tmp.get(i).getText().equals("Milton Bostock")){
                tmp2.get(i).click();
                break;
            }
        }

        if(!driver.getTitle().equals("balance_EXT_")){
            Assert.fail();
        }






        select = new Select(driver.findElement(By.id("balanceDay")));
        select.selectByVisibleText("18");
        select = new Select(driver.findElement(By.id("balanceMonth")));
        select.selectByVisibleText("11");
        select = new Select(driver.findElement(By.id("balanceYearFP")));
        select.selectByVisibleText("19");
        driver.findElement(By.id("balanceYearSP")).clear();
        driver.findElement(By.id("balanceYearSP")).sendKeys("97");
        driver.findElement(By.id("filter")).click();


        tmp = new ArrayList<WebElement>();
        tmp2 = new ArrayList<WebElement>();
        tmp3 = new ArrayList<WebElement>();
        balanceName = new ArrayList<String>();
        balanceCount = new ArrayList<String>();
        balanceTime = new ArrayList<String>();

        // Setup name array
        balanceName.add("BalanceName :: BalanceDOWN");
        balanceCount.add("BalanceCount :: 400.0");
        balanceTime.add("BalanceTimeTransaction :: 1998-01-08 05:05:06.0");

        balanceName.add("BalanceName :: BalanceUP");
        balanceCount.add("BalanceCount :: 500.0");
        balanceTime.add("BalanceTimeTransaction :: 1999-01-08 06:05:06.0");


        // Setup element array
        tmp = driver.findElements(By.id("balanceName"));
        tmp2 = driver.findElements(By.id("balanceCount"));
        tmp3 = driver.findElements(By.id("balanceTime"));
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
            int num3 = balanceTime.indexOf(tmp3.get(i).getText().toString());
            if( num==-1 || num2==-1 || num3==-1){
                System.out.println("Error::_" + tmp.get(i).getText() + "_Stop");
                System.out.println("Error::_" + tmp2.get(i).getText() +  "_Stop");
                System.out.println("Error::_" + tmp3.get(i).getText() +  "_Stop");
                System.out.println("NUM::" + num + " NUM2::" + num2 + " NUM3::" +num3 );
                Assert.fail();
            }
            else {
                balanceName.remove(num);
                balanceCount.remove(num2);
                balanceTime.remove(num3);
            }
        }

        //<---TIME_TEST_TIME--->\\


    }
}

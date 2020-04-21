package selenium;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class clientExtendedTest extends base{

    @Test
    public void Test(){
       // System.setProperty("webdriver.chrome.driver", "/Users/max/work/prac/Base/hibernate/odb/src/main/resources/chromedriver");
        //ChromeDriver driver = new ChromeDriver();
        driver.get("http://localhost:8080/start");

        if(!driver.getTitle().equals("Client_EXT_")){
            Assert.fail();
        }

        driver.findElement(By.id("clientButton")).click();
        if( !driver.getCurrentUrl().equals("http://localhost:8080/client/filter")){
            System.out.println(driver.getCurrentUrl());
            Assert.fail();
        }

        driver.findElement(By.id("serviceButton")).click();
        if( !driver.getCurrentUrl().equals("http://localhost:8080/service")){
            System.out.println(driver.getCurrentUrl());
            Assert.fail();
        }

        driver.findElement(By.id("clientButton")).click();

        driver.findElement(By.id("clientAdd")).click();
        if( !driver.getCurrentUrl().equals("http://localhost:8080/client/person/add")){
            System.out.println(driver.getCurrentUrl());
            Assert.fail();
        }

        driver.findElement(By.id("backButton")).click();

        List<WebElement> tmp = new ArrayList<WebElement>();
        List<String>  clientName = new ArrayList<String>();
        // Setup name array
        clientName.add("Milton Bostock");
        clientName.add("Mazie Burn");
        clientName.add("Zayden Gould");
        clientName.add("Harriet Shaw");
        clientName.add("Armitage Company");
        // Setup element array
        tmp = driver.findElements(By.id("clientName"));
        // trick
        tmp.remove(0); //First element everytime Empty
        // run nad check every name
        for ( WebElement ent : tmp){
            int count = clientName.indexOf(ent.getText());
            if( (count == -1)){
                Assert.fail();
            }
            else {
                clientName.remove(count);
            }
        }

        driver.findElement(By.id("clientDebt")).click();
        driver.findElement(By.id("filterButton")).click();

        tmp = new ArrayList<WebElement>();
        clientName = new ArrayList<String>();
        // Setup name array
        clientName.add("Zayden Gould");
        clientName.add("Harriet Shaw");
        // Setup element array
        tmp = driver.findElements(By.id("clientName"));
        // trick
        tmp.remove(0); //First element everytime Empty
        // run nad check every name
        for ( WebElement ent : tmp){
            int count = clientName.indexOf(ent.getText());
            if( (count == -1)){
                System.out.println("Error::_" + ent.getText());
                Assert.fail();
            }
            else {
                clientName.remove(count);
            }
        }

        driver.findElement(By.id("clientDebt")).click();
        driver.findElement(By.id("filterButton")).click();

        driver.findElement(By.id("clientBalance")).click();
        driver.findElement(By.id("filterButton")).click();

        tmp = new ArrayList<WebElement>();
        clientName = new ArrayList<String>();
        // Setup name array
        clientName.add("Milton Bostock");
        clientName.add("Mazie Burn");
        clientName.add("Armitage Company");
        // Setup element array
        tmp = driver.findElements(By.id("clientName"));
        // trick
        tmp.remove(0); //First element everytime Empty
        // run nad check every name
        for ( WebElement ent : tmp){
            int count = clientName.indexOf(ent.getText());
            if( (count == -1)){
                System.out.println("Error::_" + ent.getText());
                Assert.fail();
            }
            else {
                clientName.remove(count);
            }
        }

        driver.findElement(By.id("clientBalance")).click();
        driver.findElement(By.id("filterButton")).click();


        driver.findElement(By.id("clientNameInput")).sendKeys("Milton Bostock");
        driver.findElement(By.id("filterButton")).click();

        tmp = new ArrayList<WebElement>();
        clientName = new ArrayList<String>();
        // Setup name array
        clientName.add("Milton Bostock");
        // Setup element array
        tmp = driver.findElements(By.id("clientName"));
        // trick
        tmp.remove(0); //First element everytime Empty
        // run nad check every name
        for ( WebElement ent : tmp){
            int count = clientName.indexOf(ent.getText());
            if( (count == -1)){
                System.out.println("Error::_" + ent.getText());
                Assert.fail();
            }
            else {
                clientName.remove(count);
            }
        }

        driver.findElement(By.id("clientNameInput")).clear();
        driver.findElement(By.id("filterButton")).click();

        driver.findElement(By.id("clientNameInput")).sendKeys("Genius");
        driver.findElement(By.id("filterButton")).click();

        tmp = new ArrayList<WebElement>();
        clientName = new ArrayList<String>();
        // Setup name array
        // Setup element array
        tmp = driver.findElements(By.id("clientName"));
        // trick
        if ( tmp.size() != 0){
            tmp.remove(0); //First element everytime Empty
        }
        // run nad check every name
        for ( WebElement ent : tmp){
            int count = clientName.indexOf(ent.getText());
            if( (count == -1)){
                System.out.println("Error::_" + ent.getText());
                Assert.fail();
            }
            else {
                clientName.remove(count);
            }
        }

        driver.findElement(By.id("clientNameInput")).clear();
        driver.findElement(By.id("filterButton")).click();


        driver.findElement(By.id("serviceNameInput")).sendKeys("internet");
        driver.findElement(By.id("filterButton")).click();

        tmp = new ArrayList<WebElement>();
        clientName = new ArrayList<String>();
        // Setup name array
        clientName.add("Milton Bostock");
        clientName.add("Mazie Burn");
        clientName.add("Harriet Shaw");
        clientName.add("Armitage Company");
        // Setup element array
        tmp = driver.findElements(By.id("clientName"));
        // trick
        tmp.remove(0); //First element everytime Empty
        // run nad check every name
        for ( WebElement ent : tmp){
            int count = clientName.indexOf(ent.getText());
            if( (count == -1)){
                System.out.println("Error::_" + ent.getText());
                Assert.fail();
            }
            else {
                clientName.remove(count);
            }
        }

        driver.findElement(By.id("serviceNameInput")).clear();
        driver.findElement(By.id("filterButton")).click();

        driver.findElement(By.id("serviceNameInput")).sendKeys("Hereford");
        driver.findElement(By.id("filterButton")).click();

        tmp = new ArrayList<WebElement>();
        clientName = new ArrayList<String>();
        // Setup name array
        // Setup element array
        tmp = driver.findElements(By.id("clientName"));
        // trick
        if ( tmp.size() != 0){
            tmp.remove(0); //First element everytime Empty
        }
        // run nad check every name
        for ( WebElement ent : tmp){
            int count = clientName.indexOf(ent.getText());
            if( (count == -1)){
                System.out.println("Error::_" + ent.getText());
                Assert.fail();
            }
            else {
                clientName.remove(count);
            }
        }

        driver.findElement(By.id("serviceNameInput")).clear();
        driver.findElement(By.id("filterButton")).click();

        Select select = new Select(driver.findElement(By.id("downDateDay")));
        select.selectByVisibleText("31");
        select = new Select(driver.findElement(By.id("downDateMonth")));
        select.selectByVisibleText("2");
        select = new Select(driver.findElement(By.id("downDateYearFP")));
        select.selectByVisibleText("20");
        driver.findElement(By.id("downDateYearSP")).clear();
        driver.findElement(By.id("downDateYearSP")).sendKeys("81");
        driver.findElement(By.id("filterButton")).click();

        if(!driver.getTitle().equals("ERROR")){
            System.out.println(driver.getTitle());
            Assert.fail();
        }

        driver.findElement(By.id("back")).click();

        driver.findElement(By.id("downDateYearSP")).clear();
        driver.findElement(By.id("downDateYearSP")).sendKeys("awdawd");
        driver.findElement(By.id("filterButton")).click();

        if(!driver.getTitle().equals("ERROR")){
            System.out.println(driver.getTitle());
            Assert.fail();
        }

        driver.findElement(By.id("back")).click();

        select = new Select(driver.findElement(By.id("downDateDay")));
        select.selectByVisibleText("18");
        select = new Select(driver.findElement(By.id("downDateMonth")));
        select.selectByVisibleText("11");
        select = new Select(driver.findElement(By.id("downDateYearFP")));
        select.selectByVisibleText("20");
        driver.findElement(By.id("downDateYearSP")).clear();
        driver.findElement(By.id("downDateYearSP")).sendKeys("00");
        driver.findElement(By.id("serviceNameInput")).clear();
        driver.findElement(By.id("serviceNameInput")).sendKeys("internet");
        driver.findElement(By.id("filterButton")).click();

        tmp = new ArrayList<WebElement>();
        clientName = new ArrayList<String>();
        // Setup name array
        // Setup element array
        tmp = driver.findElements(By.id("clientName"));
        clientName.add("Mazie Burn");
        clientName.add("Armitage Company");
        // trick
        if ( tmp.size() != 0){
            tmp.remove(0); //First element everytime Empty
        }
        // run nad check every name
        for ( WebElement ent : tmp){
            int count = clientName.indexOf(ent.getText());
            if( (count == -1)){
                System.out.println("Error::_" + ent.getText());
                Assert.fail();
            }
            else {
                clientName.remove(count);
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
        driver.findElement(By.id("serviceNameInput")).clear();
        driver.findElement(By.id("serviceNameInput")).sendKeys("");
        driver.findElement(By.id("filterButton")).click();


        select = new Select(driver.findElement(By.id("upDateDay")));
        select.selectByVisibleText("31");
        select = new Select(driver.findElement(By.id("upDateMonth")));
        select.selectByVisibleText("2");
        select = new Select(driver.findElement(By.id("upDateYearFP")));
        select.selectByVisibleText("20");
        driver.findElement(By.id("upDateYearSP")).clear();
        driver.findElement(By.id("upDateYearSP")).sendKeys("81");
        driver.findElement(By.id("filterButton")).click();

        if(!driver.getTitle().equals("ERROR")){
            System.out.println(driver.getTitle());
            Assert.fail();
        }

        driver.findElement(By.id("back")).click();

        driver.findElement(By.id("upDateYearSP")).clear();
        driver.findElement(By.id("upDateYearSP")).sendKeys("awdawd");
        driver.findElement(By.id("filterButton")).click();

        if(!driver.getTitle().equals("ERROR")){
            System.out.println(driver.getTitle());
            Assert.fail();
        }
        driver.findElement(By.id("back")).click();


        select = new Select(driver.findElement(By.id("upDateDay")));
        select.selectByVisibleText("18");
        select = new Select(driver.findElement(By.id("upDateMonth")));
        select.selectByVisibleText("11");
        select = new Select(driver.findElement(By.id("upDateYearFP")));
        select.selectByVisibleText("20");
        driver.findElement(By.id("upDateYearSP")).clear();
        driver.findElement(By.id("upDateYearSP")).sendKeys("45");
        driver.findElement(By.id("serviceNameInput")).clear();
        driver.findElement(By.id("serviceNameInput")).sendKeys("internet");
        driver.findElement(By.id("filterButton")).click();

        tmp = new ArrayList<WebElement>();
        clientName = new ArrayList<String>();
        // Setup name array
        // Setup element array
        tmp = driver.findElements(By.id("clientName"));
        clientName.add("Harriet Shaw");
        // trick
        if ( tmp.size() != 0){
            tmp.remove(0); //First element everytime Empty
        }
        // run nad check every name
        for ( WebElement ent : tmp){
            int count = clientName.indexOf(ent.getText());
            if( (count == -1)){
                System.out.println("Error::_" + ent.getText());
                Assert.fail();
            }
            else {
                clientName.remove(count);
            }
        }

        select = new Select(driver.findElement(By.id("upDateDay")));
        select.selectByVisibleText("--");
        select = new Select(driver.findElement(By.id("upDateMonth")));
        select.selectByVisibleText("--");
        select = new Select(driver.findElement(By.id("upDateYearFP")));
        select.selectByVisibleText("--");
        driver.findElement(By.id("upDateYearSP")).clear();
        driver.findElement(By.id("upDateYearSP")).sendKeys("--");
        driver.findElement(By.id("serviceNameInput")).clear();
        driver.findElement(By.id("serviceNameInput")).sendKeys("");
        driver.findElement(By.id("filterButton")).click();


    }
}

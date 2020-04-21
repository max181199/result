package selenium;

import org.junit.Assert;
import org.junit.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class clientAddTest extends base {


    @Test
    public void clientAdd(){

        driver.get("http://localhost:8080/start");

        if(!driver.getTitle().equals("Client_EXT_")){
            Assert.fail();
        }

        driver.findElement(By.id("clientAdd")).click();
        if( !driver.getCurrentUrl().equals("http://localhost:8080/client/person/add")){
            System.out.println(driver.getCurrentUrl());
            Assert.fail();
        }

        driver.findElement(By.id("backButton")).click();
        if(!driver.getTitle().equals("Client_EXT_")){
            Assert.fail();
        }

        driver.findElement(By.id("clientAdd")).click();

        driver.findElement(By.id("clientName")).clear();
        driver.findElement(By.id("addButton")).click();
        if(!driver.getTitle().equals("ERROR")){
            Assert.fail();
        }
        driver.findElement(By.id("back")).click();


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

        driver.findElement(By.id("clientAdd")).click();
        name= "TestUser";
        count = "13";
        day   = "13";
        driver.findElement(By.id("clientName")).clear();
        driver.findElement(By.id("clientName")).sendKeys(name);
        driver.findElement(By.id("mcCount")).clear();
        driver.findElement(By.id("mcCount")).sendKeys(count);
        driver.findElement(By.id("mcDay")).clear();
        driver.findElement(By.id("mcDay")).sendKeys(day);
        driver.findElement(By.id("addButton")).click();
        if(!driver.getTitle().equals("ERROR")){
            Assert.fail();
        }
        driver.findElement(By.id("back")).click();

        driver.findElement(By.id("clientAdd")).click();
        name= "TestUser2";
        count = "sefnsfno92904--=";
         day   = "234802===";
        driver.findElement(By.id("clientName")).clear();
        driver.findElement(By.id("clientName")).sendKeys(name);
        driver.findElement(By.id("mcCount")).clear();
        driver.findElement(By.id("mcCount")).sendKeys(count);
        driver.findElement(By.id("mcDay")).clear();
        driver.findElement(By.id("mcDay")).sendKeys(day);
        driver.findElement(By.id("addButton")).click();

        if(!driver.getTitle().equals("ERROR")){
            Assert.fail();
        }
        driver.findElement(By.id("back")).click();

        List<WebElement> tmp = new ArrayList<WebElement>();
        List<String>  clientName = new ArrayList<String>();
        // Setup name array
        clientName.add("Milton Bostock");
        clientName.add("Mazie Burn");
        clientName.add("Zayden Gould");
        clientName.add("Harriet Shaw");
        clientName.add("Armitage Company");
        clientName.add("TestUser");
        // Setup element array
        tmp = driver.findElements(By.id("clientName"));
        // trick
        if ( tmp.size() != 0){
            tmp.remove(0); //First element everytime Empty
        }
        // run nad check every name
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

        for ( WebElement ent : tmp){
            if (ent.getText().equals("TestUser")){
                ent.click();
                break;
            }
        }

        if(!driver.getTitle().equals("oneClient_EXT_")){
            Assert.fail();
        }

        name= "TestUser";
        count = "13.0";
        day   = "13.0";

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

        driver.findElement(By.id("delete")).click();
        if(!driver.getTitle().equals("Client_EXT_")){
            Assert.fail();
        }

        tmp = new ArrayList<WebElement>();
        clientName = new ArrayList<String>();
        // Setup name array
        clientName.add("Milton Bostock");
        clientName.add("Mazie Burn");
        clientName.add("Zayden Gould");
        clientName.add("Harriet Shaw");
        clientName.add("Armitage Company");
        // Setup element array
        tmp = driver.findElements(By.id("clientName"));
        // trick
        if ( tmp.size() != 0){
            tmp.remove(0); //First element everytime Empty
        }
        // run nad check every name
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

    }
}

package selenium;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class contactTest extends base {

    @Test
    public void conTest(){


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


        tmp = new ArrayList<WebElement>();
        List<WebElement> tmp2 = new ArrayList<WebElement>();
        List<WebElement> tmp3 = new ArrayList<WebElement>();
        List<WebElement> tmp4 = new ArrayList<WebElement>();
        List<String>  contactName = new ArrayList<String>();
        List<String>  contactAddress = new ArrayList<String>();
        List<String>  contactEmail = new ArrayList<String>();
        List<String>  contactPhone = new ArrayList<String>();

        // Setup name array

        contactName.add("ContactName :: Milton Bostock");
        contactAddress.add("ContactAddres :: 75 Mill Pond Avenue North Bergen, NJ 07047");
        contactEmail.add("ContactEmail :: mil_bos@mail.ru");
        contactPhone.add("ContactPhone :: 8-800-555-3535");

        // Setup element array
        tmp = driver.findElements(By.id("contactName"));
        tmp2 = driver.findElements(By.id("contactAddress"));
        tmp3 = driver.findElements(By.id("contactEmail"));
        tmp4 = driver.findElements(By.id("contactPhone"));
        //Check every string
        for(int i =0 ; i<tmp.size(); i++){
//           System.out.println(tmp.get(i).getText());
//           System.out.println(tmp2.get(i).getText());
//           System.out.println(tmp3.get(i).getText());
//           System.out.println(tmp4.get(i).getText());
            int num = contactName.indexOf(tmp.get(i).getText());
            int num2 = contactAddress.indexOf(tmp2.get(i).getText().toString());
            int num3 = contactEmail.indexOf(tmp3.get(i).getText().toString());
            int num4 = contactPhone.indexOf(tmp4.get(i).getText().toString());
            if( num==-1 || num2==-1 || num3==-1 || num4==-1){
                System.out.println("Error::_" + tmp.get(i).getText() + "_Stop");
                System.out.println("Error::_" + tmp2.get(i).getText() +  "_Stop");
                System.out.println("Error::_" + tmp3.get(i).getText() +  "_Stop");
                System.out.println("Error::_" + tmp4.get(i).getText() + "_Stop");
                System.out.println("NUM::" + num + " NUM2::" + num2 + " NUM3::" +num3 + " NUM4::" + num4);
                Assert.fail();
            }
            else {
                contactName.remove(num);
                contactAddress.remove(num2);
                contactEmail.remove(num3);
                contactPhone.remove(num4);
            }
        }

        tmp = new ArrayList<WebElement>();
        tmp = driver.findElements(By.id("contactName"));

        for ( WebElement ent : tmp){
            //System.out.println(ent.getText());
            if (ent.getText().equals("ContactName :: Milton Bostock")){
                ent.click();
                break;
            }
        }

        driver.findElement(By.id("name")).clear();
        driver.findElement(By.id("update")).click();

        if(!driver.getTitle().equals("ERROR")){
            System.out.println(driver.getTitle());
            Assert.fail();
        }
        driver.findElement(By.id("back")).click();


        tmp = new ArrayList<WebElement>();
        tmp = driver.findElements(By.id("clientName"));
        for ( WebElement ent : tmp){
            //System.out.println(ent.getText());
            if (ent.getText().equals("Milton Bostock")){
                ent.click();
                break;
            }
        }

        tmp = new ArrayList<WebElement>();
        tmp = driver.findElements(By.id("contactName"));

        for ( WebElement ent : tmp){
            //System.out.println(ent.getText());
            if (ent.getText().equals("ContactName :: Milton Bostock")){
                ent.click();
                break;
            }
        }

        driver.findElement(By.id("name")).clear();
        driver.findElement(By.id("name")).sendKeys("Milton Boss");
        driver.findElement(By.id("update")).click();
        driver.findElement(By.id("back")).click();

        if(!driver.getTitle().equals("oneClient_EXT_")){
            Assert.fail();
        }

        tmp = new ArrayList<WebElement>();
        tmp2 = new ArrayList<WebElement>();
        tmp3 = new ArrayList<WebElement>();
        tmp4 = new ArrayList<WebElement>();
        contactName = new ArrayList<String>();
        contactAddress = new ArrayList<String>();
        contactEmail = new ArrayList<String>();
        contactPhone = new ArrayList<String>();

        // Setup name array

        contactName.add("ContactName :: Milton Boss");
        contactAddress.add("ContactAddres :: 75 Mill Pond Avenue North Bergen, NJ 07047");
        contactEmail.add("ContactEmail :: mil_bos@mail.ru");
        contactPhone.add("ContactPhone :: 8-800-555-3535");

        // Setup element array
        tmp = driver.findElements(By.id("contactName"));
        tmp2 = driver.findElements(By.id("contactAddress"));
        tmp3 = driver.findElements(By.id("contactEmail"));
        tmp4 = driver.findElements(By.id("contactPhone"));
        //Check every string
        for(int i =0 ; i<tmp.size(); i++){
//           System.out.println(tmp.get(i).getText());
//           System.out.println(tmp2.get(i).getText());
//           System.out.println(tmp3.get(i).getText());
//           System.out.println(tmp4.get(i).getText());
            int num = contactName.indexOf(tmp.get(i).getText());
            int num2 = contactAddress.indexOf(tmp2.get(i).getText().toString());
            int num3 = contactEmail.indexOf(tmp3.get(i).getText().toString());
            int num4 = contactPhone.indexOf(tmp4.get(i).getText().toString());
            if( num==-1 || num2==-1 || num3==-1 || num4==-1){
                System.out.println("Error::_" + tmp.get(i).getText() + "_Stop");
                System.out.println("Error::_" + tmp2.get(i).getText() +  "_Stop");
                System.out.println("Error::_" + tmp3.get(i).getText() +  "_Stop");
                System.out.println("Error::_" + tmp4.get(i).getText() + "_Stop");
                System.out.println("NUM::" + num + " NUM2::" + num2 + " NUM3::" +num3 + " NUM4::" + num4);
                Assert.fail();
            }
            else {
                contactName.remove(num);
                contactAddress.remove(num2);
                contactEmail.remove(num3);
                contactPhone.remove(num4);
            }
        }

        tmp = new ArrayList<WebElement>();
        tmp = driver.findElements(By.id("contactName"));

        for ( WebElement ent : tmp){
            //System.out.println(ent.getText());
            if (ent.getText().equals("ContactName :: Milton Boss")){
                ent.click();
                break;
            }
        }

        driver.findElement(By.id("name")).clear();
        driver.findElement(By.id("name")).sendKeys("Milton Bostock");
        driver.findElement(By.id("update")).click();
        driver.findElement(By.id("back")).click();


        //<-------------------------------------->\\

        tmp = new ArrayList<WebElement>();
        tmp = driver.findElements(By.id("contactName"));

        for ( WebElement ent : tmp){
            //System.out.println(ent.getText());
            if (ent.getText().equals("ContactName :: Milton Bostock")){
                ent.click();
                break;
            }
        }

        driver.findElement(By.id("deleteAddress")).click();
        driver.findElement(By.id("back")).click();

        tmp = new ArrayList<WebElement>();
        tmp2 = new ArrayList<WebElement>();
        tmp3 = new ArrayList<WebElement>();
        tmp4 = new ArrayList<WebElement>();
        contactName = new ArrayList<String>();
        contactAddress = new ArrayList<String>();
        contactEmail = new ArrayList<String>();
        contactPhone = new ArrayList<String>();

        // Setup name array

        contactName.add("ContactName :: Milton Bostock");
        contactAddress.add("ContactAddres :: 75 Mill Pond Avenue North Bergen, NJ 07047");
        contactEmail.add("ContactEmail :: mil_bos@mail.ru");
        contactPhone.add("ContactPhone :: 8-800-555-3535");

        // Setup element array
        tmp = driver.findElements(By.id("contactName"));
        tmp2 = driver.findElements(By.id("contactAddress"));
        tmp3 = driver.findElements(By.id("contactEmail"));
        tmp4 = driver.findElements(By.id("contactPhone"));
        //Check every string
        for(int i =0 ; i<tmp.size(); i++){
//           System.out.println(tmp.get(i).getText());
//           System.out.println(tmp2.get(i).getText());
//           System.out.println(tmp3.get(i).getText());
//           System.out.println(tmp4.get(i).getText());
            int num = contactName.indexOf(tmp.get(i).getText());
            int num2=-1;
            if( tmp2.isEmpty()){
                num2=1;
            }
            int num3 = contactEmail.indexOf(tmp3.get(i).getText().toString());
            int num4 = contactPhone.indexOf(tmp4.get(i).getText().toString());
            if( num==-1 || num2==-1 || num3==-1 || num4==-1){
                System.out.println("Error::_" + tmp.get(i).getText() + "_Stop");
                System.out.println("Error::_" + tmp2 +  "_Stop");
                System.out.println("Error::_" + tmp3.get(i).getText() +  "_Stop");
                System.out.println("Error::_" + tmp4.get(i).getText() + "_Stop");
                System.out.println("NUM::" + num + " NUM2::" + num2 + " NUM3::" +num3 + " NUM4::" + num4);
                Assert.fail();
            }
            else {
                contactName.remove(num);
                contactEmail.remove(num3);
                contactPhone.remove(num4);
            }
        }

        tmp = new ArrayList<WebElement>();
        tmp = driver.findElements(By.id("contactName"));

        for ( WebElement ent : tmp){
            //System.out.println(ent.getText());
            if (ent.getText().equals("ContactName :: Milton Bostock")){
                ent.click();
                break;
            }
        }

        driver.findElement(By.id("address")).sendKeys("75 Mill Pond Avenue North Bergen, NJ 07047");
        driver.findElement(By.id("update")).click();
        driver.findElement(By.id("back")).click();

        tmp = new ArrayList<WebElement>();
        tmp2 = new ArrayList<WebElement>();
        tmp3 = new ArrayList<WebElement>();
        tmp4 = new ArrayList<WebElement>();
        contactName = new ArrayList<String>();
        contactAddress = new ArrayList<String>();
        contactEmail = new ArrayList<String>();
        contactPhone = new ArrayList<String>();

        // Setup name array

        contactName.add("ContactName :: Milton Bostock");
        contactAddress.add("ContactAddres :: 75 Mill Pond Avenue North Bergen, NJ 07047");
        contactEmail.add("ContactEmail :: mil_bos@mail.ru");
        contactPhone.add("ContactPhone :: 8-800-555-3535");

        // Setup element array
        tmp = driver.findElements(By.id("contactName"));
        tmp2 = driver.findElements(By.id("contactAddress"));
        tmp3 = driver.findElements(By.id("contactEmail"));
        tmp4 = driver.findElements(By.id("contactPhone"));
        //Check every string
        for(int i =0 ; i<tmp.size(); i++){
//           System.out.println(tmp.get(i).getText());
//           System.out.println(tmp2.get(i).getText());
//           System.out.println(tmp3.get(i).getText());
//           System.out.println(tmp4.get(i).getText());
            int num = contactName.indexOf(tmp.get(i).getText());
            int num2 = contactAddress.indexOf(tmp2.get(i).getText().toString());
            int num3 = contactEmail.indexOf(tmp3.get(i).getText().toString());
            int num4 = contactPhone.indexOf(tmp4.get(i).getText().toString());
            if( num==-1 || num2==-1 || num3==-1 || num4==-1){
                System.out.println("Error::_" + tmp.get(i).getText() + "_Stop");
                System.out.println("Error::_" + tmp2.get(i).getText() +  "_Stop");
                System.out.println("Error::_" + tmp3.get(i).getText() +  "_Stop");
                System.out.println("Error::_" + tmp4.get(i).getText() + "_Stop");
                System.out.println("NUM::" + num + " NUM2::" + num2 + " NUM3::" +num3 + " NUM4::" + num4);
                Assert.fail();
            }
            else {
                contactName.remove(num);
                contactAddress.remove(num2);
                contactEmail.remove(num3);
                contactPhone.remove(num4);
            }
        }


     //<--------------------------->\\








        //<-------------------------------------->\\

        tmp = new ArrayList<WebElement>();
        tmp = driver.findElements(By.id("contactName"));

        for ( WebElement ent : tmp){
            //System.out.println(ent.getText());
            if (ent.getText().equals("ContactName :: Milton Bostock")){
                ent.click();
                break;
            }
        }

        driver.findElement(By.id("deleteEmail")).click();
        driver.findElement(By.id("back")).click();

        tmp = new ArrayList<WebElement>();
        tmp2 = new ArrayList<WebElement>();
        tmp3 = new ArrayList<WebElement>();
        tmp4 = new ArrayList<WebElement>();
        contactName = new ArrayList<String>();
        contactAddress = new ArrayList<String>();
        contactEmail = new ArrayList<String>();
        contactPhone = new ArrayList<String>();

        // Setup name array

        contactName.add("ContactName :: Milton Bostock");
        contactAddress.add("ContactAddres :: 75 Mill Pond Avenue North Bergen, NJ 07047");
        contactEmail.add("ContactEmail :: mil_bos@mail.ru");
        contactPhone.add("ContactPhone :: 8-800-555-3535");

        // Setup element array
        tmp = driver.findElements(By.id("contactName"));
        tmp2 = driver.findElements(By.id("contactAddress"));
        tmp3 = driver.findElements(By.id("contactEmail"));
        tmp4 = driver.findElements(By.id("contactPhone"));
        //Check every string
        for(int i =0 ; i<tmp.size(); i++){
//           System.out.println(tmp.get(i).getText());
//           System.out.println(tmp2.get(i).getText());
//           System.out.println(tmp3.get(i).getText());
//           System.out.println(tmp4.get(i).getText());
            int num = contactName.indexOf(tmp.get(i).getText());
            int num2= contactAddress.indexOf(tmp2.get(i).getText().toString());
            int num3=-1;
            if( tmp3.isEmpty()){
                num3=1;
            }
            int num4 = contactPhone.indexOf(tmp4.get(i).getText().toString());
            if( num==-1 || num2==-1 || num3==-1 || num4==-1){
                System.out.println("Error::_" + tmp.get(i).getText() + "_Stop");
                System.out.println("Error::_" + tmp2 +  "_Stop");
                System.out.println("Error::_" + tmp3 +  "_Stop");
                System.out.println("Error::_" + tmp4.get(i).getText() + "_Stop");
                System.out.println("NUM::" + num + " NUM2::" + num2 + " NUM3::" +num3 + " NUM4::" + num4);
                Assert.fail();
            }
            else {
                contactName.remove(num);
                contactAddress.remove(num2);
                //contactEmail.remove(num3);
                contactPhone.remove(num4);
            }
        }

        tmp = new ArrayList<WebElement>();
        tmp = driver.findElements(By.id("contactName"));

        for ( WebElement ent : tmp){
            //System.out.println(ent.getText());
            if (ent.getText().equals("ContactName :: Milton Bostock")){
                ent.click();
                break;
            }
        }

        driver.findElement(By.id("email")).sendKeys("mil_bos@mail.ru");
        driver.findElement(By.id("update")).click();
        driver.findElement(By.id("back")).click();

        tmp = new ArrayList<WebElement>();
        tmp2 = new ArrayList<WebElement>();
        tmp3 = new ArrayList<WebElement>();
        tmp4 = new ArrayList<WebElement>();
        contactName = new ArrayList<String>();
        contactAddress = new ArrayList<String>();
        contactEmail = new ArrayList<String>();
        contactPhone = new ArrayList<String>();

        // Setup name array

        contactName.add("ContactName :: Milton Bostock");
        contactAddress.add("ContactAddres :: 75 Mill Pond Avenue North Bergen, NJ 07047");
        contactEmail.add("ContactEmail :: mil_bos@mail.ru");
        contactPhone.add("ContactPhone :: 8-800-555-3535");

        // Setup element array
        tmp = driver.findElements(By.id("contactName"));
        tmp2 = driver.findElements(By.id("contactAddress"));
        tmp3 = driver.findElements(By.id("contactEmail"));
        tmp4 = driver.findElements(By.id("contactPhone"));
        //Check every string
        for(int i =0 ; i<tmp.size(); i++){
//           System.out.println(tmp.get(i).getText());
//           System.out.println(tmp2.get(i).getText());
//           System.out.println(tmp3.get(i).getText());
//           System.out.println(tmp4.get(i).getText());
            int num = contactName.indexOf(tmp.get(i).getText());
            int num2 = contactAddress.indexOf(tmp2.get(i).getText().toString());
            int num3 = contactEmail.indexOf(tmp3.get(i).getText().toString());
            int num4 = contactPhone.indexOf(tmp4.get(i).getText().toString());
            if( num==-1 || num2==-1 || num3==-1 || num4==-1){
                System.out.println("Error::_" + tmp.get(i).getText() + "_Stop");
                System.out.println("Error::_" + tmp2.get(i).getText() +  "_Stop");
                System.out.println("Error::_" + tmp3.get(i).getText() +  "_Stop");
                System.out.println("Error::_" + tmp4.get(i).getText() + "_Stop");
                System.out.println("NUM::" + num + " NUM2::" + num2 + " NUM3::" +num3 + " NUM4::" + num4);
                Assert.fail();
            }
            else {
                contactName.remove(num);
                contactAddress.remove(num2);
                contactEmail.remove(num3);
                contactPhone.remove(num4);
            }
        }


        //<--------------------------->\\













        //<-------------------------------------->\\

        tmp = new ArrayList<WebElement>();
        tmp = driver.findElements(By.id("contactName"));

        for ( WebElement ent : tmp){
            //System.out.println(ent.getText());
            if (ent.getText().equals("ContactName :: Milton Bostock")){
                ent.click();
                break;
            }
        }

        driver.findElement(By.id("deletePhone")).click();
        driver.findElement(By.id("back")).click();

        tmp = new ArrayList<WebElement>();
        tmp2 = new ArrayList<WebElement>();
        tmp3 = new ArrayList<WebElement>();
        tmp4 = new ArrayList<WebElement>();
        contactName = new ArrayList<String>();
        contactAddress = new ArrayList<String>();
        contactEmail = new ArrayList<String>();
        contactPhone = new ArrayList<String>();

        // Setup name array

        contactName.add("ContactName :: Milton Bostock");
        contactAddress.add("ContactAddres :: 75 Mill Pond Avenue North Bergen, NJ 07047");
        contactEmail.add("ContactEmail :: mil_bos@mail.ru");
        contactPhone.add("ContactPhone :: 8-800-555-3535");

        // Setup element array
        tmp = driver.findElements(By.id("contactName"));
        tmp2 = driver.findElements(By.id("contactAddress"));
        tmp3 = driver.findElements(By.id("contactEmail"));
        tmp4 = driver.findElements(By.id("contactPhone"));
        //Check every string
        for(int i =0 ; i<tmp.size(); i++){
//           System.out.println(tmp.get(i).getText());
//           System.out.println(tmp2.get(i).getText());
//           System.out.println(tmp3.get(i).getText());
//           System.out.println(tmp4.get(i).getText());
            int num = contactName.indexOf(tmp.get(i).getText());
            int num2= contactAddress.indexOf(tmp2.get(i).getText().toString());
            int num3= contactEmail.indexOf(tmp3.get(i).getText().toString());
            int num4=-1;
            if( tmp4.isEmpty()){
                num4=1;
            }
            if( num==-1 || num2==-1 || num3==-1 || num4==-1){
                System.out.println("Error::_" + tmp.get(i).getText() + "_Stop");
                System.out.println("Error::_" + tmp2.get(i).getText() +  "_Stop");
                System.out.println("Error::_" + tmp3.get(i).getText() +  "_Stop");
                System.out.println("Error::_" + tmp4 + "_Stop");
                System.out.println("NUM::" + num + " NUM2::" + num2 + " NUM3::" +num3 + " NUM4::" + num4);
                Assert.fail();
            }
            else {
                contactName.remove(num);
                contactAddress.remove(num2);
                contactEmail.remove(num3);
                //contactPhone.remove(num4);
            }
        }

        tmp = new ArrayList<WebElement>();
        tmp = driver.findElements(By.id("contactName"));

        for ( WebElement ent : tmp){
            //System.out.println(ent.getText());
            if (ent.getText().equals("ContactName :: Milton Bostock")){
                ent.click();
                break;
            }
        }

        driver.findElement(By.id("phone")).sendKeys("8-800-555-3535");
        driver.findElement(By.id("update")).click();
        driver.findElement(By.id("back")).click();

        tmp = new ArrayList<WebElement>();
        tmp2 = new ArrayList<WebElement>();
        tmp3 = new ArrayList<WebElement>();
        tmp4 = new ArrayList<WebElement>();
        contactName = new ArrayList<String>();
        contactAddress = new ArrayList<String>();
        contactEmail = new ArrayList<String>();
        contactPhone = new ArrayList<String>();

        // Setup name array

        contactName.add("ContactName :: Milton Bostock");
        contactAddress.add("ContactAddres :: 75 Mill Pond Avenue North Bergen, NJ 07047");
        contactEmail.add("ContactEmail :: mil_bos@mail.ru");
        contactPhone.add("ContactPhone :: 8-800-555-3535");

        // Setup element array
        tmp = driver.findElements(By.id("contactName"));
        tmp2 = driver.findElements(By.id("contactAddress"));
        tmp3 = driver.findElements(By.id("contactEmail"));
        tmp4 = driver.findElements(By.id("contactPhone"));
        //Check every string
        for(int i =0 ; i<tmp.size(); i++){
//           System.out.println(tmp.get(i).getText());
//           System.out.println(tmp2.get(i).getText());
//           System.out.println(tmp3.get(i).getText());
//           System.out.println(tmp4.get(i).getText());
            int num = contactName.indexOf(tmp.get(i).getText());
            int num2 = contactAddress.indexOf(tmp2.get(i).getText().toString());
            int num3 = contactEmail.indexOf(tmp3.get(i).getText().toString());
            int num4 = contactPhone.indexOf(tmp4.get(i).getText().toString());
            if( num==-1 || num2==-1 || num3==-1 || num4==-1){
                System.out.println("Error::_" + tmp.get(i).getText() + "_Stop");
                System.out.println("Error::_" + tmp2.get(i).getText() +  "_Stop");
                System.out.println("Error::_" + tmp3.get(i).getText() +  "_Stop");
                System.out.println("Error::_" + tmp4.get(i).getText() + "_Stop");
                System.out.println("NUM::" + num + " NUM2::" + num2 + " NUM3::" +num3 + " NUM4::" + num4);
                Assert.fail();
            }
            else {
                contactName.remove(num);
                contactAddress.remove(num2);
                contactEmail.remove(num3);
                contactPhone.remove(num4);
            }
        }

        tmp = new ArrayList<WebElement>();
        tmp = driver.findElements(By.id("contactName"));

        for ( WebElement ent : tmp){
            //System.out.println(ent.getText());
            if (ent.getText().equals("ContactName :: Milton Bostock")){
                ent.click();
                break;
            }
        }

        driver.findElement(By.id("address")).sendKeys("75 Mill Pond Avenue North Bergen, NJ 07047");
        driver.findElement(By.id("update")).click();

        if(!driver.getTitle().equals("ERROR")){
            Assert.fail();
        }

        driver.findElement(By.id("back")).click();

        if(!driver.getTitle().equals("Client_EXT_")){
            Assert.fail();
        }

        tmp = new ArrayList<WebElement>();
        tmp = driver.findElements(By.id("clientName"));

        for ( WebElement ent : tmp){
            //System.out.println(ent.getText());
            if (ent.getText().equals("Milton Bostock")){
                ent.click();
                break;
            }
        }

        tmp = new ArrayList<WebElement>();
        tmp = driver.findElements(By.id("contactName"));

        for ( WebElement ent : tmp){
            //System.out.println(ent.getText());
            if (ent.getText().equals("ContactName :: Milton Bostock")){
                ent.click();
                break;
            }
        }


        driver.findElement(By.id("email")).sendKeys("mil_bos@mail.ru");
        driver.findElement(By.id("update")).click();

        if(!driver.getTitle().equals("ERROR")){
            Assert.fail();
        }

        driver.findElement(By.id("back")).click();




        tmp = new ArrayList<WebElement>();
        tmp = driver.findElements(By.id("clientName"));

        for ( WebElement ent : tmp){
            //System.out.println(ent.getText());
            if (ent.getText().equals("Milton Bostock")){
                ent.click();
                break;
            }
        }

        tmp = new ArrayList<WebElement>();
        tmp = driver.findElements(By.id("contactName"));

        for ( WebElement ent : tmp){
            //System.out.println(ent.getText());
            if (ent.getText().equals("ContactName :: Milton Bostock")){
                ent.click();
                break;
            }
        }


        driver.findElement(By.id("phone")).sendKeys("8-800-555-3535");
        driver.findElement(By.id("update")).click();

        if(!driver.getTitle().equals("ERROR")){
            Assert.fail();
        }

        driver.findElement(By.id("back")).click();
        //<--------------------------->\\

    }

}

package selenium;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {

 public  ChromeDriver driver;

 @Before
 public void begin(){
  System.setProperty("webdriver.chrome.driver", "/Users/max/work/prac/Base/hibernate/odb/src/main/resources/chromedriver");
  driver = new ChromeDriver();
  System.out.println("Test Begin ::: ");
 }

 @After
 public void end(){
  driver.quit();
  System.out.println("Test End ::: ");
 }


}

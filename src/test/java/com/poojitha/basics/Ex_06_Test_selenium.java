package com.poojitha.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Ex_06_Test_selenium {
    @Test
    public static void test_selenium() throws Exception {
        WebDriver driver =new ChromeDriver() ;
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        String pageSource=driver.getPageSource() ;
        if(pageSource.contains("CURA Healthcare Service") ) {
            Assert.assertTrue(true);
            Thread.sleep(3000);
        }
          //  else{
                //Assert.assertTrue(false ) ;

       // }

        throw new Exception("CURA Healthcare Service not found") ;

    }
}

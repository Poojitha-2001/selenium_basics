package com.poojitha.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Ex_05_Test_selenium {
    @Test
    public static void test_selenium(){
        //creates a new session
        WebDriver driver=new ChromeDriver() ;
        //open the url
        driver.get("https://google.com");
        Assert.assertEquals(driver.getCurrentUrl() ,"https://www.google.com/");
        driver.quit() ;

    }
}

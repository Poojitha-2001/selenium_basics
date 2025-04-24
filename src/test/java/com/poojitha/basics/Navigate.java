package com.poojitha;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Navigate {
    @Test
    public static void selenium_navigate() throws InterruptedException {

        WebDriver driver =new ChromeDriver() ;
        driver.get("https://www.google.com") ;
        Thread .sleep(3000) ;
        driver.navigate() .to("https://bing.com") ;
        Thread.sleep(3000);
        driver.navigate() .back();
        Thread.sleep(3000);
        driver.navigate() .forward() ;
        Thread.sleep(3000);
        driver .navigate() .refresh() ;
        driver .quit() ;


    }
}

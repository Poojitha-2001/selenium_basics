package com.poojitha.basics;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class get {
    @Test
    public static void selenium_get() {
        WebDriver driver = new ChromeDriver() ;
        driver.get("https://www.google.com") ;

    }
}
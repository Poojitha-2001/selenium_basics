package com.poojitha.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Ex_04_test_selenium {
    @Test
    public static void test_selenium() throws InterruptedException {
        WebDriver driver =new ChromeDriver() ;
        driver .get("https://google.com");
        driver.manage() .window() .maximize() ;
        Thread.sleep(3000) ;
        driver.manage() .window() .minimize() ;
        driver.quit() ;
    }}

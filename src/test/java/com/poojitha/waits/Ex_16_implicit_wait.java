package com.poojitha.waits;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Ex_16_implicit_wait {

        @Description("implicit_wait")
        @Test
        public static void implicit_wait() throws InterruptedException {
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--incognito") ;
            options.addArguments("--start-maximized");
            WebDriver driver = new ChromeDriver(options);
            driver.get("https://app.vwo.com");
            String title=driver.getTitle() ;
            System.out.println(title);
            driver.manage().timeouts() .implicitlyWait(30,TimeUnit.SECONDS ) ;
            Assert.assertEquals(title ,"Login - VWO");


            driver.quit() ;
        }
}

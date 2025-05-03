package com.poojitha.Locators;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Ex_12_Absolute_Xpath {
    @Description("Absolute xpath")
    @Test
    public void A_xpath() throws InterruptedException {
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--start-maximized");
        WebDriver driver =new ChromeDriver(options) ;
        driver .get("https://app.vwo.com");
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div/div[1]/div/div/div[3]/form[1]/ul/li[1]/div/input")).sendKeys("pinky@gmail.com") ;
        Thread.sleep(3000) ;
        driver.quit() ;
    }
}

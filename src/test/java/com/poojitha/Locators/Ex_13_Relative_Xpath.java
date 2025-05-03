package com.poojitha.Locators;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Ex_13_Relative_Xpath {
    @Description ("Relative_Xpath")
    @Test
    public static void Relative_xpath() throws InterruptedException {

        ChromeOptions options =new ChromeOptions();
        options.addArguments("--start-maximized") ;
        WebDriver driver=new ChromeDriver(options) ;
        driver .get("https://app.vwo.com") ;
        //xpath by attribute
        //driver.findElement(By.xpath("input[@id='login-username']" )).sendKeys("poojitha@gmail.com") ;
        //xpath by contains
        //xpath by contains using Attributes
        //driver.findElement(By.xpath("//input[contains(@id,'login-username')]") ).sendKeys("poojitha@gmail.com") ;
        //xpath by contains using text
        //driver.findElement(By.xpath("//button[contains(text(),'Forgot Password?')]") ).click() ;
        //xpath by visible text(> vt <)
       // driver.findElement(By.xpath("//button[text()='Forgot Password?']") ).click() ;
        //xpath by group index
        driver.findElement(By.xpath("(//input)[1]") ).sendKeys("poojitha@gmail.com") ;
Thread .sleep(3000) ;
        driver.quit() ;
    }
}

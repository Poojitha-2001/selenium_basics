package com.poojitha;

import io.qameta.allure.Description;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Ex_25_making_booking {
    @Description ("making booking")
    @Test
    public static void making_booking() throws InterruptedException {
        //browser options
        ChromeOptions options=new ChromeOptions();
        options .addArguments("--start-maximized") ;
        //opens new session
        WebDriver driver=new ChromeDriver(options) ;
        //opens the web page
        driver.get("https://katalon-demo-cura.herokuapp.com/") ;
        //clicks on book appointment
        driver.findElement(By.xpath("//a[@id='btn-make-appointment']")).click() ;
        //enters the username
        driver.findElement( By.xpath("//input[@id='txt-username']") ).sendKeys("John Doe") ;
        //enters the password
        driver.findElement( By.xpath("//input[@id='txt-password']") ).sendKeys("ThisIsNotAPassword") ;
        //press on log in button
        driver.findElement( By.xpath("//button[@id='btn-login']") ).click() ;
        //explicit wait
       // WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(4) );
        //wait.until(ExpectedConditions .alertIsPresent());
        //Alert alert=driver.switchTo().alert() ;
        //alert.accept() ;
        //selects the options
       WebElement select= driver.findElement(By.xpath( "//select[@id='combo_facility']")) ;
     select .click() ;
     Select s=new Select(select);
       s.selectByValue("Seoul CURA Healthcare Center");
        //checks box
       driver.findElement(By.id("chk_hospotal_readmission" )).click() ;
        //radio box
       //driver.findElement(By.xpath("//input[@id='radio_program_none']") ) .click() ;

//enters the comment
       // driver.findElement(By.xpath("//textarea[@id='txt_comment']") ).sendKeys("poojitha is booking this appointment") ;
        //clicks the book appointment
        //driver.findElement(By.xpath("//button[@id='btn-book-appointment']")) .click() ;
        //does the assertions
        //Assert .assertEquals(driver.getCurrentUrl() ,"https://katalon-demo-cura.herokuapp.com/appointment.php#summary");
       // Thread.sleep(15000) ;
driver.quit() ;


    }
}

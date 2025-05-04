package com.poojitha.full_katalon_project;

import io.qameta.allure.Description;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class Ex_25_booking {
    @Description("making booking")
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
        WebElement buttonMakeAppointment =driver.findElement(By.xpath("//a[@id='btn-make-appointment']")) ;
        buttonMakeAppointment.click() ;
        //enters the username
        WebElement usernameInputBox=driver.findElement( By.xpath("//input[@id='txt-username']") ) ;
        usernameInputBox.sendKeys("John Doe");
        //enters the password
        WebElement pwdInputBox =driver.findElement( By.xpath("//input[@id='txt-password']") );
        pwdInputBox .sendKeys("ThisIsNotAPassword") ;
        //press on log in button
        WebElement buttonLogin= driver.findElement( By.xpath("//button[@id='btn-login']") ) ;
        buttonLogin.click() ;
        Thread.sleep(3000);
    /*explicit wait
      WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(4) );
       wait.until(ExpectedConditions.alertIsPresent());
       Alert alert=driver.switchTo().alert() ;
       alert.accept() ;*/
//selects the options
        WebElement select= driver.findElement(By.id( "combo_facility")) ;
        Select s=new Select(select);
        s.selectByValue("Seoul CURA Healthcare Center");
        //check box
        driver.findElement(By.id("chk_hospotal_readmission")).click() ;
//radio box
        driver.findElement(By.id("radio_program_none")) .click() ;

        WebElement visitDate=driver.findElement(By.cssSelector("input[placeholder='dd/mm/yyyy']"));
        visitDate.sendKeys("01/04/2025");
        WebElement comment_Box=driver.findElement(By.id("txt_comment"));
        comment_Box.sendKeys("ABC");
        driver.findElement(By.id("btn-book-appointment")).click();
        Thread.sleep(4000) ;
        driver.quit();

    }}

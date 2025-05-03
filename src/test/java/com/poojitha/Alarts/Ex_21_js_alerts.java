package com.poojitha.Alarts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class Ex_21_js_alerts {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver() ;
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        //driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click() ;
        //Alert alert=driver.switchTo() .alert() ;
        //alert.accept() ;
        //js confirm alert
        //driver .findElement(By.xpath("//button[@onclick='jsConfirm()']") ).click() ;
        //js prompt alert
        driver.findElement(By.xpath("//button[@onclick='jsPrompt()']") ).click() ;
        //explicit wait
        WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(4) );
        wait.until(ExpectedConditions.alertIsPresent() );
       Alert  alert =driver.switchTo() .alert() ;
       alert.sendKeys("poojitha") ;
       alert.accept() ;
      String result= driver.findElement(By.id("result") ).getText() ;
        System.out.println(result );





    }
}

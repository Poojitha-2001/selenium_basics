package com.poojitha.TestSelenium26_Input_Checkbox_Radio;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Ex_19_TestSelenium_Input_Checkbox_Radio {
    @Description ("TestSelenium_Input_Checkbox_Radio")
    @Test
    public static void TestSelenium_Input_Checkbox_Radio() throws InterruptedException {
        WebDriver driver=new ChromeDriver() ;
        driver.get("https://awesomeqa.com/practice.html");
        driver.findElement(By.xpath("//input[@value='Female']")).click() ;
        driver.findElement(By.xpath("//input[contains(@value,'Manual Tester')]") ) .click() ;
        driver.findElement(By.xpath("//input[contains(@value,'Manual Tester')]/following-sibling::input")) .click() ;
Thread.sleep(3000) ;
driver.quit() ;
    }
}

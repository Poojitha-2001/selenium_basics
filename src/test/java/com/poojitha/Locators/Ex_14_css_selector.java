package com.poojitha.Locators;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Ex_14_css_selector {
    @Description("css_selector")
    @Test
    public static void css_selector() throws InterruptedException {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://app.vwo.com");
        driver.findElement(By.cssSelector("input[id='login-username']")).sendKeys("poojitha@gmail.com") ;
        driver.quit() ;
    }
}

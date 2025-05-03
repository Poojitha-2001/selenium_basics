package com.poojitha.waits;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Ex_17_explicit_wait {
    @Description("explicit_wait")
    @Test
    public static void explicit_wait() throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito") ;
        options.addArguments("--start-maximized");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://app.vwo.com");
        String title=driver.getTitle() ;
        System.out.println(title);

        WebElement emailInputBox = driver.findElement(By.id("login-username"));
        emailInputBox.sendKeys("admin@admin.com");

        WebElement passwordInputBox = driver.findElement(By.name("password"));
        passwordInputBox.sendKeys("password@321");

        WebElement buttonSubmit = driver.findElement(By.id("js-login-btn"));
        buttonSubmit.click();

        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10) );
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("notification-box-description")) );

        WebElement error_message = driver.findElement(By.className("notification-box-description"));
        Assert.assertEquals(error_message.getText(), "Your email, password, IP address or location did not match");
        System.out.println(error_message.getText());

        driver.quit() ;
    }
}



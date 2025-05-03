package com.poojitha.waits;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Ex_15_java_waits {
    @Description("java_waits")
    @Test
    public static void java_waits() throws InterruptedException {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://app.vwo.com");
        driver.findElement(By.cssSelector("input[id='login-username']")).sendKeys("poojitha@gmail.com");
        Thread.sleep(3000) ;//JVM waits for 3sec
        driver.quit();
    }
}

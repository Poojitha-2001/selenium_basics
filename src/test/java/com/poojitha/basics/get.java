package com.poojitha;


import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Set;

public class get {
    @Test
    public static void selenium_get() {
        WebDriver driver = new ChromeDriver() ;
        driver.get("https://www.google.com") ;

    }
}
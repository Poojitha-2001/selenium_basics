package com.poojitha.actionsclass;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Set;

public class Ex_32 {
    @Test
    public static void drag_drop(){
        WebDriver driver=new ChromeDriver() ;
        driver.get("https://the-internet.herokuapp.com/drag_and_drop") ;
        Actions actions =new Actions(driver );
        WebElement from = driver.findElement(By.id("column-a"));
        WebElement to = driver.findElement(By.id("column-b"));
        actions .dragAndDrop(from ,to ).build() .perform() ;

        }}

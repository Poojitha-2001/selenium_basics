package com.poojitha.actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Ex_28_actions_class_methods {
//keyboard related actions and mouse related actions are done
    @Test
    public void test_actions(){
        WebDriver driver=new ChromeDriver() ;
        driver.get("https://awesomeqa.com/practice.html");
        driver.manage().window() .maximize() ;
        WebElement firstName = driver.findElement(By.name("firstname"));
        //if you want to use actions class we need to creat the actions class object
        Actions  actions =new Actions(driver ) ;
        actions.keyDown(Keys .SHIFT )
                .sendKeys(firstName,"the testing")
        .keyUp(Keys.SHIFT ) .build() .perform() ;
       // driver .quit() ;


    }

}

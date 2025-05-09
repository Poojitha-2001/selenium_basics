package com.poojitha.windows;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Set;

public class Ex_34_windowhandles {
    @Description("window_handles")
    @Test
    public static void window_handle(){
        WebDriver driver=new ChromeDriver() ;
        driver.get("https://the-internet.herokuapp.com/windows");
        driver.findElement(By.xpath("//a[text()='Click Here']")).click() ;
        String parent = driver.getWindowHandle();
        System.out.println(parent);
        Set<String> parent_child_handles =driver.getWindowHandles() ;
        System.out.println(parent_child_handles);
        String Url=driver.getPageSource()  ;
       System.out.println(Url);
        for(String handle:parent_child_handles) {
            driver.switchTo().window(handle);
            if (driver.getPageSource().contains("New Window")) {
                System.out.println("the test is passed");
            }
            driver .switchTo() .window(parent );
        }

        }






}

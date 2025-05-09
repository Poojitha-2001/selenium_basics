package com.poojitha.windows;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Ex_33_window_handle {
    @Description ("window_handle")
    @Test
    public static void window_handle(){
        WebDriver driver=new ChromeDriver() ;
        driver.get("https://the-internet.herokuapp.com/windows");
       String windowHandle = driver.getWindowHandle() ;
        System.out.println(windowHandle );
        driver.quit() ;
    }

}

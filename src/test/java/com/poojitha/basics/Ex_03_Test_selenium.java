package com.poojitha.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.sql.Driver;

public class Ex_03_Test_selenium {
    @Test
    public static void test_selenium(){
        //creates a new session
        WebDriver driver =new ChromeDriver() ;
        //opens this url
        driver.get("https://google.com");
        String Title=driver.getTitle() ;
        String current_url=driver .getCurrentUrl();
       String pageSource = driver.getPageSource() ;
        System.out.println(Title );
        System.out.println(current_url );
        System.out.println(pageSource );
        driver .quit() ;

    }

}

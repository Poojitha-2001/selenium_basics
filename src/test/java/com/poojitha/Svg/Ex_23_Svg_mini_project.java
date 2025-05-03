package com.poojitha.Svg;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class Ex_23_Svg_mini_project {
    @Description ("Verify Tripura is present in the map and click to zoom it")
    @Test
    public static void svg() throws InterruptedException {
    WebDriver driver=new ChromeDriver() ;
        driver.manage() .window() .maximize() ;
        driver.get("https://www.amcharts.com/svg-maps/?map=india");
      List<WebElement > states= driver.findElements(By.xpath("//*[name()='svg']/*[name()='g'][7]/*[name()='g']/*[name()='g']/*[name()='path']"));
      for(WebElement state:states ){
         System.out.println(state.getDomAttribute("aria-label") );
         if(state .getDomAttribute("aria-label") .contains("Tripura") ){
             state.click() ;
         }
       }
Thread.sleep(15000) ;
driver .quit() ;

    }

}


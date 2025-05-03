package com.poojitha.Locators;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Ex_11_linkText_partialLinktext {
    @Description("example for link text and partial link text")
    @Test
    public void linkText(){
        ChromeOptions options =new ChromeOptions();
        options .addArguments("--start-maximized");
        WebDriver driver=new ChromeDriver(options) ;
        driver.get("https://app.vwo.com") ;
//<a href="https://vwo.com/free-trial/?utm_medium=website&amp;utm_source=login-page&amp;
// utm_campaign=mof_eg_loginpage" class="text-link" data-qa="bericafeqo">Start a free trial</a>
       // WebElement a_tag_free_trail_full_match= driver.findElement(By.linkText("Start a free trial") ) ;

       // a_tag_free_trail_full_match.click() ;


       // Assert.assertEquals(driver.getCurrentUrl() ,"https://vwo.com/free-trial/?utm_medium=website&utm_source=login-page&utm_campaign=mof_eg_loginpage");

//partial link text
driver.findElement(By.partialLinkText("Start ") ).click() ;
driver.quit() ;


    }
}

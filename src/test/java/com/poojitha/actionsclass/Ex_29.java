package com.poojitha.actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class Ex_29 {
    //movie to the element
    @Test
    public void test_actions() throws InterruptedException {
        WebDriver driver=new ChromeDriver() ;
        driver.get("https://www.emirates.com/us/english/book/?utm_source=google&utm_medium=cpc&utm_campaign=GGS_US_EN_Brand_Pure___US_E&gad_source=1&gad_campaignid=631437595&gbraid=0AAAAADjsLtMdsWWQ3rWdJImPlWPYvjAUf&gclid=CjwKCAjwiezABhBZEiwAEbTPGI3Gdr58VYbbeVF8EimHKX6dkb16--dVrwWrmnPQ-pljS0krG439ShoCPzEQAvD_BwE&gclsrc=aw.ds") ;
        WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(15) );
       //WebElement path= driver.findElement(By.xpath("//div[@class='ot-sdk-container']") ) ;
        wait.until(ExpectedConditions .visibilityOfElementLocated( By.className ("ot-sdk-container") ));
       WebElement button= driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']") );
button .click() ;
//page down page up//scroll up and scroll down
        Actions actions =new Actions(driver);
        actions.keyDown (Keys.PAGE_DOWN ) .keyUp(Keys.PAGE_DOWN). keyDown(Keys .PAGE_DOWN ).keyUp(Keys.PAGE_DOWN).build() .perform() ;
        //Thread .sleep(3000) ;
       // actions.sendKeys(Keys.PAGE_UP ) .sendKeys(Keys.PAGE_UP ).build() .perform() ;

        // driver.quit()
}}

package com.poojitha.Svg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex_22_Scalable_vector_Graphics {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver() ;
        driver.get("https://www.flipkart.com/search") ;
        driver.findElement(By.xpath("//input[@class='zDPmFV']")) .sendKeys("macmini");
        Thread.sleep(3000) ;
        driver.findElement(By.xpath("(//*[local-name()='svg'])[1]") ) .click();
        Thread.sleep(3000) ;
        driver.quit() ;
    }
}

package com.poojitha.TestSelenium26_Input_Checkbox_Radio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ex_20_SelectBox_Static {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver() ;
        driver.get("https://the-internet.herokuapp.com/dropdown");
        WebElement  option=driver.findElement(By.xpath("//select[contains(@id,'dropdown')]"));
        Select s=new Select(option );
        //s.selectByVisibleText("Option 2");
s.selectByValue("2");
    }
}

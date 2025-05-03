package com.poojitha.Katalon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class mini_project {
    @Test
    public static void Katalon(){
        WebDriver driver =new ChromeDriver() ;
        driver.get("https://katalon-demo-cura.herokuapp.com/") ;
        //<a id="btn-make-appointment"
        // href="./profile.php#login"
        // class="btn btn-dark btn-lg">Make Appointment
        // </a>
driver .findElement(By.id("btn-make-appointment") ).click() ;
//<input type="text"
// class="form-control"
// id="txt-username"
// name="username"
// placeholder="Username"
// value="" autocomplete="off">
        driver.findElement(By.id("txt-username")) .sendKeys("John Doe");
        //<input type="password"
        // class="form-control"
        // id="txt-password"
        // name="password"
        // placeholder="Password"
        // value="" autocomplete="off">
        driver.findElement(By.id("txt-password")).sendKeys("ThisIsNotAPassword");

//<button id="btn-login"
// type="submit"
// class="btn btn-default">Login</button>
        driver.findElement(By.id("btn-login") ) .click() ;
        //now you need to cheek current URL is equal to this "https://katalon-demo-cura.herokuapp.com/#appointment"
       String  current_url=driver.getCurrentUrl() ;
        Assert.assertEquals(current_url,"https://katalon-demo-cura.herokuapp.com/#appointment") ;

    }
}

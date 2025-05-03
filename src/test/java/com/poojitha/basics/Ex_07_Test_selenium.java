package com.poojitha.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Ex_07_Test_selenium {
    //close
    // Close - will close the current tab, not the session (not the all tabs)
    // session id != null
    @Test
    public static void test_selenium() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        Thread.sleep(3000);

        //driver .close() ;
        // // It will close all the tabs. - session id == null
        driver.quit();
    }

    //

}

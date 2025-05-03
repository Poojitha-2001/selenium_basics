package com.poojitha.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Ex_08_Test_selenium {
    // FirefoxOptions, ChromeOptions, SafariOptions

    // EdgeOptions -> It will help you set the browser
    // options to browsers
    // window - size
    // headless mode - there is not UI -> advantage - Fast Execution
    // full UI mode - default - UI browser
    // incognito mode - switch
    // start Max
    // add extensions - browsers
    // 100 + others , https , http
    @Test
    public static void test_selenium() throws InterruptedException {
        ChromeOptions chromeOptions =new ChromeOptions();
        chromeOptions  .addArguments("--window-size=800,600");
        Thread.sleep(5000);
       chromeOptions.addArguments("--headless") ;
        WebDriver driver =new ChromeDriver() ;
        driver .quit() ;
    }
}

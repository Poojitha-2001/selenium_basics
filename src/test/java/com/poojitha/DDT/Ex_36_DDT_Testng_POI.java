package com.poojitha.DDT;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class Ex_36_DDT_Testng_POI {
    public ChromeDriver driver;
@BeforeTest
public  void openBrowser(){
    ChromeOptions options =new ChromeOptions();
    options .addArguments("--guest") ;
   driver=new ChromeDriver(options ) ;
}

@Test(dataProvider = "getData")
    public static void test_vwo_login(String email,String password){
    System.out.println(email+ "-"+ password );

}
@DataProvider
    public Object[][] getData() {
    return new Object[][]{
            new Object[]{"admin@gmail.com", "pass123"},
            new Object[]{"admin123@gmail.com", "pass123"},
            new Object[]{"admin123@gmail.com", "pass124"}

    };
}

    @AfterTest
    public void closeBrowser(){
    driver .quit() ;
    }
}











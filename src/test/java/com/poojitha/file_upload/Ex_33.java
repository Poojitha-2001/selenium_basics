package com.poojitha.file_upload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Ex_33 {
    @Test
    public void test_file_upload(){
        WebDriver driver=new ChromeDriver() ;

        driver.get("https://awesomeqa.com/selenium/upload.html");
        WebElement uploadFileInput = driver.findElement(By.id("fileToUpload"));

        String working_dir = System.getProperty("user.dir");
        System.out.println(working_dir);
        // /Users/promode/IdeaProjects/LearningSeleniumATB10x
        String path="/src/test/java/com/poojitha/file_upload/Testdata.txt";

        uploadFileInput.sendKeys(working_dir+path);
        driver.findElement(By.name("submit")).click();



    }


}
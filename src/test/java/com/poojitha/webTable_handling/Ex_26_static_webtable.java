package com.poojitha.webTable_handling;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class Ex_26_static_webtable {
    @Description ("getting the table data")
    @Test
    public static void test_web_table(){
       // String  first_part="//table[@id='customers']/tbody/tr[";
       // String second_part="]/td[";
       // String third_part="]";
        WebDriver driver=new ChromeDriver() ;
        driver.get("https://awesomeqa.com/webtable.html");
        driver.manage().window() .maximize() ;
        int row = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr")).size();
        int columns=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[1]/th") ).size() ;
       //List<WebElement > second_row =driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[2]/td") );
       for(int i=1;i<=columns ;i++){
           String f_one="//table[@id='customers']/tbody/tr[2]/td[";
           String f_two="]";
          String val= driver.findElement(By.xpath(f_one +i+f_two) ).getText() ;
           System.out.println(val);




            }

        }

        /*System.out.println("number of rows = "+row);
        System.out.println("number of columns ="+columns );
       String contact_second_row =driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[2]/td[2]") ).getText() ;
        System.out.println(contact_second_row);
        for(int i=2;i<=row ;i++){
            for(int j=1;j<=columns ;j++){
                String full_xpath=first_part+i+second_part+j+third_part;
                String all_data=  driver.findElement(By.xpath(full_xpath  )) .getText() ;
                //System.out.println(all_data );
                if(all_data.contains("Helen Bennett") ){
                    String sibling_xpath="/following-sibling::td";
                   String Country= driver.findElement(By.xpath(full_xpath+sibling_xpath) ).getText() ;
                    System.out.println(Country );
                }
            }
        }*/


        }







package com.cydeo.tests.week17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

    public static void main(String[] args) throws InterruptedException {

//        TC001 As a user I should be able to login with valid credentials
//                *
//
//                1- Open a chrome browser
//        2- Go to "https://vytrack.com/"
//        3- Click LOGIN button
//        4- Login to application with username as "User1" and password as "UserUser123"
//        5- Verify the title contains "Dashboard"
//                */

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://vytrack.com/");
        driver.findElement(By.cssSelector("#top-menu #menu-item-849")).click();


        //HOMEWORK CREATE A LOGIN METHOD
        //login(username, password......)

        driver.findElement(By.id("prependedInput")).sendKeys("User1");
        driver.findElement(By.id("prependedInput2")).sendKeys("UserUser123");
        driver.findElement(By.id("_submit")).click();
        Thread.sleep(5000);
        String title = driver.getTitle();

        if(title.equals("Dashboard")){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }

        driver.quit();
    }
}

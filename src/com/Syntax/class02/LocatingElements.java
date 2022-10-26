package com.Syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElements {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("email")).sendKeys("abracadabra");
        driver.findElement(By.id("pass")).sendKeys("pooperscooper");
        //driver.findElement(By.name("login")).click();
        //driver.findElement(By.linkText("Forgot password?")).click();
        //driver.findElement(By.partialLinkText("Forgot")).click();
    }
}

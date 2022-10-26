package com.Syntax.class02;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(1000);
        driver.findElement(By.name("firstname")).sendKeys("Sergey");
        driver.findElement(By.name("lastname")).sendKeys("Shklarov");
        Thread.sleep(1000);
        driver.findElement(By.className("_8idr img")).click();
    }
}

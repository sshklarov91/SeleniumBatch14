package com.Syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task02 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.manage().window().maximize();
        driver.findElement(By.id("customer.firstName")).sendKeys("Sergey");
        Thread.sleep(1000);
        driver.findElement(By.id("customer.lastName")).sendKeys("Shklarov");
        Thread.sleep(1000);
        driver.findElement(By.id("customer.address.street")).sendKeys("123 West Drive");
        Thread.sleep(1000);
        driver.findElement(By.id("customer.address.city")).sendKeys("Brooklyn");
        Thread.sleep(1000);
        driver.findElement(By.id("customer.address.state")).sendKeys("New York");
        Thread.sleep(1000);
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("11235");
        Thread.sleep(1000);
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("123456789");
        Thread.sleep(1000);
        driver.findElement(By.id("customer.ssn")).sendKeys("987654321");
        Thread.sleep(1000);
        driver.findElement(By.id("customer.username")).sendKeys("Serg");
        Thread.sleep(1000);
        driver.findElement(By.id("customer.password")).sendKeys("kampot");
        Thread.sleep(1000);
        driver.findElement(By.id("repeatedPassword")).sendKeys("kampot");
        Thread.sleep(1000);
        driver.findElement(By.className("button")).click();
        Thread.sleep(1000);
        driver.close();
    }
}

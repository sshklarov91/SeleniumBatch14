package com.Syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class maximizeWindow {
    public static void main(String[] args) throws InterruptedException {
        //go to google.com
        //maximize widnow
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        //full screen
        driver.manage().window().fullscreen();
        Thread.sleep(2000);
        driver.quit();
    }
}

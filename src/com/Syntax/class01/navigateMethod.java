package com.Syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigateMethod {
    public static void main(String[] args) throws InterruptedException {
        //go to google.com
        //go to facebook.com
        //go back to google.com
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        // create a webdriver instance
        WebDriver driver=new ChromeDriver();
        // go to google.com
        driver.get("https://www.google.com/");
        driver.navigate().to("https://www.facebook.com/");
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().forward();
        Thread.sleep(2000);
        driver.navigate().refresh();
        driver.quit();
    }
}

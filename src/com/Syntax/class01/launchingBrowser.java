package com.Syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launchingBrowser {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        String url=driver.getCurrentUrl();
        System.out.println(url);
        //get title
        String title=driver.getTitle();
        System.out.println(title);
        // close the chrome browser
        driver.quit();
        driver.close();
    }
}

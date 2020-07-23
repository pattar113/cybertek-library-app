package com.cybertek.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {
    //singleton
    //single object
    private static WebDriver driver;
    private Driver(){

    }

    public static WebDriver getDriver() {
        String browser = ConfigurationReader.getProperty("browser");
        if (driver == null) {
            if ("chrome".equals(browser) || "CHROME".equals(browser) || "chrome-browser".equals(browser) || "Chrome".equals(browser)) {
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
            } else if ("firefox".equals(browser)) {
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
            } else {
                throw new RuntimeException("Wrong browser name!");
            }
        }
        return driver;

    }
  public static void closeDriver(){
        if(driver!=null){
            driver.quit();
            driver=null;
        }
    }




















}

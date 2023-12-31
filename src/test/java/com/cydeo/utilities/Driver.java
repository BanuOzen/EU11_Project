package com.cydeo.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.concurrent.TimeUnit;

public class Driver {

    /*
       Creating a private constructor,
       so we are closing access to the object of this class from outside the class
        */
    private Driver() {
    }

    /*
    We make WebDriver private, because we want to close access from outside of the class.
    We make it static because we will ue it in a static method.
     */
        // private static WebDriver driver; //value is null by default
        private static InheritableThreadLocal<WebDriver> driverPool = new InheritableThreadLocal<>();
    /*
    Create a re-usable utility method which will return same driver instance when we call it
     */
        public static WebDriver getDriver() {

        if (driverPool.get() == null) {

            /*
            We read our browserType from configuration.properties.
            This way, we can control which browser is opened from outside our code, from configuration.properties
             */

            ChromeOptions chromeOptions = new ChromeOptions();
            String browserType = ConfigurationReader.getProperty("browser");
            /*
            Depending on the browserType that will be return from configuration.properties file switch state
             */
            switch (browserType) {
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    chromeOptions.addArguments("incognito");
                    chromeOptions.addArguments("--remote-allow-origins=*");
                   // chromeOptions.addArguments("start-maximized");
                    driverPool.set(new ChromeDriver(chromeOptions));

                   // driverPool.get().manage().window().maximize();
                 //   driverPool.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driverPool.set(new FirefoxDriver());
                    driverPool.get().manage().window().maximize();
                    driverPool.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    break;
            }

        }

        return driverPool.get();
    }
    /*
    This method will make sure our driver value is always null after using quit() method
     */
        public static void closeDriver () {
        if (driverPool.get() != null) {
            driverPool.get().quit(); // this line will terminate the existing session. Value will not even be null
            driverPool.remove();
        }
    }

    }

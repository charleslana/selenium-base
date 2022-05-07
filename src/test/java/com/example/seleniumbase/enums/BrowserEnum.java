package com.example.seleniumbase.enums;

import com.example.seleniumbase.interfaces.GetWebDriver;
import com.example.seleniumbase.utils.FunctionUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public enum BrowserEnum implements GetWebDriver {

    CHROME {
        @Override
        public WebDriver getWebDriver(Boolean hasHeadless) {
            ChromeOptions options = new ChromeOptions();
            options.setHeadless(hasHeadless);
            options.addArguments("--window-size=1920x1080");
            System.setProperty("webdriver.chrome.driver", FunctionUtils.getResourcesWebDriverDir().concat("chromedriver"));
            return new ChromeDriver(options);
        }
    }, EDGE {
        @Override
        public WebDriver getWebDriver(Boolean hasHeadless) {
            EdgeOptions options = new EdgeOptions();
            options.setHeadless(hasHeadless);
            options.addArguments("--window-size=1920x1080");
            System.setProperty("webdriver.edge.driver", FunctionUtils.getResourcesWebDriverDir().concat("msedgedriver"));
            return new EdgeDriver(options);
        }
    }, FIREFOX {
        @Override
        public WebDriver getWebDriver(Boolean hasHeadless) {
            FirefoxOptions options = new FirefoxOptions();
            options.setHeadless(hasHeadless);
            System.setProperty("webdriver.gecko.driver", FunctionUtils.getResourcesWebDriverDir().concat("geckodriver"));
            return new FirefoxDriver(options);
        }
    }
}

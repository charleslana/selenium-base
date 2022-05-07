package com.example.seleniumbase.base;

import com.example.seleniumbase.enums.BrowserEnum;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.function.Function;

public class BaseSetup {

    public static WebDriver driver;
    public static WebDriverWait wait;

    @BeforeEach
    public void setUp() {
        driver = BrowserEnum.CHROME.getWebDriver(false);
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(60));
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }

    public static <V> void await(Function<? super WebDriver, V> isTrue) {
        wait.until(isTrue);
    }

    public static WebElement findElement(By by) {
        return BaseSetup.driver.findElement(by);
    }

    public static void findElementAndClearAndSendKeys(By by, CharSequence keys) {
        BaseSetup.driver.findElement(by).sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE), keys);
    }

    public static void findElementAndSendKeys(By by, CharSequence keys) {
        BaseSetup.driver.findElement(by).sendKeys(keys);
    }
}

package com.example.seleniumbase.testcase;

import com.example.seleniumbase.base.BaseSetup;
import com.example.seleniumbase.interfaces.SeleniumDocumentation;
import com.example.seleniumbase.interfaces.SeleniumImplicitWait;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SeleniumTest extends BaseSetup implements SeleniumDocumentation, SeleniumImplicitWait {

    @Test
    void test1() {
        driver.get("https://www.selenium.dev/");
        Assertions.assertTrue(driver.getTitle().contains("Selenium"));
    }

    @Test
    void test2() {
        driver.get("https://www.selenium.dev/downloads/");
        Assertions.assertTrue(driver.getTitle().contains("Downloads"));
    }

    @Test
    void test3() {
        goToDocumentation();
    }

    @Test
    void test4() {
        searchImplicitWait();
    }
}

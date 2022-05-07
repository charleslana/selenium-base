package com.example.seleniumbase.interfaces;

import com.example.seleniumbase.base.BaseSetup;
import org.junit.jupiter.api.Assertions;

public interface SeleniumDocumentation {

    default void goToDocumentation() {
        BaseSetup.driver.get("https://www.selenium.dev/documentation/");
        Assertions.assertTrue(BaseSetup.driver.getTitle().contains("The Selenium Browser Automation Project"));
    }
}

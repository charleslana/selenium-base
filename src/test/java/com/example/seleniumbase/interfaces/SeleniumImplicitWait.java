package com.example.seleniumbase.interfaces;

import com.example.seleniumbase.base.BaseSetup;
import com.example.seleniumbase.pageobjects.SeleniumImplicitWaitPage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;

public interface SeleniumImplicitWait {

    default void searchImplicitWait() {
        BaseSetup.driver.get("https://www.selenium.dev/");
        By searchField = By.className(SeleniumImplicitWaitPage.SEARCH_FIELD);
        BaseSetup.findElementAndClearAndSendKeys(searchField, "Implicit wait");
        BaseSetup.await(ExpectedConditions.visibilityOf(BaseSetup.findElement(By.id(SeleniumImplicitWaitPage.DROPDOWN_MENU_SEARCH))));
        BaseSetup.findElementAndSendKeys(searchField, Keys.ENTER);
        Assertions.assertTrue(BaseSetup.driver.getTitle().contains("Waits"));
    }
}

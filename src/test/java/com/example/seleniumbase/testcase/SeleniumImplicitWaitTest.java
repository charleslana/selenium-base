package com.example.seleniumbase.testcase;

import com.example.seleniumbase.base.BaseSetup;
import com.example.seleniumbase.interfaces.SeleniumImplicitWait;
import org.junit.jupiter.api.Test;

class SeleniumImplicitWaitTest extends BaseSetup implements SeleniumImplicitWait {

    @Test
    void test1() {
        searchImplicitWait();
    }
}

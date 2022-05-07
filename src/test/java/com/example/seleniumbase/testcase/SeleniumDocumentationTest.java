package com.example.seleniumbase.testcase;

import com.example.seleniumbase.base.BaseSetup;
import com.example.seleniumbase.interfaces.SeleniumDocumentation;
import org.junit.jupiter.api.Test;

class SeleniumDocumentationTest extends BaseSetup implements SeleniumDocumentation {

    @Test
    void firstTest() {
        goToDocumentation();
    }
}

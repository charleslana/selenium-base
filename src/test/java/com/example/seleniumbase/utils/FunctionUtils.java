package com.example.seleniumbase.utils;

public class FunctionUtils {

    public static String getResourcesWebDriverDir() {
        return System.getProperty("user.dir").concat("/src/main/resources/webdriver/");
    }
}

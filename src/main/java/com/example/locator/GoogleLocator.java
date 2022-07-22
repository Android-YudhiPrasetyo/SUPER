package com.example.locator;

import org.openqa.selenium.By;

public interface GoogleLocator {
    By INPUT_KEYWORD = By.cssSelector("div[class*='YacQv gsfi'] + input");
    By BUTTON_SEARCH = By.cssSelector("div[class='CqAVzb lJ9FBc'] input[value='Google Search']");
    By KEYWORD_DESCRIPTION = By.cssSelector("div[class*=\"mw-parser-output\"] table[class*='infobox'] + p");
}

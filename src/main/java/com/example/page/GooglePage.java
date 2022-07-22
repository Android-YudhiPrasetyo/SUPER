package com.example.page;

import com.example.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.List;

import static com.example.locator.GoogleLocator.INPUT_KEYWORD;
import static com.example.locator.GoogleLocator.KEYWORD_DESCRIPTION;

public class GooglePage extends BaseClass {
    public static void inputKeyword(String keyword) {
        driver.findElement(INPUT_KEYWORD).click();
        driver.findElement(INPUT_KEYWORD).sendKeys(keyword);
    }

    public static void clickBtnSearch() {
        driver.findElement(INPUT_KEYWORD).sendKeys(Keys.ENTER);
        try {
            findFirstResult();
        } catch (org.openqa.selenium.StaleElementReferenceException ex) {
            findFirstResult();
        }

    }

    public static void findFirstResult() {
        List<WebElement> result = driver.findElements(By.cssSelector("div[class*=\"yuRUbf\"] h3[class*='LC20lb MBeuO DKV0Md']"));
        for (int i = 0; i < result.size(); i++) {
            result.get(i).getText().equalsIgnoreCase("Pikachu - Wikipedia bahasa Indonesia, ensiklopedia bebas");
            result.get(i).click();
        }
    }

    public static String getKeywordDesc() {
        return driver.findElement(KEYWORD_DESCRIPTION).getText();
    }
}

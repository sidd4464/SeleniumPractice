package com_java_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

import static com_java_practice.BaseDemo.setup;

public class AutoSuggestiveDropdown {


    @Test
    public static void handlingAutoSuggestiveDropdown() {
        try {
            WebDriver driver = setup();
            driver.findElement(By.xpath("//input[@id='autosuggest']")).sendKeys("Ind");
            List<WebElement> countryNames = driver.findElements(By.cssSelector("li.ui-menu-item a"));
            String Name = "India";
            for (WebElement countryName : countryNames) {
                if (countryName.getText().equals(Name)) {
                    countryName.click();
                    Thread.sleep(2000);
                } else {
                    System.out.println("Option not Present");
                }
                driver.quit();
            }

        } catch (Exception e) {
            throw new RuntimeException("Option not Present");
        }
    }
}

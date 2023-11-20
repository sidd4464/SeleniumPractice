package com_java_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import static com_java_practice.BaseDemo.setup;

public class StaticDropdownTest {

    @Test
    public static  void handlingStaticDropdowns(WebElement element, String value) {
        WebDriver driver = setup();
        WebElement dropdown= driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']"));
        Select drpDown = new Select(element);
        drpDown.selectByValue(value);
        String text = drpDown.getFirstSelectedOption().getText();
        System.out.println("selected value" + text);
        driver.quit();
    }
}

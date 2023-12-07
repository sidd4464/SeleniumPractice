package com_java_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static com_java_practice.BaseDemo.setup;

public class HandlingCheckboxes {

    @Test
    public static void handlingCheckboxes(){
        try {
            WebDriver driver = setup();
            List<WebElement> Labels =driver.findElements(By.xpath("//div[@id='discount-checkbox']//label"));
            List<WebElement> checkboxes = driver.findElements(By.xpath("//div[@id='discount-checkbox']//input"));
            String labelName = "Indian Armed Forces";
            int index= 0;
            List<String> labelNames = new ArrayList<String>();
            for(WebElement label: Labels) {
                labelNames.add(label.getText());
            }
            index = labelNames.indexOf(labelName);
            checkboxes.get(index).click();
            Thread.sleep(1000);
            Assert.assertTrue((checkboxes.get(index).isSelected()));
            driver.quit();
        }
        catch (Exception e){
            throw new RuntimeException("Invalid Checkbox");
        }
    }
}

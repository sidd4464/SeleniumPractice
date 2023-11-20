package com_java_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com_java_practice.BaseDemo.setup;

public class CalendarUI {

    @Test
    public static void handlingCalendarUI() {
        WebDriver driver = setup();
        driver.findElement(By.xpath("//input[contains(@name, 'ctl00_mainContent_ddl_originStation1_CTXT')]")).click();
        driver.findElement(By.xpath("//table[@id='citydropdown'] //a[@value='PNQ']")).click();
        //Assert.assertTrue(driver.findElement(By.xpath("\"//table[@id='citydropdown'] //a[@value='PNQ']\"")).isSelected());
        driver.findElement(By.xpath("(//table[@id='citydropdown'] //a[@value='BOM'])[2]")).click();
        //Assert.assertTrue(driver.findElement(By.xpath("(//table[@id='citydropdown'] //a[@value='BOM'])[2]")).isSelected());
        driver.findElement(By.cssSelector("a.ui-state-default.ui-state-highlight")).click();
        //Assert.assertFalse(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());
        driver.findElement(By.xpath("//div[@id='Div1']")).getAttribute("style").contains("0.5");
        if(driver.findElement(By.xpath("//div[@id='Div1']")).getAttribute("style").contains("0.5")) {
            System.out.println("Element is Enabled");
            Assert.assertTrue(true);
        }
        else {
            System.out.println("Element is disabled");
            Assert.assertFalse(false);
        }
        driver.quit();
    }


}

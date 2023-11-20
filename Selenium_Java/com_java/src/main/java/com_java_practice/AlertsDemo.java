package com_java_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import static com_java_practice.BaseDemo.setup;

public class AlertsDemo {

    @Test
    public static void handlingAlerts() {
        WebDriver driver = setup();
        driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Siddhesh Deshpande");
        driver.findElement(By.id("alertbtn")).click();
        String alertText = driver.switchTo().alert().getText();
        System.out.println(alertText);
        driver.switchTo().alert().accept();
        driver.quit();

    }


}

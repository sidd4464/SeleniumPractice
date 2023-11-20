package com_java_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static com_java_practice.BaseDemo.setup;

public class SelectDropdownTest {

    @Test
    public static void selectDropdownOptionByDropdownName(WebElement element, String name, int noOfPersons) {
        WebDriver driver = setup();
        driver.findElement(By.id("divpaxinfo")).click();
        WebElement drpContainer = driver.findElement(By.id("divpaxOptions"));
        if(name =="Adults") {
            WebElement drpRowOne = drpContainer.findElement(By.id("divAdult"));
            for(int i = 0; i<noOfPersons;i++) {
                drpRowOne.findElement(By.xpath("//span[@id='hrefIncAdt']")).click();
            }
        }
        if(name =="Child") {
            WebElement drpRowTwo = drpContainer.findElement(By.id("divChild"));
            for(int i = 0; i<noOfPersons;i++) {

                drpRowTwo.findElement(By.xpath("//span[@id='hrefIncChd']")).click();
            }
        }
        if(name =="Infants") {
            WebElement drpRowThree = drpContainer.findElement(By.id("divInfant"));
            for(int i = 0; i<noOfPersons;i++) {
                drpRowThree.findElement(By.xpath("//span[@id='hrefIncInf']")).click();
            }
        }
        driver.findElement(By.id("btnclosepaxoption")).click();
        driver.quit();
    }

}

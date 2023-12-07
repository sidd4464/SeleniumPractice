package com_java_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static com_java_practice.BaseDemo.setup;


public class EndToEndAutomation {

          @Test
          public static void addingItemsToCart() throws Exception {
              try {
                  WebDriver driver = setup();
                  String value = "Cucumber";
                  List<WebElement> productNames = driver.findElements(By.cssSelector("h4.product-name"));
                  ArrayList<String>products = new ArrayList<String>();
                  for(WebElement name:productNames) {
                      products.add(name.getText());
                  }
                  int index = products.indexOf(value);
                  List<WebElement> cartButtons = driver.findElements(By.xpath("//button[contains(text(),'ADD TO CART')]"));
                  cartButtons.get(index).click();
                  driver.findElement(By.cssSelector("a.cart-icon")).click();
                  driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
                  Thread.sleep(2000);
                  driver.findElement(By.cssSelector(".promoCode")).sendKeys("rahulsettyacademy");
                  Thread.sleep(3000);
                  String promoApplied = driver.findElement(By.cssSelector(".promoInfo")).getText();
                  System.out.println(promoApplied);
                  driver.findElement(By.xpath("//button[contains(text(),'Place Order')]")).click();
                  WebElement dropdown = driver.findElement(By.xpath("//select"));
                  Select drp = new Select(dropdown);
                  drp.selectByValue("India");
                  driver.findElement(By.cssSelector(".chkAgree")).click();
                  driver.findElement(By.xpath("\"//button[contains(text(),'Proceed')]")).click();
                  System.out.println(driver.findElement(By.xpath("//span")).getText());
                  driver.quit();
              }
              catch (Exception e) {
                  throw new Exception("Failed adding items to card");
              }

          }






}

package com.allied;

//import org.junit.Test;

import org.openqa.selenium.chrome.ChromeDriver;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class FirstTest {


    /**
     * Hello world!
     */
    @Test
    public void test() throws InterruptedException {
        // Create a new instance of the Firefox driver
        // Notice that the remainder of the code relies on the interface,
        // not the implementation.
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(300, TimeUnit.SECONDS);


        // And now use this to visit Google
        driver.get("http://www.google.com");
        // Alternatively the same thing can be done like this
//         driver.navigate().to("http://www.google.com");

        // Find the text input element by its name
        WebElement element = driver.findElement(By.name("q"));


        element.sendKeys("Cheetah");

        // Now submit the form. WebDriver will find the form for us from the element
        element.submit();

//        // Check the title of the page
//        System.out.println("Page title is: " + driver.getTitle());

        // Google's search is rendered dynamically with JavaScript.
        // Wait for the page to load, timeout after 10 seconds
        (new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getTitle().toLowerCase().startsWith("cheetah");
            }
        });


//        List<WebElement> links = driver.findElements(By.xpath("//div[h2[not(contains(text(),'People also ask'))]]//div[@class='r']//a[contains(.,'heetah')]"));
//        int numberOfLinks = links.size();
//
//        for(int i=0;i<numberOfLinks;i++){
//            List<WebElement> links2 = driver.findElements(By.xpath("//div[h2[not(contains(text(),'People also ask'))]]//div[@class='r']//a[contains(.,'heetah')]"));
//            links2.get(i).click();
//            System.out.println("Page title " + driver.getTitle());
//            System.out.println("Page url " + driver.getCurrentUrl());
//            System.out.println("Number of cheetahs: " + StringUtils.countMatches(driver.getPageSource().toLowerCase(),"cheetah"));
//            driver.navigate().back();
//            Thread.sleep(3000);
//        }


        List<WebElement> links = driver.findElements(By.xpath("//div[h2[not(contains(text(),'People also ask'))]]//div[@class='r']//a[contains(.,'heetah')]"));
        List<String> nameLinks = new ArrayList<>();
        for (WebElement el : links) {
            nameLinks.add(el.getText());
        System.out.println(el.getAttribute("href"));
    }


        for (int i = 0; i < nameLinks.size(); i++) {
        WebElement el = driver.findElement(By.linkText(nameLinks.get(i)));
        el.click();
        System.out.println("Page title " + driver.getTitle());
        System.out.println("Page url " + driver.getCurrentUrl());
        System.out.println("Number of cheetahs: " + StringUtils.countMatches(driver.getPageSource().toLowerCase(), "cheetah"));
        driver.navigate().back();
        Thread.sleep(3000);
    }


//        // Should see: "cheese! - Google Search"
//        System.out.println("Page title is: " + driver.getTitle());


        //Close the browser
        driver.quit();
    }

}

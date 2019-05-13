package com.allied;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.chrome.ChromeDriver;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class SearchSelenium {

    private static Integer indexMain = 0;

    @Test
    public void test() throws InterruptedException, IOException {


        String path = "list_url.xlsx";
        FileInputStream fileinp = new FileInputStream(path);
        Workbook wb = new XSSFWorkbook(fileinp);
        Sheet sheet = wb.createSheet("Selenium Search");

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


        element.sendKeys("Selenium");

        // Now submit the form. WebDriver will find the form for us from the element
        element.submit();

//        // Check the title of the page
//        System.out.println("Page title is: " + driver.getTitle());

        // Google's search is rendered dynamically with JavaScript.
        // Wait for the page to load, timeout after 10 seconds
        (new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getTitle().toLowerCase().startsWith("selenium");
            }
        });

        List<WebElement> links = driver.findElements(By.xpath("//div[@class='r']//a[contains(.,'selenium')]"));

        List<String> nameLinks = new ArrayList<>();

        for (WebElement el : links) {
            nameLinks.add(el.getText());
        }

        for(int i = 0; i<nameLinks.size(); i++){

            List<WebElement> links2 = driver.findElements(By.xpath("//div[@class='r']//a[contains(.,'selenium')]"));
            links2.get(i).click();

            List<String> dataForExcel = new ArrayList<>();
            dataForExcel.add(driver.getTitle());
            dataForExcel.add( driver.getCurrentUrl());
            dataForExcel.add(String.valueOf(StringUtils.countMatches(driver.getPageSource().toLowerCase(),"selenium")));

            SearchSelenium.indexMain++;
            PoiExcelWrite.PoiWrite((ArrayList) dataForExcel, wb, sheet, SearchSelenium.indexMain);

            driver.navigate().back();
            Thread.sleep(3000);

        }

        List<WebElement> pages = driver.findElements(By.xpath("//*[@id=\"nav\"]/tbody/tr/td"));

        int i = 3;
        for (WebElement el : pages) {

            while (i <= 12) {


                WebElement page = driver.findElement(By.xpath("//*[@id=\"nav\"]/tbody/tr/td[" + i + "]"));
                page.click();

                links = driver.findElements(By.xpath("//div[@class='r']//a[contains(.,'selenium')]"));

                List<String> nameLinks2 = new ArrayList<>();

                for (WebElement el2 : links) {
                    nameLinks2.add(el2.getText());
                }


                for(int j=0;j<nameLinks2.size();j++){
                    List<WebElement> links2 = driver.findElements(By.xpath("//div[@class='r']//a[contains(.,'selenium')]"));

                    if (driver.getTitle().equals("What is Selenium? Getting started with Selenium Automation Testing")){
                        continue;
                    }
                    if (driver.getCurrentUrl().equals("https://www.ranorex.com/selenium-webdriver-integration/")){
                        continue;
                    }
                    if (driver.getCurrentUrl().equals("https://dzone.com/refcardz/getting-started-selenium/")){
                        continue;
                    }
                    if (driver.getCurrentUrl().equals("https://dzone.com/refcardz/getting-started-selenium")){
                        continue;
                    }
                    if (driver.getCurrentUrl().equals("https://dzone.com/refcardz/getting-started-selenium?chapter=1")){
                        continue;
                    }
                    if (driver.getCurrentUrl().equals("https://www.usgs.gov/mission-areas/water-resources/science/linking-selenium-sources-ecosystems-mining?qt-science_center_objects=0#qt-science_center_objects")){
                        continue;
                    }
                    if (driver.getCurrentUrl().equals("https://www.usgs.gov/mission-areas/water-resources/science/linking-selenium-sources-ecosystems-mining")){
                        continue;
                    }
                    if (driver.getCurrentUrl().equals("https://www.usgs.gov/mission-areas/water-resources/science/linking-selenium-sources-ecosystems-mining/")){
                        continue;
                    }

                    //System.out.println("title: " + driver.getTitle());

                    links2.get(j).click();

                    List<String> dataForExcel = new ArrayList<>();
                    dataForExcel.add(driver.getTitle());
                    dataForExcel.add( driver.getCurrentUrl());
                    dataForExcel.add(String.valueOf(StringUtils.countMatches(driver.getPageSource().toLowerCase(),"selenium")));

                    SearchSelenium.indexMain++;
                    PoiExcelWrite.PoiWrite((ArrayList) dataForExcel, wb, sheet, SearchSelenium.indexMain);

                    driver.navigate().back();
                    Thread.sleep(5000);

                }
                driver.navigate().back();
                Thread.sleep(5000);

                System.out.println("i= " + i);
                i++;

            }
        }

        try {
            OutputStream fileOut = new FileOutputStream("list_url.xlsx");
            wb.write(fileOut);
            fileOut.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Close the browser
        driver.quit();
    }

}

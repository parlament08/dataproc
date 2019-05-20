package com.allied.practice4;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class ParkingCalculator {

    @Test
    public void test() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.get("http://adam.goucher.ca/parkcalc/index.php");

        Assert.assertEquals(driver.getTitle(), "Parking Calculator");

        Select chooseALotSelect = new Select(driver.findElement(By.xpath("//tr[td[contains(text(),'Choose a Lot')]]//select[@id='Lot']")));
        chooseALotSelect.selectByVisibleText("Valet Parking");

        WebElement startTime = driver.findElement(By.xpath("//tr[td[contains(text(),'Choose Entry DateClass and Time')]]//input[@name='EntryTime']"));
        List<WebElement> startDateAmPm = driver.findElements(By.xpath("//tr[td[contains(text(),'Choose Entry DateClass and Time')]]//input[@name='EntryTimeAMPM']"));
        WebElement startDate = driver.findElement(By.xpath("//tr[td[contains(text(),'Choose Entry DateClass and Time')]]//input[@name='EntryDate']"));

        startTime.clear();
        startTime.sendKeys("3:00");
        selectRadioValue(startDateAmPm, "PM");
        startDate.clear();
        startDate.sendKeys("3/18/2019");

        WebElement endTime = driver.findElement(By.xpath("//tr[td[contains(text(),'Choose Leaving DateClass and Time')]]//input[@name='ExitTime']"));
        List<WebElement> endDateAmPm = driver.findElements(By.xpath("//tr[td[contains(text(),'Choose Leaving DateClass and Time')]]//input[@name='ExitTimeAMPM']"));
        WebElement endDate = driver.findElement(By.xpath("//tr[td[contains(text(),'Choose Leaving DateClass and Time')]]//input[@name='ExitDate']"));

        endTime.clear();
        endTime.sendKeys("7:00");
        selectRadioValue(endDateAmPm, "PM");
        endDate.clear();
        endDate.sendKeys("3/20/2019");

        WebElement submitBtn = driver.findElement(By.xpath("//input[@name='Submit' and @value='Calculate']"));

        submitBtn.click();

        Thread.sleep(1000);

        WebElement costValue = driver.findElement(By.xpath("//tr[contains(.,'COST')]/td//b[contains(text(),'$')]"));
        WebElement calculatedTime = driver.findElement(By.xpath("//tr[contains(.,'COST')]/td//b[contains(text(),'Days')]"));

        Assert.assertEquals(costValue.getText(),"$ 72.00");
        Assert.assertEquals(calculatedTime.getText().trim(), "(2 Days, 4 Hours, 0 Minutes)");
    }


    @Test
    public void test2() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.get("http://adam.goucher.ca/parkcalc/index.php");

        Assert.assertEquals(driver.getTitle(), "Parking Calculator");

        Select chooseALotSelect = new Select(driver.findElement(By.xpath("//tr[td[contains(text(),'Choose a Lot')]]//select[@id='Lot']")));
        chooseALotSelect.selectByVisibleText("Valet Parking");

        WebElement startTime = driver.findElement(By.xpath("//tr[td[contains(text(),'Choose Entry DateClass and Time')]]//input[@name='EntryTime']"));
        List<WebElement> startDateAmPm = driver.findElements(By.xpath("//tr[td[contains(text(),'Choose Entry DateClass and Time')]]//input[@name='EntryTimeAMPM']"));
        WebElement startDate = driver.findElement(By.xpath("//tr[td[contains(text(),'Choose Entry DateClass and Time')]]//input[@name='EntryDate']"));

        startTime.clear();
        startTime.sendKeys("3:00");
        selectRadioValue(startDateAmPm, "PM");
        startDate.clear();
        startDate.sendKeys("3/18/2019");

        WebElement endTime = driver.findElement(By.xpath("//tr[td[contains(text(),'Choose Leaving DateClass and Time')]]//input[@name='ExitTime']"));
        List<WebElement> endDateAmPm = driver.findElements(By.xpath("//tr[td[contains(text(),'Choose Leaving DateClass and Time')]]//input[@name='ExitTimeAMPM']"));
        WebElement endDate = driver.findElement(By.xpath("//tr[td[contains(text(),'Choose Leaving DateClass and Time')]]//input[@name='ExitDate']"));

        endTime.clear();
        endTime.sendKeys("7:00");
        selectRadioValue(endDateAmPm, "PM");
        endDate.clear();
        endDate.sendKeys("3/20/2019");

        WebElement submitBtn = driver.findElement(By.xpath("//input[@name='Submit' and @value='Calculate']"));

        submitBtn.click();

        Thread.sleep(1000);

        WebElement costValue = driver.findElement(By.xpath("//tr[contains(.,'COST')]/td//b[contains(text(),'$')]"));
        WebElement calculatedTime = driver.findElement(By.xpath("//tr[contains(.,'COST')]/td//b[contains(text(),'Days')]"));

        Assert.assertEquals(costValue.getText(),"$ 72.00");
        Assert.assertEquals(calculatedTime.getText().trim(), "(2 Days, 4 Hours, 0 Minutes)");
    }

    @Test
    public void test3() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.get("http://adam.goucher.ca/parkcalc/index.php");

        Assert.assertEquals(driver.getTitle(), "Parking Calculator");

        Select chooseALotSelect = new Select(driver.findElement(By.xpath("//tr[td[contains(text(),'Choose a Lot')]]//select[@id='Lot']")));
        chooseALotSelect.selectByVisibleText("Valet Parking");

        WebElement startTime = driver.findElement(By.xpath("//tr[td[contains(text(),'Choose Entry DateClass and Time')]]//input[@name='EntryTime']"));
        List<WebElement> startDateAmPm = driver.findElements(By.xpath("//tr[td[contains(text(),'Choose Entry DateClass and Time')]]//input[@name='EntryTimeAMPM']"));
        WebElement startDate = driver.findElement(By.xpath("//tr[td[contains(text(),'Choose Entry DateClass and Time')]]//input[@name='EntryDate']"));

        startTime.clear();
        startTime.sendKeys("3:00");
        selectRadioValue(startDateAmPm, "PM");
        startDate.clear();
        startDate.sendKeys("3/18/2019");

        WebElement endTime = driver.findElement(By.xpath("//tr[td[contains(text(),'Choose Leaving DateClass and Time')]]//input[@name='ExitTime']"));
        List<WebElement> endDateAmPm = driver.findElements(By.xpath("//tr[td[contains(text(),'Choose Leaving DateClass and Time')]]//input[@name='ExitTimeAMPM']"));
        WebElement endDate = driver.findElement(By.xpath("//tr[td[contains(text(),'Choose Leaving DateClass and Time')]]//input[@name='ExitDate']"));

        endTime.clear();
        endTime.sendKeys("7:00");
        selectRadioValue(endDateAmPm, "PM");
        endDate.clear();
        endDate.sendKeys("3/20/2019");

        WebElement submitBtn = driver.findElement(By.xpath("//input[@name='Submit' and @value='Calculate']"));

        submitBtn.click();

        Thread.sleep(1000);

        WebElement costValue = driver.findElement(By.xpath("//tr[contains(.,'COST')]/td//b[contains(text(),'$')]"));
        WebElement calculatedTime = driver.findElement(By.xpath("//tr[contains(.,'COST')]/td//b[contains(text(),'Days')]"));

        Assert.assertEquals(costValue.getText(),"$ 72.00");
        Assert.assertEquals(calculatedTime.getText().trim(), "(2 Days, 4 Hours, 0 Minutes)");
    }


    @Test
    public void test4() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.get("http://adam.goucher.ca/parkcalc/index.php");

        Assert.assertEquals(driver.getTitle(), "Parking Calculator");

        Select chooseALotSelect = new Select(driver.findElement(By.xpath("//tr[td[contains(text(),'Choose a Lot')]]//select[@id='Lot']")));
        chooseALotSelect.selectByVisibleText("Valet Parking");

        WebElement startTime = driver.findElement(By.xpath("//tr[td[contains(text(),'Choose Entry DateClass and Time')]]//input[@name='EntryTime']"));
        List<WebElement> startDateAmPm = driver.findElements(By.xpath("//tr[td[contains(text(),'Choose Entry DateClass and Time')]]//input[@name='EntryTimeAMPM']"));
        WebElement startDate = driver.findElement(By.xpath("//tr[td[contains(text(),'Choose Entry DateClass and Time')]]//input[@name='EntryDate']"));

        startTime.clear();
        startTime.sendKeys("3:00");
        selectRadioValue(startDateAmPm, "PM");
        startDate.clear();
        startDate.sendKeys("3/18/2019");

        WebElement endTime = driver.findElement(By.xpath("//tr[td[contains(text(),'Choose Leaving DateClass and Time')]]//input[@name='ExitTime']"));
        List<WebElement> endDateAmPm = driver.findElements(By.xpath("//tr[td[contains(text(),'Choose Leaving DateClass and Time')]]//input[@name='ExitTimeAMPM']"));
        WebElement endDate = driver.findElement(By.xpath("//tr[td[contains(text(),'Choose Leaving DateClass and Time')]]//input[@name='ExitDate']"));

        endTime.clear();
        endTime.sendKeys("7:00");
        selectRadioValue(endDateAmPm, "PM");
        endDate.clear();
        endDate.sendKeys("3/20/2019");

        WebElement submitBtn = driver.findElement(By.xpath("//input[@name='Submit' and @value='Calculate']"));

        submitBtn.click();

        Thread.sleep(1000);

        WebElement costValue = driver.findElement(By.xpath("//tr[contains(.,'COST')]/td//b[contains(text(),'$')]"));
        WebElement calculatedTime = driver.findElement(By.xpath("//tr[contains(.,'COST')]/td//b[contains(text(),'Days')]"));

        Assert.assertEquals(costValue.getText(),"$ 72.00");
        Assert.assertEquals(calculatedTime.getText().trim(), "(2 Days, 4 Hours, 0 Minutes)");
    }

    @Test
    public void test5() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.get("http://adam.goucher.ca/parkcalc/index.php");

        Assert.assertEquals(driver.getTitle(), "Parking Calculator");

        Select chooseALotSelect = new Select(driver.findElement(By.xpath("//tr[td[contains(text(),'Choose a Lot')]]//select[@id='Lot']")));
        chooseALotSelect.selectByVisibleText("Valet Parking");

        WebElement startTime = driver.findElement(By.xpath("//tr[td[contains(text(),'Choose Entry DateClass and Time')]]//input[@name='EntryTime']"));
        List<WebElement> startDateAmPm = driver.findElements(By.xpath("//tr[td[contains(text(),'Choose Entry DateClass and Time')]]//input[@name='EntryTimeAMPM']"));
        WebElement startDate = driver.findElement(By.xpath("//tr[td[contains(text(),'Choose Entry DateClass and Time')]]//input[@name='EntryDate']"));

        startTime.clear();
        startTime.sendKeys("3:00");
        selectRadioValue(startDateAmPm, "PM");
        startDate.clear();
        startDate.sendKeys("3/18/2019");

        WebElement endTime = driver.findElement(By.xpath("//tr[td[contains(text(),'Choose Leaving DateClass and Time')]]//input[@name='ExitTime']"));
        List<WebElement> endDateAmPm = driver.findElements(By.xpath("//tr[td[contains(text(),'Choose Leaving DateClass and Time')]]//input[@name='ExitTimeAMPM']"));
        WebElement endDate = driver.findElement(By.xpath("//tr[td[contains(text(),'Choose Leaving DateClass and Time')]]//input[@name='ExitDate']"));

        endTime.clear();
        endTime.sendKeys("7:00");
        selectRadioValue(endDateAmPm, "PM");
        endDate.clear();
        endDate.sendKeys("3/20/2019");

        WebElement submitBtn = driver.findElement(By.xpath("//input[@name='Submit' and @value='Calculate']"));

        submitBtn.click();

        Thread.sleep(1000);

        WebElement costValue = driver.findElement(By.xpath("//tr[contains(.,'COST')]/td//b[contains(text(),'$')]"));
        WebElement calculatedTime = driver.findElement(By.xpath("//tr[contains(.,'COST')]/td//b[contains(text(),'Days')]"));

        Assert.assertEquals(costValue.getText(),"$ 72.00");
        Assert.assertEquals(calculatedTime.getText().trim(), "(2 Days, 4 Hours, 0 Minutes)");
    }


    public void selectRadioValue(List<WebElement> list, String selectValue){
        for(WebElement elem:list){
            String paramValue = elem.getAttribute("value");
            if (StringUtils.equals(selectValue,paramValue)){
                elem.click();
                return;
            }
        }
    }
}
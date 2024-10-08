package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {
    public static final String XPATH_COOKIES_ACCEPT = "//div[contains(@class, \"x1exxf4d\")]/div/div[1]";
    public static final String XPATH_NEW_ACCOUNT = "//a[contains(@class, \"_42ft\")]";
    public static final String XPATH_DAY = "//select[1]";
    public static final String XPATH_MONTH = "//select[2]";
    public static final String XPATH_YEAR = "//select[3]";


    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://facebook.com");

        WebElement acceptCookies = driver.findElement(By.xpath(XPATH_COOKIES_ACCEPT));
        acceptCookies.click();

        while (!driver.findElement(By.xpath(XPATH_NEW_ACCOUNT)).isDisplayed());

        WebElement createAccount = driver.findElement(By.xpath(XPATH_NEW_ACCOUNT));
        createAccount.click();

        while (!driver.findElement(By.xpath(XPATH_DAY)).isDisplayed());

        WebElement selectDayCombo = driver.findElement(By.xpath(XPATH_DAY));
        Select selectDay = new Select(selectDayCombo);
        selectDay.selectByValue("13");

        WebElement selectMonthCombo = driver.findElement(By.xpath(XPATH_MONTH));
        Select selectMonth = new Select(selectMonthCombo);
        selectMonth.selectByValue("2");

        WebElement selectYearCombo = driver.findElement(By.xpath(XPATH_YEAR));
        Select selectYear = new Select(selectYearCombo);
        selectYear.selectByValue("1954");



    }
}

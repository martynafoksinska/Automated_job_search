package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PracujPLPage {

    private WebDriver driver;

    public PracujPLPage(WebDriver driver) {
        this.driver = driver;
    }

    public void acceptCookies() {
        WebElement acceptPopUp = driver.findElement(By.className("ptv5q7l"));
        acceptPopUp.click();

        WebElement acceptCookiesButton = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[6]/div/div/div/div[4]/div/button[1]"));
        acceptCookiesButton.click();

    }

    public void clickOnJobSearch() {
        WebElement clickOnSearchJobButton = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section[1]/div[3]/div/div/div[1]/div[1]/div/div/div/input"));
        clickOnSearchJobButton.click();
        clickOnSearchJobButton.sendKeys("Tester");

        WebElement clickOnLocationButton = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section[1]/div[3]/div/div/div[1]/div[3]/div/div/div/input"));
        clickOnLocationButton.click();
        clickOnLocationButton.sendKeys("Trójmiasto");

        WebElement clickOnSearchButton = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section[1]/div[3]/div/div/div[2]/button"));
        clickOnSearchButton.click();

    }
}

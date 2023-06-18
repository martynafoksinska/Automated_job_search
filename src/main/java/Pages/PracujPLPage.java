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
        WebElement acceptPopUp = driver.findElement(By.xpath("/html/body/div[1]/div/div[7]/div/div/div/div[3]/div/button[1]"));
        acceptPopUp.click();

    }

    public void clickOnItJobOffers() {
        WebElement clickOnItJobOffers = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/header/div[1]/div/nav/a[3]/span"));
        clickOnItJobOffers.click();


        WebElement clickOnLocationButton = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section[1]/div[3]/div/div/div[1]/div[3]/div/div/div/input"));
        clickOnLocationButton.click();
        clickOnLocationButton.sendKeys("Trójmiasto");

        WebElement clickOnSearchButton = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section[1]/div[3]/div/div/div[2]/button"));
        clickOnSearchButton.click();

    }
}

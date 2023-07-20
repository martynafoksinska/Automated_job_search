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

        WebElement checkOnOnlyRemoteJobOffers = driver.findElement(By.className("ShowMoreLessstyles__Wrapper-sc-18j98pt-0 ejoPiX"));
        checkOnOnlyRemoteJobOffers.click();

    }
}

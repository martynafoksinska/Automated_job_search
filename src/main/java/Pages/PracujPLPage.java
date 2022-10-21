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
        WebElement acceptCookiesButton = driver.findElement(By.xpath("//*[@id=\"gp-cookie-agreements\"]/div/div/div[1]/div[3]/button"));
        acceptCookiesButton.click();
    }

}

package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Keys;


public class GooglePage {

    private WebDriver driver;

    public GooglePage(WebDriver driver) {
        this.driver = driver;
    }

    public void inputTextJustJoinIT() {
        WebElement acceptButton = driver.findElement(By.xpath("//*[@id='L2AGLb']/div"));
        acceptButton.click();
        WebElement searchInput = driver.findElement(By.id("APjFqb"));
        searchInput.clear();
        searchInput.click();
        searchInput.sendKeys("just join it");
        searchInput.sendKeys(Keys.RETURN);
        WebElement searchButton = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]"));
        searchButton.click();
    }

    public void inputTextPracujPL() {
        WebElement acceptButton = driver.findElement(By.xpath("//*[@id='L2AGLb']/div"));
        acceptButton.click();
        WebElement searchInput = driver.findElement(By.className("gLFyf"));
        searchInput.sendKeys("pracuj pl");
        WebElement searchButton = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]"));
        searchButton.click();
    }

    public void clickLink() {
        WebElement firstLink = driver.findElement(By.xpath("/html/body/div[6]/div/div[13]/div[2]/div/div/div[2]/div/div[1]/div[2]/div[1]/div/div[2]/div/div[1]/a/div"));
        firstLink.click();
    }
}

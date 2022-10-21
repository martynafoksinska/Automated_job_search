package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GooglePage {

    private WebDriver driver;

    public GooglePage(WebDriver driver) {
        this.driver = driver;
    }

    public void inputTextJustJoinIT() {
        WebElement acceptButton = driver.findElement(By.xpath("//*[@id='L2AGLb']/div"));
        acceptButton.click();
        WebElement serachInput = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input"));
        serachInput.sendKeys("just join it");
        WebElement searchButton = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]"));
        searchButton.click();
    }

    public void inputTextPracujPL() {
        WebElement acceptButton = driver.findElement(By.xpath("//*[@id='L2AGLb']/div"));
        acceptButton.click();
        WebElement serachInput = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input"));
        serachInput.sendKeys("pracuj pl");
        WebElement searchButton = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]"));
        searchButton.click();
    }

    public void clickLink() {
        WebElement firstLink = driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div/div[1]/a/h3"));
        firstLink.click();
    }
}

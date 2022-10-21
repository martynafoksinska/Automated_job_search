package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class JustJoinITPage {

    private WebDriver driver;

    public JustJoinITPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickTestingButton() {
        WebElement testingIcon = driver.findElement(By.className("css-1ihgbwn"));
        testingIcon.click();
         }

    public void clickFilters() {
        WebElement moreFiltersButton = driver.findElement(By.className("css-p1hmmo"));
        moreFiltersButton.click();
    }

    public void chooseFilters() {
        WebElement employmentType = driver.findElement(By.xpath("/html/body/div[5]/div[3]/div/div[2]/div[4]/div/button[3]/span[1]"));
        employmentType.click();
        WebElement seniority = driver.findElement(By.xpath("/html/body/div[5]/div[3]/div/div[2]/div[6]/div/button[2]/span[1]"));
        seniority.click();
        WebElement showOffersButton = driver.findElement(By.className("css-182ns5c"));
        showOffersButton.click();
    }

    public void clickLocation() {
        WebElement locationButton = driver.findElement(By.className("css-rbgze"));
        locationButton.click();
        WebElement threeCityButton = driver.findElement(By.xpath("/html/body/div[5]/div[3]/div/div/div[3]/div/div/div/div/a[5]/span[1]"));
        threeCityButton.click();
    }
}

package JobSearchJustJoinIT;

import Pages.GooglePage;
import Pages.JustJoinITPage;
import Pages.PracujPLPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.media.model.Timestamp;

import java.io.File;
import java.io.IOException;

public class SearchingJonOnPracujPL {

    WebDriver driver;

    @Given("the user is on {string} page")
    public void enterPage(String url) {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);

    }

    @When("the user inputs pracuj pl into the search box")
    public void inputText() throws InterruptedException {
        GooglePage onGooglePage = new GooglePage(driver);
        onGooglePage.inputTextPracujPL();

    }

    @And("the user clicks on the first link that shows up")
    public void clickLink() {
        GooglePage onGooglePage = new GooglePage(driver);
        onGooglePage.clickLink();

    }

    @And("the user accept cookies")
    public void acceptCookies() {
        PracujPLPage onPracujPLPage = new PracujPLPage(driver);
        onPracujPLPage.acceptCookies();

    }

    @And("the user clicks on Oferty IT and chooses desired filters")
    public void clickOnJobSearch() {
        PracujPLPage onPracujPLPage = new PracujPLPage(driver);
        onPracujPLPage.clickOnItJobOffers();

    }

    @Then("screenshot with available job offers from pracuj.pl is taken")
    public void screenshot() throws IOException {
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String imageFileDir = "C:\\Users\\marty\\Desktop";
        FileUtils.copyFile(scrFile, new File(imageFileDir, "test" + timestamp + ".png"));
        //driver.quit();
    }
}

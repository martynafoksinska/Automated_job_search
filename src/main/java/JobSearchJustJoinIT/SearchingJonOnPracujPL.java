package JobSearchJustJoinIT;

import Pages.GooglePage;
import Pages.JustJoinITPage;
import Pages.PracujPLPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

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

    @Then("the user inputs job name and location into the search box and then clicks search")
    public void clickOnJobSearch() {
        PracujPLPage onPracujPLPage = new PracujPLPage(driver);
        onPracujPLPage.clickOnItJobOffers();

    }
}

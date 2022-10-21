package JobSearchJustJoinIT;

import Pages.GooglePage;
import Pages.JustJoinITPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchingJobOnJustJoinIT {

    WebDriver driver;

    @Given("user is on {string} page")
    public void enterPage(String url) {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);

    }

    @When("user inputs just join it into the search box")
    public void inputText() {
        GooglePage onGooglePage = new GooglePage(driver);
        onGooglePage.inputTextJustJoinIT();

    }

    @And("user clicks on the first link that shows up")
    public void clickLink() {
        GooglePage onGooglePage = new GooglePage(driver);
        onGooglePage.clickLink();

    }

    @And("user clicks on the testing category")
    public void clickTestingButton() {
        JustJoinITPage onJustJoinITPage = new JustJoinITPage(driver);
        onJustJoinITPage.clickTestingButton();

    }

    @And("user clicks on more filters and chooses permanent, junior and then clicks show offers")
    public void selectFilters() {
        JustJoinITPage onJustJoinITPage = new JustJoinITPage(driver);
        onJustJoinITPage.clickFilters();
        onJustJoinITPage.chooseFilters();

    }

    @Then("user clicks location and chooses Trójmiasto")
    public void clickLocation() {
        JustJoinITPage onJustJoinITPage = new JustJoinITPage(driver);
        onJustJoinITPage.clickLocation();

    }
}

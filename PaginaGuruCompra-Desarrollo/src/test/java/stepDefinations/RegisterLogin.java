package stepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import objectReposity.HomepageReposity;
import objectReposity.LoginReposity;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

@RunWith(Cucumber.class)
public class RegisterLogin {
    WebDriver df;

    @Given("The user is on the website and wants to register")
    public void theUserIsOnTheWebsiteAndWantsToRegister() {
        System.out.println("Primer paso");
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\usuario\\Documents\\Curso_Selenium\\Recursos\\geckodriver.exe");
        df = new FirefoxDriver();
        df.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        df.get("http://live.demoguru99.com/");
        System.out.println("fin Primer paso");
    }

    @When("Enter the login section of the website")
    public void enterTheLoginSectionOfTheWebsite() {
        HomepageReposity Register = new HomepageReposity(df);
        Register.Account().click();
        System.out.println("Segundo paso");
    }

    @And("select register new user")
    public void selectRegisterNewUser() {
        HomepageReposity Register = new HomepageReposity(df);
        Register.Register().click();
        System.out.println("Tercer paso");
    }

    @And("Fill in the necessary fields for a successful registration")
    public void fillInTheNecessaryFieldsForASuccessfulRegistration() {
        System.out.println("Cuarto paso");
    }

    @Then("DASHBOARD is shown")
    public void dashboardIsShown() {
        System.out.println("Quinto paso");
    }

    @And("validate that the page title is correct")
    public void validateThatThePageTitleIsCorrect() {
        System.out.println("Sexto paso");
        df.close();
    }

   // WebDriver df;
    @Given("the user enters the website and wants to login with their credentials")
    public void theUserEntersTheWebsiteAndWantsToLoginWithTheirCredentials() {
        System.out.println("Login1");
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\usuario\\Documents\\Curso_Selenium\\Recursos\\geckodriver.exe");
        df = new FirefoxDriver();
        df.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        df.get("http://live.demoguru99.com/");
        System.out.println("fin Primer paso");
    }

    @When("Enter the login section of the website and want to login")
    public void enterTheLoginSectionOfTheWebsiteAndWantToLogin() throws InterruptedException {
        LoginReposity logarse = new LoginReposity(df);
        logarse.Account().click();
        System.out.println("Account");


    }

    @And("select login section")
    public void selectLoginSection() throws InterruptedException {
        LoginReposity logarse = new LoginReposity(df);
        logarse.Login().click();
        Thread.sleep(2000);
        System.out.println("Login3");
    }

    @And("Email and password")
    public void emailAndPassword() throws InterruptedException {
        LoginReposity logarse = new LoginReposity(df);
        logarse.email().sendKeys("Derniernaim@gmail.com");
        logarse.pass().sendKeys("123456");
        Thread.sleep(3000);
        logarse.sendLogin().click();
        System.out.println("Logado correctamente");

    }

    @Then("DASHBOARD is shown with the user's data and all their previous purchase record")
    public void dashboardIsShownWithTheUserSDataAndAllTheirPreviousPurchaseRecord() {
        System.out.println("Login4");
    }

    @And("validate that it correctly displays the username")
    public void validateThatItCorrectlyDisplaysTheUsername() throws InterruptedException {
        System.out.println("Login5");
        Thread.sleep(3000);
        df.close();
    }
}

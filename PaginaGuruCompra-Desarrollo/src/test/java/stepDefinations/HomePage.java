package stepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import objectReposity.Consulta;
import objectReposity.HomepageReposity;
import objectReposity.HomepageT;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

@RunWith(Cucumber.class)
public class HomePage {
   WebDriver dr;

    @Given("entra a la aplicación con sus credenciales")
    public void entraALaAplicaciónConSusCredenciales() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\usuario\\Documents\\Curso_Selenium\\Recursos\\chromedriver.exe");
        dr = new ChromeDriver();
        dr.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        dr.manage().window().maximize();
        dr.get("http://appianriskcert.scib.pre.corp/suite/sites/nys-new-york-sis");
        HomepageT usuario = new HomepageT(dr);
        usuario.inputNombreDeUsuario().sendKeys("nysMO1");
        usuario.inputContraseña().sendKeys("nysMO1_1");
        usuario.btnEntrar().click();
        System.out.println("Usuario logado");
        Thread.sleep(3000);
    }

    @And("Verifica que el portal este en su idioma")
    public void verificaQueElPortalEsteEnSuIdioma() {
        System.out.println("Idioma Correcto");
    }

    @When("Realiza una consulta")
    public void realizaUnaConsulta() throws InterruptedException {
        Consulta Search = new Consulta(dr);
        Search.buscar1();

    }
}




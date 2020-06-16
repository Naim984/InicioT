package objectReposity;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomepageT {
    WebDriver driver;

    public HomepageT(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver, this);
        // TODO Auto-generated constructor stub
    }

    @FindBy(id = "un")
    WebElement inputNombreDeUsuario;
    @FindBy(id = "pw") WebElement inputContrasena;
    @FindBy(xpath = "//form[@id='loginForm']//input[@class='btn primary']")
    WebElement btnEntrar;

    @FindBy(xpath = "//input[@id='e51cd5204d85bd18302f8f2811d78af7']") WebElement Buscar;


    public WebElement inputContraseña()
    {
        return inputContrasena;

    }

    public WebElement btnEntrar()
    {
        return btnEntrar;

    }
    public WebElement inputNombreDeUsuario()
    {
        return inputNombreDeUsuario;

    }

}

package objectReposity;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Consulta {
    WebDriver driver;

    public Consulta(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        // TODO Auto-generated constructor stub
    }

    @FindBy(xpath = "//input[@id='e51cd5204d85bd18302f8f2811d78af7']")
    WebElement buscar;


    public void buscar1() throws InterruptedException {
        buscar.sendKeys("0101Y8");
        buscar.sendKeys(Keys.ENTER);

    }


}

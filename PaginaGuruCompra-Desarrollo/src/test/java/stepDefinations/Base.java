package stepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Base {

    private WebDriver driver;

    public  Base(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement findElement(By locator) {
        return driver.findElement(locator);
    }

    public void click(WebElement webElement) {
        driver.findElement((By) webElement).click();
    }
}

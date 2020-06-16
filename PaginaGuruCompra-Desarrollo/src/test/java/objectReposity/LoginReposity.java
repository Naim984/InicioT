package objectReposity;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginReposity {
    WebDriver driver;

    public LoginReposity(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver, this);
        // TODO Auto-generated constructor stub
    }



    @FindBy(css=("body.cms-index-index.cms-home:nth-child(2) div.wrapper div.page:nth-child(2) header.page-header div.page-header-container div.skip-links:nth-child(3) div.account-cart-wrapper:nth-child(3) > a.skip-link.skip-account"))
    WebElement Account;

    @FindBy(linkText=("Log In"))
    WebElement Login;

    @FindBy(id=("email"))
    WebElement email;

    @FindBy(id=("pass"))
    WebElement pass;

    @FindBy(xpath=("//button[@id='send2']"))
    WebElement sendLogin;

    @FindBy(css=("div.block-content:nth-child(2) > ul:nth-child(1) > li:nth-child(8) > a:nth-child(1)"))
    WebElement Wishlist;

    @FindBy(xpath=("//button[@class='button btn-cart']"))
    WebElement AddCart;

    @FindBy(xpath=("//*[@id=\"postcode\"]"))
    WebElement Enterpostcode;

    @FindBy(css=("html#top.js.no-touch.localstorage.no-ios body.checkout-cart-index div.wrapper div.page div.main-container.col1-layout div.main div.col-main div.cart.display-single-price div.cart-forms div.shipping div.shipping-form form#shipping-zip-form div.buttons-set button.button2 span span"))
    WebElement Estimate;

    @FindBy(xpath=("/html/body/div/div/div[2]/div/div/div/div[2]/div/div/form[2]/dl/dd/ul/li/label"))
    WebElement Cost;

    @FindBy(xpath=("/html/body/div/div/div[2]/div/div/div/div[3]/div/ul/li[1]/button"))
    WebElement Checkout;

    @FindBy(id=("billing:street1"))
    WebElement Address;


    @FindBy(id=("billing:city"))
    WebElement city;

    @FindBy(id=("billing:postcode"))
    WebElement postcode1;

    @FindBy(id=("billing:telephone"))
    WebElement telephone;




    @FindBy(xpath=("//div[@id='billing-buttons-container']//button[@class='button']//span//span[contains(text(),'Continue')]"))
    WebElement shiipping;

    @FindBy(xpath=("//div[@id='shipping-method-buttons-container']//button[@class='button']//span//span[contains(text(),'Continue')]"))
    WebElement continue1;

    @FindBy(id=("p_method_checkmo"))
    WebElement metodopago;
    ///Orders
    @FindBy(css=(".block-account > div:nth-child(2) > ul:nth-child(1) > li:nth-child(4) > a:nth-child(1)"))
    WebElement Orders;

    @FindBy(css=(".a-center > span:nth-child(1) > a:nth-child(1)"))
    WebElement ViewOrders;

    @FindBy(css=(".page-title > h1:nth-child(1)"))
    WebElement PendingOrders;

    @FindBy(css=(".link-print"))
    WebElement Print;



    public WebElement Account()
    {
        return Account;

    }

    public WebElement Login()
    {
        return Login;

    }
    public WebElement email()
    {
        return email;

    }

    public WebElement pass()
    {
        return pass;

    }

    public WebElement sendLogin()
    {
        return sendLogin;

    }
    public WebElement Wishlist()
    {
        return Wishlist;

    }
    public WebElement AddCart()
    {
        return AddCart;

    }

    public WebElement Enterpostcode()
    {
        return Enterpostcode;

    }

    public WebElement Estimate()
    {
        return Estimate;

    }

    public WebElement Cost()
    {
        return Cost;

    }

    public WebElement Checkout()
    {
        return Checkout;

    }

    public WebElement Address()
    {
        return Address;

    }
    public WebElement city()
    {
        return city;

    }

    public WebElement postcode1()
    {
        return postcode1;

    }

    public WebElement shiipping()
    {
        return shiipping;

    }

    public WebElement telephone()
    {
        return telephone;

    }
    public WebElement continue1()
    {
        return continue1;

    }

    public WebElement metodopago()
    {
        return metodopago;

    }

    ///Orders

    public WebElement Orders()
    {
        return Orders;

    }
    public WebElement ViewOrders()
    {
        return ViewOrders;

    }

    public String PendingOrders()
    {
        return PendingOrders.getText();

    }

    public WebElement Print()
    {
        return Print;

    }
}

package objectReposity;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomepageReposity {
    WebDriver driver;

    public HomepageReposity(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver, this);
        // TODO Auto-generated constructor stub
    }

    //By search =By.id("srchword");
    //By submit =By.xpath("//form[@id='queryTop']//input[@class='newsrchbtn']");

    @FindBy(xpath=("//body[contains(@class,'catalog-category-view categorypath-mobile-html category-mobile')]/div[@class='wrapper']/div[@class='page']/div[@class='main-container col3-layout']/div[@class='main']/div[@class='col-wrapper']/div[@class='col-main']/div[@class='category-products']/div[@class='toolbar']/div[@class='sorter']/div[@class='sort-by']/select[1]"))
    WebElement Search;

    @FindBy(xpath=("//a[contains(text(),'Mobile')]"))
    WebElement Mobile;

    @FindBy(css=("body.catalog-category-view.categorypath-mobile-html.category-mobile:nth-child(2) div.wrapper div.page:nth-child(2) div.main-container.col3-layout div.main div.col-wrapper div.col-main div.category-products div.toolbar:nth-child(1) div.sorter div.sort-by select:nth-child(2) > option:nth-child(2)"))
    WebElement Seleccion;

    @FindBy(css=("\r\n" +
            "body.catalog-category-view.categorypath-mobile-html.category-mobile:nth-child(2) div.wrapper div.page:nth-child(2) div.main-container.col3-layout div.main div.col-wrapper div.col-main div.category-products ul.products-grid.products-grid--max-4-col.first.last.odd:nth-child(2) li.item.last:nth-child(1) div.product-info div.actions ul.add-to-links li:nth-child(2) > a.link-compare"))
    WebElement Mobile1;

    @FindBy(css=("body.catalog-category-view.categorypath-mobile-html.category-mobile:nth-child(2) div.wrapper div.page:nth-child(2) div.main-container.col3-layout div.main div.col-wrapper div.col-main div.category-products ul.products-grid.products-grid--max-4-col.first.last.odd:nth-child(2) li.item.last:nth-child(2) div.product-info div.actions ul.add-to-links li:nth-child(2) > a.link-compare"))
    WebElement Mobile2;

    @FindBy(xpath=("//div[@class='block block-list block-compare']//button[@class='button']"))
    WebElement Compare;

    @FindBy(css=("body.cms-index-index.cms-home:nth-child(2) div.wrapper div.page:nth-child(2) header.page-header div.page-header-container div.skip-links:nth-child(3) div.account-cart-wrapper:nth-child(3) > a.skip-link.skip-account"))
    WebElement Account;

    @FindBy(linkText=("Register"))
    WebElement Register;

    @FindBy(id=("firstname"))
    WebElement First;

    @FindBy(id=("lastname"))
    WebElement Last;

    @FindBy(id=("email_address"))
    WebElement email;

    @FindBy(id=("password"))
    WebElement Password;

    @FindBy(id=("confirmation"))
    WebElement confirmation;


    @FindBy(xpath=("//div[@class='buttons-set']//button[@class='button']"))
    WebElement Registerr;

    @FindBy(css=("li.level0:nth-child(2) > a:nth-child(1)"))
    WebElement tv;

    @FindBy(xpath=("//li[2]//div[1]//div[3]//ul[1]//li[1]//a[1]"))
    WebElement addtv;

    @FindBy(xpath=("//button[@name='save_and_share']"))
    WebElement share;


    @FindBy(id=("email_address"))
    WebElement address_email;

    @FindBy(id=("message"))
    WebElement message;


    @FindBy(xpath=("//div[@class='buttons-set form-buttons']//button[@class='button']"))
    WebElement enviarmessage;


    public WebElement Select()
    {
        return Select();
    }

    public WebElement Mobile()
    {
        return Mobile;
    }
    public WebElement Mobile1()
    {
        return Mobile1;
    }
    public WebElement Mobile2()
    {
        return Mobile2;
    }
    public WebElement Compare()
    {
        return Compare;
    }


    public WebElement Search()
    {
        return Search;
    }

    public WebElement Seleccion()
    {
        return Seleccion;

    }
    public WebElement Account()
    {
        return Account;

    }
    public WebElement First()
    {
        return First;

    }
    public WebElement Last()
    {
        return Last;

    }
    public WebElement email()
    {
        return email;

    }
    public WebElement Password()
    {
        return Password;

    }
    public WebElement confirmation()
    {
        return confirmation;

    }
    public WebElement Register()
    {
        return Register;

    }
    public WebElement Registerr()
    {
        return Registerr;

    }

    public WebElement tv()
    {
        return tv;

    }

    public WebElement addtv()
    {
        return addtv;

    }
    public WebElement share()
    {
        return share;

    }
    public WebElement address_email()
    {
        return address_email;

    }

    public WebElement message()
    {
        return message;

    }


    public WebElement enviarmessage()
    {
        return enviarmessage;

    }
}

package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import util.Util;
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.assertTrue;

public class HomePage extends Util {

    public HomePage(){
        PageFactory.initElements(getDriver(), this);
    }

    @FindBy(xpath = "//input[@id=\"search\"]")
    private WebElement inputSerch;

    @FindBy(xpath = "//button[@id=\"search-icon-legacy\"]")
    private WebElement buttonSearch;

    @FindBy(xpath = "(//div[@id=\"dismissible\"])[2]")
    private WebElement videoSonia;

    public HomePage inserirPesquisa(String Search){
        inserirTextoElemento(inputSerch, Search);
        clicarElemento(buttonSearch);
        return this;
    }

    public HomePage entreNoVideo(){
        clicarElemento(videoSonia);
        return this;
    }
}

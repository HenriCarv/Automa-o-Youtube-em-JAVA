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

    @FindBy(xpath = "//input[@name=\"search_query\"]")
    private WebElement inputSerch;

    @FindBy(xpath = "//button[@aria-label=\"Search\"]")
    private WebElement buttonSearch;

    @FindBy(xpath = "(//img[@class=\"ytCoreImageHost ytCoreImageFillParentHeight ytCoreImageFillParentWidth ytCoreImageContentModeScaleAspectFill ytCoreImageLoaded\"])[1]")
    private WebElement videoSonia;

    @FindBy(xpath = "//yt-formatted-string[@title=\"fala sonia\"]")
    private WebElement titleName;

    public HomePage inserirPesquisa(String Search){
        inserirTextoElemento(inputSerch, Search);
        clicarElemento(buttonSearch);
        return this;
    }

    public HomePage entreNoVideo() {
        clicarElemento(videoSonia);
        validateElementText(titleName, "fala sonia");
        return this;
    }

}

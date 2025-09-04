package util;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

public class Util {

    private static WebDriver driver;
    private static WebDriverWait wait;
    private static int timeOut = 15;
    protected WebDriver iniciarNavegador(String url){

        //System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(url);
        return driver;
    }

    protected WebDriver getDriver(){
        return driver;
    }

    protected void inserirTextoElemento(WebElement element, String texto){
        wait = new WebDriverWait(driver, timeOut);
        wait.until(ExpectedConditions.visibilityOf(element));
        element.sendKeys(texto);
    }

    protected void clicarElemento(WebElement element){
        wait = new WebDriverWait(driver, timeOut);
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }

    protected void selecionarElementoValor(WebElement element, String valor){
        wait = new WebDriverWait(driver, timeOut);
        wait.until(ExpectedConditions.visibilityOf(element));
        Select select = new Select(element);
        select.selectByValue(valor);
    }

    protected boolean existeElementoNaPagina(String xpath){
        return getDriver().findElements(By.xpath(xpath)).size() != 0;
    }
}

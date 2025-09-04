package hooks;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import util.Util;

public class Hooks extends Util {

    @Before(value = "@Teste")
    public void before(){
        iniciarNavegador("https://www.youtube.com");
    }

    @After(value = "@Teste")
    public void after(){
        getDriver().quit();
    }
}

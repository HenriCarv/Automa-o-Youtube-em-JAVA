package hooks;

import io.cucumber.java.*;
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

package support;

import definitions.hooks;
import org.openqa.selenium.support.ui.WebDriverWait;

public class util extends hooks {
    public static WebDriverWait wait;
    public util() {
        //traemos la variable driver que esta en hook
        wait = new WebDriverWait(driver,30);
    }
}

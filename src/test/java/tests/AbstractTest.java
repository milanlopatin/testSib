package tests;

import com.codeborne.selenide.Configuration;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import pages.CartPage;
import pages.MainPage;
import utilities.PropertyLoader;

import static com.codeborne.selenide.Selenide.*;

public abstract class AbstractTest {
    protected static final String appUrl = PropertyLoader.loadProperty("app.url", "app.properties");
    protected static final String cartUrl = PropertyLoader.loadProperty("cart.url", "app.properties");


    @BeforeEach
    public void initWebDriverBeforeTest() {
        Configuration.browser = "chrome";
        ChromeDriverManager.chromedriver().setup();
    }

    @AfterEach
    public void closeBrowser() {

    }

    public static MainPage openMainPage() {
        open(appUrl);
        return new MainPage();
    }

    public static CartPage openCartPage() {
        open(cartUrl);
        return new CartPage();
    }
}

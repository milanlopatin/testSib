package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.Assertions;
import ru.yandex.qatools.htmlelements.annotations.Name;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.element;


public abstract class AbstractPage {

    @Name("Поиск по сайту")
    protected final SelenideElement searchField = element(byXpath("//*[@id='search-input']"));


    public AbstractPage() {
    }

    public AbstractPage(String expectedName) {
        this();
        checkPageTitle(expectedName);
    }

    public SearchTab goToSearch() {
        searchField.click();
        return new SearchTab();
    }


    private void checkPageTitle(String expectedName) {

        final String actualName = WebDriverRunner.getWebDriver().getTitle();
        Assertions.assertEquals(expectedName, actualName);
    }

    public void refreshPage() {
        Selenide.refresh();
    }


}

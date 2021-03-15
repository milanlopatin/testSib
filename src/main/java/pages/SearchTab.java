package pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static utilities.CommonMethods.*;

public class SearchTab extends AbstractPage{

    public SearchTab()  {
        super();
    }

    public SearchTab inputToSearchField(String text) {
        setTextInput(searchField, text);
        return this;
    }

    public SearchTab clearSearchInput() {
        clearField(searchField);
        return this;
    }

    public SearchTab addItemWithNameToCart(String itemName) {
        $(By.xpath("//div[@class='digi--products-catalog__item']//a[text()='" + itemName + "']")).hover();//focus on element
        $(By.xpath("//a[text()='" + itemName + "']/../..//*[contains(text(),'В корзину')]")).click();//add to cart
        return this;
    }
}

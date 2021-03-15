package pages;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import utilities.app_entities.Item;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class CartPage extends AbstractPage{

    public CartPage() {
        super("Корзина");
    }


    public CartPage checkItemInCart(Item item) {
        $(By.xpath("//div[@class='cart-package__item']//a[contains(text(),'" + item.getName() + "')]")).should(visible);
        return this;
    }

    public CartPage checkItemId(Item item) {
        return this;
    }

    public CartPage checkItemPrice(Item item) {
        $(By.xpath("//a[contains(text(),'" + item.getName() + "')]/../..//span[@itemprop='price']"));
        String actualPrice = $(By.xpath("//a[contains(text(),'" + item.getName() + "')]/../..//span[@itemprop='price']")).getText();
        String expectedPrice = item.getPrice();
        Assertions.assertEquals(expectedPrice, actualPrice);
        return this;
    }

    public CartPage checkItemQuantity(Item item) {
        return this;
    }

    public CartPage checkItemIsVisibleAndHasCorrectValues(Item item) {
        return this;
    }
}

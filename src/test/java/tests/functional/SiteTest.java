package tests.functional;

import org.junit.jupiter.api.Test;

import pages.CartPage;
import tests.AbstractTest;
import utilities.app_entities.Item;


public class SiteTest extends AbstractTest {

    private final Item novomin = new Item("500020", "Новомин", "650");

    @Test
    public void checkItemMovedToCart() {
        openMainPage()
                .goToSearch()
                .inputToSearchField(novomin.getId())
                .addItemWithNameToCart(novomin.getName());

        CartPage cartPage = openCartPage()
                .checkItemInCart(novomin)
                .checkItemPrice(novomin);

    }
}

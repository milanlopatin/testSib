package utilities;

import com.codeborne.selenide.SelenideElement;


public class CommonMethods {
    public static void setTextInput(SelenideElement field, String text) {
        field.clear();
        field.sendKeys(text);
    }

    public static void clearField(SelenideElement field) {
        field.clear();
    }


    public static void hoverIntoElement(SelenideElement element) {
        element.hover();
    }
}

package Tests;

import Data.DataHelper;
import Page.AuthPage;
import Page.ProductsPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.testit.annotations.*;

import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;

public class TestSauce {
    AuthPage authPage;

    @BeforeEach
    @Step
    @Title("Перейти на сайт https://www.saucedemo.com/v1/")
    void setUp() {
        authPage = open(baseUrl, AuthPage.class);

    }


    @Test
    @ExternalId("Авторизация на сайте")
    @DisplayName("Авторизация на сайте")
    @Title("Авторизация на сайте")
    @WorkItemIds("3")
    void authValidLoginPassword() {
        ProductsPage productsPage = authPage.login(DataHelper.USER_NAME_STANDARD, DataHelper.USER_PASSWORD);
        Assertions.assertEquals("Products", productsPage.getLabelText());
    }
}
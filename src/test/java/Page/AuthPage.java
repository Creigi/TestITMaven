package Page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class AuthPage {
    private final SelenideElement username = $("[data-test=\"username\"]");
    private final SelenideElement password = $("[data-test=\"password\"]");
    private final SelenideElement loginButton = $("#login-button");

    private void inputUsername(String name) {
        username.setValue(name);
    }

    private void inputPassword(String pass) {
        password.setValue(pass);
    }

    public ProductsPage login(String name, String pass) {
        inputUsername(name);
        inputPassword(pass);
        loginButton.click();
        return new ProductsPage();
    }
}

package Page;

import com.codeborne.selenide.SelenideElement;
import ru.testit.annotations.Step;
import ru.testit.annotations.Title;

import static com.codeborne.selenide.Selenide.$;

public class AuthPage {
    private final SelenideElement username = $("[data-test=\"username\"]");
    private final SelenideElement password = $("[data-test=\"password\"]");
    private final SelenideElement loginButton = $("#login-button");

    @Step
    @Title("Ввести логин")
    private void inputUsername(String name) {
        username.setValue(name);
    }

    @Step
    @Title("Ввести пароль")
    private void inputPassword(String pass) {
        password.setValue(pass);
    }

    @Step
    @Title("Авторизоваться валидным пользователем")
    public ProductsPage login(String name, String pass) {
        inputUsername(name);
        inputPassword(pass);
        clickLogin();
        return new ProductsPage();
    }

    @Step
    @Title("Нажать кнопку логин")
    public void clickLogin() {
        loginButton.click();
    }
}

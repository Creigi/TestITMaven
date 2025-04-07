package Page;

import Data.DataHelper;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.List;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class ProductsPage {
    private final SelenideElement label = $(".product_label");
    private final String nameProduct = ".inventory_item_name";
    private final String descProduct = ".inventory_item_desc";
    private final String priceProduct = ".inventory_item_price";
    private final ElementsCollection cardProduct = $$(".inventory_item");

    public String getLabelText() {
        return label.getText();
    }

    public List<DataHelper.ProductCard> getListProduct() {
        List<DataHelper.ProductCard> listProduct = new ArrayList<>();

        cardProduct.forEach(card -> {
            listProduct.add(new DataHelper.ProductCard(
                    card.find(By.cssSelector(nameProduct)).getText(),
                    card.find(By.cssSelector(descProduct)).getText(),
                    card.find(By.cssSelector(priceProduct)).getText()));
        });

        return listProduct;
    }

}

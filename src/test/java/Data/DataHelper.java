package Data;

public class DataHelper {
    public static final String USER_NAME_STANDARD = "standard_user";

    public static class ProductCard {
        public ProductCard(String desc, String price, String name) {
            this.name = name;
            this.price = price;
            this.desc = desc;
        }

        String name;
        String desc;
        String price;
    }

    public static final String USER_PASSWORD = "secret_sauce";
}

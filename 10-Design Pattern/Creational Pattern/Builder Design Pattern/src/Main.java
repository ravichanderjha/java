public class Main {
    public static void main(String[] args) {
        Product product = new Product.ProductBuilder()
                .name("Ravi")
                        .category("Ravi Category")
                                .price("Priceless")
                                        .build();
        System.out.println(product.toString());
    }
}
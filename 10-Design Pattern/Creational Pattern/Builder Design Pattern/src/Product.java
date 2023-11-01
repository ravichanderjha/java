public class Product {
    private String name;
    private String price;
    private String category;

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", category='" + category + '\'' +
                '}';
    }

    private Product(ProductBuilder productBuilder){
        this.name = productBuilder.name;
        this.price = productBuilder.price;
        this.category = productBuilder.category;
    }

    public static class ProductBuilder {
        private String name;
        private String price;
        private String category;

        public ProductBuilder name(String name){
            this.name = name;
            return this;
        }
        public ProductBuilder price(String price){
            this.price = price;
            return this;
        }
        public ProductBuilder category(String category){
            this.category = category;
            return this;
        }

        public Product build(){
            return new Product(this);
        }
    }


}

package oopıntro;

public class Main {

    public static void main(String[] args) {
        Product();
    }

    public static void Category() {
        Category category1 = new Category();
        category1.id = 1;
        category1.name = "Bilgisayar";

        Category category2 = new Category();
        category2.id = 2;
        category2.name = "Tablet";

    }

    public static void Product() {

        Product product3 = new Product(3, "Lenovo", 8500, "16 GB", 10, 850);

        Product product1 = new Product();
        product1.setId(1);
        product1.setName("Asus");
        product1.setUnitPrice(1000);
        product1.setDetail("gb");
        product1.setDiscount(10);

        Product product2 = new Product();
        product2.setId(1);
        product2.setName("Hp"); 
        product2.setUnitPrice(1000);
        product2.setDetail("8gb");

        oopıntro.Product[] products = {product1, product2, product3};

        for (Product product : products) {
            System.out.println(product.getName());
        }

        System.out.println(products.length);

        ProductManager productManager = new ProductManager();

        productManager.addToCart(product1);
        productManager.addToCart(product2);
        productManager.addToCart(product3);
    }
}

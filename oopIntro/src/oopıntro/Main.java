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

        Product product3 = new Product(3, "Lenovo", 8500, "16 GB");

        Product product1 = new Product();
        product1.id = 1;
        product1.name = "Asus";
        product1.unitPrice = 10000;
        product1.detail = "8 GB";

        Product product2 = new Product();
        product2.id = 2;
        product2.name = "HP";
        product2.unitPrice = 2500;
        product2.detail = "4 GB";

        Product[] products = {product1, product2, product3};

        for (Product product : products) {
            System.out.println(product.name);
        }

        System.out.println(products.length);

        ProductManager productManager = new ProductManager();

        productManager.addToCart(product1);
        productManager.addToCart(product2);
        productManager.addToCart(product3);
    }
}


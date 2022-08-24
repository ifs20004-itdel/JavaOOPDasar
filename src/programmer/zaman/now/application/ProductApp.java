package programmer.zaman.now.application;

import programmer.zaman.now.data.Product;

public class ProductApp {
    public static void main(String[] args) {
        Product product = new Product("Mac Book Pro", 30000000);

        System.out.println(product.name);
        System.out.println(product.price);

        System.out.println(product);

        Product product1 = new Product("Mac Book Pro",30000000);
        System.out.println(product.equals(product1));
        System.out.println(product.hashCode()== product1.hashCode());
    }
}

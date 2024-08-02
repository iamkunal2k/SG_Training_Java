package StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product {

    String name;
    int quantity;
    float price;

    Product(String name, int quantity, float price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

}

public class StreamEg1 {

    public static void main(String[] args) {

        List<Product> products = new ArrayList<Product>();

        products.add(new Product("Phone", 2 , 4453.55F));
        products.add(new Product("laptop", 2 , 40453.55F));
        products.add(new Product("device", 2 , 453.55F));
        products.add(new Product("monitor", 2 , 3453.55F));
        products.add(new Product("TV", 2 , 53.55F));
        products.add(new Product("Refrigerator", 2 , 5553.55F));

        List<Float> productsadded =
                products.stream()
                    .filter(p -> p.price > 3000)
                    .map(p -> p.price)
                        .collect(Collectors.toList());

        System.out.println(productsadded);

    }
}

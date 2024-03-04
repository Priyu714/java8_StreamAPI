package Product;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class JavaStreamExample {
    public static void main(String[] args) {

        List<Product> productList = new ArrayList<Product>();

        productList.add(new Product(1,"HP Laptop",25000f));
        productList.add(new Product(2,"Dell Laptop",30000f));
        productList.add(new Product(3,"Lenevo Laptop",28000f));
        productList.add(new Product(4,"Sony Laptop",28000f));
        productList.add(new Product(5,"Apple Laptop",90000f));

        List<Float> productlist2 = productList.stream()
                .filter(p -> p.price > 30000f)
                .map(p -> p.price).collect(Collectors.toList());

        System.out.println(productlist2);

//        Filtering price from product name

                 productList.stream()
                .filter(p -> p.getName().equals("HP Laptop"))
                .forEach(p -> System.out.println(p.price));

//          filting product name from pricing

        productList.stream()
                .filter(p -> p.price== 90000f)
                .forEach(p -> System.out.println(p.name));



    }
}

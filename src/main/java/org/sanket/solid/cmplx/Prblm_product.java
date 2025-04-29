package org.sanket.solid.cmplx;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Prblm_product {

    public static void main(String[] args) {
        List<Product> products =Arrays.asList(new Product(
                1,
                "sugar",45
        ),
                new Product(
                        2,
                        "rice",40
                )
        ,new Product(
                        1,
                        "wheat",55
                )
        ,
                new Product(
                        1,
                        "corn",65
                )
        ,new Product(
                5,
                "maida",30
        ));

        //Group Products by Category and Sort Each Group by Price Descending

        Map<Integer, List<Product>> collect = products.stream().sorted(Comparator.comparing(Product::getPrice)).collect(Collectors.groupingBy(Product::getCatagoryId));


        collect.forEach((age, productList) -> {
            System.out.println("Age: " + age);
            productList.forEach(product -> System.out.println("  " + product));
        });



    }
}

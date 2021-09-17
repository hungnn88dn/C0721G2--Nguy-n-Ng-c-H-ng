package _12_collection_framework_java.exercise;

import java.util.Comparator;

public class SortPriceProductDown implements Comparator<ProductManager> {

    @Override
    public int compare(ProductManager o1, ProductManager o2) {
        return (int) (o2.getPrice() - o1.getPrice());
    }
}

package _12_collection_framework_java.exercise;

import java.util.Comparator;

public class SortPriceProductDown implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {
        return (int) (o2.getPrice() - o1.getPrice());
    }
}

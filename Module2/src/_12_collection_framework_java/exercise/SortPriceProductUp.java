package _12_collection_framework_java.exercise;

import java.util.Comparator;

public class SortPriceProductUp implements Comparator <Product>{

    @Override
    public int compare(Product o1, Product o2) {
        return (int) (o1.getPrice() - o2.getPrice());
    }
}

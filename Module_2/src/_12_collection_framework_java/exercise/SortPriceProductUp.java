package _12_collection_framework_java.exercise;

import java.util.Comparator;

public class SortPriceProductUp implements Comparator <ProductManager>{

    @Override
    public int compare(ProductManager o1, ProductManager o2) {
        return (int) (o1.getPrice() - o2.getPrice());
    }
}

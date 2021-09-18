package _12_collection_framework_java.exercise;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SortProduct {
    public void sortProduct(List<ProductManager> productManagerList) {
        Scanner scanner = new Scanner(System.in);
        int chooseSort;
        do {
            System.out.println("1. Sap xep theo giá tăng dần");
            System.out.println("2. Sap xep theo giá giảm dần");
            System.out.println("0. Ket thuc");
            System.out.println("Nhập lựa chọn của bạn: ");
             chooseSort = scanner.nextInt();
            if (chooseSort == 1) {
                Collections.sort(productManagerList, new SortPriceProductUp());
            } else if (chooseSort == 2) {
                Collections.sort(productManagerList, new SortPriceProductDown());
            }
            for (ProductManager productManager : productManagerList) {
                System.out.println(productManager);
            }
        } while (chooseSort != 0);
    }
}


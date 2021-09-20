package _12_collection_framework_java.exercise;

import java.util.List;
import java.util.Scanner;

public class DeleteProduct {
    public static void deleteProduct(List<ProductManager> productManagerList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập ID của sản phẫm cần xoá : ");
        int number = Integer.parseInt(scanner.nextLine());
        productManagerList.removeIf(productManager -> productManager.getId() == number);
        System.out.println("__________________________________");
    }
}

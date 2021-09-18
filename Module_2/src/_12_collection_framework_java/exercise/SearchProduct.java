package _12_collection_framework_java.exercise;

import _10_list_java.exercise.linkedlist.LinkedList;

import java.util.List;
import java.util.Scanner;

public class SearchProduct  {
    public void searchProduct(List<ProductManager> productManagerList) {
        System.out.println("Nhập tên sản phẩm bạn muốn tìm kiếm: ");
        Scanner scanner = new Scanner(System.in);
        String phone = scanner.nextLine();
        for (ProductManager productManager : productManagerList) {
            if (productManager.getName().equals(phone)) {
                System.out.println(productManager);
            }
        }
        System.out.println("__________________________________");
    }
}

package _12_collection_framework_java.exercise;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class AddProduct {

    public static void addProduct(List<ProductManager> productManagerList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên sản phẩm :");
        String phone = scanner.nextLine();
        System.out.println("Nhập tên hãng sản phẩm: ");
        String product = scanner.nextLine();
        System.out.println("Nhập giá sản phẩm: ");
        int price = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập ID sản phẩm : ");
        int id= Integer.parseInt(scanner.nextLine());
        productManagerList.add(new ProductManager(phone, product, price,id));
        System.out.println("__________________________________");
    }
}

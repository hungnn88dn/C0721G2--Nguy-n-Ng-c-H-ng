package _12_collection_framework_java.exercise;

import java.util.List;
import java.util.Scanner;

public class EditProduct {
    public void editProduct(List<ProductManager> productManagerList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập ID của sản phẫm cần sửa : ");
        int number = Integer.parseInt(scanner.nextLine());
        for (ProductManager productManager : productManagerList) {
            if (productManager.getId() == number) {
                System.out.println("Nhập tên sản phẩm :");
                String phone = scanner.nextLine();
                System.out.println("Nhập tên hãng sản phẩm: ");
                String product = scanner.nextLine();
                System.out.println("Nhập giá sản phẩm: ");
                int price = Integer.parseInt(scanner.nextLine());
                productManagerList.get(number).setName(phone);
                productManagerList.get(number).setNameProduct(product);
                productManagerList.get(number).setPrice(price);
            }
        }
        System.out.println("__________________________________");
    }
}

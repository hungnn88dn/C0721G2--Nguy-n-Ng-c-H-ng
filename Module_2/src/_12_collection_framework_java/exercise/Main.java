package _12_collection_framework_java.exercise;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Product> productList = new LinkedList<>();
        productList.add(new Product("Iphone6", "Apple", 7000,1));
        productList.add(new Product("SonyXZ3", "Sony", 6000,2));
        productList.add(new Product("PassPort", "Blackberry", 5000,3));
        productList.add(new Product("Mi 8", "Xiaomi", 4000,4));
        int choose;
        do {
            System.out.println("1.Thêm sản phẩm");
            System.out.println("2.Sửa thông tin sản phẩm");
            System.out.println("3.Xoá sản phẩm");
            System.out.println("4.Hiển thị danh sách sản phẩm");
            System.out.println("5.Tìm kiếm sản phẩm");
            System.out.println("6.Sắp xếp sản phẩm");
            System.out.println("0.Thoát chương trình");
            System.out.println("Nhập lựa chọn của bạn :");
            choose = Integer.parseInt(scanner.nextLine());
            if (choose == 1) {
                ProductManager.addProduct(productList);
            }
            if (choose == 2) {
               ProductManager.editProduct(productList);
            }
            if (choose == 3) {
                ProductManager.deleteProduct(productList);
            }
            if (choose == 4) {
                for (Product product : productList) {
                    System.out.println(product);
                }
                System.out.println("__________________________________");
            }
            if (choose == 5) {
                  ProductManager.searchProduct(productList);
            }
            if (choose == 6) {
                ProductManager.sortProduct(productList);
            }
        } while (choose != 0);
    }
}

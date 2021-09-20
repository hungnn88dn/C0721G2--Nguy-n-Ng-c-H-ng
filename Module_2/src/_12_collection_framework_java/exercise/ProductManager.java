package _12_collection_framework_java.exercise;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ProductManager {

    public static void addProduct(List<Product> productList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên sản phẩm :");
        String phone = scanner.nextLine();
        System.out.println("Nhập tên hãng sản phẩm: ");
        String product = scanner.nextLine();
        System.out.println("Nhập giá sản phẩm: ");
        int price = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập ID sản phẩm : ");
        int id = Integer.parseInt(scanner.nextLine());
        productList.add(new Product(phone, product, price, id));
        System.out.println("__________________________________");
    }

    public static void editProduct(List<Product> productList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập ID của sản phẫm cần sửa : ");
        int number = Integer.parseInt(scanner.nextLine());
        for (Product productManager : productList) {
            if (productManager.getId() == number) {
                System.out.println("Nhập tên sản phẩm :");
                String phone = scanner.nextLine();
                System.out.println("Nhập tên hãng sản phẩm: ");
                String product = scanner.nextLine();
                System.out.println("Nhập giá sản phẩm: ");
                int price = Integer.parseInt(scanner.nextLine());
                productList.get(number).setName(phone);
                productList.get(number).setNameProduct(product);
                productList.get(number).setPrice(price);
            }
        }
        System.out.println("__________________________________");
    }

    public static void deleteProduct(List<Product> productList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập ID của sản phẫm cần xoá : ");
        int number = Integer.parseInt(scanner.nextLine());
        productList.removeIf(productManager -> productManager.getId() == number);
        System.out.println("__________________________________");
    }

    public static void searchProduct(List<Product> productList) {
        System.out.println("Nhập tên sản phẩm bạn muốn tìm kiếm: ");
        Scanner scanner = new Scanner(System.in);
        String phone = scanner.nextLine();
        for (Product product : productList) {
            if (product.getName().equals(phone)) {
                System.out.println(product);
            }
        }
        System.out.println("__________________________________");
    }

    public static void sortProduct(List<Product> productList) {
        Scanner scanner = new Scanner(System.in);
        int chooseSort;
        do {
            System.out.println("1. Sap xep theo giá tăng dần");
            System.out.println("2. Sap xep theo giá giảm dần");
            System.out.println("0. Ket thuc");
            System.out.println("Nhập lựa chọn của bạn: ");
            chooseSort = scanner.nextInt();
            if (chooseSort == 1) {
                Collections.sort(productList, new SortPriceProductUp());
            } else if (chooseSort == 2) {
                Collections.sort(productList, new SortPriceProductDown());
            }
            for (Product product : productList) {
                System.out.println(product);
            }
        } while (chooseSort != 0);
    }
}

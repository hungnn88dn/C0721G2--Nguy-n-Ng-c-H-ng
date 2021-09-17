package _12_collection_framework_java.exercise;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<ProductManager> productManagerList = new LinkedList<>();
        productManagerList.add(new ProductManager("Iphone6", "Apple", 7000));
        productManagerList.add(new ProductManager("SonyXZ3", "Sony", 6000));
        productManagerList.add(new ProductManager("PassPort", "Blackberry", 5000));
        productManagerList.add(new ProductManager("Mi 8", "Xiaomi", 4000));
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
                System.out.println("Nhập tên sản phẩm :");
                String phone = scanner.nextLine();
                System.out.println("Nhập tên hãng sản phẩm: ");
                String product = scanner.nextLine();
                System.out.println("Nhập giá sản phẩm: ");
                int price = Integer.parseInt(scanner.nextLine());
                productManagerList.add(new ProductManager(phone, product, price));
                System.out.println("__________________________________");
            }
            if (choose == 2) {
                System.out.println("Nhập vị trí của sản phẫm cần sửa : ");
                int number = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhập tên sản phẩm :");
                String phone = scanner.nextLine();
                System.out.println("Nhập tên hãng sản phẩm: ");
                String product = scanner.nextLine();
                System.out.println("Nhập giá sản phẩm: ");
                int price = Integer.parseInt(scanner.nextLine());
                productManagerList.get(number).setName(phone);
                productManagerList.get(number).setNameProduct(product);
                productManagerList.get(number).setPrice(price);
                System.out.println("__________________________________");
            }
            if (choose == 3) {
                System.out.println("Nhập vị trí của sản phẫm xoá: ");
                int number = Integer.parseInt(scanner.nextLine());
                if (number > productManagerList.size()) {
                    System.out.println("Vị trí bạn chọn đang trống");
                } else {
                    productManagerList.remove(number);
                    System.out.println("Đã xoá " + productManagerList.get(number).getName());
                }
                System.out.println("__________________________________");
            }
            if (choose == 4) {
                for (ProductManager productManager : productManagerList) {
                    System.out.println(productManager);
                }
                System.out.println("__________________________________");
            }
            if (choose == 5) {
                System.out.println("Nhập tên sản phẩm bạn muốn tìm kiếm: ");
                String phone = scanner.nextLine();
                for (ProductManager productManager : productManagerList) {
                    if (productManager.getName().equals(phone)) {
                        System.out.println(productManager);
                    }
                }
                System.out.println("__________________________________");
            }
            if (choose == 6) {
                do {
                    System.out.println("1. Sap xep theo giá tăng dần");
                    System.out.println("2. Sap xep theo giá giảm dần");
                    System.out.println("0. Ket thuc");
                    choose = scanner.nextInt();
                    if (choose == 1) {
                        Collections.sort(productManagerList, new SortPriceProductUp());
                    } else if (choose == 2) {
                        Collections.sort(productManagerList, new SortPriceProductDown());
                    }
                    for (ProductManager productManager : productManagerList) {
                        System.out.println(productManager);
                    }
                } while (choose != 0);
            }
        } while (choose != 0);
    }
}

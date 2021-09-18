package _12_collection_framework_java.exercise;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<ProductManager> productManagerList = new LinkedList<>();
        productManagerList.add(new ProductManager("Iphone6", "Apple", 7000,1));
        productManagerList.add(new ProductManager("SonyXZ3", "Sony", 6000,2));
        productManagerList.add(new ProductManager("PassPort", "Blackberry", 5000,3));
        productManagerList.add(new ProductManager("Mi 8", "Xiaomi", 4000,4));
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
                AddProduct.addProduct(productManagerList);
            }
            if (choose == 2) {
               EditProduct.editProduct(productManagerList);
            }
            if (choose == 3) {
                DeleteProduct.deleteProduct(productManagerList);
            }
            if (choose == 4) {
                for (ProductManager productManager : productManagerList) {
                    System.out.println(productManager);
                }
                System.out.println("__________________________________");
            }
            if (choose == 5) {
                  SearchProduct.searchProduct(productManagerList);
            }
            if (choose == 6) {
                SortProduct.sortProduct(productManagerList);
            }
        } while (choose != 0);
    }
}

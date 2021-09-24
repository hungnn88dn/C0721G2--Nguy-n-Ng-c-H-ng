package _17_binaryfile_serialization_java.exercise;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner= new Scanner(System.in);
        List<Product> productList= new ArrayList<>();
        int choose;
        do {
            System.out.println("1.Add Product: ");
            System.out.println("2.Show All Product: ");
            System.out.println("3.Search Product: ");
            System.out.println("0.Exit ");
            System.out.println("Your chosse: ");
            choose= scanner.nextInt();
            if(choose ==1) {
                ProductManager.addProduct(productList);
            }
            if(choose == 2) {
                ProductManager.showProduct();
            }
            if ( choose ==3) {
                ProductManager.searchProduct();
            }
        }while(choose != 0);

    }

}

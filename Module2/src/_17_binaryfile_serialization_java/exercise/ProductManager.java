package _17_binaryfile_serialization_java.exercise;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManager {

    public static void writeObjectProduct(List<Product> productList) throws IOException {
        File file = new File("src\\_17_binaryfile_serialization_java\\exercise\\product.csv");
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutput = new ObjectOutputStream(fileOutputStream);
            objectOutput.writeObject(productList);
            fileOutputStream.close();
            objectOutput.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<Product> readProductFile() {
        File file = new File("src\\_17_binaryfile_serialization_java\\exercise\\product.csv");
        ArrayList<Product> listProduct = new ArrayList<>();
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            ObjectInputStream objectInput = new ObjectInputStream(fileInputStream);
            listProduct = (ArrayList<Product>) objectInput.readObject();
            objectInput.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return listProduct;
    }

    public static void addProduct(List<Product> list) throws IOException {
        try {
            File file = new File("src\\_17_binaryfile_serialization_java\\exercise\\product.csv");
            Scanner scanner = new Scanner(System.in);
            System.out.println("input ID: ");
            int id = Integer.parseInt(scanner.nextLine());
            System.out.println("input name: ");
            String name = scanner.nextLine();
            System.out.println("input brand: ");
            String brand = scanner.nextLine();
            System.out.println("input price: ");
            int price = Integer.parseInt(scanner.nextLine());
            if (file.length() > 0) {
                list = readProductFile();
            }
            list.add(new Product(id, name, brand, price));
            ProductManager.writeObjectProduct(list);
        } catch (NumberFormatException e) {
            System.out.println("wrong input");
        }
    }

    public static void showProduct() {
        List<Product> list = readProductFile();
        for (Product l : list) {
            System.out.println(l);
        }
    }

    public static void searchProduct() {
        try {
            Scanner scanner = new Scanner(System.in);
            List<Product> list = readProductFile();
            System.out.println("input ID product: ");
            int id = Integer.parseInt(scanner.nextLine());
            for (Product product : list) {
                if (product.getIdProduct() == id) {
                    System.out.println(product);
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("wrong input");
        }

    }
}

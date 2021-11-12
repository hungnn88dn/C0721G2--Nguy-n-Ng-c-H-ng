package bai_tap;


import javafx.scene.shape.QuadCurve;

import java.util.Scanner;

public class Test {

   static Scanner scanner= new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Nhập hệ số bậc 2, a = ");
        float a = scanner.nextFloat();
        System.out.print("Nhập hệ số bậc 1, b = ");
        float b = scanner.nextFloat();
        System.out.print("Nhập hằng số tự do, c = ");
        float c = scanner.nextFloat();
        Quadratic.quadratic(a, b, c);
    }

}

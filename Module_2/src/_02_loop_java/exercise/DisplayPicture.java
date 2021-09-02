package _02_loop_java.exercise;

public class DisplayPicture {
    public static void main(String[] args) {

        ;
        for (int i = 0; i < 3; i ++) {
            for (int j=0; j < 7; j ++) {
                System.out.print(" *");
            }
            System.out.print("\n");
        }

        System.out.print("\n");

        for (int i = 0; i < 5; i++) {
            for (int j=0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }

        System.out.print("\n");

        for (int i = 0; i < 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }

        System.out.print("\n");

        for (int i = 0; i < 5; i++) {
            for (int k = 5; k > i; k--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }

    }
}

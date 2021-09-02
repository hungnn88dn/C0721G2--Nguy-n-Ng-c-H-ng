package _02_loop_java.exercise;

public class PrimeNumber100 {
    public static void main(String[] args) {

        for (int number= 0; number < 100; number++) {
            boolean flag = true;
            if (number < 2) {
                flag = false;
            }
            for (int i = 2; i < number; i++) {
                if ((number%i) == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.print(number + " ");
            }
        }
    }
}

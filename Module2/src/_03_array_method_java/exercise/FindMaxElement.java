package _03_array_method_java.exercise;

public class FindMaxElement {
    public static void main(String[] args) {
        int[][] array = {
                {1, 11, 3, 5},
                {3, 19, 21, 4, 7}
        };
        int max = array[0][0];
        for (int i = 0; i < array.length ; i++) {
            for (int j=0; j < array[i].length; j++) {
                if ( max < array[i][j]){
                    max = array[i][j];
                }
            }
        }
        System.out.println("Phần tử có giá trị lớn nhất là " + max);
    }
}
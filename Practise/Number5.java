package practiseSAA;

import java.util.Scanner;

public class Number5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Въведете елементите на двумерен масив. Изчислете сумата на елементите му намиращи се на главния диагонал


        int I = Integer.parseInt(sc.nextLine());
        int J = Integer.parseInt(sc.nextLine());
        int[][] array = new int[I][J];

        int sum = 0;

        for (int i = 0; i < I; i++) {
            for (int j = 0; j < J; j++) {
                array[i][j] = Integer.parseInt(sc.nextLine());
            }
        }


        for (int i = 0; i < I; i++) {
            for (int j = 0; j < J; j++) {
                if (i == j) {
                    sum += array[i][j];
                }
            }
        }

        System.out.println(sum);






    }
}

package practiseSAA;

import java.util.Scanner;

public class Number6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Въведете елементите на двумерен масив. Изчислете сумата на елементите му по редове
        int I = Integer.parseInt(sc.nextLine());
        int J = Integer.parseInt(sc.nextLine());
        int[][] array = new int[I][J];
        int[] rows = new int[I];


        for (int i = 0; i < I; i++) {
            for (int j = 0; j < J; j++) {
                array[i][j] = Integer.parseInt(sc.nextLine());
            }
        }

        for (int i = 0; i < I; i++) {
            int sum = 0;
            for (int j = 0; j < J; j++) {
                sum += array[i][j];
            }
            rows[i] = sum;
        }

        for (int n = 0; n < rows.length; n++) {
            System.out.println(rows[n]);
        }








    }
}

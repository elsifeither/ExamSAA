package practiseSAA;

import java.util.Scanner;

public class Number8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Въведете елементите на двумерен масив.
        //Създайте едномерен масивс елементи елементите на двумерния масив намиращи се в интервала [x, y].

        int x = Integer.parseInt(sc.nextLine());
        int y = Integer.parseInt(sc.nextLine());


        int I = Integer.parseInt(sc.nextLine());
        int J = Integer.parseInt(sc.nextLine());
        int[][] array = new int[I][J];
        int[] array2 = new int[20];

        for (int i = 0; i < I; i++) {
            for (int j = 0; j < J; j++) {
                array[i][j] = Integer.parseInt(sc.nextLine());
            }
        }

        int k = 0;
        for (int i = 0; i < I; i++) {
            for (int j = 0; j < J; j++) {
                if (array[i][j] >= x && array[i][j] <= y) {
                    array2[k] = array[i][j];
                    k++;
                }
            }
        }

        for (int i = 0; i < k; i++) {
            System.out.println(array2[i]);
        }


    }
}

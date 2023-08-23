package practiseSAA;

import java.util.Scanner;

public class Number7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Въведете елементите на двумерен масив.
        // Създайте едномерен масив с елементи елементите  на двумерния масив намиращие се над главния му диагонал

        int I = Integer.parseInt(sc.nextLine());
        int J = Integer.parseInt(sc.nextLine());
        int [][] array = new int[I][J];
        int [] diagonal = new int[30];


        for (int i = 0; i < I; i++) {
            for (int j = 0; j < J; j++) {
                array[i][j] = Integer.parseInt(sc.nextLine());
            }
        }



        int k = 0;
        for (int i = 0; i < I; i++) {
            for (int j = 0; j < J; j++) {
                if (i < j) {
                    diagonal[k] = array[i][j];
                    k++;
                }
            }
        }


        System.out.println();
        System.out.println();
        for (int i = 0; i < k; i++) {
            System.out.println(diagonal[i]);
        }


    }


}

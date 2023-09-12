package practiseSAA;

import java.util.Scanner;

public class Number10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


//        Даден е двумерен масив А с n реда.
//        Запишете стойностите от двата диагонала на двумерния масив в едномерен масив В.
//        Сортирайте В в друг едномерен масив С в низходящ ред


        int I = Integer.parseInt(sc.nextLine());
        int J = Integer.parseInt(sc.nextLine());
        int[][] arr = new int[I][J];

        for (int i = 0; i < I; i++) {
            for (int j = 0; j < J; j++) {
                arr[i][j] = Integer.parseInt(sc.nextLine());
            }
        }

        System.out.println();

        int count = 0;



        for (int i = 0; i < I; i++) {
            for (int j = 0; j < J; j++) {
                if(i == j) {
                    count++;
                }
                if (i+j == arr.length-1) {
                    count++;
                }
            }
        }

        System.out.println(count);
        System.out.println();
        int arrB [] = new int [count];


        int k =0;
        for (int i = 0; i < I; i++) {
            for (int j = 0; j < J; j++) {
                if (i == j) {
                    arrB[k] = arr[i][j];
                    k++;
                }
                if (i+j == arr.length-1) {
                    arrB[k] = arr[i][j];
                    k++;
                }
            }
        }

        for (int i : arrB) {
            System.out.println(i);
        }
        System.out.println();


        int arrC [] = new int[count];
        for (int i = 0; i < arrB.length; i++) {
            arrC[i] = arrB[i];
        }

        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count - i - 1; j++) {
                if (arrC[j] < arrC[j + 1]) {
                    int tmp = arrC[j];
                    arrC[j] = arrC[j + 1];
                    arrC[j + 1] = tmp;
                }
            }
        }



        for (int i : arrC) {
            System.out.println(i);
        }


    }
}

package practiseSAA;

import java.util.Scanner;

public class Number4 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int I = Integer.parseInt(sc.nextLine());
            int J = Integer.parseInt(sc.nextLine());
            int[][] arr = new int[I][J];

            for (int i = 0; i < I; i++) {
                for (int j = 0; j < J; j++) {
                    arr[i][j] = Integer.parseInt(sc.nextLine());
                }
            }

            System.out.println();

            for (int i = 0; i < I; i++) {
                for (int j = 0; j < J; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }
    }







package practiseSAA;

import java.util.Scanner;

public class Number11 {
    public static void main(String[] args) {

//        Имаш два масива А и Б и трябва да вземеш елементите,
//        които имат еднакви индекси и различни стойности и да ги запишеш в масив С.
//        След това на двойките съседни елементи да им намериш най големия общ делител и
//        този делител да го запишеш в четвърти масив.
        Scanner sc = new Scanner(System.in);

        int arrA[] = new int[] {1,2,3,4};
        int arrB[] = new int[] {5,6,7,8};




        int count = 0;
        for (int i = 0; i < arrA.length; i++) {
            if (arrA[i] != arrB[i]) {
                count += 2;
            }
        }
        int arrC[] = new int[count];


        int position =0;
        for (int i = 0; i < arrA.length; i++) {
            if (arrA[i] != arrB[i]) {
                arrC[position++] = arrA[i];
                arrC[position++] = arrB[i];
            }
        }


        int arrD[] = new int[count/2];
        int helper = 0;
        for (int i = 0; i < arrD.length; i++) {
            arrD[i]= gcd(arrC[helper],arrC[helper+1]);
            helper += 2;
        }

        for (int i : arrD) {
            System.out.println(i);
        }


    }


    static int gcd(int a, int b) {
        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }

        return a;
    }
}






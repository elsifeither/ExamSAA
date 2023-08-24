package practiseSAA;

import java.util.Scanner;

public class Number9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Проектирайте рекурсивна функция преобразуваща цяло десетично число в двоично

        int n = Integer.parseInt(sc.nextLine());
        dec_byn(n);


    }

    static void dec_byn (int n) {

        if (n > 0) {
            dec_byn(n/2);
            n %= 2;
            System.out.print(n);
        }
    }




}

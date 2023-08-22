package practiseSAA;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Number2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float a, b, c, p, s;
        a = Float.parseFloat(sc.nextLine());
        b = Float.parseFloat(sc.nextLine());
        c = Float.parseFloat(sc.nextLine());


        p = (a + b + c) / 2;
        s = (float) sqrt(p * (p - a)*(p - b)*(p - c));

        System.out.println(s);


    }
}

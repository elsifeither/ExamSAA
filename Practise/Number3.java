package practiseSAA;

import java.util.Scanner;

public class Number3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Въведете елементите на едномерен масив. Изведете броя на четните от тях


        int []numbers = {5,6,8,10,15,12,16,17};
        int count = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]%2 == 0) {
                count++;
            }
        }

        System.out.println(count);



    }
}

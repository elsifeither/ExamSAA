package practiseSAA;

import java.util.Scanner;

public class number1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Въведете елементите на едномерен масив. Изведете максималният от тях


        int numbers[] = {3,13,4,99,-5};
        int maxNumber = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (maxNumber < numbers[i]) {
                maxNumber = numbers[i];
            }
        }
        System.out.println(maxNumber);


    }
}

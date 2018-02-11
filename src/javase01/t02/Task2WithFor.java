package javase01.t02;

import java.util.Scanner;

/**
 * Created by Екатерина on 07.02.2018.
 */
public class Task2WithFor {
    //Найти наименьший номер элемента последовательности,
    // для которого выполняется условие M
    // Вывести на экран этот номер и все элементы ai  где i = 1, 2, ..., п.
    public static void main(String[] args) {
        double a = 1;
        double e = 0.1;
        int n = 0;


        System.out.println("a_n = 1/(n+1)^2");
        System.out.println("Condition:");
        System.out.println("a_n < e ");
        System.out.print("Please specify e > 0 (example: 0,001): ");
        Scanner in = new Scanner(System.in);
      //  while (in.hasNext()){
        if(in.hasNextDouble()){
            e = in.nextDouble();
        }
        System.out.println("a_n < " + e);

        System.out.println("Let`s find n");
        System.out.println();

        for (int i = 1; !(a < e); i++) {
            a = 1/(((double)i+1)*((double) i+1));
            n = i;
            System.out.println("a min = " + a + " as i = " + i);
        }
        System.out.println("result:");
        System.out.println("i = " + n);

    }
}

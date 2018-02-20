package homework.javase01.t05;

import java.util.Scanner;

/**
 * Created by Екатерина on 08.02.2018.
 */
public class TwoDimensionalArray {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of array");
        int x = in.nextInt();//количество строк и столбцов
        int [] [] tda = new int[x][x];

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                if (i == j || i == x - 1 - j)
                    tda[i][j] = 1;

              //  else { tda[i][j] = 0; } unnecessary for int = 0

                System.out.print(tda[i][j] + " ");
            }
            System.out.println();
        }
    }

}

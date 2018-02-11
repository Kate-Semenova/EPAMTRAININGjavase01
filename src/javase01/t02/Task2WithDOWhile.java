package javase01.t02;

/**
 * Created by Екатерина on 07.02.2018.
 */
public class Task2WithDOWhile {
    //Найти наименьший номер элемента последовательности,
    // для которого выполняется условие M
    // Вывести на экран этот номер и все элементы ai  где i = 1, 2, ..., п.

    public static void main(String[] args) {
        double a;
        double e = 0.0027; //M < e
        int i = 0;

        System.out.println("a_n = 1/(n+1)^2");
        System.out.println("Condition:");
        System.out.println("a_n < " + e);
        System.out.println("Let`s find n");
        System.out.println();
        do{
            i++;
            a = 1/(((double)i+1)*((double) i+1));
            System.out.println("a min = " + a + " as i = " + i);
        }
        while (a >= e);
        System.out.println();
        System.out.println("result:");
        System.out.println("i = " + i);
    }
}

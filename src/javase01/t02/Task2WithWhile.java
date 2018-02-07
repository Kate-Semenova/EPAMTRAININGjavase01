package javase01.t02;

/**
 * Created by Екатерина on 07.02.2018.
 */
public class Task2WithWhile {
    public static void main(String[] args) {
        double a = 1;
        double e = 0.01;
        int i = 0;

        System.out.println("a_n = 1/(n+1)^2");
        System.out.println("Uslovie:");
        System.out.println("a_n < " + e);
        System.out.println("Let`s find n");
        System.out.println();

        while (a >= e){
            i++;
            a = 1/(((double)i+1)*((double) i+1));
            System.out.println("a min = " + a + " as i = " + i);
        }
        System.out.println();
        System.out.println("result:");
        System.out.println("a min = " + a + " as i = " + i);
    }
}

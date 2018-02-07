package javase01.t02;

/**
 * Created by Екатерина on 07.02.2018.
 */
public class Task2WithWhile {
    public static void main(String[] args) {
        double a = 1;
        double e = 0.01;
        int i = 0;
        while (a >= e){
            i++;
            a = 1/(((double)i+1)*((double) i+1));
        }
        System.out.println("result:");
        System.out.println("a min = " + a + " as i = " + i);
    }
}

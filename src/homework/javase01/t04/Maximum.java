package homework.javase01.t04;

/**
 * Created by Екатерина on 07.02.2018.
 */
public class Maximum {
    public static void main(String[] args) {
       // Даны действительные числа a1, a2 … an.  Найти   максимальное из (a1 + a2n) , (a2+ a2n-1)
        double sqrt = Math.sqrt(2), pi = Math.PI;
        double [] d = {1.0, -1.5, 1.0, 1.0, -3.3, 2.2, 10, 1, sqrt, pi, 6, 4 }; //действительные числа
        int length = d.length;
        double [] res = new double[length / 2];
        System.out.print("[");
        for (int i = 0; i < length/2; i++){
            res[i] = d[i] + d[length-1-i];

            System.out.print(res[i]);
            if (i < length / 2 - 1) System.out.print(", "); //для нормального вывода в консоли
        }
        System.out.println("]");
        System.out.println(maxFromArray(res));

        }
    static double maxFromArray(double[] a){

        double max = a[0];
        for (int i = 0; i < a.length; i++) {
            if(a[i] < max) {}
            else max = a[i];
        }
        return max;
    }
}

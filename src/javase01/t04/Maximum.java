package javase01.t04;

/**
 * Created by Екатерина on 07.02.2018.
 */
public class Maximum {
    public static void main(String[] args) {
       // Даны действительные числа a1, a2 … an.  Найти   максимальное из (a1 + a2n) , (a2+)
        double [] d = {1.0, 1.5, 1.0, 1.0};
        int length = d.length;
        double [] res = new double[length];
        for (int i = 0; i < length/2; i++){
            res[i] = d[i] + d[length-1-i];

        }
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

package javase01.t04;

/**
 * Created by Екатерина on 11.02.2018.
 */
public class MaximumWITHOUTnewArray {
    public static void main(String[] args) {
        // Даны действительные числа a1, a2 … an.  Найти   максимальное из (a1 + a2n) , (a2+ a2n-1)
        double sqrt = Math.sqrt(2), pi = Math.PI;
        double [] d = {1.0, -1.5, 1.0, 1.0, -3.3, 2.2, 10, 1, sqrt, pi, 6, 4, 5, 4 }; //действительные числа
        int length = d.length;
        double max = d[0]+d[length-1];
        for (int i = 0; i < length/2; i++){
            System.out.print(d[i] + d[length-1-i] + " ");
            if(max <= d[i] + d[length-1-i]){
                max = d[i] + d[length-1-i];
            }
        }
        System.out.println();
        System.out.println("max = " + max);
    }
}

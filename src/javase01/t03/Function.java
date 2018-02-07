package javase01.t03;

/**
 * Created by Екатерина on 07.02.2018.
 */
public class Function {
    //Составить программу для вычисления значений функции F(x)
    // на отрезке [а, b] с шагом h.
    // Результат представить в виде таблицы,
    // первый столбец которой – значения аргумента,
    // второй - соответствующие значения функции:
    //F(x)=tg(2x)-3
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        double h = 0.5;
        double f;
        for (double x = a; x <= b; x = x + h ) {
            f = Math.tan(2 * x) - 3;
            System.out.println("f(x) = " + f + ", when x = " + x);
        }
    }
}

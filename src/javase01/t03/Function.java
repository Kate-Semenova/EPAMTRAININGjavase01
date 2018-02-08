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
        int a = -10;
        int b = 10;
        double h = 0.5; //шаг
        double f;
        for (double x = a; x <= b; x = x + h ) {
            f = Math.tan(2 * x) - 3;
            if (Math.round(f)==f) System.out.print("f(x) = ");
            else System.out.print("f(x) ~ ");
            System.out.println((double) Math.round(f*100)/100 + ", when x = " + x); //округление до сотых

        }
    }
}

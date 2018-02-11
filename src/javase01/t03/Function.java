package javase01.t03;

import java.util.Scanner;

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

        System.out.println("Let`s find all values F(x)=tg(2x)-3");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the beginning(example -10): ");
        double a = in.nextDouble();

        System.out.print("Enter the end(example 10): ");
        double b = in.nextDouble();

        System.out.print("Enter the step(example 0,5): ");
        double h = in.nextDouble(); //шаг
        double f;
        if (a > b){ //Проверка на отрицательный шаг.
            double c = a;
            a = b;
            b = c;
            }
        //Или можно было не создавать новую переменную, а написать еще один цикл for для уловия (a > b)
        for (double x = a; x <= b; x = x + h ) {
            f = Math.tan(2 * x) - 3;
            if (Math.round(f)==f) {
                System.out.print("f(x) = ");
            }
            else {
                System.out.print("f(x) ~ ");
            }
            System.out.println((double) Math.round(f*100)/100 + ", when x = " + x); //округление до сотых
        }
    }
}

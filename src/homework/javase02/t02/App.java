package homework.javase02.t02;

import homework.javase02.t01.Pen;

/**
 * Created by Ekaterina Semenova on 26.02.2018.
 */
public class App {
    public static void main(String[] args) {
        Employee employee1 = new Employee("John", "Snow");
        employee1.addPen(new Pen("red", "bic", 10));
        System.out.println(employee1.costOfAllPens());
        employee1.addPen(new Pen("red", "bic", 10));
        employee1.addPen(new Pen("red", "bic", 10));
        employee1.addPen(new Pen("red", "bic", 10));
        employee1.addPen(new Pen("red", "bic", 10));
        System.out.println(employee1.costOfAllPens());
        employee1.removePen(new Pen("red", "bic", 10));
        System.out.println(employee1.costOfAllPens());

    }
}

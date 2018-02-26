package homework.javase02.t02;

import homework.javase02.t01.Pen;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ekaterina Semenova on 21.02.2018.
 */
public class Employee {
/*Напишите приложение, позволяющее вести учет канцелярских товаров на рабочем месте сотрудника.
Определите полную стоимость канцтоваров у определенного сотрудника.
*/

    private String name;
    private String surname;
    private List<Pen> pens = new ArrayList<>();

    public Employee(String name, String surname){
        this.name = name;
        this.surname = surname;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public boolean addPen(Pen pen){
        try{
            pens.add(pen);
            return true;
        } catch (NullPointerException e){
            return false;
        }
    }

    public boolean hasPen(Pen pen){
        return pens.contains(pen);
    }

    public void removePen(Pen pen){
       if( this.hasPen(pen)){
           pens.remove(pen);
       } else {
           System.out.println("There is no such a pen");
       }
    }

    public double costOfAllPens(){
        double prise = 0;
        for (Pen pen:pens) {
            prise += pen.getPrise();
        }
        return prise;
    }
}

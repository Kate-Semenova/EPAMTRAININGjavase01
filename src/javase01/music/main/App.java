package javase01.music.main;

import javase01.music.types.Stringed;
import javase01.music.Instrument;

/**
 * Created by Екатерина on 12.02.2018.
 */
public class App {
    public static void main(String[] args) {
        //Создадим инструмент класса Stringed
        Instrument stringed = new Stringed();//Конструктор по умолчанию
        //Посмотрим какие параметры у этого инструмента:
        System.out.println(stringed.getMin());//нет нижней ноты

    }

}

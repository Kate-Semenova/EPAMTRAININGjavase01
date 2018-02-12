package javase01.music;

import javase01.music.Instrument;
import javase01.music.Stringed;

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

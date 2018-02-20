package homework.javase01.music.main;

import homework.javase01.music.instruments.Stringed;
import homework.javase01.music.instruments.DefiniteNoteInstrument;
import homework.javase01.music.instruments.pieces.Vibraphone;

/**
 * Created by Екатерина on 12.02.2018.
 */
public class App {
    public static void main(String[] args) {
        //Создадим инструмент класса Stringed
        DefiniteNoteInstrument stringed = new Stringed();//Конструктор по умолчанию
        //Посмотрим какие параметры у этого инструмента:
        System.out.println(stringed.getMin());//нет нижней ноты

        Vibraphone v = new Vibraphone();

        v.setMin("H");
        System.out.println(v.getMin());
        v.play();

        System.out.println(95 / 12);
        System.out.println(2.3 * 16 / 12);
        System.out.println(2.3 * (16/12));




    }

}

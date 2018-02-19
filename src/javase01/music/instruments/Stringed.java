package javase01.music.instruments;

/**
 * Created by Екатерина on 12.02.2018.
 */

import javase01.music.note.AllNotes;

/**
 * Класс стунных инструментов
 * @author Semenova Ekaterina
 */
public class Stringed extends DefiniteNoteInstrument {


    /**
     *
     */
    private int numberOfStrings;
    /**
     *
     */
    private AllNotes[] tunings;// C D E F G A H

    {
      //  setType("stringed");
    }

    /**
     * Конструктор
     */
    public Stringed() {
        setName("none");
        numberOfStrings = 0;
        tunings = null;

    }

    /**
     * @param s Название инструмента
     */
    Stringed(String s) {
        setName(s);
        switch (s.toLowerCase()) {
            case "classicguitar": {

                numberOfStrings = 6;
                tunings = new AllNotes[numberOfStrings];
                tunings[0] = new AllNotes("E", -1);
                tunings[1] = new AllNotes("B", -1);
                tunings[2] = new AllNotes("G", 0);
                tunings[3] = new AllNotes("D", 1);
                tunings[4] = new AllNotes("A", 1);
                tunings[5] = new AllNotes("E", 2);
                setRange(4);
                setMin(tunings[5]);
                setMax(new AllNotes("D", 3));
                break;
            }

            case "violin": {
                numberOfStrings = 4;
                tunings = new AllNotes[numberOfStrings];
                setMin(new AllNotes("G", 0));
                setMax(new AllNotes("C", 4));
//                tunings[0] = 'E';
//                tunings[1] = 'A';
//                tunings[2] = 'D';
//                tunings[3] = 'G';
                setRange(4);
                break;
            }

            case "ukulele": {
                numberOfStrings = 4;
//                tunings = new char[numberOfStrings];
//                tunings[0] = 'A';
//                tunings[1] = 'E';
//                tunings[2] = 'C';
//                tunings[3] = 'G';
//                setMin('C');
//                setMax('E');
                break;
            }
            default: {
                numberOfStrings = 0;
            }
        }
    }

    /**
     * @return Число струн
     */
    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    /**
     * @param numberOfStrings Число струн
     */
    public void setNumberOfStrings(int numberOfStrings){
        this.numberOfStrings = numberOfStrings;
    }


    @Override
    public void play() {
        System.out.println("blink");
    }
}

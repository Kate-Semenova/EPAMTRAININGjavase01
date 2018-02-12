package javase01.music;

/**
 * Created by Екатерина on 12.02.2018.
 */

/**
 * Класс стунных инструментов
 * @author Semenova Ekaterina
 */
public class Stringed extends Instrument {


    /**
     *
     */
    private int numberOfStrings;
    /**
     *
     */
    private char[] tunings;// C D E F G A H

    {
        setType("stringed");
    }

    /**
     * Конструктор
     */
    Stringed() {
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
                tunings = new char[numberOfStrings];
                tunings[0] = 'E';
                tunings[1] = 'B';
                tunings[2] = 'G';
                tunings[3] = 'D';
                tunings[4] = 'A';
                tunings[5] = 'E';
                setRange(4);
                setMin('E');
                setMax('D');
                break;
            }

            case "violin": {
                numberOfStrings = 4;
                tunings = new char[numberOfStrings];
                setMin('G');
                setMax('A');
                tunings[0] = 'E';
                tunings[1] = 'A';
                tunings[2] = 'D';
                tunings[3] = 'G';
                setRange(3);
                break;
            }

            case "ukulele": {
                numberOfStrings = 4;
                tunings = new char[numberOfStrings];
                tunings[0] = 'A';
                tunings[1] = 'E';
                tunings[2] = 'C';
                tunings[3] = 'G';
                setMin('C');
                setMax('E');
                break;
            }
            default: {
                numberOfStrings = 0;
                tunings = null;
                break;
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
    void makeNoise() {
        System.out.println("blink");
    }



}

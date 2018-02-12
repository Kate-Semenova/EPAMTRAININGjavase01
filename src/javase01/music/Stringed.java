package javase01.music;

/**
 * Created by Екатерина on 12.02.2018.
 */
public class Stringed extends Instrument{


    private int numberOfStrings;
    private char [] tunings;// C D E F G A H
    {
        super.type = "stringed";
    }
    /**
     * Конструктор
     */
    Stringed(){
        super.name = "none";
        numberOfStrings = 0;
        tunings = null;

    }
    Stringed(String s){

        super.name = s;
        switch (s){
            case "classicGuitar":
            {

                numberOfStrings = 6;
                char [] c = new char[numberOfStrings];
                tunings = c;
                tunings[0] = 'E';
                tunings[1] = 'B';
                tunings[2] = 'G';
                tunings[3] = 'D';
                tunings[4] = 'A';
                tunings[5] = 'E';
                range = 4;
                min = 'E';
                max = 'D';

            }

            case "violin":
            {
                numberOfStrings = 4;
            }

            case "ukulele":
            {
                numberOfStrings = 4;

            }
        }
    }

    @Override
    void makeNoise() {
        System.out.println("blink");
    }

}

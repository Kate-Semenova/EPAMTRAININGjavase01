package javase01.music;

/**
 * Created by Екатерина on 12.02.2018.
 */
public class App {
    public static void main(String[] args) {


        Instrument ii = new Wind();
        ii.makeNoise();

        Wind w = new Wind();
        w.makeNoise();

        Stringed guitar = new Stringed();
        //присвоить кол струн
        //
        System.out.println(guitar.range);
        System.out.print("guitar says ");
        guitar.makeNoise();

        Instrument instrument = new Stringed("classicGuitar");

        System.out.println(instrument.name);

        instrument.makeNoise('D');
    }

}

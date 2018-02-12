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
        //System.out.println(guitar.range);
        System.out.print("guitar says ");
        guitar.makeNoise();

        Instrument instrument = new Stringed("classicGuitar");

        //System.out.println(instrument.name);

        instrument.makeNoise('D');
        System.out.println();
        System.out.println(instrument.getClass());
        Stringed www = (Stringed)instrument;
        System.out.println();
       // System.out.println(www.name);

        System.out.println(www.getNumberOfStrings());
        System.out.println(        );
        System.out.println(www.getType());
        System.out.println(www.getMax());
        ((Instrument)www).setMax('F');
        System.out.println((www).getMax());
        System.out.println();
        System.out.println(instrument.getMin());
        instrument.setMin('G');
        System.out.println(instrument.getMin());
        System.out.println(www.getMin());


        Stringed violin = new Stringed("violin");
        System.out.println(violin.getMin());
        violin.setMin('0');
        System.out.println(violin.getMin());

        Stringed uku = new Stringed("ukulele");
        System.out.println(uku.getRange());
        System.out.println(w.getMaterial());
    }

}

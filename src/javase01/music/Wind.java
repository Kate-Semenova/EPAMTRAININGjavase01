package javase01.music;

/**
 * Created by Екатерина on 12.02.2018.
 */
public class Wind extends Instrument {

    {
        type = "wind";
    }
    boolean material; //0-wood, 1-brass

    @Override
    void makeNoise() {
        System.out.println("Tuuuu");
    }


}

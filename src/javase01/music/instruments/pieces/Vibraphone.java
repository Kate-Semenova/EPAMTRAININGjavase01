package javase01.music.instruments.pieces;

import javase01.music.instruments.DefiniteNoteInstrument;
import javase01.music.instruments.Percussion;

/**
 * Created by Екатерина on 14.02.2018.
 */
public class Vibraphone extends DefiniteNoteInstrument implements Percussion {

    @Override
    public void getMethodOfSoundProduction() {

    }

    @Override
    public void setMethodOfSoundProduction(String str) {

    }

    @Override
    public void play() {
        System.out.println("Bam-bam-bom");
    }
}

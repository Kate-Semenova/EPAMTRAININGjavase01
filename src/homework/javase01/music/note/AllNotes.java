package homework.javase01.music.note;

import java.util.ArrayList;

/**
 * Created by Екатерина on 14.02.2018.
 */
public class AllNotes {
    int num;
    String  note;
    int octave;
    String octaveName;
    double _Hz;
    final String NOTES[] = {
            "C", "C#", "D", "D#","E","F","F#","G","G#","A","A#","B"};
    final ArrayList<String> NOTES_LIST = new ArrayList<>();
    {
        for (String e: NOTES) {
            NOTES_LIST.add(e);
        }
    }

    final int AMOUNT_OF_NOTES = NOTES.length;

    final String [] OCTAVESTEXT = {
            "суб-контр-октава", "контр-октава", "большая октава", "малая октава",
            "первая октава", "вторая октава", "третяя октава", "четвертая октава", "пятая октава"};
    final int [] OCTAVES = {-3, -2, -1, 0, 1, 2, 3, 4, 5};

    final ArrayList<Double> ARRAY_OF_ALL_NOTES = new ArrayList<>();
    {
        for (int i = 1; i <= 256; i = i*2) {
            //C
            ARRAY_OF_ALL_NOTES.add(16.35 * i);
            //C#
            ARRAY_OF_ALL_NOTES.add(17.32 * i);
            //D
            ARRAY_OF_ALL_NOTES.add(18.35 * i);
            //D#
            ARRAY_OF_ALL_NOTES.add(19.44 * i);
            //E
            ARRAY_OF_ALL_NOTES.add(20.61 * i);
            //F
            ARRAY_OF_ALL_NOTES.add(21.82 * i);
            //F#
            ARRAY_OF_ALL_NOTES.add(23.12 * i);
            //G
            ARRAY_OF_ALL_NOTES.add(24.5 * i);
            //G#
            ARRAY_OF_ALL_NOTES.add(25.95 * i);
            //A
            ARRAY_OF_ALL_NOTES.add(27.5 * i);
            //A#
            ARRAY_OF_ALL_NOTES.add(29.13 * i);
            //B
            ARRAY_OF_ALL_NOTES.add(30.87 * i);
        }
    }

    //суб контр октава 1 - 12
    //контр-октава 13 - 24
    //большая октава 36 - 47
    // малая октава 48- 59
    // первая октава 60 - 71
    // вторая октава 72 - 83
    // третяя октава 84 - 95
    // четвертая октава 96 - 107
    //пятая октава 108 - 112

    public AllNotes(Double h){
        _Hz = h;
        //num = LIST.get(h);
        num = ARRAY_OF_ALL_NOTES.indexOf(h);

        note = NOTES[(num - 1) % AMOUNT_OF_NOTES];
        octave = (num - 1) / AMOUNT_OF_NOTES - 3;

        octaveName = OCTAVESTEXT[octave + 3];
    }
    public AllNotes(String note, int octave){
        this.note = note;
        this.octave = octave;
        octaveName = OCTAVESTEXT[octave + 3];
        num = (octave + 3) * AMOUNT_OF_NOTES + NOTES_LIST.indexOf(note) + 1;
        _Hz = ARRAY_OF_ALL_NOTES.get(num - 1);
    }

    public void printNOTES_LIST(){
        System.out.println(NOTES_LIST.toString());
    }

    public void printARRAY_OF_ALL_NOTES(){
        System.out.println(ARRAY_OF_ALL_NOTES.toString());
    }
    public int getOctave() {
        return octave;
    }
    public double get_Hz(){
        return _Hz;
    }
    public String getNote(){
        return note;
    }
    public String getOctaveName(){
        return octaveName;
    }
    public int getNum(){
        return num;
    }

    public void setNote(String note, int octave){
        this.note = note;
        this.octave = octave;
        octaveName = OCTAVESTEXT[octave + 3];
        num = (octave + 3) * AMOUNT_OF_NOTES + NOTES_LIST.indexOf(note) + 1;
        _Hz = ARRAY_OF_ALL_NOTES.get(num - 1);
    }

    @Override
    public String toString(){
        return note;
    }
}

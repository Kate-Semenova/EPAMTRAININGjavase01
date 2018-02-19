package javase01.music.instruments;

import javase01.music.note.AllNotes;

/**
 * Created by Екатерина on 14.02.2018.
 */
public interface DefiniteNote extends Instrument {
    AllNotes getMin();
    void setMin(AllNotes c);
    AllNotes getMax();
    void setMax(AllNotes c);
    int getRange();
    void setRange(int i);
}

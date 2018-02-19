package javase01.music.instruments;

/**
 * Created by Екатерина on 14.02.2018.
 */
public interface Instrument {
    String getName();
    void setName(String str);
    String getType();
    void setType(String str);
    void play();
}

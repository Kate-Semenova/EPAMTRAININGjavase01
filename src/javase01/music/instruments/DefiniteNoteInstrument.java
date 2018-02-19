package javase01.music.instruments;

import javase01.music.note.AllNotes;

/**
 *
 * Created by Екатерина on 12.02.2018.
 * Абстрактный класс. Инструменты с определенной высотой звучания
 */
//В идеале сделать класс Tune где бы прописывались герцы для нот, потому
public abstract class DefiniteNoteInstrument implements DefiniteNote {

    /**
     * Вид инструмента
     */
    private String type;
    /**
    * Название
    */
    private String name;

    /**
     * Диапазон инсрумента
     */
    private int range;

    /**
     * Нижняя нота
     */
    private AllNotes min;

    /**
     * Верхняя нота
     */
    private AllNotes max;


    /**
     * @return Тип музыкального инструмента
     */
    @Override
    public String getType(){
        return type;
    }

    /**
     * @param s Тип музыкального инструмента
     */
    @Override
    public void setType(String s){
        type = s;
    }

    /**
     * @return Название инструмента
     */
    @Override
    public String getName(){
        return name;
    }

    /**
     * @param s Название инструмента
     */
    public void setName(String s){
        name = s;
    }

    /**
     * @return Диапазон
     */
    public int getRange(){
        return range;
    }

    /**
     * @param i Диапазон
     */
    public void setRange(int i){

        range = i;
    }

    /**
     * @return Самая низкая нота
     */
    public AllNotes getMin(){
        return min;
    }

    /**
     * @param min Самая низкая нота
     */
    public void setMin(AllNotes min) {
        this.min = min;
    }

    public void setMin(String min){
        this.min = new AllNotes(min, 1);
    }
    /**
     * @return Самая высокая нота
     */
    public AllNotes getMax(){
        return min;
    }

    /**
     * @param max Самая высокая нота
     */
    public void setMax(AllNotes max) {
        this.max = max;
    }

    public void setMax(String max){
        this.max = new AllNotes(max, 2);
    }

}

package javase01.music;

/**
 *
 * Created by Екатерина on 12.02.2018.
 */
//В идеале сделать класс Tune где бы прописывались герцы для нот, потому
public abstract class Instrument {

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
    private char min;

    /**
     * Верхняя нота
     */
    private char max;

    /**
     * Звук инструмента
     */
    protected abstract void makeNoise();

    /**
     * Звук на конкретной ноте
     * @param c
     */
    final protected void makeNoise(char c){ //FINAL
        makeNoise();
        System.out.println(c);
    };

    /**
     * @return Тип музыкального инструмента
     */
    protected String getType(){
        return type;
    }

    /**
     * @param s Тип музыкального инструмента
     */
    protected void setType(String s){
        type = s;
    }

    /**
     * @return Название инструмента
     */
    String getName(){
        return name;
    }

    /**
     * @param s Название инструмента
     */
    protected void setName(String s){
        name = s;
    }

    /**
     * @return Диапазон
     */
    protected int getRange(){
        return range;
    }

    /**
     * @param i Диапазон
     */
    protected void setRange(int i){

        range = i;
    }

    /**
     * @return Самая низкая нота
     */
    public char getMin(){

        return min;
    }

    /**
     * @param min Самая низкая нота
     */
    public void setMin(char min) {

        this.min = min;
    }


    /**
     * @return Самая высокая нота
     */
    char getMax(){
        return min;
    }

    /**
     * @param c Самая высокая нота
     */
    public void setMax(char c) {
        max = c;
    }

}

package javase01.music;

/**
 * Created by Екатерина on 12.02.2018.
 */
abstract class Instrument {

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
    abstract void makeNoise();

    /**
     * Звук на конкретной ноте
     * @param c
     */
    void makeNoise(char c){
        makeNoise();
        System.out.println(c);
    };

    /**
     * @return Тип музыкального инструмента
     */
    String getType(){
        return type;
    }

    /**
     * @param s Тип музыкального инструмента
     */
    void setType(String s){
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
    void setName(String s){
        name = s;
    }

    /**
     * @return Диапазон
     */
    int getRange(){
        return range;
    }

    /**
     * @param i Диапазон
     */
    void setRange(int i){
        range = i;
    }

    /**
     * @return Самая низкая нота
     */
    char getMin(){
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

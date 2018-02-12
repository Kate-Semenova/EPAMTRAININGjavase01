package javase01.music;

/**
 * Created by Екатерина on 12.02.2018.
 */
abstract class Instrument {

    /**
     * Вид инструмента
     */
    String type;
    /**
    * Название
    */
    String name;

    /**
     * Диапазон инсрумента
     */
    int range;

    /**
     * Нижняя нота
     */
    char min;

    /**
     * Верхняя нота
     */
    char max;

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

}

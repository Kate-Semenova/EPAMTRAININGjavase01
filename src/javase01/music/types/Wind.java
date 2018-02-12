package javase01.music.types;

import javase01.music.Instrument;

/**
 * Created by Екатерина on 12.02.2018.
 */
public class Wind extends Instrument {

    {
        setType("wind");
    }

    /**
     * Материал инструмента
     */
    private boolean material; //0-wood, 1-brass

    /**
     * Конструктор
     */
    Wind(){
        super();
    }

    Wind(String s){
        setName(s);
        switch (s.toLowerCase()) {
            case "horn": {
                material = true;
                setMin(' ');
                setMax(' ');
                setRange(0);
                break;
            }
            case "flute":{
                material = false;
                break;
            }
        }
    }

    @Override
    protected void makeNoise() {
        System.out.println("Tuuuu");
    }


    public String getMaterial() {
        if (material){
            return "Brass";
        }
        else {
            return "Wood";
        }
    }

    public void setMaterial(boolean material) {
        this.material = material;
    }
    public void setMaterial(String material){
        switch (material.toLowerCase()){
            case "wood":{
                this.material = true;
                break;
            }
            case "brass":{
                this.material = false;
                break;
            }
            default:{
                System.out.println("Wind instrument can`t be " + material);
                break;
            }
        }
    }
}

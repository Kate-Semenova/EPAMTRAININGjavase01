package homework.javase02.t01;

/**
 * Created by Ekaterina Semenova on 21.02.2018.
 */
/*Задание 1. Принципы ООП,
простейшие классы и объекты

Разработайте спецификацию и
создайте класс Ручка (Pen).
Определите в этом классе
методы equals(), hashCode() и toString().
*/
public class Pen {
    //Color color;
    private String color;
    private boolean cap; //колпачок
    private String manufacturerCompany;
    private double prise;

    public Pen(String color, String manufacturerCompany, double prise){
        this.color = color;
        this.manufacturerCompany = manufacturerCompany;
        this.prise = prise;
    }

    public Pen(String color, String manufacturerCompany, double prise, boolean cap){
        this(color, manufacturerCompany, prise);
        this.cap = cap;
    }
    @Override
    public boolean equals(Object anObject){
        if (this == anObject) {
            return true;
        }
        if (anObject instanceof Pen){
            Pen anotherPen = (Pen)anObject;
            if (color == null && anotherPen.getColor()!=null
                    || manufacturerCompany == null && anotherPen.getManufacturerCompany() !=null
                    || anotherPen.getColor()== null && color != null
                    || anotherPen.getManufacturerCompany() == null && manufacturerCompany != null){
                return false;
            }

            if (color == null && anotherPen.getColor() == null
                    && manufacturerCompany != null && anotherPen.getManufacturerCompany() != null){
                return cap == anotherPen.isCap()&&
                        manufacturerCompany.equals(anotherPen.getManufacturerCompany())&&
                        prise == anotherPen.getPrise();
            }
            if (manufacturerCompany == null && anotherPen.getManufacturerCompany() == null
                    && color != null && anotherPen.getColor() != null ) {
                return color.equals(anotherPen.getColor())&&
                        cap == anotherPen.isCap()&&
                        prise == anotherPen.getPrise();
            }
            return color.equals(anotherPen.getColor())&&
                    cap == anotherPen.isCap()&&
                    manufacturerCompany.equals(anotherPen.getManufacturerCompany())&&
                    prise == anotherPen.getPrise();
        }
        return false;
    }

    @Override
    public int hashCode() {
        /* private String color;
    private boolean cap; //колпачок
    private String manufacturerCompany;
    private double prise;*/
        final int prime = 37;
        int result = 1;
        result = prime * result + (color == null ? 0 : color.hashCode());
        result = prime * result + (cap ? 1 : 0);
        result = prime * result + (manufacturerCompany == null ? 0 : manufacturerCompany.hashCode());
        result = prime * result + (cap ? 1 : 0);
        long prise = Double.doubleToLongBits(this.prise);
        result = prime * result + (int)(prise - (prise >>> 32));
        return result;
    }

    @Override
    public String toString(){
        if(this == null)
            return null;
        if(color == null) {
            if(manufacturerCompany == null){
                return String.format("Pen");
            }
            return String.format("Pen of %s company", manufacturerCompany);
        }
        return String.format("%s pen of %s company",
                (color.substring(0,1).toUpperCase() + color.substring(1).toLowerCase()),
                manufacturerCompany);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isCap() {
        return cap;
    }

    public void setCap(boolean cap) {
        this.cap = cap;
    }

    public String getManufacturerCompany() {
        return manufacturerCompany;
    }

    public void setManufacturerCompany(String manufacturerCompany) {
        this.manufacturerCompany = manufacturerCompany;
    }

    public double getPrise() {
        return prise;
    }

    public void setPrise(double prise) {
        this.prise = prise;
    }
}


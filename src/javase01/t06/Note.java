package javase01.t06;

/**
 * Created by Екатерина on 08.02.2018.
 */
public class Note {
    public String note = "hello"; //текст записи
    public int num = 1; //номер записи
    Note (String n){
        note = n;

    }

    public int getNum (){
        return num;
    }

    public String getNote(){
        return note;
    }

    public void setNum(int n){
        num = n;
    };

    public void prisvoit(Note n){
        num = n.getNum();
        note = n.getNote();
    }

    public void print(){
        System.out.println(num + " - " + note);
    }
}

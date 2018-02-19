package javase01.t06;

/**
 * Created by Екатерина on 08.02.2018.
 */

//TODO отредактировать документацию
public class Note {
    /**
     * Текст записи
     */
    private String note;

    /**
     * Конструктор
     * @param note Текст записи
     */
    public Note (String note){

        this.note = note;
    }

    /**
     * Метод, возвращает текст записи
     * @return Текст записи
     */
    public String getNote(){

        return note;
    }

    /**
     * Метод, переопредеяет текст записи
     * @param note Новый текст записи
     */
    public void setNote(String note){

        this.note = note;
    }

    /**
     * Метод, присваивает значение одного AllNotes другому
     * @param n Запись
     */
    public void place(Note n){
        note = n.getNote();
    }

    /**
     * Вывод текста записи на консоль
     */
    public void print(){
        System.out.println(note);
    }
}

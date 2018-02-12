package javase01.t06;

/**
 * Created by Екатерина on 08.02.2018.
 */
public class Note {
    /**
     * Текст записи
     */
    private String note = "hello";

    /**
     * Конструктор
     * @param note Текст записи
     */
    Note (String note){
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
     * Метод, присваивает значение одного Note другому
     * @param n Запись
     */
    public void prisvoit(Note n){
        note = n.getNote();
    }

    /**
     * Вывод текста записи на консоль
     */
    public void print(){
        System.out.println(note);
    }
}

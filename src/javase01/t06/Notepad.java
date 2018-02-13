package javase01.t06;

/**
 * Created by Екатерина on 08.02.2018.
 */

/**
 * Класс блокнота
 *
 * @version 1.0
 * @autor Semenova Ekaterina
 */
public class Notepad {
    /**
     * Массив записей в блокноте
     */
    private Note[] notes;

    /**
     * Количество записей в блокноте
     */
    private int num;

    /**
     * Размер массива по умолчанию
     */
    private final int def = 100;
    /**
     * Конструктор по умолчанию
     */
    public Notepad() {
        notes = new Note[def];
        num = 0;
    }

    /**
     * Конструктор
     * @param n массив записей в блокноте
     */
    public Notepad(Note[] n) {
        num = n.length;
        if (num <= def) {
            new Notepad(); //Просто хочу чтобы сразу был массив с размером по умолчанию,
                            // чтобы при дальнейшем добавлении создавать меньше экземпляров.
                            //Надеюсь, я правильно понимаю вопрос оптимизации
            for(int i = 0; i < num; i++){
                notes[i] = n[i];
            }
        }
        else {
            notes = n;
        }
    }

     /**
     * Метод, показывает все записи в блокноте в виде номер_записи - запись
     */
    public void showAllNotes() {
        if (notes == null) System.out.println("Записей нет");
        else {
            System.out.println("Записи блокнота: ");
            for (int i = 0; i < num; i++) {
                System.out.print(i + 1 + " - ");
                notes[i].print();
            }
        }
    }

    /**
     * Метод, добавляет новую запись в блокнот
     *
     * @param note запись
     */
    public void addNote(Note note) {
         if (notes.length == num){
            Note [] newNotes = new Note[notes.length + def];
            for(int i = 0; i < num; i++) {
                newNotes[i] = notes[i];
            }
            newNotes[num] = note;
            notes = newNotes;
        } else {
            notes[num] = note;
        }
        num++;
    }

    /**
     * Метод добавляет новую запись в блокнот
     * @param str Текст записи
     */
    public void addNote(String str){

        addNote(new Note(str));
    }

    /**
     * Метод, удаляет запись по номеру
     *
     * @param number номер записи
     */
    public void deleteNote(int number) { //Написать еще метод для массива чисел
        if (num >= number) {
            for (int i = number; i < num; i++) {
                notes[i - 1] = notes[i];
            }
            num--;
        } else {
            System.out.println("Нет записи номер " + number);
        }
        if(notes.length > num + def) { //Комментарий скорее для автора кода:
                                        //Если вдруг массив стал слишком большим,
                                        // то есть там "ненужных" элементов больше чем def
                                        // тогда заводим новый массив нужного размера
            Note [] newNotes = new Note[num + def];
            for(int i = 0; i < num; i++){
                newNotes[i] = notes[i];
            }
            notes = newNotes;
        }

    }

    /**
     * Метод, удаляет записи по номерам
     *
     * @param numbers номер записи
     */
    public void deleteNote(int [] numbers){
        for (int e: numbers) {
            deleteNote(e);
        }
    }

    /**
     * Метод, редактирует запись
     *
     * @param number номер записи
     * @param note   отредактированная запись
     */
    public void rewriteNote(int number, Note note) {

        if (num >= number) {
            notes[number - 1] = note;
        }
        else {
            System.out.println("Такой записи не существует");
        }
    }

    /**
     * Метод, редактирует запись
     *
     * @param number номер записи
     * @param str   отредактированный текст записи
     */
    public void  rewriteNote(int number, String str){

        rewriteNote(number, new Note(str));
    }
    /**
     * Метод, возвращает количество записей в блокноте
     *
     * @return количество записей
     */

    public int getNumberOfNotes() {
        return num;
    }
    /**
     * Метод, возвращает запись по ее номеру
     * @param number Номер записи
     * @return Запись
     */
    public Note getNoteByNumber(int number){
        return notes[number - 1];
    }

    /**
     * Метод, возвращает текст записи по ее номеру
     * @param number Номер записи
     * @return Текст записи
     */
    public String getNoteTextByNumber(int number){
        return getNoteByNumber(number).getNote();
    }
}

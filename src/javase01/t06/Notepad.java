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
    private int amountOfNotes;

    /**
     * Размер массива по умолчанию
     */
    private final int DEFAULT_AMOUT_OF_NOTES = 100;
    /**
     * Конструктор по умолчанию
     */
    public Notepad() {
        notes = new Note[DEFAULT_AMOUT_OF_NOTES];
        amountOfNotes = 0;
    }

    /**
     * Конструктор
     * @param n массив записей в блокноте
     */
    public Notepad(Note[] n) {
        amountOfNotes = n.length;
        if (amountOfNotes <= DEFAULT_AMOUT_OF_NOTES) {
            notes = new Note[DEFAULT_AMOUT_OF_NOTES]; //Просто хочу чтобы сразу был массив с размером по умолчанию,
                                // чтобы при дальнейшем добавлении создавать меньше экземпляров.
                                //Надеюсь, я правильно понимаю вопрос оптимизации
            for(int i = 0; i < amountOfNotes; i++){
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
            for (int i = 0; i < amountOfNotes; i++) {
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
         if (notes.length == amountOfNotes){
            Note [] newNotes = new Note[notes.length + DEFAULT_AMOUT_OF_NOTES];
            for(int i = 0; i < amountOfNotes; i++) {
                newNotes[i] = notes[i];
            }
            newNotes[amountOfNotes] = note;
            notes = newNotes;
        } else {
            notes[amountOfNotes] = note;
        }
        amountOfNotes++;
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
        if (amountOfNotes >= number) {
            for (int i = number; i < amountOfNotes; i++) {
                notes[i - 1] = notes[i];
            }
            amountOfNotes--;
        } else {
            System.out.println("Нет записи номер " + number);
        }
        if(notes.length > amountOfNotes + DEFAULT_AMOUT_OF_NOTES) { //Комментарий скорее для автора кода:
                                        //Если вдруг массив стал слишком большим,
                                        // то есть там "ненужных" элементов больше чем DEFAULT_AMOUT_OF_NOTES
                                        // тогда заводим новый массив нужного размера
            Note [] newNotes = new Note[amountOfNotes + DEFAULT_AMOUT_OF_NOTES];
            for(int i = 0; i < amountOfNotes; i++){
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

        if (amountOfNotes >= number) {
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
        return amountOfNotes;
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

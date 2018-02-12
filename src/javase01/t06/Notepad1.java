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
public class Notepad1 {
    /**
     * Массив записей в блокноте
     */
    public Note[] notes;

    /**
     * Количество записей в блокноте
     */
    public int num;

    /**
     * Конструктор по умолчанию
     */
    Notepad1() {
        notes = null;
        num = 0;
    }

    /**
     * Конструктор
     * @param notes массив записей в блокноте
     */
    Notepad1(Note[] notes) {
        this.notes = notes;
        num = notes.length;
    }

    /**
     * Метод, показывает все записи в блокноте в виде номер_записи - запись
     */
    public void showAllNotes() {
        if (notes == null) System.out.println("Записей нет");
        else {
            System.out.println("Записи блокнота: ");
            for (int i = 0; i < notes.length; i++) {
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
        Note newNotes[];

        if (notes == null) {
            newNotes = new Note[1];
            newNotes[0] = note;
        } else {
            newNotes = new Note[num + 1];
            for (int i = 0; i < num; i++) {
                newNotes[i] = notes[i];
            }
            newNotes[num] = note;
        }
        notes = newNotes;
        num = notes.length;
    }

    /**
     * Метод, удаляет запись по номеру
     *
     * @param number номер записи
     */
    public void deleteNote(int number) { //Написать еще метод для массива чисел
        if (num >= number) {
            Note newNotes[] = new Note[num - 1];
            for (int i = 0; i < number - 1; i++) {
                newNotes[i] = notes[i];
            }
            for (int i = number; i < num; i++) {
                newNotes[i - 1] = notes[i];
            }
            notes = newNotes;
            num = notes.length;
        } else System.out.println("Нет записи с таким номером");
    }

    /**
     * Метод, редактирует запись
     *
     * @param number номер записи
     * @param note   отредактированный текст записи
     */
    public void rewriteNote(int number, Note note) {

        if (num >= number) notes[number - 1] = note;
        else System.out.println("Такой записи не существует");
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

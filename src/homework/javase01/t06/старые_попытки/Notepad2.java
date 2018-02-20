package homework.javase01.t06.старые_попытки;

/**
 * Created by Екатерина on 08.02.2018.
 */

/**
 * Класс блокнота
 *
 * @version 1.0
 * @autor Semenova Ekaterina
 */
public class Notepad2 {
    /**
     * Массив записей в блокноте
     */
    public String[] notes;

    /**
     * Количество записей в блокноте
     */
    public int num;

    /**
     * Конструктор по умолчанию
     */
    Notepad2() {
        notes = null;
        num = 0;
    }

    /**
     * Конструктор
     * @param notes массив строк - записей в блокноте
     */
    Notepad2(String[] notes) {
        this.notes = notes;
        num = notes.length;
    }

    /**
     * Метод, показывает все записи в блокноте в виде номер_записи - запись
     */
    public void showAllNotes() {
        if (notes == null) System.out.println("Записей нет");
        else {
            for (int i = 0; i < notes.length; i++) {
                System.out.print(i + 1 + " - ");
                System.out.println(notes[i]);
            }
        }
    }

    /**
     * Метод, добавляет новую запись в блокнот
     *
     * @param note запись
     */
    public void addNote(String note) {
        String newNotes[];

        if (notes == null) {
            newNotes = new String[1];
            newNotes[0] = note;
        } else {
            newNotes = new String[num + 1];
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
    public void deleteNote(int number) {
        if (num >= number) {
            String newNotes[] = new String[num - 1];
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
    public void rewriteNote(int number, String note) {

        if (num >= number) notes[number - 1] = note;
        else System.out.println("Такой записи не существует");
    }

    /**
     * Метод, возвращает количество записей в блокноте
     *
     * @return количество записей
     */
    public int numberOfNotes() {
        return num;
    }
}

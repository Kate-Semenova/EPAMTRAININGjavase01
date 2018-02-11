package javase01.t06;

/**
 * Created by Екатерина on 08.02.2018.
 */
public class Notepad {
    public String [] notes;
    public int num;
    // Реализовать методы:
    // Добавить запись,
    // Удалить запись,
    // Редактировать запись,
    // Посмотреть все записи.
    Notepad (){
        notes = null;
        num = 0;
    }
    Notepad (String [] notes){
        this.notes = notes;
        num = notes.length;
    }

    public void showAllNotes(){
        if (notes == null) System.out.println("Записей нет");
        else {
            for (int i = 0; i < notes.length; i++) {
                System.out.print(i + 1 + " - ");
                System.out.println(notes[i]);
            }
        }
    }

    public void addNote(String note){
        String newNotes[];

        if (notes == null) {
            newNotes = new String[1];
            newNotes[0] = note;
        }
        else {
            newNotes = new String[num + 1];
            for (int i = 0; i < num; i++) {
                newNotes[i] = notes[i];
                }
            newNotes[num] = note;
            }
        notes = newNotes;
        num = notes.length;
    }

    public void deleteNote(int number){
        if(num >= number) {
            String newNotes[] = new String[num - 1];
            for (int i = 0; i < number - 1; i++) {
                newNotes[i] = notes[i];
            }
            for (int i = number; i < num; i++) {
                newNotes[i - 1] = notes[i];
            }
            notes = newNotes;
            num = notes.length;
        }
        else System.out.println("Нет записи с таким номером");
    }

    public void rewriteNote (int number, String note){

        if(num >= number) notes[number - 1] = note;
        else System.out.println("Такой записи не существует");
    }

    public int numberOfNotes (){
        return num;
    }


}

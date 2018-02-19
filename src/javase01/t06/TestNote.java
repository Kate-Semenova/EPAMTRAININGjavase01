package javase01.t06;

/**
 * Created by Екатерина on 12.02.2018.
 */
//Что усовершенствовать:
    //сделать addNote и rewriteNote  с аргументом String, а не AllNotes - DONE
    //возможность дать массив int [] методу deleteNote() - DONE
public class TestNote {
    public static void main(String[] args) {
        System.out.println("Создадим новую запись");
        Note note = new Note("Hello");
        System.out.print("Запись: ");
        note.print();
        System.out.println();

        System.out.println("Изменим запись");
        note.setNote("Bye");
        System.out.print("Запись: ");
        note. print();
        System.out.println();

        System.out.println("Создадим блокнот, куда поместим нашу запись");
        Note notes [] = {note};
        Notepad notepad = new Notepad(notes);

        notepad.showAllNotes();
        System.out.println();

        System.out.println("Добавим новую строку");
        notepad.addNote(new Note("Hello World!"));
        notepad.showAllNotes();
        System.out.println();

        System.out.println("Количество записей: " + notepad.getNumberOfNotes());
        System.out.println();
        System.out.println("Добавим еще 10 записей");
        for (int i = 0; i < 10; i++) {
            notepad.addNote("hey you " + i);
        }
        notepad.showAllNotes();
        System.out.println();

        int g = 7;
        System.out.println(String.format(
                "Удалим строку номер %d с записью \"%s\"", g, notepad.getNoteTextByNumber(g)));
        notepad.deleteNote(g);
        notepad.showAllNotes();
        System.out.println();

        System.out.println("Удалим записи 4, 5, 12, 6, 1 из блокнота");
        notepad.deleteNote(new int[] {4, 5, 12, 6, 1});
        notepad.showAllNotes();
        System.out.println();

        System.out.println(String.format(
                "Отредактируем строку номер %d с записью \"%s\"", 5, notepad.getNoteTextByNumber(5)));
        notepad.rewriteNote(5, new Note("I AM REWRITTEN"));
        notepad.showAllNotes();
        System.out.println();


    }
}

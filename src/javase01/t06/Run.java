package javase01.t06;

/**
 * Created by Екатерина on 08.02.2018.
 */
public class Run {
    //Спроектировать и разработать классы Запись в блокноте и Блокнот (записи блокнота хранятся в массиве).
    // Реализовать методы:
    // Добавить запись,
    // Удалить запись,
    // Редактировать запись,
    // Посмотреть все записи.
    //
    // Написать для данного кода javadoc-документацию.
    public static void main(String[] args) throws NullPointerException {
        Notepad n = new Notepad();

        n.showAllNotes();
        System.out.println(n.num);
        System.out.println();
        n.rewriteNote(2, "df");
        System.out.println(n.numberOfNotes());
        n.addNote("hey you");
        n.showAllNotes();
        System.out.println(n.num);

        n.addNote("hey you");
        n.showAllNotes();
        System.out.println(n.num);

        n.deleteNote(2);
        n.showAllNotes();
        System.out.println(n.num);

        n.rewriteNote(1, "good");
        n.showAllNotes();

        n.rewriteNote(2, "dkfdf");
        n.showAllNotes();
        System.out.println();
        for (int i = 0; i < 10; i++) {
            n.addNote("hey you" + i);

        }
        n.showAllNotes();
    }
}

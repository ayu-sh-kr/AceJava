import java.util.EnumSet;

public class EnumTest {
    public static void main(String[] args) {
        System.out.println("All Books: ");

        // print all books in enum Book
        for (Book book: Book.values()){
            System.out.printf("%-10s%-45s%s%n",book,
                    book.getTitle(), book.getCopyrightYear());
        }

        System.out.printf("%nDisplay a range of enum constant: %n");

        //print first four book
        for (Book book: EnumSet.range(Book.JHTP, Book.CPPHTP)){
            System.out.printf("%-10s%-45s%s%n",book,
                    book.getTitle(), book.getCopyrightYear());
        }
    }
}

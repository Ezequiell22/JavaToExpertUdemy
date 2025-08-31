import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Book> books = new ArrayList<>();

        books.add(new Book(Type.FICTION, 243, "NEW CAR", "JACKSON"));
        books.add(new Book(Type.FICTION, 3321, "NEW CAR", "JACKSON"));
        books.add(new Book(Type.NOVEL, 134, "MY EX-GIRL FRIEND", "HOMMER"));
        books.add(new Book(Type.FICTION, 124, "THE NIGHT OF SUMMER", "MARTHA"));

        List<String> result = books.stream().filter( b -> b.getType() == Type.NOVEL)
                .sorted(Comparator.comparing(Book::getPages))
                .map(Book::getTitle)
                .collect(Collectors.toList());
        result.stream().forEach(System.out::println);
    }
}
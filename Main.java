import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

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

        // grouping by type
        Map<Type, List<Book> > booksByType = books.stream().collect(Collectors.groupingBy(Book::getType));
        booksByType.entrySet().stream().forEach( e -> System.out.println(e));

        // finding 2 longest books
        List<String> longestBooks = books.stream().filter(n -> n.getPages() > 500)
                .map(Book::getTitle).limit(2).collect(Collectors.toList());

        longestBooks.stream().forEach(System.out::println);


        books.stream().map(Book::getPages).reduce(Integer::max)
                .ifPresent(System.out::println);

        // sum all pages of all books
        IntStream s = books.stream().mapToInt(Book::getPages);
        Stream<Integer> ss = s.boxed();


     }
}
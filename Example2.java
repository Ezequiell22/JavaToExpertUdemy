import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example2 {

  public static void exe() throws IOException {
      String path = "";
      Stream<String> namesStram = Files.lines(Paths.get(path));
      List<String> names = namesStram.filter(x -> x.startsWith("S"))
              .collect(Collectors.toList());
      names.forEach(System.out::println);
  }
}

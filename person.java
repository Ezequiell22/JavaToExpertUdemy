import java.util.*;

record Pessoa(String nome, int idade) {}

public class Main {
    public static void main(String[] args) {
        List<Pessoa> pessoas = List.of(
            new Pessoa("Ana", 17),
            new Pessoa("Bruno", 22),
            new Pessoa("Carla", 30),
            new Pessoa("Daniel", 15)
        );

        var maioresDeIdade = pessoas.stream()
            .filter(p -> p.idade() >= 18)
            .sorted(Comparator.comparing(Pessoa::idade))
            .map(Pessoa::nome)
            .toList();
 
        maioresDeIdade.forEach(System.out::println);
    }
}

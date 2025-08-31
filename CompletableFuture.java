import java.util.concurrent.Executors;

public class CompletableFuture {

    public static void main(String[] args){
        try( var service = Executors.newVirtualThreadPerTaskExecutor() ){
            java.util.concurrent.CompletableFuture
                    .supplyAsync( () -> "Hello ")
                    .thenCombine(java.util.concurrent.CompletableFuture
                            .supplyAsync( () -> "world"), (s, s1) -> s + s1)
                    .thenAccept(System.out::println);
        }
    }
}

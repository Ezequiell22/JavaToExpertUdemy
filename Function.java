import java.util.function.Function;
 
public class Exercise {
    
    public Function<Integer, Integer> construct(int num) {
        
          Function<Integer, Integer> func1 = x -> x * x;
          Function<Integer, Integer> func2 = x -> x /2;
          Function<Integer, Integer> resultFunction = func1.andThen(func2);
          
          return resultFunction;
    }
}
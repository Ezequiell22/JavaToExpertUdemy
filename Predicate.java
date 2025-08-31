import java.util.function.Predicate;
 
public class Exercise {
    
    public Predicate<Integer> construct() {
        
        // create predicates to test whether an integer is larger than 100 AND it is divisible by 3
        // ...
        
        Predicate<Integer> p1 = x -> x > 100;
        Predicate<Integer> p2 = x -> x % 3 == 0;
        
        Predicate<Integer> finalPredicate = p1.and(p2);
        
        return finalPredicate;
        
    }
}
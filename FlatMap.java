
import java.util.*;
import java.util.stream.Collectors;

public class FlatMap {

    public List<List<Integer>> generatePairs() {

        List<Integer> nums1 = Arrays.asList(1, 2, 3);
        List<Integer> nums2 = Arrays.asList(4, 5);

        List<List<Integer>> pairs =
                nums1.stream().flatMap(i -> nums2.stream().map(j -> Arrays.asList(i, j)))
                        .collect(Collectors.toList());

        return pairs;
    }
}
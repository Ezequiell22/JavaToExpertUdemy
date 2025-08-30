import java.util.*;
import java.util.HashSet;
import java.util.Set; 
 
public class Exercise {
 
    public Set<Integer> twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        Set<Integer> result = new HashSet<>();
        
        
        for(int i=0;i<nums.length;i++) {
            if(map.containsKey(target-nums[i])) {
                result.add(map.get(target-nums[i]));
                result.add(i);
                return result;
            }
            map.put(nums[i],i);
        }
        return result;
    }
}
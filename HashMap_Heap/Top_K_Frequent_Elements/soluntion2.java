package lettcode.Top_K_Frequent_Elements;

import java.util.HashMap;
import java.util.Map;

public class soluntion2 {
    public int[] topKFrequent(int[] nums, int k) {
            Map<Integer, Integer> frequencyMap = new HashMap<>();
            for (int num: nums) {
                frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1 );
            }
        
    }
}

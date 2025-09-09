package lettcode.Top_K_Frequent_Elements;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class solution1 {
        public int[] topKFrequent(int[] nums, int k) {
            Map<Integer, Integer> frequencyMap = new HashMap<>();
            for (int num: nums) {
                frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1 );
            }
            PriorityQueue<Integer> maxHeap = new PriorityQueue<>(
                (a, b) -> frequencyMap.get(b) - frequencyMap.get(a)
            ); // nếu ra âm thì a đứng trước b, ra dương thì a đứng sau b
            maxHeap.addAll(frequencyMap.keySet()); 

            int[] result = new int[k];
            for (int i = 0; i < k; i++ ) {
                result[i] = maxHeap.poll();
            }
            return result;         
    }
}

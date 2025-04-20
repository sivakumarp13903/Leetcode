import java.util.*;

public class Solution {
    public int largestInteger(int[] nums, int k) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        int n = nums.length;
        
        // Step 1: Count occurrences of each number in each sliding window of size k
        for (int i = 0; i <= n - k; i++) {
            // Use a set to avoid counting the same element multiple times in one window
            Set<Integer> windowElements = new HashSet<>();
            for (int j = i; j < i + k; j++) {
                if (!windowElements.contains(nums[j])) {
                    freqMap.put(nums[j], freqMap.getOrDefault(nums[j], 0) + 1);
                    windowElements.add(nums[j]);
                }
            }
        }
        
        // Step 2: Find the largest element that appears exactly once in all subarrays
        int result = -1;
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() == 1) {
                result = Math.max(result, entry.getKey());
            }
        }
        
        return result;
    }
}

class Solution {
    public long countGood(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        long count = 0;
        long goodPairs = 0;
        int left = 0;

        for (int right = 0; right < nums.length; right++) {
            int val = nums[right];
            int prevFreq = freq.getOrDefault(val, 0);
            goodPairs += prevFreq;

            freq.put(val, prevFreq + 1);

            while (goodPairs >= k) {
                count += nums.length - right;
                int leftVal = nums[left];
                int f = freq.get(leftVal);
                goodPairs -= f - 1;
                if (f == 1) {
                    freq.remove(leftVal);
                } else {
                    freq.put(leftVal, f - 1);
                }
                left++;
            }
        }

        return count;
    }
}

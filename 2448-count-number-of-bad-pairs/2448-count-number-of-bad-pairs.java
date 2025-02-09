class Solution {
    public long countBadPairs(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        long t = 0,g=0;
        for(int i=0;i<nums.length;i++){
           int key = nums[i]-i;
           if(map.containsKey(key)){
                g+=map.get(key);
           }
           map.put(key,map.getOrDefault(key,0)+1);
           t+=i;
        }return t-g;
    }
}
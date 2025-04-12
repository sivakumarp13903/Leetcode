class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        int c=0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i : nums1){
            for(int j : nums2){
                int s = i+j;
                map.put(s,map.getOrDefault(s,0)+1);
            }
        }
        for(int i : nums3){
            for(int j : nums4){
                int s = -(i+j);
                if(map.containsKey(s)){
                    c+=map.get(s);
                }
            }
        }
        return c;
    }
}
class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int n = Integer.MIN_VALUE;
        for(int i=1;i<nums.length;i++){
           n=Math.max(n,Math.abs(nums[i-1]-nums[i]));
        }
        n=Math.max(n,Math.abs(nums[0]-nums[nums.length-1]));
        return n;
    }
}
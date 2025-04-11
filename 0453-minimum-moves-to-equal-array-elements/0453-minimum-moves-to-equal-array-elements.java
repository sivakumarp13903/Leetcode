class Solution {
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int t=nums[0],sum=0;
        for(int i=0;i<nums.length;i++){
            nums[i] = Math.abs(nums[i]-t);
            sum+=nums[i];
        }
        return sum;
    }
}
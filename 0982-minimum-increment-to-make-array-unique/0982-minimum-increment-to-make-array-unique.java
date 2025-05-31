class Solution {
    public int minIncrementForUnique(int[] nums) {
        int c=0;
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]>=nums[i]){
                c+=(nums[i-1]+1-nums[i]);
                nums[i] = nums[i-1]+1;
            }
        }
        return c;
    }
}
class Solution {
    public int countSubarrays(int[] nums) {
        int c=0;
        int n = nums.length;
        for(int i=0;i<n-2;i++){
            if((nums[i]+nums[i+2])*2 == (nums[i+1])){
                c++;
            }
        }return c;
    }
}
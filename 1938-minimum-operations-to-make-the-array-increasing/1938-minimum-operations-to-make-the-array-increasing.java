class Solution {
    public int minOperations(int[] nums) {
        int arr[] = nums.clone();
        int sum=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]>nums[i]){
                nums[i] = nums[i-1]+1;
            }
            else if(nums[i-1]==nums[i]){
                nums[i]+=1;
            }
        }
        for(int i=0;i<nums.length;i++){
            sum+=(nums[i]-arr[i]);
        }
        
        return sum;
    }
}
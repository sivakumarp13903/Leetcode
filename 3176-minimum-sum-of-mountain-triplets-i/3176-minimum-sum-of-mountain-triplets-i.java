class Solution {
    public int minimumSum(int[] nums) {
        int count = Integer.MAX_VALUE;
        for(int i=0;i<nums.length-2;i++){
            for(int j=i+1;j<nums.length-1;j++){
                    for(int k=j+1;k<nums.length;k++){
                            if(nums[i]<nums[j] && nums[j]>nums[k]){
                                count = Math.min(count,nums[i]+nums[j]+nums[k]);
                            }
                        }
        }
        }
        return count!=Integer.MAX_VALUE?count:-1;
    }
}
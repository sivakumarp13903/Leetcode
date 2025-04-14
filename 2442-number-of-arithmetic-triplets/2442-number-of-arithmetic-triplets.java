class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        int c=0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                for(int k=0;k<nums.length;k++){
                    if(nums[i]-nums[j]==diff && nums[j]-nums[k]==diff){
                        c++;
                    }
                }
            }
        }return c;
    
    }
}
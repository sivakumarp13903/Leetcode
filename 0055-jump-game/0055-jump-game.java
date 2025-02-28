class Solution {
    public boolean canJump(int[] nums) {
        int max = 0,n=nums.length;
        if(n==1){
            return true;
        }
        for(int i=0;i<n-1;i++){
            max = Math.max(max,nums[i]+i);
            if(nums[i]==0 && max<=i){
                return false;
            }
            System.out.print(max+" ");
            if(max>=n-1){
                return true;
            }
        }
        return false;
    }
}
class Solution {
    public int maxAscendingSum(int[] nums) {
        if(nums.length==1)return nums[0];
        int maxSum=0;
        int sum=0;
        boolean res=false;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<nums[i+1]){
                sum+=nums[i];
                if(i==nums.length-2){
                    res=true;
                }
            }
            else{
                sum+=nums[i];
                System.out.print(sum+" ");
                maxSum=Math.max(maxSum,sum);
                sum=0;
            }
        }
        if(res&sum!=0)sum+=nums[nums.length-1];
        maxSum=Math.max(maxSum,sum);
        return maxSum;
    }
}
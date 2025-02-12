class Solution {
    public int maximumSum(int[] nums) {
        int maxSum[]= new int[83];
        int res=-1;
        for(int i : nums){
            int temp=i,sum=0;
            while(temp>0){
                sum+=(temp%10);
                temp/=10;
            }
            if(maxSum[sum]!=0){
                res= Math.max(res,i+maxSum[sum]);
            }
            maxSum[sum]=Math.max(maxSum[sum],i);
        }
        return res;
    }
}
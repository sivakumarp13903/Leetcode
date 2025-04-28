class Solution {
    public long countSubarrays(int[] nums, long k) {
        long count = 0,n=nums.length;
        long sum=0;
        int start=0;
        sum=0;
        for(int end=0;end<n;end++){
            sum+=nums[end];
            while(end>=start && sum * (end-start+1)>=k){
                sum-=nums[start];
                start++;
            }
            count+=(end-start+1);

        }
        return count;
    }
}
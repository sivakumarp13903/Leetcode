class Solution {
    public int pivotIndex(int[] nums) {
        int sum=0;
        int sum2=0;
        int left[] = new int[nums.length];
        int right[]= new int[nums.length];
        for(int i=0;i<nums.length;i++){
            left[i]=sum+nums[i];
            sum+=nums[i];
        }
        int k=0;
        for(int i=nums.length-1;i>=0;i--){
            right[i]=sum2+nums[i];
            sum2+=nums[i];
        }

        for(int i=0;i<nums.length;i++){
            if(left[i]==right[i]){
                return i;
            }
        }
        return -1;
    }
}
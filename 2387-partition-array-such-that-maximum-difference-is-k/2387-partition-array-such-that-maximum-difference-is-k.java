class Solution {
    public int partitionArray(int[] nums, int k) {
        Arrays.sort(nums);
        int count = 0;
        int i=0;
        while(i<nums.length){
            int j=i;
            while(j<nums.length && nums[i]+k >= nums[j]){
                j++;
            }
            i=j;
            count++;
        }
        return count;
    }
}
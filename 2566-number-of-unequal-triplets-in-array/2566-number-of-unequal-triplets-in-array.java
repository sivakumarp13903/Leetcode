class Solution {
    public int unequalTriplets(int[] nums) {
        int c=0;
        for(int i : nums){
            for(int j : nums){
                for(int k : nums){
                    if(i<j && j<k && i!=j && j!=k){
                        c++;
                    }
                }
            }
        }
        return c;
    }
}
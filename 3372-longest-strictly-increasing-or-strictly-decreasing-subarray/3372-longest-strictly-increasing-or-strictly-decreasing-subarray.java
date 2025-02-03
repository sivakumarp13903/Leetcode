class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int inc=1,dec=1;
        for(int i=0;i<nums.length;i++){
            int n1=1,n2=1;
            for(int j=0;j<nums.length-1;j++){
                if(nums[j]<nums[j+1]){
                    n1++;
                }
                else{
                    inc = Math.max(inc,n1);
                    n1=1;
                }
            }
            for(int j=0;j<nums.length-1;j++){
                if(nums[j]>nums[j+1]){
                    n2++;
                    System.out.println(n2);
                }
                else{
                    dec = Math.max(dec,n2);
                    n2=1;
                }
            }
            dec = Math.max(dec,n2);
            inc = Math.max(inc,n1);
        }
        return inc>dec?inc:dec;
    }
}
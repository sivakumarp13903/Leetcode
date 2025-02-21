class Solution {
    public String findDifferentBinaryString(String[] nums) {
        StringBuffer sb= new StringBuffer();
        for(int i=0;i<nums.length;i++){
            sb.append(nums[i].charAt(i)=='0'?'1':'0');
        }
        return sb.toString();
    }
}
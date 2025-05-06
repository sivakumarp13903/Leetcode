class Solution {

    public boolean checkNum(int n1,int n2){
        if(n1==n2)return true;
        String s1 = Integer.toString(n1);
        String s2 = Integer.toString(n2);
        int num = 0;
        for(int i=0;i<s2.length();i++){
            for(int j=i+1;j<s2.length();j++){
                char ch[] = s2.toCharArray();
                char t = ch[i];
                ch[i] = ch[j];
                ch[j] = t;
                int sum = 0;
                int k=0;
                while(k<ch.length){
                    sum= sum*10+ ch[k]-'0';
                    k++;
                }
                if(n1==sum){
                    System.out.println(n1+  " - > "+sum);
                    return true;
                }
            }
        }
        return false;
    }

    public int countPairs(int[] nums) {
        int count = 0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(checkNum(nums[i],nums[j]) || checkNum(nums[j], nums[i]))count++;
            }
        }
        return count;
    }
}
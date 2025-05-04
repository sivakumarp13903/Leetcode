class Solution {
    public int numEquivDominoPairs(int[][] arr) {
        int count =0;
        Map<Integer,Integer> map = new HashMap<>();
        int n = arr.length;
        for(int i=0;i<n;i++){
            int a = arr[i][0];
            int b = arr[i][1];
            for(int j=i+1;j<n;j++){
                int c = arr[j][0];
                int d = arr[j][1];
                if((a==c && b==d) || (a==d && b==c)){
                    count++;
                }
            }
        }
        
        return count;

    }
}
class Solution {
    public int hIndex(int[] arr) {
        int n=arr.length;
        Arrays.sort(arr);
        int c=0,k=1;
        for(int i=n-1 ;i>=0;i--){
            if(arr[i]>=k){
                c++;
                k++;
            }
            else{
                return c;
            }
        }
        return c;
    }
}
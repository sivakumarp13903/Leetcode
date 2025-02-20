class Solution {
    public int hIndex(int[] arr) {
        if(arr.length==1 && arr[0]>=1){
            return 1;
        }
        Arrays.sort(arr);
        int c=0,k=1;
        for(int i=arr.length-1 ;i>=0;i--){
            System.out.println(arr[i]+" "+k);
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
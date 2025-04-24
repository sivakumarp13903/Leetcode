class Solution {
    public int tribonacci(int n) {
        int sum=0;
        int arr[] = new int[38];
        int n1=0,n2=1;
        int n3=n1+n2;
        arr[1]=1;
        arr[2]=1;
        for(int i=3;i<38;i++){
            arr[i] = arr[i-3]+arr[i-2]+arr[i-1];
            
        }
        return arr[n];
    }
}
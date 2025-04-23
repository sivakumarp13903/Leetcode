class Solution {
    public boolean canPlaceFlowers(int[] arr, int n) {
        int size=arr.length;
        if(size==1 && arr[0]==0){
            n--;
        }
        for(int i=0;i<size;i++){
            if(arr[i]==0){
                if(i==0 && i+1<size && arr[i+1]==0){
                    arr[i]=1;
                    n--;
                }
                else if((i-1>=0 && i+1<size)){
                    if(arr[i-1]==0 && arr[i+1]==0){
                        arr[i]=1;
                        n--;
                    }
                }
                else if(i+1==size && i-1>=0 && arr[i-1]==0){
                    arr[i]=1;
                    n--;
                }
            }
        }
        return n<=0?true:false;
    }
}
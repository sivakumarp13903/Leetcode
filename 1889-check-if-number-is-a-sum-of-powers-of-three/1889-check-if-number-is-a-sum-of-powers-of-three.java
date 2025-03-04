class Solution {

    public void backTrack(int index,boolean flag[],boolean flagArr[],int arr[],int n){
        if(n==0){
            flag[0]=true;
            return;
        }
        else{
            for (int i = index; i < arr.length; i++) {
                if (!flagArr[i] && n == arr[i]) {
                    flag[0] = true;
                    return;
                }
                if (!flagArr[i] && arr[i] < n) {
                    flagArr[i] = true; 
                    backTrack(i, flag, flagArr, arr, n - arr[i]);
                    if (flag[0]) return; 
                    flagArr[i] = false; 
                }
            }
        }
    }

    public boolean checkPowersOfThree(int n) {
        int arr[]=new int[17];
        for(int i=0;i<arr.length;i++){
            arr[i]=(int)Math.pow(3,i);
            System.out.print(arr[i]+" ");
        }
        boolean flagArr[] = new boolean[17];
        boolean flag[] = new boolean[1];
        backTrack(0,flag,flagArr,arr,n);
        return flag[0];
    }
}

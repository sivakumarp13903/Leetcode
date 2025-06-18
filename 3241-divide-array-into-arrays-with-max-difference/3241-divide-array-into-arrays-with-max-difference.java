class Solution {

    public boolean checkSub(int[] arr,int k){
        int n1 = arr[2]-arr[1];
        int n2 = arr[2]-arr[0];
        int n3 = arr[1]-arr[0];
        if(n1>k || n2>k || n3>k){
            return false;
        }
        return true;
    }

    public int[][] divideArray(int[] nums, int k) {
        int arr[][] = new int[nums.length/3][3];
        int a = 0;
        Arrays.sort(nums);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j] = nums[a++];
            }
        }
        for(int subArr[] : arr){
            if(!checkSub(subArr,k)){
                return new int[0][];
            }
        }
        return arr;
    }
}
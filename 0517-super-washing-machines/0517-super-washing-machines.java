class Solution {
    public int findMinMoves(int[] arr) {
        int sum=0,n=arr.length;
        for(int i : arr){
            sum+=i;
        }
        int avg = sum/n;
        if (sum % n != 0) return -1;
        int max = Integer.MIN_VALUE;
        int  cum = 0;
        for (int i = 0; i < arr.length; i++) {
            int diff = arr[i] - avg;
            cum += diff;
            max = Math.max(max, Math.max(Math.abs(cum), diff));
        }
        return max;
    }
}
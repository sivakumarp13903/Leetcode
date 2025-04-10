class Solution {

    public int findKthPositive(int[] arr, int k) {
        Arrays.sort(arr);
        int num[] = new int[arr[arr.length-1]+5000];
        boolean flag[] = new boolean[arr[arr.length-1]+1];
        for(int i=0;i<arr.length;i++){
            num[arr[i]] = 1;
        }
        int c=0;
        for(int i=1;i<num.length;i++){
            if(num[i]==0){
                c++;

                 System.out.println(c+" "+i+" "+" "+k);
            }
            if(c==k){
                System.out.println("-> "+i);
                return i;
            }
           
        }
        return c;
    }
}
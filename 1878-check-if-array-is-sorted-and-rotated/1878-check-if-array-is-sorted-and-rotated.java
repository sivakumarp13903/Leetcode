class Solution {

    public boolean check(int[] nums) {
        int arr[]=nums.clone();
        int A[]=nums.clone();
        for(int i=0;i<nums.length;i++){
            boolean res=true;
            for(int j=1;j<A.length;j++){
                if(A[j-1]>A[j]){
                    res=false;break;
                }
            }
            if(res){
                return true;
            }
            int B[]=new int[A.length];
            for(int k=0;k<A.length;k++){
                B[k]=A[(k+1)%A.length];
            }
            for(int k =0;k<A.length;k++){
                A[k]=B[k];
            }
        }
        return false;
    }
}
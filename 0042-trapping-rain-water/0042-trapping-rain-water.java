class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int c =0 ;
        int maxLeft[] = new int[n];
        int maxRight[] = new int[n];
        int maxL = Integer.MIN_VALUE;
        int prev = 0;
        for(int i=0;i<n;i++){
            maxL = Math.max(prev,maxL);
            maxLeft[i] = maxL;
            prev = height[i];
        }
        prev =0;
        int maxR = Integer.MIN_VALUE;
        for(int i=n-1;i>=0;i--){
            maxR = Math.max(prev,maxR);
            maxRight[i] = maxR;
            prev = height[i];
        }
        for(int i : maxLeft){
            System.out.print(i+" ");
        }
        System.out.println();
        for(int i : maxRight){
            System.out.print(i+" ");
        }
        for(int i = 0;i<n;i++){
            int min = Math.min(maxLeft[i],maxRight[i]);
            if(min-height[i]>0){
                c+=(min-height[i]);
            }
        }
        return c;
    }
}
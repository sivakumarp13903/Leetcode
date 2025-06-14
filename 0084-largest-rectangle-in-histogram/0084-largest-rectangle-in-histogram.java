class Solution {
    public int largestRectangleArea(int[] heights) {
        int areaMax = 0;
        int n = heights.length;
        int left[] = new int[n];
        Stack<Integer> leftStack = new Stack<>();
        for(int i=0;i<n;i++){

            while(!leftStack.isEmpty() && heights[leftStack.peek()] >= heights[i] ){
                leftStack.pop();
            }

            if(leftStack.isEmpty()){
                left[i] = 0;
            }
            else{
                left[i] = leftStack.peek()+1;
            }
            leftStack.push(i);
        }

        int right[] = new int[n];
        Stack<Integer> rightStack = new Stack<>();
        for(int i=n-1;i>=0;i--){

            while(!rightStack.isEmpty() && heights[rightStack.peek()] >= heights[i] ){
                rightStack.pop();
            }

            if(rightStack.isEmpty()){
                right[i] = n-1;
            }
            else{
                right[i] = rightStack.peek()-1;
            }
            rightStack.push(i);
        }
        
        for(int i=0;i<n;i++){
            int area = heights[i] * (right[i] - left[i] +1);
            areaMax = Math.max(areaMax,area);
        }

        return areaMax;
    }
}
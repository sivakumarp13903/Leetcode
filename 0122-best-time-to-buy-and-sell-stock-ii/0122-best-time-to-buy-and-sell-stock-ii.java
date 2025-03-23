class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int sum=0,k=n-2;
        int i=n-1;
        while(i>=0 && k>=0){
                if(prices[k]<prices[i]){
                    sum=sum+(prices[i--]-prices[k--]);
                }
                else{
                    i--;
                    k--;
                }
            }
        
        return sum;
    }
}
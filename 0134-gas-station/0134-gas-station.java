class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int t1=0,t2=0;
        for(int i=0;i<gas.length;i++){
            t1+=gas[i];
            t2+=cost[i];
        }
        if(t1<t2)return -1;
        int totalCost = 0,start=0;
        for(int i=0;i<gas.length;i++){
            totalCost+=gas[i]-cost[i];
            if(totalCost<0){
                totalCost = 0;
                start = 1+i;
            }
        }
        return start;
    }
}
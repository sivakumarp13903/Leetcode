class Solution {
    public int countDays(int days, int[][] meetings) {
        Arrays.sort(meetings,(a,b) -> Integer.compare(a[0],b[0]));
        
        List<int[]> list = new ArrayList<>();
        int cur[] = meetings[0];
        for(int i = 1;i<meetings.length;i++){
            int next[] = meetings[i];
            if(cur[1]>=meetings[i][0]-1){
                cur[1] = Math.max(cur[1],meetings[i][1]);
            }
            else{
                list.add(cur);
                cur = next;
            }
        }
        list.add(cur);
        int metDays = 0;
        for(int interval[] : list){
            metDays += (interval[1]-interval[0]+1);
        }

        return days-metDays;
    }
}
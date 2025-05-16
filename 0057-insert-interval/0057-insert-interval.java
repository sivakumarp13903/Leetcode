class Solution {
    public int[][] insert(int[][] in, int[] newIn) {
        List<int[]> list = new ArrayList<>();

        int n = in.length;
        int i=0;
        while(i<n && in[i][1]<newIn[0]){
            list.add(in[i]);
            i++;
        }

        while(i<n && newIn[1]>=in[i][0]){
            newIn[0] = Math.min(newIn[0],in[i][0]);
            newIn[1] = Math.max(newIn[1],in[i][1]);
            i++;
        }
        list.add(newIn);

        while(i<n){
            list.add(in[i]);
            i++;
        }
        
        return list.toArray(new int[list.size()][]);
    }
}
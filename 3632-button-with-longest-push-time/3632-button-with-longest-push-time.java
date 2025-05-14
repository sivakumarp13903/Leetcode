class Solution {
    public int buttonWithLongestTime(int[][] events) {
        int n = events.length;
        int arr[][] = new int[n][2];
        arr[0][0] = events[0][0];
        arr[0][1] = events[0][1];
        for(int i=1;i<n;i++){
            arr[i][0] = events[i][0];
            arr[i][1] = events[i][1]-events[i-1][1];
        }
        int max =0;
        for(int i=0;i<n;i++){
            max = Math.max(max,arr[i][1]);
        }
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(arr[i][1]==max){
                list.add(arr[i][0]);
            }
        }
        Collections.sort(list);
        return list.get(0);
    }
}
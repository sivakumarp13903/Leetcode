class Solution {
    public int[][] merge(int[][] arr) {
        if(arr.length<=1){
            return arr;
        }
        Arrays.sort(arr,(a,b) -> Integer.compare(a[0],b[0]));
        List<int[]> list  = new ArrayList<>();
        int[] cur = arr[0];
        for(int i=0;i<arr.length;i++){
            if(cur[1]>=arr[i][0]){
                cur[1] = Math.max(cur[1],arr[i][1]);
            }
            else{
                list.add(cur);
                cur = arr[i];
            }
        }
        list.add(cur);
        return list.toArray(new int[list.size()][]);
    }
}
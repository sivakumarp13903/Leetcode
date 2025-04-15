class Solution {
    public int mostFrequentEven(int[] nums) {
        int n=-1;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i : nums){
            if(i%2==0){
                map.put(i,map.getOrDefault(i,0)+1);
            }
        }
        if(map.isEmpty()){
            return -1;
        }
        int arr[][] = new int[map.size()][2];
        int k=0;
        int max = Integer.MAX_VALUE;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            int key = entry.getKey();
            int val = entry.getValue();
            arr[k][0] = key;
            arr[k][1] = val;
            k++;

        }
        Arrays.sort(arr, (a, b) -> {
            if (a[1] != b[1]) {
                return a[1] - b[1];             }
            return b[0] - a[0];
        });
        return arr[arr.length-1][0];
    }
}
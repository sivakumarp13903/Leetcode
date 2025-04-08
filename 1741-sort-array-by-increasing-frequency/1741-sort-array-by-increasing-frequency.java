class Solution {
    public int[] frequencySort(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int arr[][] = new int[map.size()][2];
        int k=0;
        System.out.println(map);
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            int key = entry.getKey();
            int val = entry.getValue();
            arr[k][0]=key;
            arr[k][1]=val;
            k++;
        }
        Arrays.sort(arr, (a, b) -> {
            if (a[1] == b[1]) {
                return b[0] - a[0]; 
            }
            return a[1] - b[1];
        });
        int t=0;
        int res[] = new int[nums.length];
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i][0] + " -> "+arr[i][1]);
            for(int j=0;j<arr[i][1];j++){
                res[t++] = arr[i][0];
            }
        }        
        return res;
        
    }
}
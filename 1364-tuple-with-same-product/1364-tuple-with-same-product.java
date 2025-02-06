class Solution {
    public int tupleSameProduct(int[] nums) {
        int res=0;
        Map<Integer,Integer> map = new HashMap();
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                int p = nums[i]*nums[j];
                map.put(p,map.getOrDefault(p,0)+1);
            }
        }
        System.out.print(map);
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            int count = entry.getValue();
            if(entry.getValue()>1){
                res+=count*(count-1)*4;
            }
        }
        return res;

    }
}
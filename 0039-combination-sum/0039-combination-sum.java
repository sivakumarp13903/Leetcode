class Solution {

    public void backTrack(int index,List<List<Integer>> list,List<Integer> list1,int target,int[] can){
        if(target == 0){
            list.add(new ArrayList<>(list1));
            return;
        }
        else{
            for(int i=index;i<can.length;i++){
                if(can[i]<=target){
                    list1.add(can[i]);
                    backTrack(i,list,list1,target-can[i],can);
                    list1.remove(list1.size()-1);
                }
            }
        }
    }

    public List<List<Integer>> combinationSum(int[] can, int target) {
       List<List<Integer>> list = new ArrayList<>();
       backTrack(0,list,new ArrayList<>(),target,can);
       return list;
    }
}
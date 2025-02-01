class Solution {

    public void backTrack(int  index,int[] arr,int size,int n,List<List<Integer>> list,List<Integer> stack){
        if(n==0 && stack.size()==size){
            list.add(new ArrayList<>(stack));
        
        }
        else{
            for(int i=index;i<arr.length;i++){
                if(n<arr[i]){
                    break;
                }
                stack.add(arr[i]);
                System.out.println(stack);
                backTrack(i+1,arr,size,n-arr[i],list,stack);
                stack.remove(stack.size()-1);
            }
        }
    }

    public List<List<Integer>> combinationSum3(int size, int n) {
        int arr[] = new int[]{1,2,3,4,5,6,7,8,9};
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> stack = new ArrayList<>();
        backTrack(0,arr,size,n,list,stack);
        return list;
    }
}
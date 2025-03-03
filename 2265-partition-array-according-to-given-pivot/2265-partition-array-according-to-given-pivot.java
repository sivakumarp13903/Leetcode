class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> pre = new ArrayList<>();
        List<Integer> post = new ArrayList<>();
        int c=0;
        for(int i : nums){
            if(i<pivot){
                pre.add(i);
            }
            else if(i==pivot){
                c++;
            }
            else{
                post.add(i);
            }
        }
        int arr[] = new int[nums.length];
        int k=0;
        for(Integer i : pre){
            arr[k++]=i;
        }
        while(c>0){
            arr[k++]=pivot;
            c--;
        }
        for(Integer i : post){
            arr[k++]=i;
        }
        return arr;            
    }
}
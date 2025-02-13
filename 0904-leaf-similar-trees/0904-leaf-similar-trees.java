/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

    public void backTrack1(TreeNode root1,List<Integer> list1){
        if(root1==null){
            return;
        }
        if(root1.left==null && root1.right==null){
            list1.add(root1.val);
            return;
        }
        else if(root1.left==null){
            backTrack1(root1.right,list1);
            return;
        }
        else if(root1.right==null){
            backTrack1(root1.left,list1);
            return;
        }
        else{
            backTrack1(root1.left,list1);
            backTrack1(root1.right,list1);            
        }
    }

    public void backTrack2(TreeNode root2,List<Integer> list2){
        if(root2==null){
            return;
        }
        if(root2.left==null && root2.right==null){
            list2.add(root2.val);
            return;
        }
         else if(root2.left==null){
            backTrack2(root2.right,list2);
            return;
        }
        else if(root2.right==null){
            backTrack2(root2.left,list2);
            return;
        }
        else{
            backTrack2(root2.left,list2);
            backTrack2(root2.right,list2);            
        }
    }

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        boolean flag = true;
        backTrack1(root1,list1);
        backTrack2(root2,list2);
        System.out.println(list1);
        System.out.println(list2);
        if(list1.size()!=list2.size()){
            return false;
        }
        for(int i =0 ;i<list1.size();i++){
            System.out.println(list1.get(i)+" -> "+list2.get(i));
            if(list1.get(i)-list2.get(i)!=0){
                System.out.println("bvfhvbveh");
                return false;
            }
        }
        return true;
    }
}
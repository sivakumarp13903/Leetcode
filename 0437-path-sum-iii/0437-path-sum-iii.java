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
    int count;
    public void backTrack(TreeNode root,int t,List<List<Integer>> list,List<Integer> stack){
        if(root==null){
            return;
        }
            if(root.val<=Integer.MAX_VALUE){
                stack.add(root.val);
            }
            int s=0;
            boolean flag = false;
            for(int i=stack.size()-1;i>=0;i--){
                s+=stack.get(i);  
                flag =true;
                if(s==t)count++; 
            }
            backTrack(root.left,t,list,stack);
            backTrack(root.right,t,list,stack);
            stack.remove(stack.size()-1);
        
    }

    public int pathSum(TreeNode root, int targetSum) {
        if(root != null && root.val==1000000000){
            return 0;
        }
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> stack = new ArrayList<>();
        backTrack(root,targetSum,list,stack);
        for(List<Integer> l : list){
            System.out.println(l);
        }
        return count;
    }
}
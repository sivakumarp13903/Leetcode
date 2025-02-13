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

    public void backTrack(List<Integer> list,TreeNode root,int r){
        if(root==null){
            return;
        }
        if(list.isEmpty() && r==0){
            r=root.val;
            list.add(r);
        }
        else if(r<=root.val){
            r=root.val;
            list.add(r);
        }
        backTrack(list,root.left,r);
        backTrack(list,root.right,r);
    }

    public int goodNodes(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        int r=0;
        backTrack(list,root,r);
        return list.size();
    }
}
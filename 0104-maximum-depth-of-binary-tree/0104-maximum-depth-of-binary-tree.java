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
    static int max=0;
    public void backTrack(TreeNode root,int c){
        if(root==null){
            System.out.println(max);
            max=Math.max(c,max);
            return;
        }
        else{
            c++;
            System.out.print(c);
            backTrack(root.left,c);
            backTrack(root.right,c);
            c--;
        }
    }

    public int maxDepth(TreeNode root) {
        int c=0;
        backTrack(root,c);
        int v=max;
        max=0;
        return v;
    }
}
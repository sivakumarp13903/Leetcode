/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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

     public TreeNode constructTree(int nums[],int left,int right){
        if(left>right){
            return null;
        }
        int mid =left+(right-left)/2;
        TreeNode root = new TreeNode(nums[mid]);

        root.left = constructTree(nums,left,mid-1);
        root.right = constructTree(nums,mid+1,right);

        return root;
    }

    public TreeNode sortedListToBST(ListNode head) {
        TreeNode root = new TreeNode();
        ListNode temp = head;
        int c=0;
        while(temp!=null){
            // System.out.println(temp.val);
            c++;
            temp=temp.next;
        }
        int arr[]=new int[c];
        temp=head;
        int i=0;
        while(temp!=null){
            // System.out.println(temp.val);
            arr[i++]=temp.val;
            temp=temp.next;
        }
        for(int j : arr){
            System.out.println(j);
        }
        return constructTree(arr,0,arr.length-1);
    }
}
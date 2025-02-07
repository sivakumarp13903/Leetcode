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
class Solution {
    public int pairSum(ListNode head) {
        List<Integer> list = new ArrayList<>();
        ListNode t =head;
        int s=head.val,e=0;
        while(t!=null){
            list.add(t.val);
            t=t.next;
        }
        System.out.print(list);
        int i=0,j=list.size()-1;
        int res=0;
        while(i<=j){
            res=Math.max(res,list.get(i)+list.get(j));
            i++;j--;
        }
        return res;
    }
}
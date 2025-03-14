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
    public ListNode deleteMiddle(ListNode head) {
        int c=0;
        ListNode temp = head;
        while(temp!=null){
            c++;
            temp=temp.next;
        }
        if(c==1){
            return null;
        }
        c=(c/2)+1;
        System.out.print(c);
        
        temp=head;
        ListNode prev=temp;
        int i=1;
        while(temp!=null){
            if(c==i){
                if(temp.next != null){
                    prev.next= temp.next;
                }
                else{
                    prev.next=null;
                }
            }
            prev=temp;
            temp=temp.next;
            i++;
        }
        return head;
    }
}
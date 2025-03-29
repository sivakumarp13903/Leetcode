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
    public ListNode sortList(ListNode head) {
        List<Integer> list = new ArrayList<>();
        ListNode temp = head;
        while(temp!=null){
            list.add(temp.val);
            temp = temp.next;
        }
        Collections.sort(list);
        head = null;
        ListNode prev = null;
        for(Integer i : list){
            if(head==null && prev ==null){
               ListNode newNode = new ListNode(i);
               head = newNode;
               prev = head; 
            }
            else{
                ListNode newNode = new ListNode(i);
                prev.next = newNode;
                prev = newNode;
            }
        }
        return head;
    }
}
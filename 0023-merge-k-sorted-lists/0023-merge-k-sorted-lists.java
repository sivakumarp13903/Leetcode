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
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode head = null;
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<lists.length;i++){
            ListNode node = lists[i];
            while(node!=null){
                list.add(node.val);
                node = node.next;
            }
        } 
        Collections.sort(list);
        ListNode temp = null;
        for(Integer i : list){
            ListNode newNode =new ListNode(i);
            if(head==null){
                head = newNode;
                temp = head;
            }
            else{
                temp.next = newNode;
                temp = temp.next;
            }
        }
        return head;
    }
}
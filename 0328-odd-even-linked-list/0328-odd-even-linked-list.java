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
    public ListNode oddEvenList(ListNode head) {
        List<Integer>  odd = new ArrayList<>();
        List<Integer>  even = new ArrayList<>();
        ListNode temp1 = head;
        int c=1;
        while( temp1 !=null){
            if(c%2 != 0){
                odd.add(temp1.val);
            }
            else{
                even.add(temp1.val);
            }
            temp1=temp1.next;
            c++;
        }
        System.out.print(odd+" "+even);
        ListNode res = new ListNode();
        ListNode head1=null; 
        for(Integer i : odd){
            ListNode newNode = new ListNode(i);
            if (head1 == null) { 
                 head1 = newNode;
            } else {
                ListNode temp = head1;
                while (temp.next != null) { 
                    temp = temp.next;
                }
                temp.next = newNode;
            }
        }
        for(Integer i : even){
            ListNode newNode = new ListNode(i);
            if (head1 == null) { 
                 head1 = newNode;
            } else {
                ListNode temp = head1;
                while (temp.next != null) { 
                    temp = temp.next;
                }
                temp.next = newNode;
            }
        }
        return head1;
    }
}
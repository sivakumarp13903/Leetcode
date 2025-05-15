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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null)return head;
        List<Integer> list = new ArrayList<>();
        ListNode temp = head;
        while(temp!=null){
            list.add(temp.val);
            temp = temp.next;
        }
        int[] arr = list.stream().mapToInt(Integer::intValue).toArray();
        k=k%arr.length;
        while(k>0){
            int t = arr[arr.length-1];
            for(int i = arr.length - 1; i > 0; i--){
                arr[i] = arr[i-1];
            }
            arr[0] = t;
            k--;
        }
        ListNode res = new ListNode(arr[0]);
        temp = res;
        for(int i=1;i<arr.length;i++){
            temp.next = new ListNode(arr[i]);
            temp = temp.next;
        }

        return res;
    }
}
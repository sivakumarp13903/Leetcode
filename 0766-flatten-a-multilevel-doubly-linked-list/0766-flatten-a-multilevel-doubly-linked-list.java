/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/


class Solution {
    public List<Integer> list;

    public List<Integer> findNode(Node head , List<Integer> list){
        if(head == null){
            return list;
        }
        Node temp = head;
        while(temp!=null){
            list.add(temp.val);
            if(temp.child!=null){
                list =  findNode(temp.child,list);
            }
            temp = temp.next;
        }
        return list;
    }
    public Node flatten(Node head) {
        list = new LinkedList<>();
        list = findNode(head,list);
        System.out.println(list);

        if (list.size() == 0) return null;

        Node newHead = new Node();
        newHead.val = list.get(0);
        Node current = newHead;

        for (int i = 1; i < list.size(); i++) {
            Node newNode = new Node();
            newNode.val = list.get(i);

            current.next = newNode;
            newNode.prev = current;
            current = newNode;
        }
        return newHead;
    }
}
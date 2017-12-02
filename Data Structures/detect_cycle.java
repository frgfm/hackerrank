/*
Detect a cycle in a linked list. Note that the head pointer may be 'null' if the list is empty.

A Node is defined as: 
    class Node {
        int data;
        Node next;
    }
*/

boolean hasCycle(Node head) {
    Node current = head;
    HashMap<Node,Integer> nodecount = new HashMap<>();
    while(current != null){
        if (nodecount.containsKey(current)){
            return true;
        } else{
            nodecount.put(current, 1);
        }
        current = current.next;
    }
    return false;
}

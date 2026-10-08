public class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

class MyLinkedList {
    ListNode head;
    int size; // Added to easily handle out-of-bounds cases

    public MyLinkedList() {
        head = new ListNode(-1); // Dummy node
        size = 0;
    }
    
    public int get(int index) {
        if (index < 0 || index >= size) return -1; // Boundary check
        
        ListNode curr = head.next;
        for (int i = 0; i < index; i++) {
            curr = curr.next;
        }
        return curr.val;
    }
    
    public void addAtHead(int val) {
        ListNode newNode = new ListNode(val);
        newNode.next = head.next;
        head.next = newNode;
        size++;
    }
    
    public void addAtTail(int val) {
        ListNode curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = new ListNode(val);
        size++;
    }
    
    public void addAtIndex(int index, int val) {
        if (index > size) return; // Spec: If index > length, do not insert
        if (index < 0) index = 0; // Spec: If index is negative, insert at head
        
        ListNode curr = head;
        for (int i = 0; i < index; i++) {
            curr = curr.next;
        }
        
        ListNode newNode = new ListNode(val);
        newNode.next = curr.next;
        curr.next = newNode;
        size++;
    }
    
    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) return; // Boundary check
        
        ListNode curr = head;
        for (int i = 0; i < index; i++) {
            curr = curr.next;
        }
        
        curr.next = curr.next.next;
        size--;
    }
}


/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
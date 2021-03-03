public class ListNode {
    int val;
    ListNode next;
    public ListNode(){};
    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode listNode) {
        this.val = val;
        this.next = listNode;
    }
}

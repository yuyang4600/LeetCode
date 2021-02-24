public class Solution1 {
    static ListNode ns4 = new ListNode(-1);
    static ListNode n4 =  ns4;
    static ListNode ns5 = new ListNode(-1);
    static ListNode n5 = ns5;
    public static void main(String[] args) {

        Solution1 solution = new Solution1();

        for (int i = 0 ; i < 5; i ++) {
            ListNode listNode = new ListNode(i);
            n4.next = listNode;
            n4 = n4.next;
            ListNode listNode1 = new ListNode(i);
            n5.next = listNode1;
            n5 = n5.next;
        }
        ListNode node = solution.mergeTwoLists(ns4.next, ns5.next);
        while (node.next != null) {
            System.out.println(node.val);
            node = node.next;
        }
        System.out.println(node.val);
    }
    public ListNode mergeTwoLists(ListNode n1, ListNode n2) {
        if (n1 == null) {
            return n2;
        } else if (n2 == null) {
            return n1;
        }
        if (n1.val <= n2.val) {
            n1.next = mergeTwoLists(n1.next, n2);
            return n1;
        } else {
            n2.next = mergeTwoLists(n1, n2.next);
            return n2;
        }
    }


    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}

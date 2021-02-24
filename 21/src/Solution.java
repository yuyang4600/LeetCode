import java.util.List;

public class Solution {

    static ListNode ns4 = new ListNode(-1);
    static ListNode n4 =  ns4;
    static ListNode ns5 = new ListNode(-1);
    static ListNode n5 = ns5;
    public static void main(String[] args) {

        Solution solution = new Solution();

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
        ListNode nn = new ListNode(-1);
        ListNode n3 = nn;  //对象，引用传递
        while (n1 != null && n2 != null) {
            if (n1.val <= n2.val) {
                n3.next = n1;
                n1 = n1.next;
            } else {
                n3.next = n2;
                n2 = n2.next;
            }

            n3 = n3.next;
        }
        n3.next = n1 == null ? n2 : n1;
        return nn.next;

    }



//      Definition for singly-linked list.
      public static class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

}

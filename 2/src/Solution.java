import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        ListNode n1 = new ListNode(9);
        ListNode n2 = new ListNode(9);
        ListNode n3 = new ListNode(9);
        ListNode n4 = new ListNode(9);
        ListNode n5 = new ListNode(9);
        ListNode n6 = new ListNode(9);
        ListNode n7 = new ListNode(0);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = n7;

        ListNode n8 = new ListNode(9);
        ListNode n9 = new ListNode(9);
        ListNode n10 = new ListNode(9);
        ListNode n11 = new ListNode(0);
        n8.next = n9;
        n9.next = n10;
        n10.next = n11;

        ListNode listNode = addTwoNumbers(n7, n11);
        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3 = l1;
        int carry = 0;
        int resValue = 0;
        while (true){
            resValue = l3.val + l2.val + carry;
            if (resValue >= 10) {
                carry = 1;
                resValue = resValue - 10;
            } else {
                carry = 0;
            }
            l3.val = resValue;
            if (l3.next == null && l2.next != null) {
                l3.next = new ListNode(0);
            }
            if (l3.next != null && l2.next == null) {
                l2.next = new ListNode(0);
            }
            if (l3.next == null && l2.next == null) {
                if (carry == 1) {
                    l3.next = new ListNode(1);
                }
                break;
            }
            l3 = l3.next;
            l2 = l2.next;
        }
        return l1;
    }

    private static void function(ListNode l3, int carry) {
        int resValue;
        while (true) {
            resValue = l3.val + carry;
            if (resValue >= 10) {
                carry = 1;
                resValue = resValue - 10;
            } else {
                carry = 0;
            }
            l3.val = resValue;
            if(l3.next == null && carry == 1) {
                l3.next = new ListNode(1);
                break;
            }
            l3 = l3.next;
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

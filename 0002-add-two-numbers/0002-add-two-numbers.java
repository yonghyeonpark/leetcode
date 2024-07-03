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
import java.math.BigInteger;

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        BigInteger bigInteger1 = toBigInteger(reverseNode(l1));
        BigInteger bigInteger2 = toBigInteger(reverseNode(l2));
        BigInteger added = bigInteger1.add(bigInteger2);
        
        ListNode prev = null;
        for (char c : String.valueOf(added).toCharArray()) {
            ListNode node = new ListNode(Character.getNumericValue(c));
            node.next = prev;
            prev = node;
        }
        return prev;
    }

    private BigInteger toBigInteger(ListNode node) {
        String s = "";
        while (node != null) {
            s += node.val;
            node = node.next;
        }
        return new BigInteger(s);
    }

    private ListNode reverseNode(ListNode node) {
        ListNode rev = null;
        while (node != null) {
            ListNode tem = node.next;
            node.next = rev;
            rev = node;
            node = tem;
        }
        return rev;
    }
}
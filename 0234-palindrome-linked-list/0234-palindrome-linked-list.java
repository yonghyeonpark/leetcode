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
    public boolean isPalindrome(ListNode head) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();

        while (head != null) {
            deque.add(head.val);
            head = head.next;
        }

        while (deque.peek() != null) {
            if (deque.size() == 1) {
                return true;
            }
            if (deque.pollFirst() != deque.pollLast()) {
                return false;
            }
        }
        return true;
    }
}
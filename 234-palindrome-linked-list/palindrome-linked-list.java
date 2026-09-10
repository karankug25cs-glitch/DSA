import java.util.*;
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
        if(head == null || head.next == null) return true;
        // Stack<Integer> mp = new Stack<>();
        // ListNode temp = head;
        // while(temp != null){
        //     mp.push(temp.val);
        //     temp = temp.next;
        // }
        // temp = head;
        // while(temp != null){
        //     if(temp.val != mp.pop()) return false;
        //     temp = temp.next;
        // }
        // return true;

        //-------------
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode second = reverse(slow.next);
        ListNode first = head;
        while(second != null){
            if(first.val != second.val){
                reverse(slow.next);
                return false;
            }
            second = second.next;
            first = first.next;
        }
        reverse(slow.next);
        return true;
        
    }
    public ListNode reverse(ListNode head){
        if(head == null || head.next == null) return head;
        ListNode prev = null;
        ListNode current = head;
        while(current != null){
            ListNode nextp = current.next;
            current.next = prev;
            prev = current;
            current = nextp;
        }
        return prev;
    }
}
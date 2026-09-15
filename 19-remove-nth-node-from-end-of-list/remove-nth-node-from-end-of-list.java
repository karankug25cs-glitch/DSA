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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next == null ) return null;
        ListNode temp = head;
        ListNode prev = head;
        int c = 0;
        while(temp != null){
            c++;
            temp = temp.next;
        }
        temp = head;
        if(n > c) return head;
        int k = c - n + 1;
        if(k == 1) return head.next;
        while(temp != null){
            k--;
            if(k == 0)break;
            prev = temp;
            temp = temp.next;
        }
        prev.next = temp.next;
        return head;
    }  
}
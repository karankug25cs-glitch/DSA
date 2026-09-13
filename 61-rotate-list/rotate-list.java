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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null) return head;
        ListNode temp = head;
        int c = 0;
        while(temp != null){
            c++;
            temp = temp.next;
        }
        temp = head;
        k = k  % c;
        if(k == 0) return head;
        int n = c-k;
        while(temp != null){
            n--;
            if(n == 0) break;
            temp = temp.next;
        }
        ListNode sec = temp.next; 
        temp.next = null;
        ListNode temp2 = sec;
        while(temp2.next != null){
            temp2 = temp2.next;
        }
        temp2.next = head;
        return sec;
    }
}
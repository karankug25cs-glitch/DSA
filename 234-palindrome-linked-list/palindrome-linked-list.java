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
        Stack<Integer> mp = new Stack<>();
        ListNode temp = head;
        int len = 0;
        while(temp != null){
            len++;
            temp = temp.next;
        }
        temp = head;
        int mid = (len/2);
        for(int i=0; i< mid ; i++){
            mp.push(temp.val);
            temp = temp.next;
        }
        if(len % 2 != 0) temp = temp.next;
        while(temp != null){
            if(temp.val != mp.pop()) return false;
            temp = temp.next; 
        }
        return true;
    }
}
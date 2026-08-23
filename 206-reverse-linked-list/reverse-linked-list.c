/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* reverseList(struct ListNode* head) {
    struct ListNode * prevnode , *currentnode,  *nextnode;
    currentnode = head;
    nextnode = head;
    prevnode = 0;
    while(nextnode != 0){
        nextnode = nextnode->next;
        currentnode->next = prevnode;
        prevnode = currentnode;
        currentnode = nextnode;
    }
    return prevnode;
} 
/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* middleNode(struct ListNode* head) {
    struct ListNode *temp;
    temp = head;
    int c = 0;
    while(temp != 0){
        c++;
        temp = temp->next;
    }
    int midnode = c/2 + 1;
    temp = head;
    while(temp != 0){
        midnode--;
        if(midnode == 0) break;
        temp = temp->next;
    }
    return temp;
}
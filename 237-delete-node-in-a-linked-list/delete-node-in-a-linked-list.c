/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
void deleteNode(struct ListNode* node) {
    struct ListNode *temp;
    temp = node;
    while(temp->next->next != 0){
        temp = temp->next;
        node->val = temp->val;
        node = node->next;
    }
    temp = temp->next;
    node->val = temp->val;
     node->next = 0;
}
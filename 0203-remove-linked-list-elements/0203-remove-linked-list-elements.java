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
    public ListNode removeElements(ListNode head, int val) {
        while(head!=null && head.val==val){
            head=head.next;
        }
        ListNode c = head;
        while(c !=null && c.next!=null){
        if(c.next.val==val){
            c.next = c.next.next;
        }else{
            c=c.next;
        }
            }  
            return head;  
        }
}
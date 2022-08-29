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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode p=head;
        ListNode t=head;
        if(t==null) return t;
        t=t.next;
        while(t!=null){
            if(p.val==t.val){
                t=t.next;
            }
            if(t==null) p.next=t;
           else if(p.val!=t.val){
               p.next=t;
               p=p.next;
               t=t.next;
           }
        }//while
        return head;
    }
}
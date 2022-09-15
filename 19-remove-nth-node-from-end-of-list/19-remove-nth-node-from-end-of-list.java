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
        ListNode newNode=new ListNode();
newNode.next=head;
    
ListNode first=newNode;//i.e 1 step behind head;
    
ListNode start=newNode;//i.e. 1 step behind head;
    
    for(int i=0;i<n;i++)
    {
        first=first.next;
    }
    
    if(first.next==null){//i.e when n=list.size();
        first=first.next;
        return start.next.next;
    }
    
    while(first.next!=null)
    {
        first=first.next;
        start=start.next;
    }
    
    
    start.next=start.next.next;
    return head;
    }
}
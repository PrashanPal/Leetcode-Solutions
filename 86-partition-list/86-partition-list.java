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
    public ListNode partition(ListNode head, int x) {
        if(head==null){
            return null;
        }
        ListNode t=head;
        ListNode a=new ListNode(-1000);
        ListNode b=new ListNode(-2000);
        ListNode a1=a;
        ListNode b1=b;
        while(t!=null){
            if(t.val<x){
                ListNode ta=new ListNode(t.val);
                a1.next=ta;
                a1=a1.next;
            }
           else if(t.val>=x){
                ListNode tb=new ListNode(t.val);
                b1.next=tb;
                b1=b1.next;
            }
            t=t.next;
        }
        a=a.next;
        b=b.next;
        if(a==null&&b==null) return null;
       else if(a==null&&b!=null) return b;
       else if(a!=null&&b==null) return a;
        ListNode t2=a;
        while(t2.next!=null){
            t2=t2.next;
        }
        t2.next=b;
        return a;
    }
}
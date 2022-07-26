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
    //[1,1,1,1,2,3]
// 1
// [2,1,1,1,3,4,5]
// 1
// [1]
// 1
// [1,2,2,2,3,4,5]
// 1
// [1,2,3,4,5]
// 5
// [1,2,3,4,5,5,5]
// 5
// [1,2,3,4,5,6]
// 4
    public ListNode removeElements(ListNode head, int val) {
        //this is mine method
        if(head==null) return head;
        ListNode t=head;
        ListNode p=new ListNode(-1);
        if(head.val==val){
            while(t!=null&&t.val==val){
                t=t.next;
            }
            head=t;
            p.next=head;
         if(t==null) return t;
        }//if
        while(t!=null){
            if(t.val==val){
                while(t!=null&&t.val==val){
                    t=t.next;
                }//while
            }//if
            p.next=t;
            p=p.next;
            if(t!=null) t=t.next;
        }//while
      
        return head;
    }//fn
}
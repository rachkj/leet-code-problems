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
    public ListNode midNode(ListNode head){
        ListNode slow=head,fast=head;
        while(fast.next!=null && fast.next.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }

    public ListNode revList(ListNode head){
        ListNode prev=null;
        while(head!=null){
            ListNode nn = head.next;
            head.next=prev;
            prev=head;
            head=nn;
        }
        return prev;
    }
    public void reorderList(ListNode head) {
        ListNode midNode=midNode(head);
        ListNode nextToMid=midNode.next;
        midNode.next=null;
        ListNode p2=revList(nextToMid);

        ListNode p1 =  head; 
        while(p2!=null){
            //preserve
            ListNode n1 = p1.next;
            ListNode n2 = p2.next;

            //link;
            p1.next = p2;
            p2.next = n1;

            //move
            p1 = n1;
            p2 = n2;
        
        }          

    }
}

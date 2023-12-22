/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> visitedNodes=new HashSet<>();
        ListNode curNode = head;
        while (curNode != null){
            if (visitedNodes.contains(curNode)){
                return true;
            }
            visitedNodes.add(curNode);
            curNode=curNode.next;
        }
        return false;
    }
}

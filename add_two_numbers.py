# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def addTwoNumbers(self, l1: Optional[ListNode], l2: Optional[ListNode]) -> Optional[ListNode]:
        res=ListNode()
        sum=0
        cur=res
        while l1 is not None or l2 is not None or sum is not 0:
            if l1 is not None:
                sum=sum+l1.val
                l1=l1.next
            if l2 is not None:
                sum=sum+l2.val
                l2=l2.next
            cur.next=ListNode(sum%10)
            sum=sum//10
            cur=cur.next
        return res.next

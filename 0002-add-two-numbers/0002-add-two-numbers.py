# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next


class Solution:
    def addTwoNumbers(self, l1: Optional[ListNode], l2: Optional[ListNode]) -> Optional[ListNode]:
        answer = ListNode()
        s = answer
        carry = 0 # 올림수

        # 만약 l1, l2, 올림수가 있다면
        while l1 or l2 or carry:
            sum = 0
            if l1: # l1 노드 계산
                sum += l1.val
                l1 = l1.next
            if l2:  # l2 노드 계산
                sum += l2.val
                l2 = l2.next

            sum += carry # 올림수 계산

            carry = sum // 10 # 올림수 업데이트
            sum %= 10
            s.next = ListNode(sum)
            s = s.next
        return answer.next


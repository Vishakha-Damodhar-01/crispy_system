problem 141 easy
  Two pointer
  linked_list_cycle.java

  class ListNode:

  def __init__(self, x):
    self.val = x
    self.next = None


def hasCycle(head: Optional[ListNode]) -> bool:
  slow = fast = head
  while fast and fast.next:
    slow = slow.next
    fast = fast.next.next
    if slow == fast:
      return True
  return False

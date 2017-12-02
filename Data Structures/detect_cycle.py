"""
Detect a cycle in a linked list. Note that the head pointer may be 'None' if the list is empty.

A Node is defined as: 
 
    class Node(object):
        def __init__(self, data = None, next_node = None):
            self.data = data
            self.next = next_node
"""


def has_cycle(head):
    current = head
    visited = {}
    while current != None:
        if current in visited:
            return 1
        else:
            visited[current] = True
        current = current.next
    return 0
    

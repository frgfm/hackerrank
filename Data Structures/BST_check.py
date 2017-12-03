""" Node is defined as
class node:
    def __init__(self, data):
        self.data = data
        self.left = None
        self.right = None
"""
last = None
def checkBST(root):
    global last
    if root == None:
        return True
    else:
        if not checkBST(root.left):
            return False
        if (last != None and root.data <= last):
            return False
        last = root.data
        if not checkBST(root.right):
            return False
        return True

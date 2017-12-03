class Stack:
     def __init__(self):
         self.items = []

     def isEmpty(self):
         return self.items == []

     def push(self, item):
         self.items.append(item)

     def pop(self):
         return self.items.pop()

     def peek(self):
         return self.items[len(self.items)-1]

     def size(self):
         return len(self.items)

class MyQueue(object):
    newest = Stack()
    oldest = Stack()
    def __init__(self):
        self.newest = Stack()
        self.oldest = Stack()
        
    def shiftStacks(self):
        if self.oldest.isEmpty():
            while not self.newest.isEmpty():
                self.oldest.push(self.newest.pop())
    
    def peek(self):
        self.shiftStacks()
        return self.oldest.peek()
        
    def pop(self):
        self.shiftStacks()
        return self.oldest.pop()
        
    def put(self, value):
        self.newest.push(value)

queue = MyQueue()
t = int(input())
for line in range(t):
    values = map(int, input().split())
    values = list(values)
    if values[0] == 1:
        queue.put(values[1])        
    elif values[0] == 2:
        queue.pop()
    else:
        print(queue.peek())
        

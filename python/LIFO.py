import sys 
class Stack: 
    def __init__(self): 
        self.s = [] 
  
    def push(self, data): 
        self.s.append(data) 
      
    def pop(self): 
        return self.s.pop() 
  
    def peek(self): 
        return self.s[-1] 
    def count(self): 
        return len(self.s) 
  
def printStack(s): 
      
    if s.count() == 0: 
        return
    x = s.peek() 
  
    s.pop() 
      
    printStack(s) 
 
    print("{} ".format(x), end = "") 
      

    s.push(x) 
  

if __name__=='__main__': 
    s=Stack() 
    s.push(1) 
    s.push(2) 
    s.push(3) 
    s.push(4) 
    printStack(s) 
    print("Tiek dzests pedejais ievaditais elemensts")
    s.pop();
    print("Stack pec izdesanas")
    printStack(s) 
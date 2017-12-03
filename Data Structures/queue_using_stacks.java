import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class MyQueue<Integer>{
    Stack<Integer> oldest = new Stack<Integer>();
    Stack<Integer> newest = new Stack<Integer>();
    
    public void shiftStacks(){
        if (this.oldest.isEmpty()){
            while (!this.newest.isEmpty()){
                this.oldest.push(this.newest.pop());
            }
        }
    }
    
    public void enqueue(Integer item){
        this.newest.push(item);
    }
    
    public Integer dequeue(){
        shiftStacks();
        return this.oldest.pop();        
    }
    
    public Integer peek(){
        shiftStacks();
        return this.oldest.peek();     
    }
    
    public boolean isEmpty(){
        return (this.oldest == null & this.newest == null);
    }
    
}

public class Solution {
    public static void main(String[] args) {
        MyQueue<Integer> queue = new MyQueue<Integer>();

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            int operation = scan.nextInt();
            if (operation == 1) { // enqueue
              queue.enqueue(scan.nextInt());
            } else if (operation == 2) { // dequeue
              queue.dequeue();
            } else if (operation == 3) { // print/peek
              System.out.println(queue.peek());
            }
        }
        scan.close();
    }
}

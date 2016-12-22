package com.hackerrank.ritvik.algo;

import java.util.Scanner;
import java.util.Stack;

public class TwoStackQueue {
    public static class MyQueue<T> {
        Stack<T> stackNewestOnTop = new Stack<T>();
        Stack<T> stackOldestOnTop = new Stack<T>();

        public void enqueue(T value) { // Push onto newest stack
            stackNewestOnTop.push(value);
            Stack<T> temp = (Stack<T>)stackNewestOnTop.clone();
            stackOldestOnTop.clear();
            while(!temp.isEmpty()){
                stackOldestOnTop.push(temp.pop());
            }
        }

        public T peek() {
            return stackOldestOnTop.peek();

        }

        public T dequeue() {
            if(stackOldestOnTop.size()<=0){
                return null;
            }

            T res = stackOldestOnTop.pop();
            Stack<T> temp = (Stack<T>)stackOldestOnTop.clone();
            stackNewestOnTop.clear();
            while(!temp.isEmpty()){
                stackNewestOnTop.push(temp.pop());
            }
            return res;

        }
    }


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

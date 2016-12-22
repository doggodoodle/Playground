package com;

import com.sun.org.apache.regexp.internal.RE;
import com.sun.org.apache.xalan.internal.xsltc.CollatorFactory;

import java.util.*;

/**
 * Created by u6023478 on 11/1/2016.
 */
public class RemoveDuplicates {

    class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }

    }

    public static Node removeDuplicates(Node head) {
        //Write your code here
        Node ptr1 = head;

        return ptr1;

    }

    public  Node insert(Node head,int data)
    {
        Node p=new Node(data);
        if(head==null)
            head=p;
        else if(head.next==null)
            head.next=p;
        else
        {
            Node start=head;
            while(start.next!=null)
                start=start.next;
            start.next=p;

        }
        return head;
    }
    public static void display(Node head)
    {
        Node start=head;
        while(start!=null)
        {
            System.out.print(start.data+" ");
            start=start.next;
        }
    }
    public static void main(String args[])
    {
        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        Scanner sc=new Scanner(System.in);
        Node head=null;
        int T=sc.nextInt();
        while(T-->0){
            int ele=sc.nextInt();
            head=removeDuplicates.insert(head,ele);
        }
        head=removeDuplicates(head);
        display(head);

    }
}

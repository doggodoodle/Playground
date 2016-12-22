package com.leetcode.ritvik;

import java.util.*;

/**
 * Created by u6023478 on 12/16/2016.
 */
public class KReverseLinkedList {

    public static class ListNode {
        int val;
        ListNode next;

        @Override
        public String toString() {
            return "ListNode{" +
                    "val=" + val +
                    '}';
        }

        ListNode(int x) {
            val = x;
        }
    }

    public static ListNode reverseKGroup(ListNode head, int k) {
        if(head ==null)
            return null;

        HashMap<Integer,ArrayList<ListNode>> map = new HashMap<Integer,ArrayList<ListNode>>();

        ListNode head2 = head;
        int i = 0, p=0;

        while(head!=null){
            p++;
            ArrayList<ListNode> list = map.get(i);

            if(list==null)
                list = new ArrayList<>();

            if (list.size()>=k){
                i++;
                list = new ArrayList<>();
            }

            list.add(head);
            map.put(i, list);

            head = head.next;
        }

        if(k>p)
            return head2;

        ListNode res = null;
        ListNode resHead = res;

        for(int a = 0; a < map.size(); a++){
            ArrayList<ListNode> list = map.get(a);



            if(list.size() ==k){
                for(int r = list.size()-1; r>=0; r--){
                    if(res == null){
                        res = list.get(r);
                        res.next = null;
                        resHead = res;
                        continue;
                    }
                    res.next = list.get(r);
                    res = res.next;
                    res.next = null;

                }
            }
            else{

                for(ListNode node : list){
                    if(res==null){
                        res = node;
                        continue;
                    }
                    res.next = node;
                    res = res.next;
                    res.next = null;
                }
            }


        }


        return resHead;
    }

    static void printList(ListNode node){
        System.out.print("List=");
        while(node!=null){
            System.out.print(node+"->");
            node = node.next;
        }
        System.out.println("");


    }

    public static ListNode reverse(ListNode head){

        List<ListNode> list = new ArrayList<>();

        while(head!=null){
            list.add(head);
            head=head.next;
        }

        ListNode newHead = null;
        ListNode newHead2 = newHead;

        for(int i = list.size()-1; i >=0; i--){
            if(newHead==null){
                newHead = list.get(i);
                newHead2 = newHead;
                newHead.next = null;
                continue;
            }

            newHead.next = list.get(i);
            newHead = newHead.next;
            newHead.next = null;
            System.out.println("");
        }

        printList(newHead2);
        return newHead2;
    }

    public static void main(String[] args) {
        ListNode node = new ListNode(1);
       /* node.next = new ListNode(2);
        node.next.next = new ListNode(3);
        node.next.next.next = new ListNode(4);
        node.next.next.next.next = new ListNode(5);*/

       /* System.out.println("**");
        while (head!=null){
            System.out.println(head.val);
            head = head.next;
        }*/



        ListNode node1 = reverseKGroup(node,2);
        //ListNode node1 = reverse(node);
        System.out.println("**res:");
        while (node1!=null){
            System.out.println(node1.val);
            node1 = node1.next;
        }
    }

}

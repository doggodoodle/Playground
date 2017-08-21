package com.leetcode.ritvik;

/**
 * Created by u6023478 on 5/11/2017.
 */
public class MergeKSorted {

    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }

    public ListNode mergeKLists(ListNode[] lists) {

        ListNode head = null, head2 = head;


        ListNode min = lists[0];

        for(ListNode n : lists){
            if(n!=null) {
                min = n;
                break;
            }
        }

        while(!isEmpty(lists)){
            int minInd = -1;
            for(int i = 0; i <  lists.length; i++){
                if(lists[i]==null)
                    continue;
                if(min== null || min.val > lists[i].val) {
                    min = lists[i];
                    minInd = i;
                }
            }

            System.out.println(min.val);
            head = min;
            head = head.next;
            lists[minInd] = lists[minInd].next;
        }

        return head2;

    }

    boolean isEmpty(ListNode[] list){
        for(ListNode n : list){
            if(n!=null)
                return false;
        }
        return true;
    }


}

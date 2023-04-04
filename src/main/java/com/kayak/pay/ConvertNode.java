package com.kayak.pay;

import org.junit.jupiter.api.Test;

public class ConvertNode {
    @Test
    public void test(){
        ListNode listNode = new ListNode(0);
        ListNode listNode1 = new ListNode(0);
         convertNode (listNode1);
    }
    public  ListNode convertNode (ListNode node){
        ListNode next = null;
        ListNode pre = null;
        while (node != null){
             next = node.next;
             node.next = pre;
             pre = node;
             node = next;
        }
        return  pre;
    }
}

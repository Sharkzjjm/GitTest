package com.kayak.pay;

import org.junit.jupiter.api.Test;

import java.util.List;

public class mergeTwoLists {

    @Test
    public void test(){
        // 0 1 1 2 3 5 8
        int fib = fib(3);
        System.out.printf(""+ fib);
    }
    public ListNode mergeList(ListNode l1, ListNode l2){

        ListNode listNode = new ListNode(0);
        ListNode cur = listNode;
        while (l1 != null && l2 != null){
            if (l1.val <=  l2 .val){
                cur.next = l1;
                l1 = l1.next;
            }else {
                cur.next = l2;
                l2 = l2.next;
            }
            cur  = cur.next;

        }
        cur.next = l1 == null ? l2:l1;
        return cur.next;
    }

    public int fib(int n){
        int s = 0;
        int d = 1;
        int temp = d;
        for (int i = 2; i <= n; i++) {
            temp = s + temp;
            s = d;
            d = temp;

        }
        return temp;
    }

    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        int i = matrix.length - 1;
        int j = 0 ;
        while (i >= 0 &&  j <= matrix[0].length){
            if (target > matrix[i][j] ){
                j++;
            }else if (target < matrix[i][j]){
                i --;
            }else {
                return  true;
            }
        }
        return  false;


    }


    public ListNode mergeTwoLists2(ListNode l1, ListNode l2) {
        ListNode listNode = new ListNode(0);
        ListNode cur = listNode;

        while (l1 != null && l2 !=null){
            if (l1.val > l2.val){
                listNode.next = l2;
                l2 = l2.next;
            }else {
                listNode.next = l1;
                l1 = l1.next;
            }
            listNode = listNode.next;
        }
        listNode.next = l1 ==null?l2:l1;
        return cur.next;
    }
}

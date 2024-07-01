package com.zhang.algorithm;

import com.zhang.common.ListNode;

/**
 * 给定一个单链表 L 的头节点 head ，单链表 L 表示为：
 *
 * L0 → L1 → … → Ln - 1 → Ln
 * 请将其重新排列后变为：
 *
 * L0 → Ln → L1 → Ln - 1 → L2 → Ln - 2 → …
 * 不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。
 */
public class reorderList {
    ListNode prev;
    boolean flag = false;
    public static void main(String[] args) {

    }

    public void reorderList(ListNode head) {
        prev = head;
        reorder(head);
    }

    public void reorder(ListNode head) {
        if (head == null) {
            return ;
        }
        reorder(head.next);
        if (flag) {
            return;
        }
        if (prev == head || prev.next == head) {
            head.next = null;
            flag = true;
            return;
        }
        ListNode temp = prev.next;
        head.next = temp;
        prev.next = head;
        prev = temp;
    }
}

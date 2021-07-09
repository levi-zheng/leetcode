package linkedlist;

/**
 * 反转链表
 */
public class Num206 {
    /**
     * 我目前只做了这个迭代法
     * 在做链表问题的时候 记得画图 ，画图是最清晰的
     *
     *  1, 2    -->   2,3 -->   122,4 -- >  null
     *
     *  122,4 --> 2,3 -- >1,2 --> null
     *
     *  思路需要 生成两个指针 一个 prev 一个 current
     *
     *  作用是，我们很容易想到 把 current.next 指向prev
     *
     *  但这样的话，整个链就断了，所以我们需要中间量来记录
     *
     *  同时还要移动
     *
     *
     *
     */
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;

        while (current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}

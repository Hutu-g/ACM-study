package org.example.question;

public class test2 {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public static void main(String[] args) {
        int[] num = {0,1,1,4,4,4,4,4,4,4,4};
        System.out.println(removeElement(num,4));
    }

    //删除重复值
    public static int removeDuplicates(int[] nums){
        if (nums.length == 0) return 0;
        int fast = 0,low = 0;
        while (fast < nums.length){
            if (nums[fast] != nums[low]){
                low++;
                nums[low] = nums[fast];
            }
            fast++;
        }
        return low +1;
    }

    public static ListNode removeListDuplicates(ListNode  head){
        if (head == null) return null;
        ListNode fast = head,low =head;
        while (fast !=null){
            if (fast.val != low.val){
                low.next = fast;
                low = low.next;
            }
            fast = fast.next;
        }
        low.next = null;
        return head;
    }

    //
    static int removeElement(int[] nums, int val) {
        int fast = 0,low = 0;
        while (fast <nums.length){
            if (nums[fast] != val){
                nums[low] = nums[fast];
                low++;
            }
            fast++;
        }
        return low;
    }
    //单链表的倒数第 k 个节点
    // 返回链表的倒数第 k 个节点
    ListNode findFromEnd(ListNode head, int k) {
        ListNode p1 = head;
        // p1 先走 k 步
        for (int i = 0; i < k; i++) {
            p1 = p1.next;
        }
        ListNode p2 = head;
        // p1 和 p2 同时走 n - k 步
        while (p1 != null) {
            p2 = p2.next;
            p1 = p1.next;
        }
        // p2 现在指向第 n - k + 1 个节点，即倒数第 k 个节点
        return p2;
    }
    //单链表的中点
    ListNode middleNode(ListNode head) {
        // 快慢指针初始化指向 head
        ListNode slow = head, fast = head;
        // 快指针走到末尾时停止
        while (fast != null && fast.next != null) {
            // 慢指针走一步，快指针走两步
            slow = slow.next;
            fast = fast.next.next;
        }
        // 慢指针指向中点
        return slow;
    }



}

public class IsPalindrome {
    public static boolean solution(ListNode head){
        if(head == null || head.next == null){
            return true;
        }
        ListNode tmp = new ListNode(-1);
        tmp.next = head;
        ListNode slow = tmp;
        ListNode fast = tmp;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        fast = slow.next;
        slow.next = null;
        ListNode pre = null;
        while(fast != null){
            ListNode nextFast = fast.next;
            fast.next = pre;
            pre = fast;
            fast = nextFast;
        }
        while(pre != null){
            if(pre.val != head.val){
                return false;
            }
            pre = pre.next;
            head = head.next;
        }
        return true;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(100);
//        ListNode node2 = new ListNode(2);
//        ListNode node3 = new ListNode(3);
//        ListNode node4 = new ListNode(4);
//        ListNode node5 = new ListNode(1);

//        node1.next = node2;
//        node2.next = node3;
//        node3.next = node4;
//        node4.next = node5;

        boolean res = solution(node1);
        System.out.println("result is:"+res);
    }
}

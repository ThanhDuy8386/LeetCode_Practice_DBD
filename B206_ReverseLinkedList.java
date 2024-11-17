import java.util.ArrayList;

public class B206_ReverseLinkedList {
    public static void main(String[] args) {
        var node1 = new ListNode(1);
        var node2 = new ListNode(2);
        var node3 = new ListNode(3);
        var node4 = new ListNode(4);
        var node5 = new ListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        var k = reverseList(node1);
        int count = 0;
        while(k!=null) {
            System.out.println(k.val);
            if(k.next == null) {
                break;
            }
            k = k.next;
            count++;
            if(count == 10) {
                break;
            }
        }
    }

    static ListNode reverseList(ListNode head) {
        var list = new ArrayList<ListNode>();
        while(head != null) {
            list.add(head);
            if(head.next == null) {
                break;
            } else {
                head = head.next;
            }
        }
        for(int i = list.size() - 1; i >= 0; i--) {
            if(i == 0) {
                list.get(i).next = null;
                break;
            } else {
                list.get(i).next = list.get(i-1);
            }
        }
        if(list.size() == 0) {
            return null;
        } else if(list.size() == 1) {
            return list.get(0);
        }
        return list.get(list.size() - 1);
    }

    static class ListNode {
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

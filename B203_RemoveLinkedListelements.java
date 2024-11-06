import java.util.ArrayList;
import java.util.LinkedList;

public class B203_RemoveLinkedListelements {
    public static void main(String[] args) {

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

    class Solution {
        public ListNode removeElements(ListNode head, int val) {
            if(head == null) return null;
            var list = new ArrayList<ListNode>();
            while(head != null) {
                if(head.val != val) {
                    list.add(head);
                }
                head = head.next;
            }
            if(list.size() == 0) return null;
            for(int i = 0; i < list.size()-1; i++) {
                list.get(i).next = list.get(i+1);
            }
            list.get(list.size()-1).next = null;
            return list.get(0);
        }
    }
}

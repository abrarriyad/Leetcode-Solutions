/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode c1 = l1;
        ListNode c2 = l2;
        
        
        int sum = l1.val + l2.val;
        int carry = sum>9? 1: 0;
        ListNode head = new ListNode(sum%10);
        ListNode res = head;
        
        while(c1.next!=null || c2.next!=null){
            c1 = c1.next;
            c2 = c2.next;
            
            if(c1==null) c1 = new ListNode(0);
            if(c2==null) c2 = new ListNode(0);
            
            sum = c1.val+c2.val+carry;
            carry = sum>9?1:0;
            head.next = new ListNode(sum%10);
            head = head.next;
         
        }
        if(carry!=0){
            head.next = new ListNode(carry);
        }        
        return res;
    }
}
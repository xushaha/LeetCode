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

    //iterative solution
    public ListNode reverseList(ListNode head) {
        //init 2 pointers:
        //prev = null, staying before head of list
        ListNode prev = null;
        //current = head, staying at the head of list
        ListNode current = head;
        //helper pointer nextCurrent = null, which will be used for storage of current.next value
        ListNode nextCurrent = null;

        //we will reverse link between nodes and movw our pointer to the end
        //when node current will be equal null it means that we reached the end of the list
        //so that's why we're making loop while current != null
        while (current != null) {

            //in te loop we assign a value of current.next to helper pointer nextCurrent 
            nextCurrent = current.next;
            //making current.next equal to prev
            current.next = prev;
            //making prev equal to current 
            prev = current;
            //and current = current.next saved in nextCurrent
            current = nextCurrent;

        }

        //when current = null, prev at the end of input list,
        //which is new head now, so we're returning prev
        return prev;
    }
}
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head == null)
        {
            return head;
        }
        else if(head.next == null)
        {
            return head;
        }
        ListNode newpairs=head.next.next;//递归新结点
        ListNode newNode=head.next;
        newNode.next=head;//处理对调的两个结点
        head.next=swapPairs(newpairs);//递归
        return newNode;//返回头结点
        
    }
}

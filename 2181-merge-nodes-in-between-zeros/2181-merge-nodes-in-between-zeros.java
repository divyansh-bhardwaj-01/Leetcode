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
    public ListNode mergeNodes(ListNode head) {
        ArrayList<Integer>ans=new ArrayList<>();
        ListNode temp=head;
        int sum=0;
        while(temp!=null && temp.next!=null){
            int num=temp.val;
            sum=sum+num;
            if(temp.next.val == 0){
                ans.add(sum);
                sum=0;
            }
            temp=temp.next;
        }
        ListNode first=new ListNode(0);
        ListNode second=first;
        for(int i:ans){
             second.next=new ListNode(i);
             second=second.next;
        }
        second.next=null;
        return first.next;
    }
}
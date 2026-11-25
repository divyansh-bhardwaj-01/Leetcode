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
    public int pairSum(ListNode head) {
        ArrayList<Integer>ans=new ArrayList<>();
        ListNode temp=head;
        int n=0;
        while(temp!=null){
            ans.add(temp.val);
            temp=temp.next;
            n++;
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<=n/2-1;i++){
            max=Math.max(max,(ans.get(i)+ans.get(n-1-i)));
        }
        return max;
    }
}
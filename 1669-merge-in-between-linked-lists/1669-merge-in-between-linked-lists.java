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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        int count=0;
        ListNode temp=list1;
        ListNode cutpart=null;
        int c=b-a+1;
        if(a==1){
            if(count+1==a){
                cutpart=temp.next;
                temp.next=null; 
            }
        }

        else{
        while(temp!=null && temp.next!=null){
            count++;
            temp=temp.next;
            if(count+1==a){
                cutpart=temp.next;
                 temp.next=null;
                 break;
            }
        }}
        count=0;
        while(cutpart!=null){
          count++;
          cutpart=cutpart.next;
        if(count==c){
            break;
        }
        }
        temp.next=list2;
        while(temp!=null && temp.next!=null){
            temp=temp.next;
        }
        temp.next=cutpart;
        return list1;
    }
}
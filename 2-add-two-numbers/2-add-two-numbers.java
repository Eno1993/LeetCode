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
        
        
        ListNode answer = new ListNode();
        ListNode point = answer;
        
        
        int l1n = 0;
        int l2n = 0;
        int input =0;
        int up = 0;
        
        while(true){
            
            
            
            if(l1!=null){ 
                l1n = l1.val;  
                l1 = l1.next;
            }else{ 
                l1n = 0; 
            }
            
            if(l2!=null){ 
                l2n = l2.val; 
                l2 = l2.next;
            }else{
                l2n = 0;
            }
            
            input = up + l1n + l2n;
            point.val = input%10;
            if(10 <= input){ up = 1;}
            else{ up = 0; }
            
            
            if(l1==null&&l2==null&&up==0){
                break;
            }else{
                point.next = new ListNode();
                point = point.next;
            }
        }
        return answer;
    } 
}
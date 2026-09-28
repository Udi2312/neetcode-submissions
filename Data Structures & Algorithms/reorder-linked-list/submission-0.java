class Solution {
    ListNode curr;
    public void solve(ListNode head){
        if(head == null) return;
        solve(head.next);
        ListNode temp = curr.next;
        if(curr.next==null) return;
        else if(head==curr){
            head.next=null;
            return;
        }
        curr.next = head;
        if(temp == head){
            head.next = null;
        }
        else{
            head.next = temp;
        }
        curr = temp; 
    }
    public void reorderList(ListNode head) {
        curr = head;
        solve(head);
    }
}

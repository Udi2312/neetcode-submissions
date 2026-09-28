class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size = 0;
        ListNode temp = head;
        while(temp != null){
            temp = temp.next;
            size++;
        }
        temp = head;
        int j = size-n-1;
        if(j < 0) return head.next;
        else{
            while(j > 0){
                temp = temp.next;
                j--;
            }
            temp.next = temp.next.next;
            return head;
        }
    }
}

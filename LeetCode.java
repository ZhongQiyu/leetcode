public class LeetCode {
    
    // credit to my fellow students' recommendations
    
    private int problemsSolved = 0;
    private double timeAvg = 0.0;
    private String todayDate = "";
    private ArrayList<String> readTutorials = new ArrayList<>();
    
    public int[] twoSum(int[] nums, int target) {
        int numCount = nums.length;
        if(numCount < 2) {
            return null;
        }
        else {
            int[] indices = new int[2];
            for(int i = 0; i < numCount - 1; i++) {
                int first = nums[i];
                for(int j = i + 1; j < numCount; j++) {
                    int second = nums[j];
                    if(first + second == target) {
                        indices[0] = i;
                        indices[1] = j;
                        return indices;
                    }
                }
            }
            return null;
        }
    }
    
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if ((l1 == null) || (l2 == null)) {  // nodes that are not even existent
            return null;
        }
        else {
            ListNode currentSum = new ListNode(0);
            ListNode mainSum = currentSum;
            ListNode[] nodes = {l1, l2};
            int sum;
            int carry;
            boolean end = false;

            while(!end) {
                
                sum = nodes[0].val + nodes[1].val;
                carry = (int) (sum + currentSum.val) / 10;
                currentSum.val = (currentSum.val + sum) % 10;

                if ((nodes[0].next == null) && (nodes[1].next == null)) {
                    end = true;
                    // if there is an extra bit at the end, then carry
                    if (carry > 0) {
                        currentSum.next = new ListNode(carry);
                        currentSum = currentSum.next;
                    }
                }
                
                else {
                    if ((nodes[0].next == null) && (nodes[1].next != null)) {
                        nodes[0].next = new ListNode(0);
                    }
                    else if ((nodes[0].next != null) && (nodes[1].next == null)) {
                        nodes[1].next = new ListNode(0);
                    }
                    currentSum.next = new ListNode(carry);
                    currentSum = currentSum.next;
                    nodes[0] = nodes[0].next;
                    nodes[1] = nodes[1].next;
                }
            }
            return mainSum;
        }
    }
    
    public int lengthOfLongestSubstring(String s) {

    }
    
    public static void main(String[] args){
        System.out.println("Welcome to the world of LeetCode");
    }
}

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
    
    public static void main(String[] args){
        System.out.println("Welcome to the world of LeetCode");
    }
}

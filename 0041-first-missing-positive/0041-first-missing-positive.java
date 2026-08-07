import java.util.Arrays;

class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int target = 1;
        
        for (int num : nums) {
            if (num == target) {
                target++; 
            } else if (num > target) {
                break; 
            }
           
        } 
        
        return target;
    }
}
import java.util.*;

class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        Arrays.fill(result, -1);

        Stack<Integer> stack = new Stack<>();

        for (int i = 2 * n - 1; i >= 0; i--) {
            int num = nums[i % n];

            while (!stack.isEmpty() && stack.peek() <= num) {
                stack.pop();
            }

            if (i < n && !stack.isEmpty()) {
                result[i] = stack.peek();
            }

            stack.push(num);
        }

        return result;
    }
}
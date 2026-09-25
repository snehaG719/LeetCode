import java.util.*;

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        solve(candidates, target, 0, new ArrayList<>(), ans);
        return ans;
    }

    void solve(int[] arr, int target, int index,
               List<Integer> list, List<List<Integer>> ans) {

        if (target == 0) {
            ans.add(new ArrayList<>(list));
            return;
        }

        if (target < 0 || index == arr.length) {
            return;
        }

        // Include the current element
        list.add(arr[index]);
        solve(arr, target - arr[index], index, list, ans);

        // Backtrack
        list.remove(list.size() - 1);

        // Skip the current element
        solve(arr, target, index + 1, list, ans);
    }
}
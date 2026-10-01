class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();

        Arrays.sort(candidates);

        backtrack(candidates, target, 0, new ArrayList<>(), ans);

        return ans;
    }

    void backtrack(int[] arr, int target, int start,
                    List<Integer> list, List<List<Integer>> ans) {

        if (target == 0) {
            ans.add(new ArrayList<>(list));
            return;
        }

        for (int i = start; i < arr.length; i++) {

            // duplicate combination avoid
            if (i > start && arr[i] == arr[i - 1])
                continue;

            // target cross ho gaya
            if (arr[i] > target)
                break;

            list.add(arr[i]);

            // i + 1 because same element dobara use nahi karna
            backtrack(arr, target - arr[i], i + 1, list, ans);

            list.remove(list.size() - 1);
        }
    }
}
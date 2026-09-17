class Solution {
    public int minSumOfLengths(int[] arr, int target) {
        int n = arr.length;
        int INF = n + 1;

        int[] best = new int[n];
        Arrays.fill(best, INF);

        int sum = 0;
        int ans = INF;
        int minLen = INF;

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);

        for (int i = 0; i < n; i++) {
            sum += arr[i];

            if (map.containsKey(sum - target)) {
                int start = map.get(sum - target);
                int len = i - start;

                // Previous non-overlapping subarray
                if (start >= 0 && best[start] != INF) {
                    ans = Math.min(ans, len + best[start]);
                }

                minLen = Math.min(minLen, len);
            }

            // Best subarray ending at or before i
            best[i] = minLen;

            map.put(sum, i);
        }

        return ans == INF ? -1 : ans;
    }
}
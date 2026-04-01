import java.util.*;

class Pair implements Comparable<Pair> {
    int freq;
    int val;

    Pair(int freq, int val) {
        this.freq = freq;
        this.val = val;
    }

    public int compareTo(Pair other) {
        return this.freq - other.freq;
    }
}

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Pair> pq = new PriorityQueue<>();

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            pq.offer(new Pair(entry.getValue(), entry.getKey()));
        }

        while (pq.size() > k) {
            pq.poll();
        }

        int[] res = new int[k];
        for (int i = k - 1; i >= 0; i--) {
            res[i] = pq.poll().val;
        }

        return res;
    }
}
class Solution {
    public boolean isIsomorphic(String s, String t) {
        int[] a = new int[256];
        int[] b = new int[256];

        int i = 0, j = 0;

        while (i < s.length() && j < t.length()) {
            if (a[s.charAt(i)] != b[t.charAt(j)])
                return false;

            a[s.charAt(i)] = i + 1;
            b[t.charAt(j)] = j + 1;

            i++;
            j++;
        }

        return true;
    }
}
class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder ans = new StringBuilder();
        int depth = 0;

        for (char ch : s.toCharArray()) {

            if (ch == '(') {
                // Agar depth > 0 hai, ye outermost '(' nahi hai
                if (depth > 0) {
                    ans.append(ch);
                }
                depth++;
            } 
            else {
                depth--;

                // Agar depth > 0 hai, ye outermost ')' nahi hai
                if (depth > 0) {
                    ans.append(ch);
                }
            }
        }

        return ans.toString();
    }
}
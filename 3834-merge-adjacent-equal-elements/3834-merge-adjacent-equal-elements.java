class Solution {
    public List<Long> mergeAdjacent(int[] nums) {
        Stack<Long> stack = new Stack<>();
        for(long ele : nums){
            while(!stack.isEmpty() && stack.peek() == ele){
                stack.pop();
                ele = ele * 2;
            }
            stack.push(ele);
        }
        List<Long> ans = new ArrayList<>();
        while(!stack.isEmpty()){
            long ele = stack.pop();
            ans.add(ele);
        }
        Collections.reverse(ans);
        return ans;
    }
}
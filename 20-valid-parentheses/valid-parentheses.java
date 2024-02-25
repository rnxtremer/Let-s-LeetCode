class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> mapping = Map.of('(', ')', '{', '}', '[', ']');

        for (char c : s.toCharArray()) {
            if (mapping.containsKey(c)) {
                stack.push(c);
            } else if (!stack.isEmpty() && mapping.get(stack.pop()) == c) {
                
            } else {
                return false; 
            }
        }

        return stack.isEmpty(); 
    }
}

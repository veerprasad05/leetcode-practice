class Solution {
    public boolean isValid(String s) {
        Stack<Character> parenStack = new Stack<>();
        Map<Character, Character> bracketMap = new HashMap<>();
        bracketMap.put('}', '{');
        bracketMap.put(']', '[');
        bracketMap.put(')', '(');

        for (char c : s.toCharArray()) {
            if(bracketMap.containsValue(c)) {
                parenStack.push(c);
            }
            else if(!parenStack.isEmpty() && parenStack.peek() == bracketMap.get(c))
                    parenStack.pop();
            else
                return false;
        }

        return parenStack.isEmpty();
    }
}
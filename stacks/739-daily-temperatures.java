class Solution {
    public int[] dailyTemperatures(int[] temperatures) {

        // initialize stack and result array
        Stack<int[]> tempStack = new Stack<>();
        int[] result = new int[temperatures.length];

        // keep pushing till val > stack.peek()
        for (int i = 0; i < temperatures.length; i++) {
            int temp = temperatures[i];
            while(!tempStack.isEmpty() && temp > tempStack.peek()[1]) {
                int[] poppedTemp = tempStack.pop();
                result[poppedTemp[0]] = i - poppedTemp[0];
            }
            tempStack.push(new int[] {i, temp});
        }

        return result;
        // keep popping till val < stack.peek() or empty stack
            // on popping, do index of val - index of popped
            // put this into index of popped in result array

        // return result array
    }
}
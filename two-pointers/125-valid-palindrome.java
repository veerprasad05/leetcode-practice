class Solution {
    public boolean isPalindrome(String s) {
        char[] arr = s.toCharArray();
        int front = 0, back = arr.length - 1;

        while (front < back){
            while (!Character.isLetterOrDigit(arr[front]) && front < back)
                front++;
            while (!Character.isLetterOrDigit(arr[back]) && back > front)
                back--;
            
            if (Character.toLowerCase(arr[front]) != Character.toLowerCase(arr[back]))
                return false;

            front++;
            back--;
        }
        return true;
    }
}
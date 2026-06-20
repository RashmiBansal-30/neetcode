class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reverse = "";
        for(int i = s.length() - 1; i >= 0; i--){
            if (s.charAt(i) != ' '){
                reverse += s.charAt(i);
            }
        }
        if (s.equalsIgnoreCase(reverse)){
            return true;
        }
        return false;
    }
}
class Solution {
    public int characterReplacement(String s, int k) {
        int[] counts = new int[26];
        
        int left = 0;
        int maxFrequency = 0;
        int maxLength = 0;
        
        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);
            counts[currentChar - 'A']++;
            
            maxFrequency = Math.max(maxFrequency, counts[currentChar - 'A']);
            
            int windowLength = right - left + 1;
            
            if (windowLength - maxFrequency > k) {
                counts[s.charAt(left) - 'A']--;
                left++;
            }
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
}

class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = 0;
        
        for (int pile : piles) {
            right = Math.max(right, pile);
        }
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            
            if (canEatAll(piles, mid, h)) {
                right = mid; 
            } else {
                left = mid + 1; 
            }
        }
        
        return left;
    }

    private boolean canEatAll(int[] piles, int k, int h) {
        long totalHours = 0; 
        
        for (int pile : piles) {
            totalHours += (pile + k - 1) / k;
        }
        
        return totalHours <= h;
    }
}

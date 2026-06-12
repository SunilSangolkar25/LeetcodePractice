class Solution {
    public int digitFrequencyScore(int n) {
        int ans = 0;

        while (n > 0) {
            ans += n % 10;  // take last digit
            n /= 10;        // remove last digit
        }

        return ans;
    }
}
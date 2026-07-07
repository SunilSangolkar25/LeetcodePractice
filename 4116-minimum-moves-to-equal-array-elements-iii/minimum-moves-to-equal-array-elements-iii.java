class Solution {
    public int minMoves(int[] nums) {
        int max = nums[0];

        // Find maximum element
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
        }

        int moves = 0;

        // Count required moves
        for (int num : nums) {
            moves += (max - num);
        }

        return moves;
    }
}
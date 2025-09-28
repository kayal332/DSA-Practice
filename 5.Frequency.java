class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        long windowSum = 0;
        int l = 0, result = 0;

        for (int r = 0; r < nums.length; r++) {
            windowSum += nums[r];

            // cost = total increments needed to make all [l..r] equal to nums[r]
            long cost = (long) nums[r] * (r - l + 1) - windowSum;

            while (cost > k) {
                windowSum -= nums[l];
                l++;
                cost = (long) nums[r] * (r - l + 1) - windowSum;
            }

            result = Math.max(result, r - l + 1);
        }

        return result;
    }
}

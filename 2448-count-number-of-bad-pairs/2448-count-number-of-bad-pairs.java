public class Solution {
    public long countBadPairs(int[] nums) {
        int n = nums.length;
        int[] diff = new int[n];
        for (int i = 0; i < n; i++) diff[i] = nums[i] - i;
        Arrays.sort(diff);
        long good = 0, count = 1;
        for (int i = 1; i < n; i++) {
            if (diff[i] == diff[i - 1]) count++;
            else { good += count * (count - 1) / 2; count = 1; }
        }
        good += count * (count - 1) / 2;
        return (long) n * (n - 1) / 2 - good;
    }
}
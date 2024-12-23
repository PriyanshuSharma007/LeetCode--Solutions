class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int largest = 1;
        int current = 1;
        if (nums.length == 0) {
            return 0;
        }
        for (int i = 1; i < nums.length ; i++) {
            if(nums[i] == nums[i-1] +1) {
                current++;
            } else if(nums[i]!=nums[i-1]){
                // current=large;
                // large=1;
                largest = Math.max(current, largest);
                current = 1;
            }
        }
        return Math.max(current, largest);
    }
}
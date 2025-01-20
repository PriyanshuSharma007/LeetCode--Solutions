class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        int ans = Integer.MIN_VALUE, max = Integer.MIN_VALUE, result = 0;
        int left=0, right=n-1;
        while(left <= right){
            max = Math.max(nums[left], nums[right]);
            ans = Math.max(ans, max);
            if(nums[left] == ans) result = left;
            else if(nums[right] == ans) result = right;
            left++;
            right--;
        }
        return result;
    }
}
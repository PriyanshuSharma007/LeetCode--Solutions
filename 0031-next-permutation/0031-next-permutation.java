class Solution {
    public void nextPermutation(int[] nums) {

        /*
         * INTUTION FOR THE SOLUNTION.
         * 
         * 1. the intution i havbe learned in this question is that
         ** firstlty check where is the break point means where the array has a point
         * at which arr[i]<arr[i+1]
         ** 
         * secondly find the elemeent in the array that is slightly bigger than the
         * arr[i]
         ** 
         * then sort the rest of the element after the break point in the sorted manner
         * to make the next permutation close to given inupt
         */

        // to rebverse the array

        int index = -1;
        int n = nums.length;
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            reverse(0, n - 1, nums);
            return;
        } else {
            for (int i = n - 1; i > index; i--) {
                if (nums[i] > nums[index]) {
                    int temp = nums[index];
                    nums[index] = nums[i];
                    nums[i] = temp;
                    break;
                }
            }
            // return;
        }

        reverse(index + 1, n - 1, nums);
        return;

    }

    public static void reverse(int i, int k, int nums[]) {
        int start = i;
        int j = k;
        while (start <j) {
            int temp = nums[start];
            nums[start] = nums[j];
            nums[j] = temp;
            start++;
            j--;
        }
    }
}
class Solution {
    public int[] arrayChange(int[] nums, int[][] operations) {
        // as we would need to search the element in nums, according to operations
        // we can use hashmap as search = 0(1)

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < operations.length; i++) {
            int index = map.get(operations[i][0]);
            nums[index] = operations[i][1];

            // modify the map
            map.remove(operations[i][0]);
            map.put(nums[index], index);
        }

        return nums;

    }
}
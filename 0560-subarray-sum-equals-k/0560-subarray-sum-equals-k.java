class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> mpp = new HashMap<>();
        int prefixSum=0;
        int count=0;
        mpp.put(0,1);

        for(int i=0;i<nums.length;i++){
            prefixSum +=nums[i];
            int delete = prefixSum-k;

            count +=mpp.getOrDefault(delete, 0);
            mpp.put(prefixSum, mpp.getOrDefault(prefixSum, 0) + 1);
        }
        return count;
    }
}


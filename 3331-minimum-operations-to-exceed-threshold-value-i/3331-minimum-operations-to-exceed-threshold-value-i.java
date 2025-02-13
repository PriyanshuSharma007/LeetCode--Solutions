class Solution {
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for(int num : nums){
            minHeap.add(num);
        }

        int count = 0;
        while(!minHeap.isEmpty() && minHeap.peek() < k){
            minHeap.poll();
            count++;
        }
        return count;
    }
}
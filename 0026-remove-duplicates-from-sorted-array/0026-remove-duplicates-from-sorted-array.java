class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0;
        //  steps for optimal soluntion is 
        /*
        1. take two pointer one one 1st index and other in second index 
        if the arr[i]== arr[i+1] move second pointer and remain same the first pointer 
        if it is not same thyem move first pter to second and placed next element in fornt of the first pointer 
        and return the siz of the element as i+1 as array is starting fo0rm 0 index */
        for(int j=1;j<nums.length;j++){
            if(nums[j]!=nums[i]){
                nums[i+1]=nums[j];
                i++;
            }
        }
        return i+1;
    }
}
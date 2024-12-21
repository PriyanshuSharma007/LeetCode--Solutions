class Solution {
    public boolean check(int[] nums) {

        /*  appraoch i used is there will be three case in which the ouitput is matter 
        1. in which array is sorted rotaed and there is one point where nums[i+1] > nums[i] 
        2. and there is not sorted but rotated in that case also one point exixts 
        3. in which all element is sorted bvut not rotated in this last element is always greater than the first element */
        int count =0;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]>nums[i]){
                count++;
            }
        }

        // that third case is handle here 
        if(nums[nums.length-1]>nums[0]){
            count++;
        }
        // if array has similar value then its count should be 0; 
        return (count<=1)? true:false;
    }
}
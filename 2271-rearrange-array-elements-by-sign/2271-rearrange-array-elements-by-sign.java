class Solution {
    public int[] rearrangeArray(int[] nums) { 
        int positiveIndex=0;
        int negativeIndex=1;

        /*  this is the first variety that can be used
         as the array only have the even number this is the best optimal approach that can be used    to        solve this problem as the extra space 
         is required.*/
        int arr[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                arr[negativeIndex]=nums[i];
                negativeIndex+=2;
            }
            else {
                arr[positiveIndex]=nums[i];
                positiveIndex+=2;
            }
        }
        return arr;

        
    }
}
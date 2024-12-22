class Solution {
    public int majorityElement(int[] nums) {

        //  in this i have applied moore's voting algorithm 
        int counter=0;
        int checkElement=0;
        for(int i=0;i<nums.length;i++){
            if(counter==0){
                counter=1;
                checkElement=nums[i];
            } else if(nums[i]==checkElement){
                counter++;
            } else {
                counter--;
            }
        }
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==checkElement){
                count++;
            }
        }
        if(count > (nums.length/2)){
            return checkElement;
        }
        return -1;
    }
}
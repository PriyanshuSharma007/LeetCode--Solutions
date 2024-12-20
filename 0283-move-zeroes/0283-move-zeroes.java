class Solution {
    public void moveZeroes(int[] nums) { 
        /*
        approach of the problem that i have used 
        1. using two pointer swap the non zero number with the zero number 
        2. check where is the non zero number then store its index and run a anotehr for loop and swap the element 
        in that  */

        int j=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                j=i;
                break;
            }
        }
        // for single element return array only
        if(j==-1){
            return;
        }
        for(int i=j+1;i<nums.length;i++){
            if(nums[i]!=0){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                j++;
            }
        }

        
    }
}
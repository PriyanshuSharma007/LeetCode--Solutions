class Solution {
    public int trap(int[] height)
    { 
        // for storing the water there must be three bar 
        // there will be some boundry for evry bar left or right to store some water 
        // make two auxillary array to atore the left and right boundry the bar at height[i]
        // in one array store left max boundry 
        // in one store right max boundry

        // auxillary 1
        int aux1[]=new int [height.length];
            aux1[0]=height[0];
        for(int i=1;i<height.length;i++){ 
            aux1[i]=Math.max(aux1[i-1],height[i]);
        } 

        // auxillary 2

        int aux2[]= new int [height.length];
        aux2[height.length-1]=height[height.length-1];
        
        for(int i=height.length-2;i>=0;i--){
            aux2[i]= Math.max(height[i],aux2[i+1]);
        } 

        // calculating the store water 

        int trappedWater=0;
        for(int i=0;i<height.length;i++){
            int boundry=Math.min(aux1[i],aux2[i]);
            trappedWater += boundry-height[i];

        }

        return trappedWater;
        
    }
}
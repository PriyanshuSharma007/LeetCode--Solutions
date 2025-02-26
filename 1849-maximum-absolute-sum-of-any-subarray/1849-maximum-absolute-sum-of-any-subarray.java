class Solution {
    public int maxAbsoluteSum(int[] arr) {
        int n=arr.length;
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
            max=Math.max(max,sum);
            if(sum<0){
                sum=0;
            }
        }
        int min=Integer.MAX_VALUE;
        sum=0;
        for(int i=n-1;i>=0;i--){
            sum=sum+arr[i];
            min=Math.min(min,sum);
            if(sum>0){
                sum=0;
            }
        }
        return Math.max(Math.abs(max),Math.abs(min));
    }
}
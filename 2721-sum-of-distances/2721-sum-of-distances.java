 class Solution {
    public long[] distance(int[] arr) {
        Map<Long,long[]> map = new HashMap<>(); 
        int i=0;
        for(int e:arr)
        {
            long x = e;
            if(map.get(x)==null){
                map.put(x,new long[4]);
            }
            map.get(x)[1]+=i++; // total sum of indices with value x
            map.get(x)[3]++;    // no. of occurences of x in arr
        }
        
        long[] res = new long[arr.length];
        i=0;
        for(int e:arr)
        {
            long x = e;
            long[] temp = map.get(x);
            temp[1]-=i;  // sum of indices at right
            temp[3]--;   // right freq
            res[i]=Math.abs(temp[0]-i*temp[2])+Math.abs(temp[1]-i*temp[3]);
            temp[0]+=i++;  // sum of indices at left
            temp[2]++;   // left freq
        }
        return res;
    }
}
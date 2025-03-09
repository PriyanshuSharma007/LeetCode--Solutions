class Solution {
    
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        char[] pArray = p.toCharArray();
        Arrays.sort(pArray);
        int start = 0;
        int end = s.length()-1;
        int len = p.length();
        while(start+len-1<=end) {
            char[] temp = s.substring(start, start+len).toCharArray();
            Arrays.sort(temp);
            if(Arrays.equals(temp, pArray)) {
                res.add(start);
            }
            start++;
        }
        return res;
    }
}
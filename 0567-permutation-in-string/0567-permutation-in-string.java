class Solution {
    // This method will sort the string
    public String sortString(String str) {
        char[] arr = str.toCharArray(); // 1st we will convert the string into char array
        Arrays.sort(arr);// after that we will sort the char array
        return new String(arr); }

    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        // if s1's size is greater than s2, then we can't find s1 in s2, so return false
        if (n > m)
            return false;
        String newS1 = sortString(s1);
        for (int i = 0; i <= m - n; i++) {
            String subStr = s2.substring(i, i + n); 
            String newS2 = sortString(subStr);
            if (newS2.equals(newS1))
                return true;
        }
        return false;
    }

}
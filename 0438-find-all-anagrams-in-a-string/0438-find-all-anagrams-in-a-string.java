class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        if(s.length() < p.length() ) return result;
        int[] sfreq= new int[26];
        int[] pfreq= new int[26];
        for(int i=0; i < p.length(); i++){
            pfreq[p.charAt(i) -'a']++;
            sfreq[s.charAt(i) - 'a']++;
        }
       if( Arrays.equals(pfreq, sfreq) ) result.add(0);
       for(int i=p.length(); i< s.length() ;i++){
           sfreq[s.charAt(i) -'a']++;
           sfreq[s.charAt(i- p.length()) -'a']--;
           if( Arrays.equals(pfreq, sfreq) ) result.add(i- p.length()+1);
       }
        return result;
    }
}
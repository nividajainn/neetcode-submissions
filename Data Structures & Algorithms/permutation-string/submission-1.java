class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        for(char c : s1.toCharArray()){
            freq1[c - 'a']++;
        }

        int l = 0;
        for(int r=0; r<s2.length(); r++){
            freq2[s2.charAt(r) - 'a']++;
            
            if(r-l+1 > s1.length()){
                freq2[s2.charAt(l) - 'a']--;
                l++;
            }
            //koi bhi window me same mil jati h to true
            //checks whether both arrays have exactly the same values at every index.
            if(Arrays.equals(freq1, freq2)) return true;
        }
        return false;
    }
}

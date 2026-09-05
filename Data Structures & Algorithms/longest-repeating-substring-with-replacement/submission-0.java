class Solution {
// Longest window find karo jisme window length - most frequent character ki frequency <= k ho.
    public int characterReplacement(String s, int k) {
        int l = 0;
        int maxLen = 0;
        int maxFreq = 0;
        int[] freq = new int[26];

        for(int r=0; r<s.length(); r++){
            char c = s.charAt(r);
            freq[c - 'A']++; //char ki freq badhao right me 
            
            //max dekho sabse jyda kiske hai
            maxFreq = Math.max(maxFreq, freq[c - 'A']); 
            
            // Current window length = r - l + 1
            // Characters that need replacement = window length - maxFreq
            while((r-l+1) - maxFreq > k){
                freq[s.charAt(l) - 'A']--;
                l++;
            }

            maxLen = Math.max(r-l+1, maxLen);
        }
        return maxLen;
    }
}

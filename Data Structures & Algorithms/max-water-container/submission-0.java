class Solution {
    public int maxArea(int[] h) {
        int l = 0; 
        int r = h.length-1;
        int maxWater = 0;

        while(l<r){
         int he = Math.min(h[l], h[r]);
         int w = r-l;
         int a = he*w;

         maxWater = Math.max(maxWater, a);

         if(h[l] < h[r]) l++;
         else r--;
        }
       
       return maxWater;
    }
}

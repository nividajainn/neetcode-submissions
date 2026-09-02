class Solution {
    public int[] productExceptSelf(int[] nums) {
       int n = nums.length;
       int[] ans = new int[n];
       int zero = 0;
       int pro = 1;

       for(int i=0; i<n; i++){
        if(nums[i] == 0){
            zero++;
        }
        else{
            pro *= nums[i];
        }
       }
       if(zero > 1) return ans;

       for(int i=0; i<n; i++){
        if(zero == 1){

        if(nums[i] == 0){
            ans[i] = pro;
        }
        else{
            ans[i] = 0;
        }
       }
       else{
        ans[i] = pro/nums[i];
       }
    }
     
    return ans;
    }
}  

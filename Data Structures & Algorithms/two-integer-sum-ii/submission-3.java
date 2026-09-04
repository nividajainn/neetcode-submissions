class Solution {
    public int[] twoSum(int[] nums, int target) {

        for(int i=0; i<nums.length; i++){
            int low = i+1, high = nums.length-1;
            int comp = target-nums[i];
            while(low <= high){
              int mid = low+(high-low)/2;
              if(nums[mid] == comp){
                return new int[]{i+1, mid+1};
              }
              else if(nums[mid]<comp){
                low = mid+1;
              }
              else{
                high = mid-1;
              }
            }
        }
        return new int[0];
    }
}

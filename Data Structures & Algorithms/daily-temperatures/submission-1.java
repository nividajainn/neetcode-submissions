class Solution {
    public int[] dailyTemperatures(int[] temp) {
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[temp.length];
        ans[temp.length-1] = 0;
        
        for(int i=0; i<temp.length; i++){
          
          while(!st.isEmpty() && temp[i] > temp[st.peek()]){
           int pevInd =  st.pop();
           ans[pevInd] = i - pevInd;
          }
          st.push(i);
        }
        return ans;
    }
}

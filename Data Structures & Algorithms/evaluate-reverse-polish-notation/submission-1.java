class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        int ans = 0;
        for(String c : tokens){

            if(c.equals("+") || c.equals("-") || 
               c.equals("*") ||c.equals("/")){
                
                int second = st.pop();
                int first = st.pop();

                if(c.equals("+")) {
                    st.push(first + second);
                }
                else if(c.equals("-")){
                    st.push(first - second);
                } 
                else if(c.equals("*")){
                    st.push(first * second);
                }
                else { 
                    st.push(first / second);
                }
            }
            else{
                st.push(Integer.parseInt(c));
            }
            
        }
        return st.peek();
    }
}

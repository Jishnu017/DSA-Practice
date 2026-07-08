class Solution {
    public int calculate(String s) {
        Stack<Integer> st=new Stack<>();
        int res=0;
        int sign=1;
        int curr=0;
        for(char c:s.toCharArray()){
            if(Character.isDigit(c)){
                curr=10*curr+(int) (c-'0');
            }else if(c=='+'){
                res+=sign*curr;
                sign=1;
                curr=0;
            }else if(c=='-'){
                res+=sign*curr;
                sign=-1;
                curr=0;
            } else if(c=='('){
                st.push(res);
                st.push(sign);
                res=0;
                sign=1;
                curr=0;
            }else if(c==')'){
                res+=curr*sign;
                curr=0;
                res*=st.pop();
                res+=st.pop();
            }
        }
        res+=sign*curr;
        return res;
    }
}
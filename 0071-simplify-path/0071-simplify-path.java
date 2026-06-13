class Solution {
    public String simplifyPath(String path) {
        StringBuilder sb=new StringBuilder();
        String[] c=path.split("/");
        Stack<String> st=new Stack<>();
        for(String s:c){

            if(s.equals("..")){
                if(!st.empty()){
                    st.pop();
                }
            }else if(s.equals(".") || s.equals("")){ continue;
            }else{
                st.push(s);
            }
        }
        while(!st.empty()){
            sb.insert(0,"/"+st.pop());
        }
        return sb.length()==0?"/":sb.toString();
    }
}
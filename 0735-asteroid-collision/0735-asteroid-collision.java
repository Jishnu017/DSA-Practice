class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<asteroids.length;i++){
            int a=asteroids[i];
            if(a>0){
                st.push(a);
            }else{
                while(!st.empty() && st.peek()>0 && st.peek()<-a){
                    st.pop();
                }
                if(st.empty() || st.peek()<0){
                    st.push(a);
                }
                if(st.peek()==-a){
                    st.pop();
                }
            }
        }
        int m=st.size();
        int[] ans=new int[m];
        int j=m-1;
        for(int i=0;i<m;i++){
            ans[j--]=st.pop();
        }
        return ans;
    }
}
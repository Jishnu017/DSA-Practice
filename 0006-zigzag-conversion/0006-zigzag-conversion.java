class Solution {
    public String convert(String s, int n) {
       if(n==1) return s;
       StringBuilder ans=new StringBuilder();
       int cycle=2*(n-1);
       for(int i=0;i<n;i++){
        for(int j=i;j<s.length();j+=cycle){
            ans.append(s.charAt(j));
            int diagonal=j + cycle-2*i;
            if(i!=0 && i!=n-1 && diagonal<s.length()){
                ans.append(s.charAt(diagonal));
            }
        }
       }
       return ans.toString();
    }
}
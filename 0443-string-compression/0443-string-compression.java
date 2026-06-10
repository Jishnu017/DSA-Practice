class Solution {
    public int compress(char[] chars) {
        int n=chars.length;
        StringBuilder sb=new StringBuilder();
        int i=0,j=0;
        while(i<n){
            while(j<n && chars[i]==chars[j]){
                j++;
            }
            int len=j-i;
            sb.append(chars[i]);
            if(len!=1){
                sb.append(len);
            }
            i=j;
        }
        for(int a=0;a<sb.length();a++){
            chars[a]=sb.charAt(a);
        }
        return sb.length();
    }
}
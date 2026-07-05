class Solution {
    List<String> ans=new ArrayList<>();
    public List<String> letterCombinations(String digits) {
        String[] str={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        bt(0,digits,str,new StringBuilder());
        return ans;
    }
    void bt(int n,String d,String[] str, StringBuilder sb){
        if(n==d.length()){
            ans.add(sb.toString());
            return;
        }
        String t=str[d.charAt(n)-'0'];
        for(char c:t.toCharArray()){
            bt(n+1,d,str,sb.append(c));
            sb.deleteCharAt(sb.length()-1);
        }
    }
}
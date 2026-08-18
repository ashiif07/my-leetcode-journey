class Solution {
    public String reverseWords(String s) {

        int n = s.length();

        StringBuilder ans =new StringBuilder();
        StringBuilder sb =new StringBuilder(s);

        sb.reverse();


        for(int i=0;i<n;i++){
        StringBuilder word =new StringBuilder();

        while(i<n && sb.charAt(i)!= ' '){
            word.append(sb.charAt(i++));
        }
        if(word.length()>0){
            word.reverse();
            ans.append(" "+word);
        }            
        }
        return ans.substring(1);
    }
}
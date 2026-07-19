class Solution {
    public String smallestSubsequence(String s) {
        int []last=new int[26];
        boolean []visit=new boolean[26];

        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            last[ch-'a']=i;
        }

        Stack<Character>st=new Stack<>();

        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(visit[c-'a']) continue;

            while(!st.isEmpty() && st.peek()>c && last[st.peek()-'a']>i)
            {
                visit[st.pop()-'a']=false;
            }
            st.push(c);
            visit[c-'a']=true;
        }

        StringBuilder sr=new StringBuilder();

        for(char j:st){
sr.append(j);
        }

        return sr.toString();
    }
}
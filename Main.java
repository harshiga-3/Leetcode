lass Solution {
    public char findTheDifference(String s, String t) {
        int sum=0;
        for(char c:t.toCharArray())
        {
            sum+=c;
        }
         for(char w:s.toCharArray())
        {
            sum-=w;
        }

        return (char)sum;
    }
}
class Solution {
    public int countPalindromicSubsequence(String s) {
        Set<Character> set=new HashSet<>();
        for(char c:s.toCharArray())
            set.add(c);
        int i,j,k,cnt=0;
        for(char c:set)
        {
            i=-1;
            j=0;
            for(k=0;k<s.length();k++)
            {
                if(s.charAt(k)==c)
                {
                    if(i==-1)   
                        i=k;
                    j=k;
                }
            }
            Set<Character> a=new HashSet<>();
            for(k=i+1;k<j;k++)  
                a.add(s.charAt(k));
            cnt+=a.size();
        }
        return cnt;
    }
}
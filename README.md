# january4_2025
The problem that i solved today in leetcode

Problem Summary:
The task is to count all unique palindromes of length 3 that can be formed as a subsequence of the string s. A palindrome reads the same forward and backward.

Approach:
Extract Unique Characters: Identify all distinct characters in the string using a Set. This step reduces redundant checks.
Find First and Last Occurrence:
For each unique character, find its first (i) and last (j) positions in the string.
Count Intermediate Characters:
Between the first and last occurrence of the current character, collect all distinct characters in a Set (as the middle characters of the palindrome).
Update the Count:
The size of the intermediate Set gives the count of palindromes for the current character.

Code:
class Solution {
    public int countPalindromicSubsequence(String s) {
        Set<Character> set=new HashSet<>();
        for(char c:s.toCharArray())
            set.add(c);
        int i,j,k,cnt=0;;
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

Complexity:
Time Complexity: 𝑂(𝑛.26), where n is the length of the string and 26 represents the unique characters (limited by the alphabet size).
Space Complexity: 𝑂(26) for the Set storing unique characters.

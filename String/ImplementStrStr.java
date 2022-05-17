class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.length()==0)
        {
            return 0;
        }
        if(!haystack.contains(needle))
        {
            return -1;
        }

        int n = needle.length();
        for(int i=0;i<haystack.length();i++)
        {
            if((i+n)>=haystack.length())
            {
                if(haystack.substring(i).equals(needle))
                {
                   return i; 
                }
            }
            else if(haystack.substring(i,i+n).equals(needle))
            {
                return i;
            }
        }
        return -1;
    }
}

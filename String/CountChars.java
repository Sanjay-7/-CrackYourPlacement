import java.util.Set;
import java.util.TreeMap;

class Solution
{
    public void countDuplicates(String s)
    {
        int n = s.length();
        TreeMap<Character,Integer> tm = new TreeMap<>();
        for(int i=0;i<n;i++)
        {
            char ch = s.charAt(i);
            if(tm.containsKey(ch))
            {
                tm.put(ch, tm.get(ch)+1);
            }
            else
            {
                tm.put(ch, 1);
            }
        }

        Set<Character> set = tm.keySet();
        for(char ch: set)
        {
            int val = tm.get(ch);
            System.out.println(ch+"="+val);
        }
    } 
}

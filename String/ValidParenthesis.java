class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(ch=='{' || ch=='(' || ch=='[')
            {
                st.push(ch);
            }
            else
            {
                switch(ch)
                {
                    case ']':if(st.size()>0 && st.peek()=='[')
                             {
                                st.pop();
                             }
                             else
                             {
                                 return false;
                             }
                             break;
                    case ')':if(st.size()>0 && st.peek()=='(')
                             {
                                st.pop();
                             }
                             else
                             {
                                 return false;
                             }
                             break;
                    case '}':if(st.size()>0 && st.peek()=='{')
                             {
                                st.pop();
                             }
                             else
                             {
                                 return false;
                             }
                             break;
                }
            }
        }
        return st.size()==0;
    }
}



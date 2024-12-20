class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        for(char i:s.toCharArray())
        {
            if(i=='(' || i=='{' || i=='[')
            {
                st.add(i);
            }
            else
            {
                if(st.isEmpty())
                {
                    return false;
                }
                int top=st.pop();
                if((top!='(' && i==')') ||(top!='{' && i=='}') || (top!='[' && i==']'))
                {
                    return false;
                }
            }
        }
        if(st.isEmpty())
        {
            return true;
        }
        return false;
    }
}

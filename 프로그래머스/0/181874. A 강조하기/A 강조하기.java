class Solution {
    public String solution(String myString) {
        String answer = "";
        
        char[] ch = myString.toCharArray();
        
        for (int i = 0; i < ch.length; i++)
        {
            String a = Character.toString(ch[i]);

            if(a.equalsIgnoreCase("a"))
            {
                a = a.toUpperCase();
            }
            else
            {
                a = a.toLowerCase();
            }
            answer += a;
        }
        
        return answer;
    }
}
class Solution {
    public int solution(int n) {
        int pizza = 7;
        int answer = 0;
        
        if(n%pizza > 0)
        {
            answer++;
        }

        answer += (n/pizza);
        return answer;
    }
}
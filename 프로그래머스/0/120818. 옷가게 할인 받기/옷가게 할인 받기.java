class Solution {
    public int solution(int price) {
        double sale = 0.0;
        if(price >= 100000) sale = 0.05;
        if(price >= 300000) sale = 0.1;
        if(price >= 500000) sale = 0.2;

        int answer = (int)Math.floor(price - (price*sale));
        
        return answer;
    }
}
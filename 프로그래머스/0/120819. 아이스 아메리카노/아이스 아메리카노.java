class Solution {
    public int[] solution(int money) {
                int iced = 5500;

        int[] answer = {( money / iced), ( money % iced)};
        return answer;
    }
}
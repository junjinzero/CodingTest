class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        double summ = 0; 
        for (int i = 0; i < numbers.length; i++)
        {
            summ += numbers[i];
        }
        answer = summ / numbers.length;
        return answer;
    }
}
import java.util.Arrays;
class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
               // 복사할 길이 계산
        int length = num2 - num1 + 1;

        // 복사 대상 배열 생성
        int[] answer = new int[length];

        // 배열 복사
        System.arraycopy(numbers, num1, answer, 0, length);

        return answer;
    }
}
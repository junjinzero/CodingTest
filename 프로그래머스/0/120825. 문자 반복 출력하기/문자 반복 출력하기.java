class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        String[] array = my_string.split("");

        for (int i=0 ; i < array.length ; i++) {
            for (int j = 0; j < n; j++) {
                answer += array[i];
            }
        }
        return answer;
    }
}
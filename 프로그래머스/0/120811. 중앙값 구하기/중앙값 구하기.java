import java.util.Arrays;
class Solution {
    public int solution(int[] array) {
        

        Arrays.parallelSort(array);
        return array[array.length / 2];
    }
}
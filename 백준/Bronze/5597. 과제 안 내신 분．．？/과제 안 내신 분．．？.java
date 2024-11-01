import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean[] isSubmitted = new boolean[30]; // 인덱스 0~29 사용, 초기값은 false

        // 입력으로 받은 번호는 제출된 번호로 표시
        for (int i = 0; i < 28; i++)
        {
            int num = Integer.parseInt(br.readLine());
            isSubmitted[num - 1] = true;  // 인덱스 0부터 시작하므로 num-1
        }

        // 제출되지 않은 번호 찾기
        for (int i = 0; i < isSubmitted.length; i++)
        {
            if(!isSubmitted[i])
            {
                // false 이면 미제출자
                // 번호로 출력하기 위해 +1
                System.out.println(i + 1);
            }
        }

    }
}

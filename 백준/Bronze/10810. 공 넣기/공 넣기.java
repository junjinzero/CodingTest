import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 첫 줄 입력 : N(바구니 개수) 와 M(작업 횟수) 읽기
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        // N개의 바구니 상태를 저장할 배열 (초기값은 모두 0)
        int[] baskets = new int[N];

        // M번 작업 수행
        for (int t = 0; t < M; t++)
        {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken()) - 1; //시작 바구니(0-index로 변환)
            int j = Integer.parseInt(st.nextToken()) - 1; //  끝 바구니(0-index로 변환)
            int k = Integer.parseInt(st.nextToken());     //넣을 공의 번호

            // i번부터 j번 바구니까지, k번 공을 넣기
            for(int idx = i; idx <=j; idx++)
            {
                baskets[idx] = k;
            }
        }

        // 결과 출력
        StringBuilder sb = new StringBuilder();
        for (int basket : baskets)
        {
            sb.append(basket).append(" ");
        }

        System.out.println(sb.toString().trim());

    }
}

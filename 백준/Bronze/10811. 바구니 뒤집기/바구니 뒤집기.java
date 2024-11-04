import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main
{
    public static void main(String[] args) throws IOException
    {

        //1. 바구니 준비하기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = i + 1;  // 바구니의 시작상태 : 1 2 3 4 5
        }

        //2. 바구니의 순서 바꾸기
        while(M > 0)
        {
            st = new StringTokenizer(br.readLine());

            int i = Integer.parseInt(st.nextToken()) -1;
            int j = Integer.parseInt(st.nextToken()) -1;

            // i번 바구니부터와 j번 바구니까지의 순서를 뒤집는다
            while(i < j)
            {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                i++;
                j--;
            }

            M--;
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < arr.length; i++)
        {
            sb.append(arr[i]+" ");
        }

        System.out.println(sb.toString().trim());

    }
}

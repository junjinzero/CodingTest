import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] baskets = new int[N];

        for (int i = 0; i < baskets.length; i++)
        {
            baskets[i] = i+1;  // 1,2,3,4,5
        }

        for (int t = 0; t < M; t++)  // M번 바꿀거야
        {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken()) - 1;
            int j = Integer.parseInt(st.nextToken()) - 1;

            int temp = baskets[j];
            baskets[j] = baskets[i];
            baskets[i] = temp;

        }

        StringBuilder sb = new StringBuilder();

        for (int basket : baskets)
        {
            sb.append(basket).append(" ");
        }

        System.out.println(sb.toString().trim());

    }
}

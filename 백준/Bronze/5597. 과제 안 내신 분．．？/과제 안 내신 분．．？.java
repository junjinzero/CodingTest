import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] numArr = new int[28];

        for (int i = 0; i < 28; i++)
        {
            numArr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(numArr);

        int t = 1;
        for (int i = 0; i < numArr.length; i++)
        {
            while(t != numArr[i])
            {
                System.out.println(t);
                t++;
                if(t == numArr[i]) break;
            }
            t++;

        }

        while(t <= 30)
        {
            System.out.println(t);
            t++;
        }

    }
}
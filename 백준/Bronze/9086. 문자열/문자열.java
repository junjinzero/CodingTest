import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        String[] strA = new String[n];

        for (int i = 0; i < strA.length; i++)
        {
            strA[i] = br.readLine();
        }

        for (int i = 0; i < strA.length; i++)
        {
            System.out.print(strA[i].charAt(0));
            System.out.println(strA[i].charAt(strA[i].length()-1));
        }

    }
}

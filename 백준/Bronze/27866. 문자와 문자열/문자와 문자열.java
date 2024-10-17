import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String numStr = br.readLine();

        String[] splitStr = str.split("");
        int num = Integer.parseInt(numStr);

        for (int i = 0; i < splitStr.length; i++)
        {
            if(i+1==num)
            {
                System.out.println(splitStr[i]);
            }
        }

    }
}

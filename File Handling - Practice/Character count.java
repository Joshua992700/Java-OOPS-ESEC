import java.io.*;
import java.util.*;
public class Program
{
    public static void main(String[] args) throws Exception 
    {
        int cnt=0;
        String s;
        char[] buffer;
        File f1=new File("input.txt");
        FileReader fr = new FileReader(f1);
        BufferedReader bfr = new BufferedReader(fr);
        Scanner sc = new Scanner(System.in);
        char letter = sc.next().charAt(0);
        while((s=bfr.readLine())!=null)
        {
            buffer=s.toCharArray();
            for (char chr: buffer)
            {
                if (chr==letter)
                {
                    cnt++;
                }
            }
        }
        if(cnt==0)
        {
            System.out.println("Character not found!");
            
        }
        else
        {
            System.out.println("Character: "+letter+" found! Count : "+cnt);
        }
        fr.close();
    }
}

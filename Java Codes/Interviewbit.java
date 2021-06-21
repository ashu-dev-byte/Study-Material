import java.util.*;
import java.lang.*;

class Rextester
{
    public static String solve(String A)
    {
        int len = A.length();
        String ort = "";

        do{
            int roy = 2;
            int joy = 0;
            String min = A.substring(joy,roy);
            String chk = "";
            int index = roy;
            String S;
            StringBuffer res;

            for(int i=roy;i<=len;i++)
            {
                S = A.substring(joy,i);
                res = new StringBuffer(S);
                res = res.reverse();
                chk = res.toString();

                if(min.compareTo(chk) > 0)
                {
                    min = chk;
                    index = i;
                }
            }
            ort = A.substring(0,joy) + min + A.substring(index);
            roy++;
            joy++;

        }while(ort.equals(A));

        return ort;

    }

    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        String S = "ama";
        System.out.println(solve(S));
    }
}
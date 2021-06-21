import java.util.stream.Collectors;
import java.util.concurrent.*;
import java.util.regex.*;
import java.security.*;
import java.util.*;
import java.math.*;
import java.time.*;
import java.text.*;
import java.io.*;

class Rextester
{
    static class FastReader
    {
        BufferedReader br;
        StringTokenizer st;

        FastReader()
        {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next()
        {
            while (st == null || !st.hasMoreElements())
            {
                try
                {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException  e)
                {
                    e.printStackTrace();
                }
            }
              return st.nextToken();
        }

        char nextChar()
        {
            return next().charAt(0);
        }

        int nextInt()
        {
            return Integer.parseInt(next());
        }

        long nextLong()
        {
            return Long.parseLong(next());
        }

        double nextDouble()
        {
            return Double.parseDouble(next());
        }

        String nextLine()
        {
            String str = "";
            try
            {
                str = br.readLine();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
              return str;
        }

        boolean ready()
		{
            boolean b = false;
            try 
			{
                b = br.ready();
            }

            catch (IOException e)
			{
                e.printStackTrace();
            }

             return b;
        }
    }
	
    public static void main(String[] args)
	{
        FastReader in = new FastReader();
        if (in.ready())
		{
			int tc = in.nextInt();
			for(int i=0;i<tc;i++)
			{
				
			}
	    }
    }
}
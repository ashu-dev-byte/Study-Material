import java.util.stream.Collectors;
import java.util.concurrent.*;
import java.util.regex.*;
import java.security.*;
import java.util.*;
import java.math.*;
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
			int n = in.nextInt();
			int arr[] = new int[n];
			for(int i=0;i<n;i++)
			    arr[i] = in.nextInt();
			
			int overmax = 100000001;
			int x = Integer.MAX_VALUE; 
			int y = Integer.MIN_VALUE; 
	 
			for (int i = 0; i < n; i++) 
			{ 
				x = Math.min(x, arr[i]); 
				y = Math.max(y, arr[i]); 
			} 
	  
			int memo[] = new int[n]; 
			int sum[] = new int[overmax]; 
	 
			int res = 0; 
	   
			for (int d = (x - y); d <= (y - x); d++)  
			{ 
				Arrays.fill(sum, 0);
	 
				for (int i = 0; i < n; i++) 
				{ 
					   
					memo[i] = 1; 
	  
					if (arr[i] - d >= 1 && arr[i] - d <= 1000000) 
						memo[i] += sum[arr[i] - d]; 
	  
					res += memo[i] - 1; 
					sum[arr[i]] += memo[i]; 
				} 
			} 
			
			if(ans > 0)
				System.out.println("Yes");
			else
				System.out.println("No");
			
			
	    }
    }
}




















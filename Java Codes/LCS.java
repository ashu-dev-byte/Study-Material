import java.util.*;
class LCS
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter String1: ");
		String S1 = in.next().toLowerCase();
		System.out.println("Enter String2: ");
		String S2 = in.next().toLowerCase();
		int l1 = S1.length();
		int l2 = S2.length();
        int a[][] = new int[l2+1][l1+1];

        for(int i=0;i<l2;i++)
        {
        	for(int j=0;j<l1;j++)
        	{
        		if(S2.charAt(i) == S1.charAt(j))
        			a[i+1][j+1] = a[i][j] + 1;
        	}
        }
        
        /*for(int x[] : a)
        {
            for(int y : x)
                System.out.print(y + " ");
            System.out.println();
        }*/
        
          int max = 0;
        for(int i=0;i<l2+1;i++)
        	for(int j=0;j<l1+1;j++)
        		if(a[i][j] > max)
        			max = a[i][j];

        System.out.println("Length of largest common substring is: " + max);
	}
}
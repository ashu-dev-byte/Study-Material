import java.util.*;
class MED
{
    public static int mini(int a,int b,int c)
    {
        return Math.min(a,Math.min(b,c));
    }

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

        for(int i=0;i<l1+1;i++)
            a[0][i] = i;

        for(int i=0;i<l2+1;i++)
            a[i][0] = i;

        for(int i=0;i<l2;i++)
        {
        	for(int j=0;j<l1;j++)
        	{
        		if(S2.charAt(i) == S1.charAt(j))
        			a[i+1][j+1] = a[i][j];
                else
                    a[i+1][j+1] = mini(a[i][j], a[i][j+1], a[i+1][j]) + 1;
        	}
        }
        
        for(int x[] : a)
        {
            for(int y : x)
                System.out.print(y + " ");
            System.out.println();
        }

        System.out.println("Minimum Edit Distance is: " + a[l2][l1]);

	}
}
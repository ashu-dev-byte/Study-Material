import java.util.*;

class Counting_Sort
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		int a[] = {9,8,8,7,5,1,1,0,3,2,2,9,1};
		int max = Arrays.stream(a).max().getAsInt();
        int b[] = new int[max+1];
        //System.out.println(max);

        for(int i : a)
        	b[i] = b[i] + 1;

        // for(int i : b)
        // 	System.out.print(i+" ");
        // 	System.out.println();

        for(int i=0;i<max+1;i++)
        	for(int j=0;j<b[i];j++)
        		System.out.print(i+ " ");

	}
}
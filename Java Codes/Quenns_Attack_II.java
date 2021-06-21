import java.util.*;

class Queens
{
    public static int count(int row,int col,int p,int q,ArrayList<Integer> a[],int n)
    {
        int sum=1;

        if(row==-1 || col==-1 || row==n || col==n || a[row].get(col)==1)
            return sum-2;
        else
            return sum + count(row+p,col+q,p,q,a,n);
    }//End of count-function

    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int r = in.nextInt() - 1;
        int c = in.nextInt() - 1;

        ArrayList<Integer> a[] = new ArrayList[n];
        for (int i=0;i<n;i++)
            a[i] = new ArrayList<Integer>(Collections.nCopies(n,0));

        a[r].set(c,7);
        int x,y,p=0,q=0,S=0;

        for(int i=0;i<k;i++)
        {
            x = in.nextInt() - 1;
            y = in.nextInt() - 1;
            a[x].set(y,1);
        }

        for(int i=1;i<=8;i++)
        {
            switch(i)
            {
                case 1: p=-1;q=-1;
                    break;
                case 2: p=-1;q=0;
                    break;
                case 3: p=-1;q=1;
                    break;
                case 4: p=0;q=-1;
                    break;
                case 5: p=0;q=1;
                    break;
                case 6: p=1;q=-1;
                    break;
                case 7: p=1;q=0;
                    break;
                case 8: p=1;q=1;
                    break;
            }

            S = S + count(r,c,p,q,a,n);
        }
        System.out.println(S);

                 /* for(ArrayList<Integer> i : a)
                 {
                    for(int j : i)
                        System.out.print(j + " ");
                      System.out.println();
                 }*/

    }//End of main

}//End of class
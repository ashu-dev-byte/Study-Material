import java.util.*;

public class Autobiographical_Number
{  
    public static boolean check(long n)
    {
        String S = Long.toString(n);
        int num[] = new int[10];
        int a;
        
        for(int i=0;i<S.length();i++)
            num[Integer.parseInt(S.charAt(i) + "")]++;

        for(int i=0;i<S.length();i++)
            if(num[i] != Integer.parseInt(S.charAt(i) + ""))
               return false;  
        return true;
    }
    
    public static void main(String args[])
    {     
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Starting Number: ");
        long start = in.nextLong();
        System.out.print("Enter Ending Number: ");
        long end = in.nextLong();
        
        for(long i=start;i<=end;i++)            
            if(check(i))
               System.out.println(i);  
        System.out.println("The Process has been completed.");               
    }
}
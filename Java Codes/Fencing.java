import java.util.*;

class Fencing
{
    public static boolean palindrome(String a,String b)
    {
        String temp=a.concat(b);
        int l=temp.length();
        int c=0;
        while(c!=l/2)
        {
            if(temp.charAt(c)!=temp.charAt(l-c-1))
                return false;
            c++;
        }
        return true;
    }

    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        String S=in.nextLine();
        int len=S.length();
        HashMap<String,ArrayList<String>> a = new HashMap<>();
        System.out.println();
    }
}













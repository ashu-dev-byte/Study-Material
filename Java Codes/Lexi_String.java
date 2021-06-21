import java.util.*;
class Rextester
{  
    public static void sortt(char a[],char b[],StringBuilder c)
    {
       int count[] = new int[26];
       int indexcount = 0; 
        
        for(int i=0 ; i<b.length ; i++)
            count[b[i] - 'a']++;
        
        for(int j=0 ; j<a.length ; j++)
            for(int k=0 ; k<count[a[j] - 'a'] ; k++)
                 c.append(a[j]);
         
        System.out.println(c.toString());    
    }
      
    public static void main(String args[])
    {
       Scanner in = new Scanner(System.in);
       int tc = in.nextInt();
       String pattern;
       String str; 
       StringBuilder res; 
        
       for(int i=0 ; i<tc ; i++)
       {
          pattern = in.next();
          str = in.next();
          res = new StringBuilder("");
          sortt(pattern.toCharArray(),str.toCharArray(),res);           
       }
    }
    
}
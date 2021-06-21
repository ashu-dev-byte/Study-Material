import java.util.*;
class DSA_prac
{
    static ArrayList<Integer> a = new ArrayList<>();
    static ArrayList<Integer> b = new ArrayList<>();

    public static void push(int num)
    {
        a.add(num);
    }

    public static void pop()
    {
        int s=a.size();
        //System.out.println(a.get(s-1));
        a.remove(s-1);
    }

    public static void transform()
    {
        int s = a.size();

          for(int i=0;i<s;i++)
              b.add(a.get(i));
    }

    public static void insert(int num)
    {
        b.add(num);
    }

    public static void remove()
    {
        //System.out.println(b.get(0));
        b.remove(0);
    }

    public static void display_stack()
    {
        int size = a.size();
        System.out.print("Stack: ");

         for(int i=0;i<size;i++)
             System.out.print(a.get(i)+" ");
        System.out.println();
    }

    public static void display_queue()
    {
        int size = b.size();
        System.out.print("Queue: ");

        for(int i=0;i<size;i++)
            System.out.print(b.get(i)+" ");
        System.out.println();
    }

    public static void main(String[] args)
    {
        DSA_prac obj = new DSA_prac();
        obj.push(1);
        obj.push(45);
        obj.push(23);
        obj.display_stack();
        obj.push(2);
        obj.display_stack();
        obj.push(3);
        obj.display_stack();
        obj.pop();
        obj.display_stack();
        obj.transform();
        obj.display_queue();
        obj.insert(17);
        obj.display_queue();
        obj.remove();
        obj.display_queue();

    }
}
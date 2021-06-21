import java.util.*;

class Data_Structure
{
	public static void main(String args[])
	{
        ArrayList<Integer> a = new ArrayList<>();
         insert(7,a);
         insert(74,a);
         insert(43,a);
         insert(92,a);
         insert(12,a);
         traverse(a);
         delete(74,a);
         traverse(a);
         sort(a);
         traverse(a);
         search(43,a);
         traverse(a); 
	}

	public static void insert(int x,ArrayList<Integer> arr)
	{
		arr.add(x);
	}

	public static void traverse(ArrayList<Integer> arr)
	{
		System.out.println(arr);
	}
    
    public static void delete(int x,ArrayList<Integer> arr)
    {
        arr.remove(new Integer(x));
    }
    
    public static void search(int x,ArrayList<Integer> arr)
    {
        if(arr.contains(x))
            System.out.println("Element " + x + " Found");
        else
            System.out.println("Element not Found");
    }
    
    public static void sort(ArrayList<Integer> arr)
    {
        Collections.sort(arr);
    }
}
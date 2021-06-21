
import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    List<String> list_String=new ArrayList<>();
	    
	    //add element
	    list_String.add("Red");
	    list_String.add("Orange");
	    
	    //insert element at an index
	    list_String.add(1,"Blue");
	    list_String.add(0,"Yellow");
	    
	   // System.out.println(list_String);
	   for(String element : list_String){
	       System.out.println(element);
	   }
	   
	   //retreive element
	   System.out.println("----------"+list_String.get(2));
	   
	   //replace an element by index
	   System.out.println("+++++"+list_String.set(2,"BLACK")+"\n");
	   
	   for(String element : list_String){
	       System.out.println(element);
	   }
	   
	   //check if element is present
	   System.out.println(list_String.contains("BLACK"));
	   
	   //sorting
	   Collections.sort(list_String);
	       System.out.println("Sorted:"+list_String);
	       
	   ArrayList<String> list_String2=new ArrayList<>();
	   list_String2.add("aaaa");
	   list_String2.add("cccc");
	   list_String2.add("bbbb");
	   list_String2.add("dddd");
	   
	   //copy right list into first
	   Collections.copy(list_String,list_String2);//remember that left parameter must have larger or equal length than right paramenter; otherwise IndexOutOfBoundsException
	   System.out.println("*");
	   System.out.println(list_String);
	   System.out.println(list_String2);
	   
	   //shuffle
	   Collections.shuffle(list_String);
	   System.out.println("Shuffled:"+list_String);
	   
	   //reverse
	   Collections.reverse(list_String);
	   System.out.println("Reversed:"+list_String);
	   
	   System.out.println("Original List:"+list_String);
	   List<String> sub_list = list_String.subList(1,3);
	   System.out.println("Subset:"+sub_list);
	   
	   //comparing two list
	   ArrayList<String> c1=new ArrayList<>(Arrays.asList("a","b","c","d","e"));
	   ArrayList<String> c2=new ArrayList<>(Arrays.asList("c","d","e","f"));
	   ArrayList<String> c3=new ArrayList<>();
	   
	   for(String e:c1){
	       c3.add(c2.contains(e)?"Yes":"No");
	   }
	   System.out.println(c3);
	   
	   //join two lists
	   c3.clear();
	   c3.addAll(c1);
	   c3.addAll(c2);
	   System.out.println(c3);
	}
}



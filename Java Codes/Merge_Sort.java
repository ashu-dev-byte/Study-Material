import java.util.*;

class Node  
{ 
    int data; 
    Node next; 

    Node(int d) 
    {
    	data = d; 
        next = null;
    } 
} 

class Merge_Sort
{ 
	Node head;  

	public static void main(String args[]) 
	{ 
    
	    Merge_Sort llist1 = new Merge_Sort(); 
	    Merge_Sort llist2 = new Merge_Sort(); 
	      
	    llist1.addToTheLast(new Node(5)); 
	    llist1.addToTheLast(new Node(10)); 
	    llist1.addToTheLast(new Node(15));
	    llist1.addToTheLast(new Node(27)); 
	      
	    llist2.addToTheLast(new Node(2)); 
	    llist2.addToTheLast(new Node(3)); 
	    llist2.addToTheLast(new Node(20));
	      
	    llist1.head = new sortingg().sortedMerge(llist1.head, llist2.head); 
	    llist1.printList();           
	} 
	 
	public void addToTheLast(Node node)  
	{ 
	    if (head == null) 
	        head = node; 

	    else 
	    { 
	        Node temp = head; 
	        while (temp.next != null) 
	            temp = temp.next; 
	        temp.next = node; 
	    } 
	}

	void printList() 
	{ 
	    Node temp = head; 

	    while (temp != null) 
	    { 
	        System.out.print(temp.data + " "); 
	        temp = temp.next; 
	    }  
	         System.out.println(); 
	}  
}

class sortingg
{ 
    public Node sortedMerge(Node A, Node B)  
    { 
      
        if(A == null) 
        	return B; 
        if(B == null) 
        	return A; 
          
        if(A.data < B.data)  
        { 
            A.next = sortedMerge(A.next, B); 
            return A; 
        } 

        else 
        { 
            B.next = sortedMerge(A, B.next); 
            return B; 
        }     
    } 
} 
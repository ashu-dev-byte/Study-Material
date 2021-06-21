import java.util.*;
class Graphing
{
    ArrayList<String> a;
    HashMap<String,ArrayList<String>> adjList = new HashMap<>();
    //TreeMap<String,ArrayList<String>> adjList = new TreeMap<>();

    void addEdge(String u,String v)
    {
        adjList.putIfAbsent(u, new ArrayList<String>());
        adjList.putIfAbsent(v, new ArrayList<String>());
        adjList.get(u).add(v);
        adjList.get(v).add(u);
    }

    void size()
    {
        System.out.println(adjList.keySet().size());
        a = new ArrayList<String>(adjList.keySet());
        Collections.sort(a);
        System.out.println(a+"\n");
    }

    void display()
    {
        System.out.println("Display Method:-");
       for(Map.Entry<String,ArrayList<String>> v : adjList.entrySet())
       {
           System.out.print(v.getKey()+"->");
           for(String name : v.getValue())
               System.out.print(name+",");
           System.out.println();
       }
    }

    void show()
    {
        System.out.println("Show Method:-");
        for(String key : a)
        {
            System.out.print(key+"---->");
            for(String value : adjList.get(key))
                System.out.print(value+",");
            System.out.println();
        }
        System.out.println("\n");
    }
}

public class Hash_Graph
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Adjacency List of String is as follows:");
        Graphing obj = new Graphing();

        obj.addEdge("Amritsar","Delhi");
        obj.addEdge("Amritsar","Jaipur");
        obj.addEdge("Delhi","Patna");
        obj.addEdge("Patna","Gaya");
        obj.addEdge("Bhagalpur","Patna");
        obj.addEdge("Dehradun","Patna");
        obj.addEdge("Bangalore","Delhi");
        obj.size();
        obj.show();
        obj.display();

    }

}

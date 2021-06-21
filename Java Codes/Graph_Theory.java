package graph;
import java.util.*;

class Graph_Theory
{
    private Map<Integer,ArrayList<Integer>> adjListsMap;
    public Graph_Theory(int vertices){
        adjListsMap = new HashMap<Integer,ArrayList<Integer>>();
        for(int i=1;i<=vertices;i++){
            ArrayList<Integer> neighbours = new ArrayList<Integer>();
            adjListsMap.put(i, neighbours);
        }
    }
    public void addEdge(int v, int w){
        if(v > adjListsMap.size() || w > adjListsMap.size()){
            return;
        }
        (adjListsMap.get(v)).add(w);
        (adjListsMap.get(w)).add(v);
    }
    public ArrayList<Integer> getNeighbours(int v){
        if(v>adjListsMap.size()){
            return null;
        }
        return new ArrayList<Integer>(adjListsMap.get(v));
    }
    public static void main(String args[]){
        int count = 1, source, dest;
        System.out.print("Enter the number of vertices and edges");
        Scanner scan = new Scanner(System.in);
        int number_vertices = scan.nextInt();
        int number_edges = scan.nextInt();
        Graph_Theory adjacencyList = new Graph_Theory(number_vertices);
        System.out.println("Enter edges in format <source> <destination>");
        while(count <= number_edges){
            source = scan.nextInt();
            dest = scan.nextInt();
            adjacencyList.addEdge(source, dest);
            count++;
        }
        System.out.println("The given adjacency List for the graph\n");
        for(int i=1;i<=number_vertices;i++){
            System.out.print(i + "->");
            ArrayList<Integer> edgeList = adjacencyList.getNeighbours(i);
            for(int j=1;;j++){
                if(j!=edgeList.size()){
                    System.out.print(edgeList.get(j-1)+",");
                }
                else{
                    System.out.print(edgeList.get(j-1));
                    break;
                }
            }
            System.out.println();
        }

    }
}


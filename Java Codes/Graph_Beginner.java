import java.util.*;
class Graph
{
    int V;
    ArrayList<Integer> adjList[];
    Graph(int v)
    {
        V = v;
         adjList = new ArrayList[V];
        for(int i=0;i<V;i++)
            adjList[i] = new ArrayList<Integer>();
    }

    void addEdge(int u,int v)
    {
        adjList[u].add(v);
        adjList[v].add(u);
    }

    void bfs(int src)
    {
        System.out.println("Breadth First Search:-");
        Queue<Integer> q = new LinkedList<>();
        boolean vis[] = new boolean[V];
        int dist[] = new int[V];
        int parent[] = new int[V];
        q.add(src);
        vis[src]=true;

        while(!q.isEmpty())
        {
            int node = q.remove();
            System.out.print(node + "->");

              for(int neighbour : adjList[node])
              {
                  if(!vis[neighbour])
                  {
                      q.add(neighbour);
                      vis[neighbour]=true;
                      dist[neighbour] = dist[node] + 1;
                      parent[neighbour] = node;
                  }
              }
        }
            System.out.println("\n");
              for(int i=0;i<V;i++)
                  System.out.println("Distance of " + i + " from source: " + dist[i]);
    }

    void shortest_path(int src,int dest)
    {
        Queue<Integer> q = new LinkedList<>();
        boolean vis[] = new boolean[V];
        int dist[] = new int[V];
        int parent[] = new int[V];
        q.add(src);
        vis[src]=true;

        while(!q.isEmpty())
        {
            int node = q.remove();

            for(int neighbour : adjList[node])
            {
                if(!vis[neighbour])
                {
                    q.add(neighbour);
                    vis[neighbour]=true;
                    dist[neighbour] = dist[node] + 1;
                    parent[neighbour] = node;
                }
            }
        }
          System.out.println("\n\nShortest Distance between " + src + " and " + dest + " is: " + dist[dest]);
          System.out.println("And the path is:");

           int temp = dest;
           while(temp!=src)
           {
               System.out.print(temp + "<--");
               temp=parent[temp];
           }
               System.out.print(temp);

    }

    void display()
    {
        System.out.println("Display:-");
        for(int i=0;i<V;i++)
        {
            System.out.print(i+"->");
             for(int node : adjList[i])
                 System.out.print(node+",");
            System.out.println();
        }
        System.out.println();
    }
}

public class Graph_Beginner
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Adjacency List is as follows:\n");
        Graph obj = new Graph(6);

        obj.addEdge(0,1);
        obj.addEdge(0,4);
        obj.addEdge(1,2);
        obj.addEdge(2,4);
        obj.addEdge(2,3);
        obj.addEdge(3,4);
        obj.addEdge(3,5);
        obj.display();
        obj.bfs(0);
        obj.shortest_path(0,5);

    }

}

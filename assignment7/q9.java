

import java.util.LinkedList;
import java.util.Scanner;

class Graph {
    private int V; // Number of vertices
    private LinkedList<Integer>[] adjList; // Adjacency list

    public Graph(int v) {
        V = v;
        adjList = new LinkedList[v];
        for (int i = 0; i < v; ++i) {
            adjList[i] = new LinkedList<>();
        }
    }

    // Add an edge to the graph
    public void addEdge(int v, int w) {
        adjList[v].add(w);
    }

    // Depth-first search (DFS)
    public void DFS(int v) {
        boolean[] visited = new boolean[V];
        DFSUtil(v, visited);
    }

    private void DFSUtil(int v, boolean[] visited) {
        visited[v] = true;
        System.out.print(v + " ");

        for (int neighbor : adjList[v]) {
            if (!visited[neighbor]) {
                DFSUtil(neighbor, visited);
            }
        }
    }

    // Read graph and store it in adjacency list representation
    public void readGraph(Scanner scanner) {
        System.out.println("Enter the number of vertices:");
        int vertices = scanner.nextInt();
        System.out.println("Enter the number of edges:");
        int edges = scanner.nextInt();

        System.out.println("Enter " + edges + " edges (format: from to):");
        for (int i = 0; i < edges; i++) {
            int from = scanner.nextInt();
            int to = scanner.nextInt();
            addEdge(from, to);
        }
    }
}

public class q9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a graph
        System.out.println("Enter the number of vertices:");
        int V = scanner.nextInt();
        Graph graph = new Graph(V);

        // Read graph
        graph.readGraph(scanner);

        // Perform depth-first search (DFS)
        System.out.println("Depth-First Search (DFS) starting from vertex 0:");
        graph.DFS(0);

        scanner.close();
    }
}

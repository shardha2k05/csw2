

import java.util.Arrays;
import java.util.LinkedList;

public class q8 {
    private int V; // Number of vertices
    private LinkedList<Integer>[] adjList; // Adjacency list
    private int[][] adjMatrix; // Adjacency matrix

    public q8(int v) {
        V = v;
        adjList = new LinkedList[v];
        adjMatrix = new int[v][v];
        for (int i = 0; i < v; ++i) {
            adjList[i] = new LinkedList<>();
            Arrays.fill(adjMatrix[i], 0);
        }
    }

    // Add an edge to the graph
    public void addEdge(int v, int w) {
        adjList[v].add(w);
        adjMatrix[v][w] = 1;
    }

    // Display adjacency matrix
    public void displayAdjMatrix() {
        System.out.println("Adjacency Matrix:");
        for (int i = 0; i < V; ++i) {
            for (int j = 0; j < V; ++j) {
                System.out.print(adjMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Display adjacency list
    public void displayAdjList() {
        System.out.println("Adjacency List:");
        for (int i = 0; i < V; ++i) {
            System.out.print(i + " -> ");
            for (Integer neighbor : adjList[i]) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int V = 5; // Number of vertices

        // Create a graph
        q8 graph = new q8(V);

        // Add edges
        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);

        // Display adjacency matrix
        graph.displayAdjMatrix();

        // Display adjacency list
        graph.displayAdjList();
    }
}



import java.util.*;

// Vertex class
class Vertex {
    int id;
    List<Vertex> neighbors;

    public Vertex(int id) {
        this.id = id;
        this.neighbors = new ArrayList<>();
    }

    public void addNeighbor(Vertex neighbor) {
        neighbors.add(neighbor);
    }

    public List<Vertex> getNeighbors() {
        return neighbors;
    }

    @Override
    public String toString() {
        return String.valueOf(id);
    }
}

// Graph class
class Graph {
    List<Vertex> vertices;

    public Graph() {
        this.vertices = new ArrayList<>();
    }

    public void addVertex(Vertex vertex) {
        vertices.add(vertex);
    }

    public void addEdge(Vertex v1, Vertex v2) {
        v1.addNeighbor(v2);
        v2.addNeighbor(v1);
    }

    public List<Vertex> getVertices() {
        return vertices;
    }
}

public class SimpleGraphExample {
    
    
    public static void main(String[] args) {
        // Create vertices
        Vertex v1 = new Vertex(1);
        Vertex v2 = new Vertex(2);
        Vertex v3 = new Vertex(3);

        // Create a graph
        Graph graph = new Graph();

        // Add vertices to the graph
        graph.addVertex(v1);
        graph.addVertex(v2);
        graph.addVertex(v3);

        // Add edges to the graph
        graph.addEdge(v1, v2);
        graph.addEdge(v2, v3);

        // Print the graph vertices and their neighbors
        for (Vertex vertex : graph.getVertices()) {
            System.out.print("Vertex " + vertex + " is connected to: ");
            for (Vertex neighbor : vertex.getNeighbors()) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }
}

package ee.ttu.algoritmid.approxtsp;

import java.util.*;

public class DFS {

    private Map<Integer, List<Integer>> getGraph(List<Edge> edges) {
        Map<Integer, List<Integer>> graph = new TreeMap<>();

        List<Integer> verticesRaw = new ArrayList<>();
        edges.forEach(edge -> {
            verticesRaw.add(edge.getSource());
            verticesRaw.add(edge.getDestination());
        });

        for (Integer vertex : verticesRaw) {
            List<Integer> neighbours = new ArrayList<>();
            graph.put(vertex, neighbours);
        }

        for (Edge edge : edges) {
            graph.get(edge.getSource()).add(edge.getDestination());
            graph.get(edge.getDestination()).add(edge.getSource());
        }

        return graph;
    }

    private void visit(int vertex, List<Integer> current, List<Integer> visited, Map<Integer, List<Integer>> graph) {
        current.add(vertex);
        List<Integer> neighbours = graph.get(vertex);
        Collections.sort(neighbours);

        for (int neighbour : neighbours) {
            if (!visited.contains(neighbour)) {
                visited.add(vertex);
                visit(neighbour, current, visited, graph);
            }
        }

        visited.add(vertex);
    }

    public int[] getPreorder(List<Edge> edges) {
        Map<Integer, List<Integer>> graph = getGraph(edges);
        List<Integer> current = new ArrayList<>();
        List<Integer> visited = new ArrayList<>();

        for (Map.Entry<Integer, List<Integer>> vertex : graph.entrySet()) {
            if (!visited.contains(vertex.getKey())) {
                visit(vertex.getKey(), current, visited, graph);
            }
        }
        current.add(0);

        int[] path = new int[current.size()];
        for (int i = 0; i < current.size(); i++) {
            path[i] = current.get(i);
        }

        return path;
    }
}

package ee.ttu.algoritmid.approxtsp;

import java.util.ArrayList;
import java.util.List;

public class ApproximateTSP {

    /* Approximating search */
    public static int[] approximateSolution(int[][] coordinates) {
//        ApproximateTSP approximateTSP = new ApproximateTSP();
//        List<Edge> edges = approximateTSP.edgeMaker(coordinates);
//        List<Integer> vertices = approximateTSP.verticesMaker(coordinates);
//
//        Kruskal kruskal = new Kruskal(vertices, edges);
//        DFS dfs = new DFS();

        return null;
    }

    public int measureDistance(int x1, int y1, int x2, int y2){
        return (int) Math.round(Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2)));
    }

    public List<Integer> verticesMaker(int[][] coordinates) {
        List<Integer> vertices = new ArrayList<>();

        for (int i = 0; i < coordinates.length; i++) {
            vertices.add(i);
        }

        return vertices;
    }

    public List<Edge> edgeMaker(int[][] coordinates) {
        List<Edge> edges = new ArrayList<>();

        for (int i = 0; i < coordinates.length; i++) {
            for (int j = 0; j < coordinates.length; j++) {
                if (coordinates[i] != coordinates[j]) {
                    edges.add(new Edge(i, j, measureDistance(coordinates[i][0], coordinates[i][1], coordinates[j][0],
                            coordinates[j][1])));
                }
            }
        }

        return edges;
    }
}

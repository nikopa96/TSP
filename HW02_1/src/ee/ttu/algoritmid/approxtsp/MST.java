package ee.ttu.algoritmid.approxtsp;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MST {

    private List<Integer> vertices;
    private List<Edge> edges;

    public MST(List<Integer> vertices, List<Edge> edges) {
        this.vertices = vertices;
        this.edges = edges;
    }

    private void sortEdgesByWeightAsc() {
        edges.sort(Comparator.comparingInt(Edge::getWeight));
    }

    public List<Edge> findMST() {
        List<Edge> MSTEdges = new ArrayList<>();
        UpTree upTree = new UpTree(vertices.size());
        sortEdgesByWeightAsc();

        int e = 0;
        int next = 0;

        while (e < vertices.size() - 1) {
            Edge edge = edges.get(next);

            int a = upTree.find(edge.getSource());
            int b = upTree.find(edge.getDestination());

            if (a != b) {
                upTree.union(a, b);
                MSTEdges.add(edge);
                e++;
            }

            next++;
        }

        return MSTEdges;
    }
}

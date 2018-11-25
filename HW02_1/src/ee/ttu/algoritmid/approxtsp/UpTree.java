package ee.ttu.algoritmid.approxtsp;

import java.util.Arrays;

public class UpTree {

    private int[] upTreeArray;

    public UpTree(int size) {
        this.upTreeArray = new int[size];
        makeSet();
    }

    private void makeSet() {
        for (int i = 0; i < upTreeArray.length; i++) {
            upTreeArray[i] = i;
        }
    }

    public int find(int vertex) {
        if (upTreeArray[vertex] == vertex) {
            return vertex;
        } else {
            return find(upTreeArray[vertex]);
        }
    }

    public void union(int vertex1, int vertex2) {
        int a = find(vertex1);
        int b = find(vertex2);

        if (vertex1 > vertex2) {
            if (vertex2 != b) {
                upTreeArray[vertex1] = b;
            } else {
                upTreeArray[vertex2] = a;
            }
        } else {
            if (vertex1 != a) {
                upTreeArray[vertex2] = a;
            } else {
                upTreeArray[vertex1] = b;
            }
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(upTreeArray);
    }
}

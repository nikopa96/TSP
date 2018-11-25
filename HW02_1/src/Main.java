import ee.ttu.algoritmid.approxtsp.*;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
//        UpTree upTree = new UpTree(8);
//
//        System.out.println(upTree);
//
//        upTree.union(1, 4);
//        upTree.union(5, 3);
//        upTree.union(3, 7);
//        upTree.union(6, 7);
//        upTree.union(4, 2);
//        upTree.union(4, 5);
//        System.out.println(upTree.find(1));
//        System.out.println(upTree.find(0));
//
//        System.out.println(upTree);

        int[][] coordinates = new int[21][2];
        coordinates[0][0] = 981036; coordinates[0][1] = 508139;
        coordinates[1][0] = 534120; coordinates[1][1] = -42453;
        coordinates[2][0] = 577878; coordinates[2][1] = -43732;
        coordinates[3][0] = 532890; coordinates[3][1] = -96645;
        coordinates[4][0] = 205322; coordinates[4][1] = 215891;
        coordinates[5][0] = 225923; coordinates[5][1] = 197950;
        coordinates[6][0] = 69842; coordinates[6][1] = 667632;
        coordinates[7][0] = 391965; coordinates[7][1] = 1054524;
        coordinates[8][0] = 310065; coordinates[8][1] = -10714;
        coordinates[9][0] = 247401; coordinates[9][1] = 754523;
        coordinates[10][0] = 217951; coordinates[10][1] = 218350;
        coordinates[11][0] = 443097; coordinates[11][1] = 54051;
        coordinates[12][0] = 47342; coordinates[12][1] = 630935;
        coordinates[13][0] = 317515; coordinates[13][1] = 713679;
        coordinates[14][0] = 301816; coordinates[14][1] = 1021772;
        coordinates[15][0] = 950864; coordinates[15][1] = 332234;
        coordinates[16][0] = 276433; coordinates[16][1] = 725657;
        coordinates[17][0] = 921801; coordinates[17][1] = 410349;
        coordinates[18][0] = 555508; coordinates[18][1] = 67090;
        coordinates[19][0] = 409959; coordinates[19][1] = 379409;
        coordinates[20][0] = 968097; coordinates[20][1] = 540588;


//        ApproximateTSP approximateTSP = new ApproximateTSP();
//        List<Edge> edges = approximateTSP.edgeMaker(coordinates);
//        List<Integer> vertices = approximateTSP.verticesMaker(coordinates);
//
//        Kruskal kruskal = new Kruskal(vertices, edges);
//        DFS dfs = new DFS();
//        dfs.getPreorder(kruskal.findMST());

        System.out.println(Arrays.toString(ApproximateTSP.approximateSolution(coordinates)));
    }
}

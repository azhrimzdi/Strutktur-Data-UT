import java.util.*;
public class BFS{
    static boolean[] visited = new boolean[10];
    static int[] nilai = {5,12,8,23,15,7,30,18,25,10};
    static List<List<Integer>> graph = new ArrayList<>();

    public static void main(String[] args) {
        for(int i = 0; i < 10;i++){
            graph.add(new ArrayList<>());
        }
        graph.get(0).addAll(Arrays.asList(1,2,3));
        graph.get(1).addAll(Arrays.asList(0,4,5));
        graph.get(2).addAll(Arrays.asList(0,6));
        graph.get(3).addAll(Arrays.asList(0,7));
        graph.get(4).addAll(Arrays.asList(1,8));
        graph.get(5).addAll(Arrays.asList(1,9));
        graph.get(6).addAll(Arrays.asList(2));
        graph.get(7).addAll(Arrays.asList(3));
        graph.get(8).addAll(Arrays.asList(4));
        graph.get(9).addAll(Arrays.asList(5));

        int target = 23;
        System.out.println("== Pencarian nilai " + target + " Menggunakan BFS");
        System.out.println();
        bfs(0,target);
    }
    static boolean bfs(int startNode, int target){
        Queue<Integer> queue = new LinkedList<>();

        queue.add(startNode);
        visited[startNode] = true;

        while(!queue.isEmpty()){
            int node = queue.poll();
            System.out.println("Menujungi node a" + node);

            if(nilai[node] == target){
                System.out.println("Nilai di temukan di node a" + node);
                return true;
            }

            for(int neighbor: graph.get(node)){
                if(!visited[neighbor]){
                    visited[node]= true;
                    queue.add(neighbor);
                }
            }
        }
        System.out.println("Nilai tidak di temukan!");
        return false;
    }
}

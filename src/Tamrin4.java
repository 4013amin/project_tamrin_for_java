import java.util.*;

public class Tamrin4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        List<List<int[]>> scenarios = new ArrayList<>();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            List<int[]> edges = new ArrayList<>();
            for (int j = 0; j < n - 1; j++) {
                int u = scanner.nextInt() - 1;
                int v = scanner.nextInt() - 1;
                edges.add(new int[]{u, v});
            }
            scenarios.add(edges);
        }

        scanner.close();

        for (List<int[]> scenario : scenarios) {
            int result = findMinimumCoins(scenario);
            System.out.println(result);
        }
    }

    private static int findMinimumCoins(List<int[]> edges) {
        int n = edges.size() + 1;
        List<Integer>[] graph = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            graph[u].add(v);
            graph[v].add(u);
        }

        int[] colors = new int[n];
        Arrays.fill(colors, -1);
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(0);
        colors[0] = 0;

        while (!queue.isEmpty()) {
            int node = queue.poll();
            for (int neighbor : graph[node]) {
                if (colors[neighbor] == -1) {
                    colors[neighbor] = 1 - colors[node];
                    queue.offer(neighbor);
                }
            }
        }

        int count0 = 0, count1 = 0;
        for (int color : colors) {
            if (color == 0) {
                count0++;
            } else {
                count1++;
            }
        }

        return Math.min(count0, count1) * 1 + Math.max(count0, count1) * 2;
    }
}

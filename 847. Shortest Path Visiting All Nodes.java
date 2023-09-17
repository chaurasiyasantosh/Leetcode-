class Solution {
    public int shortestPathLength(int[][] graph) {
        int n = graph.length, 
            finalMask = (int) Math.pow(2, n) - 1;

        // Let's BFS starting with each node as a starting point.
        Queue<int[]> queue = new LinkedList();
        boolean[][] visited = new boolean[n][finalMask + 1];
        for (int node = 0; node < n; node++) {
            // Add node id, bitmask, and distance.
            int mask = 1 << node;
            int[] entry = new int[] {node, mask, 0};
            queue.add(entry);

            // Keep track of visited nodes.
            visited[node][mask] = true;
        }

        // Execute BFS for shortest path to visit all nodes.
        while (!queue.isEmpty()) {
            // Pop next node and parse data.
            int[] entry = queue.poll();
            int node = entry[0], 
                mask = entry[1], 
                dist = entry[2];
            
            // Successfully visited all nodes!
            if (mask == finalMask)
                return dist;
            
            // Try traversing to neighbors.
            for (int child : graph[node]) {
                // Enqueue if not visited.
                int childMask = mask | (1 << child);
                if (!visited[child][childMask]) {
                    queue.add(new int[] {child, childMask, dist + 1});
                    visited[child][childMask] = true;
                }
            }
        }

        return -1;
    }
}

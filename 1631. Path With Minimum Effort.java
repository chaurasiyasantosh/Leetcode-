
class Solution {
    public int minimumEffortPath(int[][] heights) {
        int rows = heights.length;
        int cols = heights[0].length;

        // Create a priority queue to store cells with their efforts
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> a[2] - b[2]);

        // Initialize an array to store the minimum efforts to reach each cell
        int[][] minEfforts = new int[rows][cols];
        for (int[] row : minEfforts) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }

        // Define possible directions (up, down, left, right)
        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

        // Start from the top-left cell with effort 0
        minHeap.offer(new int[]{0, 0, 0});
        minEfforts[0][0] = 0;

        while (!minHeap.isEmpty()) {
            int[] cell = minHeap.poll();
            int row = cell[0];
            int col = cell[1];
            int effort = cell[2];

            // If we reached the bottom-right cell, return the minimum effort
            if (row == rows - 1 && col == cols - 1) {
                return effort;
            }

            // Explore neighbors
            for (int[] dir : directions) {
                int newRow = row + dir[0];
                int newCol = col + dir[1];

                // Check if the neighbor is within bounds
                if (newRow >= 0 && newRow < rows && newCol >= 0 && newCol < cols) {
                    // Calculate the effort required to move to the neighbor
                    int newEffort = Math.max(effort, Math.abs(heights[newRow][newCol] - heights[row][col]));

                    // If the new effort is less than the current recorded effort for the neighbor,
                    // update the neighbor's effort and add it to the priority queue.
                    if (newEffort < minEfforts[newRow][newCol]) {
                        minEfforts[newRow][newCol] = newEffort;
                        minHeap.offer(new int[]{newRow, newCol, newEffort});
                    }
                }
            }
        }

        // If we reach here, it means there is no path to the destination.
        // You can handle this case based on your requirements, e.g., return -1.
        return -1;
    }
}

class Solution {
    public int minCostConnectPoints(int[][] points) {
        int sz = points.length;
        Set<Integer> mst = new HashSet<>();
        int minCost  = 0;
        int cost[] = new int[sz];
        for(int dest = 0; dest < sz; dest++){
             cost[dest]  = findCost(points, dest, sz-1);
        }
        while(mst.size() < sz){
           int currSrc = -1;
           for(int dest = 0; dest < sz; dest++){
               if(!mst.contains(dest)){
                   if(currSrc == - 1 || cost[currSrc] > cost[dest]){
                       currSrc = dest;
                   }
               }
           }
           mst.add(currSrc);
           minCost += cost[currSrc];
           for(int dest = 0; dest < sz; dest++){
               if(!mst.contains(dest)){
                   cost[dest] = Math.min(cost[dest], findCost(points, currSrc, dest));
               }
           }
        }
        return minCost;
    }
    private int findCost(int[][]pts, int pt1, int pt2){
        return Math.abs(pts[pt1][0] - pts[pt2][0]) + Math.abs(pts[pt1][1] - pts[pt2][1]);
    }
}

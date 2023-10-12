/**
* // This is MountainArray's API interface.
* // You should not implement it, or speculate about its implementation
* interface MountainArray {
*     public int get(int index) {}
*     public int length() {}
* }
*/

class Solution {
   public int findInMountainArray(int target, MountainArray mountainArr) {
       // Binary search to find peak - find last element that is greater than prev
       int lo = 0, hi = mountainArr.length() - 1;
       int cand = -1;
       while(lo <= hi) {
           int mid = lo + (hi - lo)/2;
           if (mid == 0 || mountainArr.get(mid) > mountainArr.get(mid - 1)) {
               cand = mid;
               lo = mid + 1;
           }
           else {
               hi = mid - 1;
           }
       }

       // Binary search for target
       lo = 0;
       hi = cand;
       while(lo <= hi) {
           int mid = lo + (hi - lo)/2;
           if(mountainArr.get(mid) == target) {
               return mid;
           }
           else if (mountainArr.get(mid) < target) {
               lo = mid + 1;
           }
           else {
               hi = mid - 1;
           }
       }
       
       lo = cand + 1;
       hi = mountainArr.length() - 1;
       while(lo <= hi) {
           int mid = lo + (hi - lo)/2;
           if(mountainArr.get(mid) == target) {
               return mid;
           }
           else if (mountainArr.get(mid) < target) {
               hi = mid - 1;
           }
           else {
               lo = mid + 1;
           }
       }

       return -1;
   }
}

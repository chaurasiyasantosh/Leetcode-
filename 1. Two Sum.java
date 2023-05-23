class Solution {
    public int[] twoSum(int[] nums, int target) {
      int N =nums.length;
        
       for(int i=0; i<N; i++) {
           for(int j=i+1; j<N;j++){
               if(nums[i]+nums[j]==target){
               return new int[] {i,j};
              }
             
           }
       }
     return null;   
    }
}

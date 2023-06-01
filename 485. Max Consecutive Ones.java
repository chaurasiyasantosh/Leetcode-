class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCount=0;
        int oneCount=0;
        for(int i=0;i<nums.length;i++){
                if(nums[i]==1){ 
                    oneCount++;
                    }
                   
                
                else{
                     maxCount = Math.max(maxCount, oneCount);
                oneCount = 0;
                }
               
            }
            
        
            maxCount = Math.max(maxCount, oneCount);
        return maxCount;
        
    }
}

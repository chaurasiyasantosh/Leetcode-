class Solution {
    public int maximumDifference(int[] nums) {
        int i,j;
        int maxDiff=0;
    for( i=0;i<nums.length;i++)   {
      for (j=0;j<nums.length;j++)
       
        if(i<j && nums[i]<nums[j])
        {int diff= nums[j]-nums[i];
        maxDiff= Math.max(maxDiff,diff);
         }
    
    }
    return (maxDiff==0)?-1 :maxDiff;
    }
}

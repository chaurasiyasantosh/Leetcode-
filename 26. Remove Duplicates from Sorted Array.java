class Solution {
    public int removeDuplicates(int[] nums) {
      int ans=1;
      int temp =nums[0];
       if(nums.length==0)
       {
           return 0;
       }
      for(int i=1;i<nums.length;i++)
      {
          int current= nums[i];
          if(current!= temp)
          {
            nums[ans++]=current;
            temp = current;  
          }
     
      }
      return ans;
    }   
     }

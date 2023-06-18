class Solution {
    public int dominantIndex(int[] nums) {
        int result = -1, temp = -1, ans= -1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]> result){
                temp=result;
                result=nums[i];
                ans =i;
            }
             else if (nums[i]> temp)
             temp = nums[i];
            
        }
        return result>= temp*2? ans: -1;
    }
}

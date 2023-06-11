class Solution {
    public int singleNumber(int[] nums) {
            Arrays.sort(nums);  
       int j=0;
       for(int i=1;i<nums.length;i=i+2){
        if(nums[j]!=nums[i]){
            return nums[j];
        }
        j=j+2;
    }
     return nums[j];  
    }
}

class Solution {
    public int differenceOfSum(int[] nums) {
        int sumElement=0;
        int digitSum=0;
        for(int i=0;i<nums.length;i++){
            sumElement+=nums[i];
            while(nums[i]!=0){
                int rem= nums[i]%10;
                digitSum+=rem;
                nums[i]=nums[i]/10;
            }
        }
        return Math.abs(sumElement-digitSum);
    }
}

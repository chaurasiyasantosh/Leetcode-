class Solution {
    public int[] decompressRLElist(int[] nums) {
        int k=0;
        for(int i=0; i<nums.length; i+=2){
            k+=nums[i];   
        }
        int[] result= new int[k];
        int ind=0;
        for(int i=0; i<nums.length; i+=2){
            for(int j=0;j<nums[i]; j++){
                result[ind]=nums[i+1];
                ind++;
            }
        }
        return result;
    }
}

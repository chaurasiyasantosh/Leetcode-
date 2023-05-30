class Solution {
    public int findNumbers(int[] nums) {
      int  count=0;
        for(int i=0; i< nums.length;i++){
         if(even(nums[i])){
             count++;
         }
            
        }
        return count;
       
}
public boolean even(int num){
    int length=1;
    while(num>9){
        num= num/10;
        length++;
    }
    return length%2==0;
}
}

class Solution {
    public int[] replaceElements(int[] arr) {
        int maxx=-1;
        for(int i= arr.length-1; i>=0;i--)
        {
            if(arr[i]> maxx){
             int temp =maxx;
             maxx= arr[i];
             arr[i]=temp;
         }
            else
              arr[i]=maxx;
        }
        return arr;
    }
}

class Solution {
    public double average(int[] salary) {
        int minSalary = Integer.MAX_VALUE;
        int maxSalary = Integer.MIN_VALUE;
        int total = 0;
        int count = 0;
        for(int value:salary)
        {
            if( value< minSalary){minSalary= value; }
             if( value> maxSalary){maxSalary= value; }
         }
         for(int value:salary){
             if(value !=minSalary && value !=maxSalary)
             { total += value ;
             count++;
             }
         }
         double avg =(double)total/count;
        return avg;
    }
}

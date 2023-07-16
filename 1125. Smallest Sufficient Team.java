class Solution {
    ArrayList<Integer>ans=new ArrayList<>();
    int helper(int ind,int []person, int nSkill,ArrayList<Integer>sol,int sMask,int dp[][],int count){
        //System.out.println(ind+" "+sMask);
        if(sMask==(1<<nSkill)-1){
                if(ans.size()==0||sol.size()<ans.size()){
                    ans=new ArrayList<>(sol);
                    return sol.size();
                }
            }
        if(ind==person.length){
            
            return Integer.MAX_VALUE ;
        }
        if(dp[sMask][count]!=0){
            
            return dp[sMask][count];
        }
        //take
        sol.add(ind);
        count++;
        int take=helper(ind+1,person,nSkill,sol,sMask|person[ind],dp,count);
        sol.remove(sol.size()-1);
        count--;
        int notTake=helper(ind+1,person,nSkill,sol,sMask,dp,count);
        
        dp[sMask][count]=Math.min(take,notTake);
        return dp[sMask][count];
    }
    public int[] smallestSufficientTeam(String[] req_skills, List<List<String>> people) {
        HashMap<String,Integer>hm=new HashMap<>();
        for(int i=0;i<req_skills.length;i++){
            hm.put(req_skills[i],i);
        }
        int person[]=new int[people.size()];
        for(int i=0;i<people.size();i++){
            for(int j=0;j<people.get(i).size();j++){
                String skill=people.get(i).get(j);
                int a=hm.get(skill);
                
                person[i]=person[i]|(1<<a);
                //System.out.println(i+"p "+person[i]);
            }
            
        }
        ArrayList<Integer>sol=new ArrayList<>();
        int len=(int)Math.pow(2,req_skills.length)+1;
        int dp[][]=new int[len][person.length+1];
        helper(0,person,req_skills.length,sol,0,dp,0);
        int answer[]=new int [ans.size()];
        for(int i=0;i<ans.size();i++){
            answer[i]=ans.get(i);
        }
         return answer;
    }
}

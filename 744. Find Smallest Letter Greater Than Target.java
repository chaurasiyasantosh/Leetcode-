class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        for(int i=0;i<letters.length-1;i++){
            if(letters[i]<=target && letters[i+1]> target){
                return letters[i+1];
            }
        }
        return letters[0];
    }
}

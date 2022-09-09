class Solution {
    //Done by Anannanya , awesome peace of work
  public int numberOfWeakCharacters(int[][] arr) {
        //Sort the attack in descending order and defense in ascending order(because duplicate attacks may be there)
        Arrays.sort(arr,(a,b) -> (a[0] == b[0]) ? (a[1] - b[1]) : (b[0] - a[0]));
        int weak = 0;
        int defense = 0;
        //Now we will only check the defense value bcoz we know that attack will be greater or equal from its next value always
        //that's why we sort attack in descending order and defense in ascending order
        for(int[] it : arr){
            if(it[1] < defense)
                weak++;
           defense = Math.max(defense,it[1]);      
        }
        return weak;
    }
}
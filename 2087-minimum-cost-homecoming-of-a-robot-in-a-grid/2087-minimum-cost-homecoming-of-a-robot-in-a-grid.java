class Solution {
    //approach0:simply observe it ,since all the elements are positive so ,in case of repetition ie moving back to same row or column will always increase path cost , so dont repeate any row or column
    //also here we dont traverse all the possible paths and count path cost for each and then return the minimum path cost  ,so we avoid all such staff in this approach hence it is optimized 
    public int minCost(int[] startPos, int[] homePos, int[] rowCosts, int[] colCosts) {
        int sum=0;
        if(check(startPos,homePos)) return sum;
        int si=startPos[0],sj=startPos[1];
        int hi=homePos[0],hj=homePos[1];
        if(si<hi){//if home is below start point
            while(si<hi){
                sum+=rowCosts[si+1];
                si++;
            }//while
        }//if
         else if(si>hi){// if home is above start point
            while(si>hi){
                sum+=rowCosts[si-1];
                si--;
            }//while
        }//if
        
        if(sj<hj){ //if home is towards right of start point
            while(sj<hj){
                sum+=colCosts[sj+1];
                sj++;
            }//while
        }//if
         else if(sj>hj){// if home is towards left of start point
            while(sj>hj){
                sum+=colCosts[sj-1];
                sj--;
            }//while
        }//if
        return sum;
    }
    public boolean check(int startPos[],int homePos[]){
        if(startPos[0]==homePos[0]&&startPos[1]==homePos[1]) return true;
        return false;
    }
}
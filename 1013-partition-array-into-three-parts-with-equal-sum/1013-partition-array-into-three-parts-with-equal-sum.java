class Solution {
    //n2--102
    //o(n) solution--> two pointers approach
    public boolean canThreePartsEqualSum(int[] arr) {
        //1st check that sum of all the no. is divisible by 3 or not
        //if yes ten let target t=totalsum/3
        //now take two pointers ,i.e i and j
        //using i,find prefixsum till ssum==t and using j, find postfix sum till rsum==t such that i<j and j-i>1 bexause we want 3 non empty parts
        int sum=0;
        for(int e:arr) 
            sum+=e;
             //check
            if(sum%3!=0) return false;
        int target=sum/3;
        int lsum=arr[0];
        int rsum=arr[arr.length-1];
        int i=0,j=arr.length-1;
        while(i<j&&j-i>1){
            if(lsum!=target){
                i++;
                lsum+=arr[i];
            }//if
            else if(rsum!=target){
                j--;
                rsum+=arr[j];
            }
            else return true;
        }//
        return false;
    }
}
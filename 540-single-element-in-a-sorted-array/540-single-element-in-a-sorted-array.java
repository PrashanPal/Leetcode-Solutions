class Solution {//s450-->nice approach based on even and odd difference of indices
    public int singleNonDuplicate(int[] nums) {
        int s=0,e=nums.length-1;
        if(e==0) return nums[0];
        while(s<=e){
            int m=(s+e)/2;
            if(s==e) return nums[s];
if(m>0&&nums[m]!=nums[m-1]&&m+1<=e&&nums[m]!=nums[m+1])// it means nums[m] is single so return
            return nums[m];
else if(m==0&&nums[m]!=nums[m+1]||m==e&&nums[m]!=nums[m-1]) //it means nums[m] is single so return it
                return nums[m];
            else if(m==0&&nums[m]==nums[m+1]&&m+2<=e)//it means right part contains single
                s=m+2;
            else if(m==e&&nums[m]==nums[m-1]&&m-1>=s)//it means leftt part contains single
                s=m+2;
 else if(m>0&&nums[m]==nums[m-1]){
                if((e-m)%2==0&&m-2>=s)// means left contains single
                    e=m-2;
                else if(m+1<=e)//it means right part contains single
                    s=m+1;
    }//else if
    else if(m+1<=e&&nums[m]==nums[m+1]){
                if((e-m+1)%2==0&&m-1>=s)//eans left contains single
                    e=m-1;
                else if(m+2<=e)//means right part contains single
                    s=m+2;
    }//else if
        }//while
                return -1;//here default return call is used randomly because each array contains one single element , it will never reached to last default call
                
    }
}
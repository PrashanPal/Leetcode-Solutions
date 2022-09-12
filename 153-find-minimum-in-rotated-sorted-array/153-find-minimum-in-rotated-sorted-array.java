class Solution {//by me
    //s450 binaraysearch medium--important
    public int findMin(int[] nums) {
        int s=0,e=nums.length-1;
        if(nums[s]<=nums[e])//it means array is already sorted ,hence 1st element is the smallest elemnt
            return nums[s];
        while(s<=e){
            int m=(s+e)/2;
            if(m==0&&nums[m]>nums[m+1]) return nums[m+1];
         else if(m-1>=0&&m+1<=e&&nums[m]<=nums[m-1]&&nums[m]<=nums[m+1])// ie ,it is the smallest elemnt 
                return nums[m];
        if(m+1<=e&&m-1>=0&&nums[m-1]<=nums[m]&&nums[m]>=nums[m+1])//it means m is the greatest element
               return nums[m+1];
         else if(m-1>=s&&nums[s]<=nums[m-1]){//if array is sorted form s to m-1
                    s=m+1;//search in right side of m
            }//else if
        else if(m+1<=e&&nums[m+1]<=nums[e]){//it means array is sorted form m+1 to e
                    e=m-1;//search on the left hand side of m
        }//else if
        }//while
        return nums[0];
    }
}
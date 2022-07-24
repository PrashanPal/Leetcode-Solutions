class Solution {
    //by me
    public int[] searchRange(int[] nums, int target) {
        int a[]=new int[2];
        if(nums.length==0){
            a[0]=-1;
            a[1]=-1;
            return a;
        }
        if(nums.length==1){
            if(nums[0]==target){
                a[0]=0;
                a[1]=0;
            }
            else{
                a[0]=-1;
                a[1]=-1;
            }
            return a;
        }
        int s=0;
        int h=nums.length-1;
        int mid=(s+h)/2;
        while(s<=h){
            mid=(s+h)/2;
            if(nums[mid]==target) break;
            else if(nums[mid]>target) h=mid-1;
            else if(nums[mid]<target) s=mid+1;
        }
        if(s>h){
            a[0]=-1;
            a[1]=-1;
            return a;
        }//if
//         else if(mid==nums.length-1&&nums[mid]==target){//end point
//             a[1]=mid;
//              int t=mid-1;
//              while(t>=0&&nums[t]==target){
//                  t=t-1;
//              }//while
//              a[0]=t+1;
//         }//else if
//          else if(mid==0&&nums[mid]==target){//start point
//             a[0]=mid;
//             int t=mid+1;
//              while(t<nums.length&&nums[t]==target){
//                  t=t+1;
//              }//while
//              a[1]=t-1;
             
//         }//else if
        else if(mid>=0&&mid<=nums.length-1&&nums[mid]==target){
            int l=mid-1;//for checking left
            int r=mid+1;//for checking right
            while(l>=0&&nums[l]==target){
                 l=l-1;
             }//while
             a[0]=l+1;
            
             while(r<nums.length&&nums[r]==target){
                 r=r+1;
             }//while
             a[1]=r-1;
        }//else if 
        return a;
    }
}
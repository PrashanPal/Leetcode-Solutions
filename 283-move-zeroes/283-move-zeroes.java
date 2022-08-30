class Solution {
    //approach: simple two pointers apprach is used 
    // take two pointer s=0 and j=0
    //nums[s]!=0 --> i.e no need  to swap
    //if nums[s]==0 ,then j=s+1 , and increment j while(j<n&&nums[j]==0) , then if
    //j>n ,ie, no non zero elment to swap simple break
    //if(j<n && nums[j]!=0) swap the elements at s and jth index
    public void moveZeroes(int[] nums) {
        int s=0;
        int j=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]!=0){
                continue;
            }
            else if(nums[i]==0){
                s=i;
                j=s+1;
                while(j<n&&nums[j]==0){
                    j++;
                }//while
                if(j<n&&nums[j]!=0){
                    swap(nums,i,j);
                }//if
                if(j>=n) break;
                //else if(j<n) i=j-1;
            }//else if
        }//for
        
    }//fn
    public void swap(int nums[],int i,int j){
        int t=nums[i];
        nums[i]=nums[j];
        nums[j]=t;
    }
}
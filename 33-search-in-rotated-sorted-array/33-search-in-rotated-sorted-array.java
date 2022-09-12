class Solution {//s450 awesome question
    public int search(int[] nums, int target) {
int s=0,e=nums.length-1;
        int r[]={-1};
         if(nums[s]<=nums[e]){//this line is awesome ,it means array is sorted from s to e ,so you apply binary search in it
            r[0]=bs(nums,target,s,e);
            return r[0];
        }//if
        r[0]= check(nums,target,s,e,r);
        return r[0];
    }//search
    
    public int check(int a[],int t,int s,int e,int r[]){
       if(s>e) return -1;
        if(s<=e){
            int m=(s+e)/2;
            if(a[m]==t){
                r[0]=m;
                return r[0];
             }//if
        if(m>s&&a[s]<=a[m-1]){//it means left end is sorted
            if(t>=a[s]&&t<=a[m-1]){//it means element is in left sorted end
                r[0]= bs(a,t,s,m-1);
                return r[0];
            }//if
            else{//it means element is in right un sorted end
                r[0]= check(a,t,m+1,e,r);
                return r[0];
            }//esle
        }//if
       else if(m<e&&a[m+1]<=a[e]){//it means right end is sorted
            if(t>=a[m+1]&&t<=a[e]){//it means element is in right sorted end
                r[0]= bs(a,t,m+1,e);
                return r[0];
            }//if
            else{//it means element is in leftt un sorted end
                r[0]= check(a,t,s,m-1,r);
                return r[0];
            }//else
        }//if       
    }//final if
          return -1;
    }//check
    
        public int bs(int a[],int t,int s,int e){
            if(s>e) return -1;
            while(s<=e){
                int m=(s+e)/2;
                if(a[m]==t) return m;
                else if(m<=e&&a[m]<t) s=m+1;
                else if(m>=s&&a[m]>t) e=m-1;
            }//while
            return -1;
        }//bs
}//class
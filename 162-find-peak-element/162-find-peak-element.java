class Solution {
        //approach: since we have to solve in o(log n) so we will use binary ,since array is not sorted ,so what is the logic behind using binary search here , i,e if array is not sorted the we will use binary  search to jump on random position in array .
        // suppose you are at , any index m in array , if you analyze the constraints then you notice that if m in not peak then , peak elemnt can be exist at both the sides of m ,Or may be at any either side of m, so how to decide to use binary again on which side, .i.e right or left --> so if a[m]<a[m+1] then we applied binary search on the right side ,bcz it will definely have a peak element Or if a[m-1]>a[m] ,then we will applied binary search on the right side
        //and we will continue this process till you didn't find any peak elemnt
        
    
    //by me: s450-->binary search easy
    public int findPeakElement(int[] nums) {
      int s=0;
        int e=nums.length-1;
        if(nums.length==1) return 0;
       return find(nums,s,e);
    }
    public int find(int a[],int s,int e){
        System.out.println(s+" "+e);
        if(s>e) return -1;
        while(s<=e){
            int m=(s+e)/2;
            if(m-1>=0&&m+1<=e&&a[m-1]<a[m]&&a[m]>a[m+1]) return m;
            else if(m==0&&a[m]>a[m+1]) return m;//s
            else if(m==e&&a[m-1]<a[m]) return m;//e
            else if(m+1<=e&&a[m]<a[m+1]){//for checking right end
                return find(a,m+1,e);
            }//else if
             else if(m-1>=0&&a[m]<a[m-1]){//for checking left end
                return find(a,s,m-1);
            }//else if
        }//while
        return -1;
    }
}
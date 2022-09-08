class Solution {
    //s450---> arrays hard
    //without using extra space
    //time: o(m*n) space:o(1)
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //according to question nums1.length=n+m
        if(n==0) return;
        for(int i=0;i<m;i++){
            if(nums1[i]<=nums2[0]){
                continue;
            }
            else if(nums1[i]>nums2[0]){
                int t=nums1[i];
                nums1[i]=nums2[0];
                nums2[0]=t;
                // now rearrange nums2 in sorted order using insertion technique
                int p=0;
                while(p+1<n&&nums2[p]>nums2[p+1]){// time: o(n);
                    int r=nums2[p];
                    nums2[p]=nums2[p+1];
                    nums2[p+1]=r;
                    p++;
                }//while
            }//else if
        }//for
        for(int i=0;i<n;i++){
            nums1[m+i]=nums2[i];
        }//for
    }
}
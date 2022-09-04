class Solution {
    //[1,2,3,3,3,4,5,6,7,7,8,9,10,11,12]-->12
    //[1,2,11,3,3,7,5,6,7,4,8,9,10,3,12]-->12
    //[-1,1,0]-->3
    //these two obove examples tells that repeted elements in consequetive sequence is not counted
    
    //BY me: time: o(n) space: o(n)
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
     int m=1;
        Set<Integer> hs=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            hs.add(nums[i]);
        }
        for(int i=0;i<nums.length;i++){
            if(!hs.contains(nums[i]-1)){
                int t=1;
                int p=nums[i];
                while(hs.contains(p+1)){
                    t++;
                    p+=1;
                }//while
                m=Math.max(m,t);
            }//if
        }//for
        return m;
    }
}
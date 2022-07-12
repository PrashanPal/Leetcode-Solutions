class Solution {
    // [2,0,9,2,1,5,6]
    //   2
    //   8
    //by me 
    //pep ,n2--98
    public int numSubarrayBoundedMax(int[] nums, int left, int right) {
        int c=0;//to count no. of subarrays
        Queue<Integer> ql=new ArrayDeque<>();//it store index of all the elements who are greater than right
          Queue<Integer> qs=new ArrayDeque<>();//it store index of all the elemnts who are less then left
          Queue<Integer> q=new ArrayDeque<>();
        for(int i=0;i<nums.length;i++){
          if(nums[i]>right){
            ql.add(i);
              nums[i]=-1;//it means that this element is greater then right
          }//if
            else if(nums[i]<left){
            qs.add(i);
              nums[i]=-2;//it means that this element is smaller than left
          }//if
            else q.add(i);
        }//foe
        ql.add(nums.length);
        qs.add(nums.length);
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=-2&&nums[i]!=-1){
                c=c+ql.peek()-i;
                q.poll();
            }//is
            else if(nums[i]==-2){
                if(q.size()>0&&ql.size()>0&&q.peek()<ql.peek()){
                    c=c+ql.peek()-q.peek();//this is the most important line
                }
                qs.poll();
            }//else if
            else if(nums[i]==-1)
                ql.poll();
        }//for
        return c;
    }
}
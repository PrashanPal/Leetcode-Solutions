class Solution {
    // to understand this approach go to n2-87 and leetcode-169
    //l2
    //n2-88
    // based on 169
    //Moore's Vooting algorith is used
    // required time=O(n) space=O(1)
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> res=new ArrayList<>();
        int val1=nums[0];
        int count1=1;//you can mark count1=1 ,but only to count1 not count2
        int val2=nums[0];
        int count2=0;//its make implementation easy ,other wise you have to find element other then    nums[0] ,which it can do easily
        for(int i=1;i<nums.length;i++){
            if(nums[i]==val1) count1++;
            else if(nums[i]==val2) count2++;
            else{
                if(count1==0){
                    val1=nums[i];
                    count1=1;
                }
                else if(count2==0){// here we use else if instead of only if ,because in case if   count1==0&& count2==0 ,then we dont assign same nums[i] ,to both val1 and val2
                    val2=nums[i];
                    count2=1;
                }
                else{//it is important to decrement both
                    count1--;
                    count2--;
                }//else
            }//else
        }//for
        int n=nums.length;
            //since val1 and val2 are potential answer not the actual ,so we have to check both
            //ex-[1,2,2,1,4,3] here val1=1,val2=2,but count2<(n/3)
        count1 = 0;
	    count2 = 0;
	for (int i = 0; i < n; i++) {
		if (nums[i] == val1)
			count1++;
		else if (nums[i] == val2)
			count2++;
   }//for
            if(count1>n/3)res.add(val1);
            if(count2>n/3)res.add(val2);
            return res;
    }
}
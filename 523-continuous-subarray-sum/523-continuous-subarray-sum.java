class Solution {
    //this question is similar to 974 i.e sub arrays sum which is divisble by k
    //there are two methods to do ,1--> by using frequency of remainder of prefix sum ,2--> by using sum of frequencies of elements
    // since i do 974 by prefixsum i.e method one,so i am doing it with method 2 i.e using remainder of elements as prefix sum
    public boolean checkSubarraySum(int[] nums, int k) {
        //insted of using hashmap i am using here an array of size k,for storing freqencies of elements where idex are the remainders
    HashMap<Integer,Integer> h=new HashMap<>();
        int s=0;
        int c=0;//count of subarrays whoes sum is divisible by k
        h.put(0,1);//it's important ,to do
        int d=0;//for storing remainder
        int f=0;//it is used as a flag here ,which indicates that array contains an element which is directly divisivle k
        for(int i=0;i<nums.length;i++){
             d=nums[i]%k;
            if(d<0) d=d+k;
            s=(s+d)%k;
   
            if(!h.containsKey(s)){
             c=c+0;//line 1-->this is the most important line
                h.put(s,1);
            }
            else if(h.containsKey(s)){
             c=c+h.get(s);//line 1-->this is the most important line
                h.put(s,h.get(s)+1);//line 2-->this must came after line 1
            }
            if(d==0) f++;
        }//for
            if(f>0){
                if(c>f) //nice trik by me,ie. if count greater then total no. of elements which are exactly divisible by k, because if an elements is divisble by k ,then in that case lenght of subarray can be 1, and we have count only those subarrays whoes length is at least 2
                    return true;
                else
                    return false;
            }//if
            else if(f==0){
                if(c>0) return true;
                else return false;
            }//else if
            return false;
    }
}
//exm-->[23,2,4,6,7,13,13] k=13
//in this case count =3 as subarrays are [13],[13],[13,13]
//and f=2 ,sice f>0 and c>f i.e 3>2 ,so our result is true;
class Solution {
    //p2
    //this is similar to target two sum
    //use two pointer approach ,along with sorting
    //time:nlong ,space:0
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        if(people[0]>limit) return 0;
        int n=people.length;
        if(people[n-1]+people[n-2]<=limit){
            if(n%2==0) return n/2;
            if(n%2==1) return n/2+1;
        }
        int count=0;//it is used to count no. of boats
        int l=0;
        int r=n-1;
        while(l<=r){
            if(people[r]>limit) r--;
            else if(people[l]+people[r]>limit){
                count+=1;//i.e r will go single
                r--;
            }
            else if(people[l]+people[r]<=limit){
                count+=1;//i.e they both will go on single boat
                l++;
                r--;
            }//else if
        }//while
        return count;
    }
}
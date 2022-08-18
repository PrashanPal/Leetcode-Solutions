class Solution {
    public int minSetSize(int[] arr) {
        //approach: use a hashmap and count frequency of each integer ,no sort this hashmap in decreasing order on the basis of values i.e. in decreasing order of frequencies
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(!hm.containsKey(arr[i]))
                hm.put(arr[i],1);
            else
                hm.put(arr[i],hm.get(arr[i])+1);
        }//for
        //till here our map is completed
        //each row of this array contains key and value
        int a[][]=new int[hm.size()][2];
        int i=0;
        for(int e:hm.keySet()){
            a[i][0]=e;
            a[i][1]=hm.get(e);
            i++;
        }
        //till here ourarray is completed
        //sorting the array on the basis of values
        Arrays.sort(a,(p,q)->Integer.compare(q[1],p[1]));
        int count=0;
        int t=0;
        int j=0;
        if(arr.length%2==0) t=arr.length/2;
        else t=arr.length/2+1;
        while(count<t){
            count+=a[j][1];
            j++;
        }//while
        return j;
    }
}
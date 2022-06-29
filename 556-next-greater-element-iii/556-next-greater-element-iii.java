class Solution {
    //by me
    //Approach: iterate from last digit to first digit
    //if digit befor current digit is greater then current then swap it ,till u get a digit smaller than        current digit .i.e statemnt 1 and 2
    //654398
    //4153
    //65432
    public int nextGreaterElement(int n) {
        String s=Integer.toString(n);
        char[] a=s.toCharArray(); 
        int c=0;
        int j=0;
        ArrayList<Character> p=new ArrayList<>();
        for(int i=a.length-1;i>0;i--){
            if(a[i]>a[i-1]){//stmt-1
                char t=a[i-1];
                p.add(a[i]);
                j=i-1;
                //iterate through pq and replace it with an element just greater than t
                Collections.sort(p);
                for(int k=0;k<p.size();k++){
                    char e=p.get(k);
                    if(e>t&&c==0){
                        p.remove(k);
                        a[i-1]=e;
                        p.add(t);
                        c++;
                    }//if
                }//for
                 // System.out.print(a[i]+" ");
                //c++;
                break;
            }//if
            else if(a[i]<=a[i-1]){//stmt-2
                p.add(a[i]);
            }//else if
        }//for
        if(c==0) return -1;
        else{
            Collections.sort(p);
            int m=0;
           for(int i=j+1;i<a.length;i++){
               a[i]=p.remove(0);
                 // m++;
           } //for
        }//else
        String r = String.valueOf(a);
         // System.out.print(r+"***");
         long val = Long.parseLong(r);
        return (val <= Integer.MAX_VALUE) ? (int) val : -1;
        //int i=Integer.parseInt(r);  
       // return i;
        
    }
}
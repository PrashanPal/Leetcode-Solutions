class Solution {
    //this done by me
    public int trap(int[] height) {
        
        int s=0;
        int c=0;
        int m=-1;
        int d[]=new int[height.length];
        Arrays.fill(d,-2);
        for(int i=0;i<height.length;i++){
            if(i==height.length-1){
                d[i]=-1;
            }
            if(c==0){
                int b=0;
                int p=0;
                for(int j=i+1;j<height.length;j++){
                    if(height[i]<=height[j]){
                        b+=1;
                        d[i]=j;
                        p=j-1;//because i will automatically incremented by 1
                        break;
                    }//if
                }//for
                if(b==0){
                    d[i]=-1;//it is greatest
                    m=i;
                    c=1;
                    break;
                }//if
                else if(b!=0) i=p;
            }//if
        }//for
        
        if(c==1){
            for(int j=height.length-1;j>m;j--){
                int p=0;
                for(int k=j-1;k>=m;k--){
                    if(height[k]>=height[j]){
                        d[j]=k;
                        p=k+1;//because j will automatically decremented by 1
                        break;
                    }//if
                }//for
                j=p;
            }//for
        }//if
        // for(int i=0;i<height.length;i++){
        //     System.out.print(d[i]+" ");
        // }
        c=0;
        int i=0;
        int j=0;
        while(j==i){
            if(d[i]!=-1){
                while(j!=d[i]){
                    s=s+height[i]-height[j];
                    j++;
                }//while
                i=j;
            }//if
            if(d[j]==-1){
                c=1;
                break;
            }//if
        }//while
        if(c==1){
            j=height.length-1;
            int k=height.length-1;
            while(k==j){
                if(d[k]!=-1){
                    while(j!=d[k]){
                        s=s+height[k]-height[j];
                        j--;
                    }//while
                    k=j;
                }//if
                if(d[j]==-1){
                    break;
                }//if
            }//while
        }//if
        return s;
    }
}
class Solution {
    //[1,0,0,0,0,0,1]
//   3
    //[0,0,1,0,1]
//1
    //this is very important question--> TOOL
    //must do it n2
    //approach: it depends on that how manys 0s are between two 1s or one 1s or zero 1s
    //ie. if an element is 1 check the next 1 exit or not and no of 0s between these two 1s
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int t=flowerbed.length;
        int c=0;
        if(t==1){
            if(flowerbed[0]==0) c=1;
        }
        else if(t>1)
        for(int i=0;i<t;i++){
            if(flowerbed[i]==0){
                if(i+1<t&&flowerbed[i+1]==0){
                 System.out.println(" *");
                c+=1;
                i=i+1;
                }//if
              else  if(i+1==t){
                 System.out.println(" *");
                c+=1;
                i=i+1;
                }//if
            }//if
            else if(flowerbed[i]==1&&i<t-1){
                int k=check(t,flowerbed,i);
                if(k>0&&k<t){
                    System.out.println(k);
                    c=c+((k-i-2)/2);
                }//if
               else if(k==t){
                   System.out.println(i+"* *");
                    c=c+((t-i-1)/2);
                   System.out.println(c+"* c *");
                }//if
               // i=k;
               // if(k>0) i=k-1;
                i=k-1;
                System.out.println(i+" *");
            }//else if
        }//for
        System.out.println(c+" c");
        if(c>=n) return true;
        return false;
    }//fn
    
    public int check(int t,int a[],int i){
        int j=i+1;
        while(j<t&&a[j]!=1){
            j++;
        }
        if(j<t&&a[j]==1) return j;
         return t;
    }
}
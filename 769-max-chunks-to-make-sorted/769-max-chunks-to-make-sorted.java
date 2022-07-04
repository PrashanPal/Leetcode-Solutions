class Solution {
    //l2
    //Approach: since if you observed that these chucks not swaped with other chunks, but values in each chunk get sorted ,
    //since valued from 0 to n-1, i,e sorted array is 0,1,2,3,4,5,6,7,8,9
    //key logic===>let you have a chunk starting idex is 3 and last index of chunk is 8 ,then min value in this chunk==3 and max value in this chunk==8
    //key logic===> if(a[i]==i) then just increase count .i,e, count of no. of chucks, because you have to maximize the no. of chunke
    public int maxChunksToSorted(int[] arr) {
        int j=0;
        int k=0;
        int min=arr[0];
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]==i){
                k++;
            }//if
            else{
                min=arr[i];
                max=arr[j];
                j++;
                k++;
                if(j<arr.length&&arr[j]<min) min =arr[j];
                if(j<arr.length&&arr[j]>max) max=arr[j];
                while(j<arr.length&&(i!=min||j!=max)){
                    j++;
                    if(arr[j]<min) min=arr[j];
                    if(arr[j]>max) max=arr[j];
                }//while
                i=j;
            }//else
            min=i+1;
            max=j+1;
            j++;
        }//for
        return k;
    }
}
class Solution {
    //approach: sort the array on the basis of 1st element row
    public int[][] merge(int[][] arr) {
        int n=arr.length;
          Arrays.sort(arr, (a, b) -> a[0] - b[0]);
        ArrayList<int[]> result = new ArrayList<>();
        int min =arr[0][0];
        int max=arr[0][1];
        for (int i = 1; i < arr.length; i++) {
            int s2 = arr[i][0];
            int e2 = arr[i][1];
            if(s2 <= max && e2 >= min){// main logic
                min= Math.min(min,s2);
                 max= Math.max(max,e2);
            }//if
            else{
                int p=min;
                int q=max;
                result.add(new int[]{p,q});
                min=arr[i][0];
                max=arr[i][1];
            }//else
        }//for
            if(min==arr[n-1][0]&&max==arr[n-1][1]){
                   result.add(new int[]{arr[n-1][0],arr[n-1][1]});
            }//if
        else{
             result.add(new int[]{min,max});
        }
        int[][] finalResult = new int[result.size()][2];
        for (int i = 0; i < result.size(); i++) {
            finalResult[i][0] = result.get(i)[0];
            finalResult[i][1] = result.get(i)[1];
        }//for
        return finalResult;
    }
}
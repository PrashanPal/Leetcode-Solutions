class Solution {
    //approach: sort the array on the basis of 1st element row
    public int[][] merge(int[][] arr) {
          Arrays.sort(arr, (a, b) -> a[0] - b[0]);
        ArrayList<int[]> result = new ArrayList<>();
        result.add(new int[]{arr[0][0], arr[0][1]});
        for (int i = 1; i < arr.length; i++) {
            int n = result.size();
            int min = result.get(n-1)[0];
            int max = result.get(n-1)[1];
            if(min <= arr[i][0] && arr[i][0] <= max){// main logic
                result.get(n-1)[1] = Math.max(max, arr[i][1]);
            }else{
                result.add(new int[]{arr[i][0],arr[i][1]});
            }
        }
        int[][] finalResult = new int[result.size()][2];
        for (int i = 0; i < result.size(); i++) {
            finalResult[i][0] = result.get(i)[0];
            finalResult[i][1] = result.get(i)[1];
        }
        return finalResult;
    }
}
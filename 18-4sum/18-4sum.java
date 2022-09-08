class Solution {
    //By me: same concept and approach as we have done in 3-sum problem
    //this is the code of striver and even this one fails in the same test case , as i am also failing
    public List<List<Integer>> fourSum(int[] arr, int target) {
     int n = arr.length;
    List<List<Integer>> list = new ArrayList<>();
    Arrays.sort(arr);
    
    for (int i = 0; i < n - 3; i++) {
            if(i==0||arr[i]!=arr[i-1]){//important
        long target_3 = target - arr[i]; // 3 sum
                //NOTE: taking long as data is reason of passing the test case -->
                // [1000000000,1000000000,1000000000,1000000000]
                // -294967296
                //bca -294967296-10000 int belongs to integer ,it actually belongs to long


        for (int j = i + 1; j < n - 2; j++) {
               if(j==i+1||arr[j]!=arr[j-1]){//main saul of this question
            long target_2 = target_3 - arr[j]; // 2 sum

            int left = j + 1;
            int right = n - 1;

            while (left < right) {
                long sum = arr[left] + arr[right];
                if (sum < target_2) {
                    left++;
                }//if 
                else if (sum > target_2) {
                    right--;
                }//else if  
                else {
                    List<Integer> subList = new ArrayList<>();
                    subList.add(arr[i]);
                    subList.add(arr[j]);
                    subList.add(arr[left]);
                    subList.add(arr[right]);
                    list.add(subList);//Adding sublist into list of lists
					
					// Processing the duplicates of 2 sum
                    while (left < right && arr[left] == arr[left + 1])
                        left++;
                    left++;
					
					// Processing the duplicates of 2 sum
                    while (left < right && arr[right] == arr[right - 1])
                        right--;
                    right--;
                }//else
            }//while
            }//if j
            }//for j
        }//if i
    }//for i
    return list;
    }
}
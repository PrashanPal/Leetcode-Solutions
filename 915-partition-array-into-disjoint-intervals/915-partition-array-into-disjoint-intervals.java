class Solution {
    //p2--->little tricky ,n2-->91
    //approach: is kind of similar to maximum range of influrnce of an character
    // here we used to extra arrays i.e. rightmin-->to storing minimum elements from the right side and leftmax-->for storing mximum element from the left side
    //but you can optimize it,by maintaining only rightmin array and insted of using leftmax we calculate it while our traveral with help of an extra max variable
    public int partitionDisjoint(int[] arr) {
        
        int leftMax = arr[0];
    int greater = arr[0];
    int ans = 0;

    for (int i = 1; i < arr.length ; i++) {
      if (arr[i] > greater) {
        greater = arr[i];
      } else if (arr[i] < leftMax) {
        leftMax = greater;
        ans = i;
      }
    }

    return ans + 1;
        
    }
}
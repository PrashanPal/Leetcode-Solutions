s450
**bruteforce:** actually the bruteforce solution of this is more complicated then the optimezed one , i,e 1st sort the array ,then linearly iterate througth each interval and  compare with every other interval and check that it lies in it or not , not then insert it the arraylist for storing result.
time: nlogn for sorting + n^2 for linrealy iterating and comparing
space: o(n) for storing result.
**optimized approach:** sort the array on the basis of 1st element row
for easy code take and ArrayList<int[]> type.
time :  nlogn
space: o(n) for storing result.
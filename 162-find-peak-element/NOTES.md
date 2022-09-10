//s450-->binary search easy
in constraints ,ie is given that **,nums[i] != nums[i + 1] for all valid i.**--> two adjacent elements can nerver be equal , i,e array may contains duplicate elements but question garuntees that they are not adjacent to each other.
//// example : 5 10 12 13 16 14 15 18 19 14 --> here if you applied the approach as you used in code , and initially you are at 15 ,then result is 19 as a peak element
--> but if see other example: 5 10 12 13 16 14 15 18 19 19
here if initially you are at 15 ,then 19 cant be your answer as, 19>19
so here you cant be able of finding any answer that's why it is given in conatraint that two adjacent elements cant be equal.
**** approach:****
//approach: since we have to solve in o(log n) so we will use binary ,since array is not sorted ,so what is the logic behind using binary search here , i,e if array is not sorted the we will use binary  search to jump on random position in array .
// suppose you are at , any index m in array , if you analyze the constraints then you notice that if m in not peak then , peak elemnt can be exist at both the sides of m ,Or may be at any either side of m, so how to decide to use binary again on which side, .i.e right or left --> so if a[m]<a[m+1] then we applied binary search on the right side ,bcz it will definely have a peak element Or if a[m-1]>a[m] ,then we will applied binary search on the right side
//and we will continue this process till you didn't find any peak elemnt
​
brute force approach: write all the permutation and retrun the one which you want
here time complexity: n!o(n)
space complexity : o(1) ,if we dont consider the space need by recursive tree
**aptimize approach**: find the break point and usig it generating the next order
time : n  + n+ n=n
space: 1
let take the exmaple 1 3 5 4 2
here if you observe , right side of 5 is decreaing order while the left side of 5 is in decreasing order
*** iterate from the back ,and find the break point ,ie a[i]<a[i+1] , int1=i**
* agins iterate from back and find the element which is just greater then 3 ,ir a[i] so itis           4 ,now swap 3 and 4 , if you notice that we used 4 insead of 5 ,we want next order         which is just greater than 1 3 5 4 2 , so after swapping array becomes 1 4 5 3 2
* now since all the values in right of 4 are in decreaing order i.e . in greater order than the required so ,simply reverse them all , 1 4 2 3 5 --> this is the required answer
​
Exception ; if you have 5 4 3 2 1 , then this is the last posible premutation so , for its answer return the 1 permutation as answer ,ie by reversing the given permutation ,ie               1 2 3 4 5
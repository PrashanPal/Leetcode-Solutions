s450
awesome approach:
https://leetcode.com/problems/merge-sorted-array/discuss/1831597/Simple-Solutions-or-Beats-100-or-TC%3A-O(m%2Bn)-or-With-explanations
​
Maintain three varaible: ie, 3-pointers approach and take extra space of o(n+m)
firstPoint -> points to first m elements of nums1 array
secondPoint -> points to first n elements of nums2 array
curr - store the index of the position to be filled.
​
Algo:
​
Compare firstPoint & secondPoint
​
if firstPoint >= secondPoint
then fill the curr index with firstPoint value & update the firstPoint the curr index by -1
else fill the update the secondPoint & curr
One of the point is fully exhausted then fill the remaining elements into nums1
**more optimized approach :** **without using extra space**--> i.e using the method of insertion and comparison along with two pointers .
time: o(n*m)
space:o(1)
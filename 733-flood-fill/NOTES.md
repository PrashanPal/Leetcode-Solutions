Time complexity: O(m*n), space complexity: O(1). m is number of rows, n is number of columns.
​
class Solution {
public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
if (image[sr][sc] == newColor) return image;
fill(image, sr, sc, image[sr][sc], newColor);
return image;
}
private void fill(int[][] image, int sr, int sc, int color, int newColor) {
if (sr < 0 || sr >= image.length || sc < 0 || sc >= image[0].length || image[sr][sc] != color) return;
image[sr][sc] = newColor;
fill(image, sr + 1, sc, color, newColor);
fill(image, sr - 1, sc, color, newColor);
fill(image, sr, sc + 1, color, newColor);
fill(image, sr, sc - 1, color, newColor);
}
}
​
class Solution {
class Pair{
int i;
int j;
Pair(int i,int j){
this.i=i;
this.j=j;
}
}
public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
int v=image[sr][sc];
int r=image.length;
int c=image[0].length;
if(v==newColor) return image;
Queue<Pair> q=new ArrayDeque<>();
q.add(new Pair(sr,sc));
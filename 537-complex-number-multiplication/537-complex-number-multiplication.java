class Solution {
    //p2 approach and base on simple calculation approach 
    public String complexNumberMultiply(String num1, String num2) {
        // num1 = a + bi
    // num2 = c + di
    // result = (a * c - b * d) + (a * d + c * b)i

    int a = Integer.parseInt(num1.substring(0, num1.indexOf("+")));
    int b = Integer.parseInt(num1.substring(num1.indexOf("+") + 1, num1.length() - 1));
    int c = Integer.parseInt(num2.substring(0, num2.indexOf("+")));
    int d = Integer.parseInt(num2.substring(num2.indexOf("+") + 1, num2.length() - 1));

    return "" + (a * c - b * d) + "+" + (a * d + c * b) + "i";
    }//fn
}//class
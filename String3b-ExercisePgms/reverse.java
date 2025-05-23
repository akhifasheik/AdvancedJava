/*Q3. Write a Java Program for Reversing the characters in a string using user defined function
reverseString().*/
public class reverse{
    public static String reverseString(String str) {
        String rev = "";
        for (int i =str.length()-1;i>=0;i--){
            rev+=str.charAt(i);
        }
        return rev;
    }
    public static void main(String[] args) {
        String s = "Hello";
        System.out.println(reverseString(s));
    }
}
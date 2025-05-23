/*Q5. Write a Java Program for Eliminating all whitespace characters from a string using user defined
function removeWhitespace()*/
public class removewhitespaces {
    public static String removeWhitespace(String str) {
        String ans= "";
        for(int i=0;i<str.length();i++) {
        	if(str.charAt(i)!=' ') {
        		ans += str.charAt(i);
        	}
        }
        return ans;   
    }
    public static void main(String[] args) {
        String s ="Hello World";
        String res=removeWhitespace(s);
        System.out.println(res);
    }
}
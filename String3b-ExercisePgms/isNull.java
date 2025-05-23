/*Q1. Write a Java Program for Checking if a given string is null or contains only whitespace using user
defined function isNullOrEmpty().*/
public class isNull{
	public static boolean isNullOrEmpty(String s){
			if(s==null||s.isEmpty()) {
				return true;
			}
			for(char ch:s.toCharArray()) {
	            if (ch != ' ') {
	                return false;
	            }
			}
		return true;
	}

	public static void main(String[] args) {
		String str="  ";
		isNullOrEmpty(str);
		if(isNullOrEmpty(str)) {
			System.out.println("space or null");
		}
		else {
			System.out.println("not");
		}

	}

}
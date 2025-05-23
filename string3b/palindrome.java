/*Q4. Write a Java Program for Checking if a string reads the same backward as forward (ignoring case
and punctuation) using user defined function isPalindrome():*/
public class palindrome{
	public static boolean isPalindrome(String s){
			int left=0;
			int right=s.length()-1;
			while(left<right) {
				if(s.charAt(left)==s.charAt(right)) {
					return true;
				}
				left++;
				right--;
			}
		return false;
	}

	public static void main(String[] args) {
		String str="ate";
		isPalindrome(str);
		if(isPalindrome(str)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not palindrome");
		}
	}
}
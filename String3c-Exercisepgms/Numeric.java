/*Q8. Write a Java Program for Verifying if a string contains only numeric characters using user defined
function isNumeric()*/
public class Numeric{
    public static boolean isNumeric(String str) {
        if (str.isEmpty()) {
            return false;
        }
        for (int i=0;i<str.length();i++){
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s ="Universe";
        if (isNumeric(s)) {
            System.out.println("The string contains only numbers.");
        } else {
            System.out.println("The string contains non-numeric characters.");
        }
    }
}
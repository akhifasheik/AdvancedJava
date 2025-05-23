/*Q7. Write a Java Program for Shortening a string to a specified length and adds an ellipsis using user
defined function truncate()*/
public class truncateStr{
    public static String truncate(String str, int len) {
        if (str.length()<=len) {
            return str;
        }
        return str.substring(0,len-3)+"..."; 
    }
    public static void main(String[] args) {
        String s="Big Data";
        int len=4;
        String result = truncate(s,len);
        System.out.println(result);
    }
}
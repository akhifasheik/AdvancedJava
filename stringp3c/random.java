/*Q9. Write a Java Program for Creating a random string of a specified length using user defined
function generateRandomString()*/
import java.util.*;
public class random{
    public static String generateRandomString(int len) {
        String ch="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random random=new Random();
        String res="";
        for (int i=0;i<len;i++) {
            int idx = random.nextInt(ch.length());
            res += ch.charAt(idx);
        }
        return res;
    }
    public static void main(String[] args) {
        int length = 10;
        String randomStr = generateRandomString(length);
        System.out.println("Generated Random String: " + randomStr);
    }
}
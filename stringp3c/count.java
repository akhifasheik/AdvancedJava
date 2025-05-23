/*Q10. Write a Java Program for Counting the number of words in a string using user defined function
countWords()*/
public class count {
public static int countWords(String str) {
        int count=0;
        for (int i=0;i<str.length();i++) {
            if (str.charAt(i)!=' '&&(i==0||str.charAt(i - 1)==' ')) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String s = "Java Environment";
        int res = countWords(s);
        System.out.println("Word count: " + res);
    }
}
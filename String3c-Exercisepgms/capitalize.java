/*Q6. Write a Java Program for Capitalizing the first letter of each word. using user defined function
capitalizeWords()*/
public class capitalize{
    public static String capitalizeAfterSpace(String str) {
        char[] chars=str.toCharArray();

        for(int i=0;i<chars.length;i++) {
            if(i==0||chars[i-1]==' ') {
                chars[i]=Character.toUpperCase(chars[i]);
            }
        }
        return new String(chars);
    }
    public static void main(String[] args) {
        String s="hello world";
        System.out.println(capitalizeAfterSpace(s));
    }
}
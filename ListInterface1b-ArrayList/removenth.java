/*Write a java program for getting different colors through ArrayList interface and delete nth
element from the ArrayList object by using remove by index*/
import java.util.*;
public class removenth{
    public static void main(String [] args){
        List<String> a = new ArrayList<>();
        a.add("Blue");
        a.add("Green");
        a.add("Red");
        a.add("Navy");
        a.add("Brown");
        a.add("Marroon");
        a.add("Grey");
        System.out.println(a);
        int n=a.size();
        a.remove(n-1);
        System.out.println(a);
    }
}
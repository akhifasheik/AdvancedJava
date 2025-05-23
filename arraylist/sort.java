/*Write a java program for getting different colors through ArrayList interface and sort them
using Collections.sort( ArrayListObj)*/
import java.util.*;
public class sort{
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
        Collections.sort(a);
        System.out.println(a);
    }
}
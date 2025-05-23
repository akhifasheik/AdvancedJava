/*Write a java program for getting different colors through ArrayList interface and extract the
elements 1st and 2nd from the ArrayList object by using SubList()*/
import java.util.*;
public class sublist{
    public static void main(String [] args){
        ArrayList<String> ar = new ArrayList<>();
        ar.add("Red");
        ar.add("Blue");
        ar.add("Brown");
        ar.add("Grey");
        ar.add("Yellow");
        System.out.println(ar);
        List<String> s = ar.subList(1,3);
        System.out.println(s);
    }
}
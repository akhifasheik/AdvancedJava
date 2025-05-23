/*Write a Java program that swaps two elements ( first and third elements ) in a linked list ( using
Collections.swap(l_list, 0, 2))*/
import java.util.*;
public class swap{
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
        Collections.swap(a,0,2);
        System.out.println(a);
    }
}
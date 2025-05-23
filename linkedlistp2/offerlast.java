/*Write a Java program to insert the specified element at the end of a linked list.( using
l_listobj.offerLast("Pink"))*/
import java.util.*;
public class offerlast{
    public static void main(String [] args){
        Deque<String> a = new ArrayDeque<>();
        a.add("Blue");
        a.add("Green");
        a.add("Red");
        a.add("Navy");
        a.add("Brown");
        a.add("Marroon");
        a.add("Grey");
        System.out.println(a);
        a.offerLast("Pink");
        System.out.println(a);
    }
}
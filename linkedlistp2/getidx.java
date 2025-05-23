/*Write a Java program to display elements and their positions in a linked list ( using
l_listobj.get(p) )*/
import java.util.*;
public class getidx{
    public static void main(String [] args){
        List<String> a = new ArrayList<>();
        a.add("Blue");
        a.add("Green");
        a.add("Red");
        a.add("Navy");
        a.add("Brown");
        System.out.println(a);
        int n=a.size();
        for(int i=0;i<n;i++){
        System.out.println("Element at index "+i+" is: "+a.get(i)); 
        } 
    }
}
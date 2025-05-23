/*Write a java program for getting different colors through ArrayList interface and search whether
the color "Red" is available or not*/
import java.util.*;
public class search{
    public static void main(String [] args){
        List<String> a = new ArrayList<>();
        a.add("Blue");
        a.add("Green");
        a.add("Red");
        a.add("Navy");
        a.add("Brown");
        System.out.println(a);
        if(a.contains("Red")){
            System.out.println("Found red");
        }
        else{
            System.out.println("Not found");
        }
    }
}
/*Write a java program for getting different colors through ArrayList interface and remove the
2nd element and color "Blue" from the ArrayList*/
import java.util.*;
public class remove{
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
        a.remove(1);
        System.out.println(a);
        if(a.contains("Blue")){
            a.remove("Blue");
            System.out.println(a);
        }
        else{
            System.out.println("Blue not found");
        }
        
    }
}
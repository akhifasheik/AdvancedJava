/*Write a Java program to iterate a linked list in reverse order (using
objlist.descendingIterator())*/
import java.util.*;
public class reverse{
    public static void main(String [] args){
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);
        ll.add(6);
        System.out.println(ll);
        Iterator<Integer> it = ll.descendingIterator();
        while(it.hasNext()){
        System.out.println(it.next());
        }
    }
}
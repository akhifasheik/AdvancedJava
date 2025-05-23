/*Write a Java program to iterate through all elements in a linked list starting at the
specified position ( 2nd) using iterator ( hint : Iterator iteratorobj = listobj.listIterator(1))*/
import java.util.*;
public class iterate{
    public static void main(String [] args){
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);
        ll.add(6);
        Iterator<Integer> it = ll.listIterator(1);
        while(it.hasNext()){
        System.out.println(it.next());
        }
    }
}
/*Q2. Write a Java Program for Counting how many times a substring appears in a main string
using user defined function countOccurrences()*/
public class countOccurrence{
	public static int countOccurrence(String m,String s) {
		int count=0;
		for(int i=0;i<=m.length()-s.length();i++) {
			int idx = m.indexOf(s, i);
			if (idx == i) {
			    count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		String m="Java";
		String s="J";
		int res=countOccurrence(m,s);
		System.out.println(res);
	}

}
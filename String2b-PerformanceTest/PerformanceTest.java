/*2.b. Develop a Java program to make a Performance Test on StringBuffer and StringBuilder for
appending the string ‘AIET’ for 10000 times both in the StringBuffer and StringBuilder. Justify
your answer which one is better.*/
public class PerformanceTest {
    public static void main(String[] args) {
        // StringBuffer test
        StringBuffer sbuf = new StringBuffer();
        long startTime1 = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            sbuf.append("AIET");
        }
        long endTime1 = System.nanoTime();
        System.out.println("Time taken by StringBuffer: " + (endTime1 - startTime1) + " ns");

        // StringBuilder test
        StringBuilder sbld = new StringBuilder();
        long startTime2 = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            sbld.append("AIET");
        }
        long endTime2 = System.nanoTime();
        System.out.println("Time taken by StringBuilder: " + (endTime2 - startTime2) + " ns");

        if ((endTime1 - startTime1) > (endTime2 - startTime2)) {
            System.out.println("StringBuilder is faster.");
        } else {
            System.out.println("StringBuffer is faster.");
        }
    }
}

package C14interface;
import java.util.*;
public class ArrayListLinkedListCompare {
    public static void main(String[] args) {
        List<Integer> mdmdmdm = new LinkedList<>();
//        mdmdmdm.add();
//        mdmdmdm.remove();
        long start = System.currentTimeMillis();
        for (int i =0; i<100000;i++){
            mdmdmdm.add(0,10);
        }
        long end = System.currentTimeMillis();
        System.out.println(end-start);
//
//        List<Integer> mdmdmdm1 = new ArrayList<>();
//        long start1 = System.currentTimeMillis();
//        for (int i =0; i<100000;i++){
//            mdmdmdm1.add(0,10);
//        }
//        long end1 = System.currentTimeMillis();
//        System.out.println(end1-start1);

        long start2 = System.currentTimeMillis();
        for (int i =0; i<100000;i++){
            mdmdmdm.get(i);
        }
        long end2 = System.currentTimeMillis();
        System.out.println(end2-start2);

    }
}

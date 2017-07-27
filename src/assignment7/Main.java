package assignment7;

/**
 * Created by Jay Dadhania on 24/7/17.
 */
public class Main {
    public static void main(String[] args) {
        SList<Integer> sl = new SList();
        SLIterator<Integer> iter = sl.iterator();
        iter.insert(1);
        iter.insert(2);
        iter.insert(3);
        System.out.println(sl);
        SLIterator<Integer> iter2 = sl.iterator();
        iter2.delete();
        System.out.println(sl);
        while(iter2.hasNext()) iter2.next();
        iter2.insert(4);
        System.out.println(sl);
    }
}

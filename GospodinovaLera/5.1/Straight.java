import java.util.*;
import java.io.*;

public class Straight {
    public static void main(String[]args) {
        int temp = 0;
        long time_add_a = 0, time_get_a= 0, time_delete_a = 0, start, end;
        Set<Integer> a = new HashSet<Integer>();
        for (int i = 0; i < 1000; i++)
            a.add(i+1);
        temp = 186;

        start = System.nanoTime();
        a.add(temp);
        end = System.nanoTime();
        time_add_a = end - start;

        start = System.nanoTime();
        a.contains(temp);
        end = System.nanoTime();
        time_get_a = end - start;

        start = System.nanoTime();
        a.remove(temp);
        end = System.nanoTime();
        time_delete_a = end - start;
        System.out.println(time_add_a + " " + time_get_a + " " + time_delete_a);

        TreeSet<Integer> t = new TreeSet<Integer>();
        for(int i = 0; i < 1000; i++)
            t.add(i+1);
        long time_add_t = 0, time_get_t = 0, time_delete_t = 0, start_t, end_t;
        start = System.nanoTime();
        t.add(temp);
        end = System.nanoTime();
        time_add_t = end - start;

        start = System.nanoTime();
        t.contains(temp);
        end = System.nanoTime();
        time_get_t = end - start;

        start = System.nanoTime();
        t.remove(temp);
        end = System.nanoTime();
        time_delete_t = end - start;
        System.out.println(time_add_t + " " + time_get_t + " " + time_delete_t);

        ArrayList<Integer> l = new ArrayList<Integer>();
        for(int i = 0; i < 1000; i++)
            l.add(i+1);
        long time_add_l = 0, time_get_l = 0, time_delete_l = 0, start_l, end_l;
        start = System.nanoTime();
        l.add(temp);
        end = System.nanoTime();
        time_add_l = end - start;

        start = System.nanoTime();
        l.contains(temp);
        end = System.nanoTime();
        time_get_l = end - start;

        start = System.nanoTime();
        l.remove(temp);
        end = System.nanoTime();
        time_delete_l = end - start;
        System.out.println(time_add_l + " " + time_get_l + " " + time_delete_l);

        LinkedList<Integer> ll = new LinkedList<Integer>();
        for(int i = 0; i < 1000; i++)
            ll.add(i+1);
        long time_add_ll = 0, time_get_ll = 0, time_delete_ll = 0, start_ll, end_ll;
        start = System.nanoTime();
        ll.add(temp);
        end = System.nanoTime();
        time_add_ll = end - start;

        start = System.nanoTime();
        ll.contains(temp);
        end = System.nanoTime();
        time_get_ll = end - start;

        start = System.nanoTime();
        ll.remove(temp);
        end = System.nanoTime();
        time_delete_ll = end - start;
        System.out.println(time_add_ll + " " + time_get_ll + " " + time_delete_ll);
    }
}
/*Имеем:
1391 19942 8812
197566 21797 24116
927 43594 13449
1391 39884 15768
Выходит, что TreeSet хуже всех справляется с добавлением и удалением элемента. Хуже всех в поиске элемента справлется ArrayList
*/

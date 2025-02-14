import java.util.*;
import java.io.*;
import java.io.IOException;
public class Random {
    public static void main(String[]args) {
        int temp = 0;
        long time_add_a = 0, time_get_a= 0, time_delete_a = 0, start, end;
        Set<Integer> a = new HashSet<Integer>();
        for (int i = 0; i < 1150; i++)
        {
            temp = (int)(temp + Math.random()*100+1)*(int)Math.pow(-1,(int)(Math.random()*100));
            a.add(temp);
        }
        temp = -4;

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
        for (int i = 0; i < 1100; i++)
        {
            temp = (int)(temp + Math.random()*100+1)*(int)Math.pow(-1,(int)(Math.random()*100));
            t.add(temp);
        }
        long time_add_t = 0, time_get_t = 0, time_delete_t = 0, start_t, end_t;
        temp = -2;
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
        for (int i = 0; i < 1000; i++)
        {
            temp = (int)(temp + Math.random()*100+1)*(int)Math.pow(-1,(int)(Math.random()*100));
            l.add(temp);
        }
        long time_add_l = 0, time_get_l = 0, time_delete_l = 0, start_l, end_l;
        temp = 4;
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
        for (int i = 0; i < 1000; i++)
        {
            temp = (int)(temp + Math.random()*100+1)*(int)Math.pow(-1,(int)(Math.random()*100));
            ll.add(temp);
        }
        long time_add_ll = 0, time_get_ll = 0, time_delete_ll = 0, start_ll, end_ll;
        temp = 5;
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
        System.out.println(a.size());
        System.out.println(t.size());
        System.out.println(l.size());
        System.out.println(ll.size());

    }
}

/*Проверяем время выполнения добавления, удаления и поиска элементов для коллекций, заполненых рандомно.
Так как коллекция сет предусматривает только попарно разные элементы, то я увеличила количество элементов в коллекции. В итоге имеем:
1391 17623 9275
3711 19942 21797
464 941912 20869
928 90435 13913
1008
1022
1000
1000

То есть TreeSet заметно уступает по времени добавления и удаления элемента, а ArrayList проигрывает по времени поиска элемента, хотя быстрее всех добавляет.
Удаление быстрее всех осуществляет HashSet. */

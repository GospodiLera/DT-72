import java.util.*;
import java.io.*;
public class Task2 {
    public static void main(String[] args) {
        ArrayList<Double> alfa = new ArrayList<Double>();
        for (int i = 0; i < 150; i++)
            alfa.add(Math.random() * 199 + 1);
        List<Double> b = alfa;
        Collections.sort(b);
        b = b.subList(135, 150);

        try(FileWriter writer = new FileWriter("notes3.txt", false))
        {
            for (Double x : b) {
                writer.write(String.format("%.3f\n", x));
                System.out.printf("%.3f\n", x);
            }
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }

    }
}
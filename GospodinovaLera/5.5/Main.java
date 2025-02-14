import java.io.BufferedReader;
import java.io.IOException;
import java.util.*;
import java.io.InputStreamReader;
import java.io.FileInputStream;

public class Main{

    public static void main(String [] args) {
        //текст должен біть написан в одной раскладке
        sortFile("notes3.txt");
    }

    public static void sortFile(String file){
        System.out.println(String.format("\nSorting %s", file));
        List<Word> words = new ArrayList<>();
        try (Scanner sc = new Scanner(new InputStreamReader(new FileInputStream(file), "UTF-8"))) {
            String sub;
            while ((sub = sc.nextLine()) != null) {
                words.add(new Word(sub));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        words.sort(Word::compareTo);
        for (int i = 0; i < words.size(); i++) {
            System.out.println(words.get(i).get());
        }
    }
}

class Word implements Comparable<Word>{
    private String text;
    Word(String text) {
        this.text = text;
    }
    String get(){return text;}
    public int compareTo(Word word){
        return text.toLowerCase().compareTo(word.get().toLowerCase());
    }
}
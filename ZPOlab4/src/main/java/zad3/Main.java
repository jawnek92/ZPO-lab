package zad3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        // write your code here
        String text = null;
        Map<String, Integer> counts = new HashMap<>();
        try(BufferedReader br = new BufferedReader(new FileReader("tekst.txt"))){
            while ((text = br.readLine())!=null){
                String[] splittedText = text.split(" ");
                for(String s : splittedText) {
                    Merge.mergePutIfAbsent(counts, s);
//                    mergeWithGetOrDefault(counts, s);
//                    mergeWithGetAndNullCheck(counts, s);
//                    mergeContainsKey(counts, s);
//                    counts.merge(s, 1, Integer::sum);
                }
            }
        }catch(IOException e){
            e.printStackTrace();
        }

        for(String s: counts.keySet()){
            System.out.println(s+" : "+counts.get(s));
        }

    }
}